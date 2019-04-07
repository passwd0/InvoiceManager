package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Contratto;

public class WriteContratto {
	private Connection c;

	public WriteContratto() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Contratto a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Contratto VALUES (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroContratto());
		ps.setInt(2, a.getNumeroRigaContratto());
		ps.setDate(3, Utils.convertToDatabaseColumn(a.getDataContratto()));
		ps.setString(4, a.getCntCodiceCommessaConvenzione());
		ps.setString(5, a.getCntCodiceCUP());
		ps.setString(6, a.getCntCodiceCIG());

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
    	String sql = "Create table public.Contratto (\r\n" + 
    			"	\"NumeroContratto\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"NumeroRigaContratto\" INTEGER NOT NULL,\r\n" + 
    			"	\"DataContratto\" Date NULL,\r\n" + 
    			"	\"CntCodiceCommessaConvenzione\" varchar(25) NULL,\r\n" + 
    			"	\"CntCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"CntCodiceCIG\" varchar(25) NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
