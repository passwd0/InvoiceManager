package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.SottogruppoMerceologico;
import invoicemanager.model.Stato;

public class SottogruppoMerceologicoDao {
	private Connection c;

	public SottogruppoMerceologicoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(SottogruppoMerceologico a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO SottogruppoMerceologico VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceSottogruppoMerceologico());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getStato().name());
		ps.setFloat(4, a.getSconto());
		ps.setFloat(5, a.getPercentualeProvvigione());
		ps.setTimestamp(6, a.getDataInserimento());
		ps.setTimestamp(7, a.getDataUltimaModifica());
		ps.setString(8, a.getLoginInserimento());

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
    	String sql = "Create table public.SottogruppoMerceologico (\r\n" + 
    			"	\"CodiceSottogruppoMerceologico\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"Sconto\" Float NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL,\r\n" + 
    			"	\"LoginInserimento\" varchar(25) NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<SottogruppoMerceologico> read() {
		List<SottogruppoMerceologico> listsottogruppoMerceologico = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM SottogruppoMerceologico");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceSottogruppoMerceologico = rs.getString("codiceSottogruppoMerceologico");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				float sconto = rs.getFloat("sconto");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				String loginInserimento = rs.getString("loginInserimento");

				SottogruppoMerceologico sottogruppoMerceologico = new SottogruppoMerceologico(codiceSottogruppoMerceologico, descrizione, stato, sconto, percentualeProvvigione, dataInserimento, dataUltimaModifica, loginInserimento);

		listsottogruppoMerceologico.add(sottogruppoMerceologico);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listsottogruppoMerceologico;
	}

}
