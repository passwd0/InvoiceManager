package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.Ricezione;
import invoicemanager.utils.Utils;

public class WriteRicezione {
	private Connection c;

	public WriteRicezione()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Ricezione a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Ricezione VALUES (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroRicezione());
		ps.setInt(2, a.getNumeroRigaRicezione());
		ps.setDate(3, Utils.convertToDatabaseColumn(a.getDataRicezione()));
		ps.setString(4, a.getRczCodiceCommessaRicezione());
		ps.setString(5, a.getRczCodiceCUP());
		ps.setString(6, a.getRczCodiceCIG());

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
    	String sql = "Create table public.Ricezione (\r\n" + 
    			"	\"NumeroRicezione\" INTEGER NOT NULL ,\r\n" + 
    			"	\"NumeroRigaRicezione\" INTEGER NOT NULL ,\r\n" + 
    			"	\"DataRicezione\" Date NULL,\r\n" + 
    			"	\"RczCodiceCommessaRicezione\" varchar(25) NULL,\r\n" + 
    			"	\"RczCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"RczCodiceCIG\" varchar(25) NULL, \r\n" + 
    			"   Primary Key (\"NumeroRicezione\", \"NumeroRigaRicezione\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
