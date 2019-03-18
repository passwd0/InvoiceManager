package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Allegato;

public class WriteAllegato {
	private Connection c;

	public WriteAllegato() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Allegato a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO Allegato VALUES (DEFAULT, ?, ?)");
			ps.setString(1, a.getNomeAllegato());
			ps.setString(2, a.getPathAllegato());
	
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
    	String sql = "Create table public.Allegato (\r\n" +
    			"	\"id\" serial NOT NULL primary key,\r\n" + 
    			"	\"NomeAllegato\" varchar(25) NOT NULL,\r\n" + 
    			"	\"PathAllegato\" varchar(25) NULL\r\n" + 
    			"); ";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();
        c.close();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
}
