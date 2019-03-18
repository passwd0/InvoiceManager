package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Ordine;

public class WriteOrdine {
	private Connection c;

	public WriteOrdine() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Ordine a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Ordine VALUES (?, ?, ?, ?, ?, ?,)");
		ps.setInt(1, a.getNumeroOrdine());
		ps.setInt(2, a.getNumeroRigaOrdine());
		ps.setDate(3, Date.valueOf(a.getDataOrdine()));
		ps.setString(4, a.getOrdCodiceCommessaConvenzione());
		ps.setString(5, a.getOrdCodiceCUP());
		ps.setString(6, a.getOrdCodiceCIG());

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
    	String sql = "Create table public.Ordine (\r\n" + 
    			"	\"NumeroOrdine\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"NumeroRigaOrdine\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"DataOrdine\" Date NOT NULL Primary Key,\r\n" + 
    			"	\"OrdCodiceCommessaConvenzione\" varchar(25) NULL,\r\n" + 
    			"	\"OrdCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"OrdCodiceCIG\" varchar(25) NULL \r\n" + 
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
