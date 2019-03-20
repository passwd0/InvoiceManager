package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.CapItaliano;
import invoicemanager.utils.Utils;

public class WriteCapItaliano {
	private Connection c;

	public WriteCapItaliano() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(CapItaliano a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO CapItaliano VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getId());
		ps.setString(2, a.getCap());
		ps.setString(3, a.getComune());
		ps.setString(4, a.getProvincia());
		ps.setString(5, a.getNazione());
		ps.setString(6, a.getCodiceISTAT());
		ps.setString(7, a.getCodiceCAB());
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(9, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.CapItaliano (\r\n" + 
    			"	\"Id\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"Cap\" varchar(25) NULL,\r\n" + 
    			"	\"Comune\" varchar(25) NULL,\r\n" + 
    			"	\"Provincia\" varchar(25) NULL,\r\n" + 
    			"	\"Nazione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceISTAT\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCAB\" varchar(25) NULL,\r\n" + 
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
