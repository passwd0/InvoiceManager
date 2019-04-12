package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Contratto;

public class WriteContratto {
	private Connection c;

	public WriteContratto()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Contratto a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Contratto VALUES (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroContratto());
		ps.setInt(2, a.getNumeroRigaContratto());
		ps.setDate(3, Date.valueOf(a.getDataContratto()));
		ps.setString(4, a.getCntCodiceCommessaConvenzione());
		ps.setString(5, a.getCntCodiceCUP());
		ps.setString(6, a.getCntCodiceCIG());

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
