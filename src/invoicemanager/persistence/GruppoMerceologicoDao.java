package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.GruppoMerceologico;
import invoicemanager.model.Stato;

public class GruppoMerceologicoDao {
	private Connection c;

	public GruppoMerceologicoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(GruppoMerceologico a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO GruppoMerceologico VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceGruppoMerceologico());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getStato().name());
		ps.setFloat(4, a.getSconto());
		ps.setFloat(5, a.getPercentualeProvvigione());
		ps.setInt(6, a.getNumeroPezziConfezione());
		ps.setTimestamp(7, a.getDataInserimento());
		ps.setTimestamp(8, a.getDataUltimaModifica());

			res = ps.executeUpdate();
				ps.close();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.GruppoMerceologico (\r\n" + 
    			"	\"CodiceGruppoMerceologico\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"Sconto\" Float NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"NumeroPezziConfezione\" INTEGER NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<GruppoMerceologico> read() {
		List<GruppoMerceologico> listgruppoMerceologico = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM GruppoMerceologico");
	         while ( rs.next() ) {

				String codiceGruppoMerceologico = rs.getString("codiceGruppoMerceologico");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				float sconto = rs.getFloat("sconto");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				int numeroPezziConfezione = rs.getInt("numeroPezziConfezione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				GruppoMerceologico gruppoMerceologico = new GruppoMerceologico(codiceGruppoMerceologico, descrizione, stato, sconto, percentualeProvvigione, numeroPezziConfezione, dataInserimento, dataUltimaModifica);

				listgruppoMerceologico.add(gruppoMerceologico);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listgruppoMerceologico;
	}

}
