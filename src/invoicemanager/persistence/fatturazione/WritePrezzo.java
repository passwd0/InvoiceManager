package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Prezzo;

public class WritePrezzo {
	private Connection c;

	public WritePrezzo()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Prezzo a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Prezzo VALUES (?, ?, ?)");
		ps.setInt(1, a.getId());
		ps.setInt(2, a.getCodiceListinoPersonalizzato());
		ps.setFloat(3, a.getPrezzo());

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
    	String sql = "Create table public.Prezzo (\r\n" + 
    			"	\"Id\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"CodiceListinoPersonalizzato\" INTEGER NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
