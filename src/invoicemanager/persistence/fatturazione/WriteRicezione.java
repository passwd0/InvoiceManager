package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Ricezione;

public class WriteRicezione {
	private Connection c;

	public WriteRicezione() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Ricezione a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Ricezione VALUES (?, ?, ?, ?, ?, ?,)");
		ps.setInt(1, a.getNumeroRicezione());
		ps.setInt(2, a.getNumeroRigaRicezione());
		ps.setDate(3, Date.valueOf(a.getDataRicezione()));
		ps.setString(4, a.getRczCodiceCommessaRicezione());
		ps.setString(5, a.getRczCodiceCUP());
		ps.setString(6, a.getRczCodiceCIG());

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Ricezione (\r\n" + 
    			"	\"NumeroRicezione\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"NumeroRigaRicezione\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"DataRicezione\" Date NULL,\r\n" + 
    			"	\"RczCodiceCommessaRicezione\" varchar(25) NULL,\r\n" + 
    			"	\"RczCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"RczCodiceCIG\" varchar(25) NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
