package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.FatturaCollegata;
import invoicemanager.utils.Utils;

public class WriteFatturaCollegata {
	private Connection c;

	public WriteFatturaCollegata()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(FatturaCollegata a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaCollegata VALUES (?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroFtCollegate());
		ps.setInt(2, a.getNumeroRigaFtCollegate());
		ps.setInt(3, a.getSezionale());
		ps.setDate(4, Utils.convertToDatabaseColumn(a.getDataFtCollegate()));
		ps.setString(5, a.getFtcCodiceCommessaFtCollegate());
		ps.setString(6, a.getFtcCodiceCUP());
		ps.setString(7, a.getFtcCodiceCIG());

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
    	String sql = "Create table public.FatturaCollegata (\r\n" + 
    			"	\"NumeroFtCollegate\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"NumeroRigaFtCollegate\" INTEGER NOT NULL,\r\n" + 
    			"	\"Sezionale\" INTEGER NOT NULL,\r\n" + 
    			"	\"DataFtCollegate\" Date NULL,\r\n" + 
    			"	\"FtcCodiceCommessaFtCollegate\" varchar(25) NULL,\r\n" + 
    			"	\"FtcCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"FtcCodiceCIG\" varchar(25) NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
