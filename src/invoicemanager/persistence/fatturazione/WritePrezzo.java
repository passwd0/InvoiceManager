package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Prezzo;

public class WritePrezzo {
	private Connection c;

	public WritePrezzo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Prezzo a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Prezzo VALUES (?, ?, ?)");
		ps.setInt(1, a.getId());
		ps.setInt(2, a.getCodiceListinoPersonalizzato());
		ps.setFloat(3, a.getPrezzo());

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
