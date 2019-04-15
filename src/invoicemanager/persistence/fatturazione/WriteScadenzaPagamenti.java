package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.ScadenzaPagamenti;
import invoicemanager.utils.Utils;

public class WriteScadenzaPagamenti {
	private Connection c;

	public WriteScadenzaPagamenti()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ScadenzaPagamenti a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Scadenze VALUES (?, ?, ?, ?)");
		
		ps.setInt(1, a.getNumeroFattura());
		ps.setFloat(2, a.getImportoScadenza());
		ps.setDate(3, Utils.convertToDatabaseColumn(a.getDataFattura()));
		ps.setDate(4, Utils.convertToDatabaseColumn(a.getDataScadenza()));
		

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
    	String sql = "Create table public.ScadenzaPagamenti (\r\n" + 
    			"	\"NumeroFattura\" integer NOT NULL Primary Key,\r\n" + 
    			"	\"ImportoScadenza\" float NULL,\r\n" + 
    			"	\"DataFattura\" date NULL,\r\n" + 
    			"	\"DataScadenza\" date NULL\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
}
