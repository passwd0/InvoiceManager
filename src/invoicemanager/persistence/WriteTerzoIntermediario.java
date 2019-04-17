package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.TerzoIntermediario;

public class WriteTerzoIntermediario {
	private Connection c;

	public WriteTerzoIntermediario()  {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(TerzoIntermediario a, boolean exist) {
	    int res = 0;
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO TerzoIntermediario VALUES (DEFAULT, ?, ?, ?, ?, ?)");
				ps.setString(1, a.getIdentificaticoFiscale());
				ps.setString(2, a.getDenominazione());
				ps.setString(3, a.getNome());
				ps.setString(4, a.getCognome());
				ps.setString(5, a.getCodEORI());

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
    	String sql = "Create table public.TerzoIntermediario (\r\n" +
    			"	\"id\" serial NOT NULL primary key,\r\n" +
    			"	\"IdentificaticoFiscale\" varchar(25) NOT NULL,\r\n" +
    			"	\"Denominazione\" varchar(25) NULL,\r\n" +
    			"	\"Nome\" varchar(25) NULL,\r\n" +
    			"	\"Cognome\" varchar(25) NULL,\r\n" +
    			"	\"CodEORI\" varchar(25) NULL\r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}


}
