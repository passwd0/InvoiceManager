package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.Convenzione;
import invoicemanager.utils.Utils;

public class WriteConvenzione {
	private Connection c;

	public WriteConvenzione()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Convenzione a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Convenzione VALUES (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroConvenzione());
		ps.setInt(2, a.getNumeroRigaConvenzione());
		ps.setDate(3, Utils.convertToDatabaseColumn(a.getDataConvenzione()));
		ps.setString(4, a.getCnvCodiceCommessaConvenzione());
		ps.setString(5, a.getCnvCodiceCUP());
		ps.setString(6, a.getCnvCodiceCIG());

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
    	String sql = "Create table public.Convenzione (\r\n" + 
    			"	\"NumeroConvenzione\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"NumeroRigaConvenzione\" INTEGER NULL,\r\n" + 
    			"	\"DataConvenzione\" Date NULL,\r\n" + 
    			"	\"CnvCodiceCommessaConvenzione\" varchar(25) NULL,\r\n" + 
    			"	\"CnvCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"CnvCodiceCIG\" varchar(25) NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
