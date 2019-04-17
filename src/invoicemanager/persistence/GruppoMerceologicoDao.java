package invoicemanager.persistence;

import invoicemanager.model.GruppoMerceologico;
import invoicemanager.model.Stato;
import invoicemanager.utils.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
		ps.setTimestamp(7, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataUltimaModifica()));

			res = ps.executeUpdate();
				ps.close();
				c.commit();

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
        c.commit();

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
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceGruppoMerceologico = rs.getString("codiceGruppoMerceologico");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				float sconto = rs.getFloat("sconto");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				int numeroPezziConfezione = rs.getInt("numeroPezziConfezione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
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
