package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.CodiceABarre;
import invoicemanager.utils.Utils;

public class WriteCodiceABarre {
	private Connection c;

	public WriteCodiceABarre()  {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(CodiceABarre a, boolean exist) {
	    int res = 0;
	    try {

			PreparedStatement ps = c.prepareStatement("INSERT INTO CodiceABarre VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceArticolo());
			ps.setString(2, a.getCodiceABarre());
			ps.setString(3, a.getTipo());
			ps.setTimestamp(4, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(5, Utils.toTimestamp(a.getDataUltimaModifica()));
	
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
    	String sql = "Create table public.CodiceABarre (\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceABarre\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Tipo\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceArticolo\", \"CodiceABarre\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
