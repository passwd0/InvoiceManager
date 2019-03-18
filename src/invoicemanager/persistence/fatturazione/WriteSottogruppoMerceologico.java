package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.SottogruppoMerceologico;
import invoicemanager.utils.Utils;

public class WriteSottogruppoMerceologico {
	private Connection c;

	public WriteSottogruppoMerceologico() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(SottogruppoMerceologico a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO SottogruppoMerceologico VALUES (?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceSottogruppoMerceologico());
		ps.setString(2, a.getDescrizione());
		ps.setBoolean(3, a.isCodiceStato());
		ps.setFloat(4, a.getSconto());
		ps.setFloat(5, a.getPercentualeProvvigione());
		ps.setTimestamp(6, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(7, Utils.toTimestamp(a.getDataUltimaModifica()));
		ps.setString(8, a.getLoginInserimento());

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.SottogruppoMerceologico (\r\n" + 
    			"	\"CodiceSottogruppoMerceologico\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceStato\" Boolean NULL,\r\n" + 
    			"	\"Sconto\" Float NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL,\r\n" + 
    			"	\"LoginInserimento\" varchar(25) NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();
        c.close();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
