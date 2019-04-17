package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.StabileOrganizzazione;

public class WriteStabileOrganizzazione {
	private Connection c;

	public WriteStabileOrganizzazione()  {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(StabileOrganizzazione a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO StabileOrganizzazione VALUES (DEFAULT, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getSoIndirizzo());
		ps.setString(2, a.getSoNumeroCivico());
		ps.setString(3, a.getSoCap());
		ps.setString(4, a.getSoComune());
		ps.setString(5, a.getSoProvincia());
		ps.setString(6, a.getSoNazione());

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
    	String sql = "Create table public.StabileOrganizzazione (\r\n" +
    			"	\"id\" serial NOT NULL primary key,\r\n" +
    			"	\"SoIndirizzo\" varchar(25) NOT NULL,\r\n" +
    			"	\"SoNumeroCivico\" varchar(25) NULL,\r\n" +
    			"	\"SoCap\" varchar(10) NULL,\r\n" +
    			"	\"SoComune\" varchar(25) NULL,\r\n" +
    			"	\"SoProvincia\" varchar(25) NULL,\r\n" +
    			"	\"SoNazione\" varchar(25) NULL\r\n" +
    			"); ";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}

}
