package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.FatturaCollegata;

public class WriteFatturaCollegata {
	private Connection c;

	public WriteFatturaCollegata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(FatturaCollegata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaCollegata VALUES (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroFtCollegate());
		ps.setInt(2, a.getNumeroRigaFtCollegate());
		ps.setDate(3, Date.valueOf(a.getDataFtCollegate()));
		ps.setString(4, a.getFtcCodiceCommessaFtCollegate());
		ps.setString(5, a.getFtcCodiceCUP());
		ps.setString(6, a.getFtcCodiceCIG());

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
    	String sql = "Create table public.FatturaCollegata (\r\n" + 
    			"	\"NumeroFtCollegate\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"NumeroRigaFtCollegate\" INTEGER NOT NULL,\r\n" + 
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
