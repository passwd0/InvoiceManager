package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.TipoBento;
import invoicemanager.utils.Utils;

public class WriteTipoBento {
	private Connection c;

	public WriteTipoBento()  {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(TipoBento a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO TipoBento VALUES (?, ?, ?, ?)");
		ps.setString(1, a.getCodiceTipoBento());
		ps.setString(2, a.getDescrizione());
		ps.setTimestamp(3, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(4, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.TipoBento (\r\n" + 
    			"	\"CodiceTipoBento\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
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
	
	
}
