package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.Controparte;
import invoicemanager.utils.Utils;

public class WriteControparte {
	private Connection c;

	public WriteControparte()  {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Controparte a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Controparte VALUES (?, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceControparte());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getStato().name());
			ps.setString(4, a.getCodiceContoCOGE());
			ps.setTimestamp(5, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(6, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.Controparte (\r\n" + 
    			"	\"CodiceControparte\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(250) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceContoCOGE\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}

	public void set(Controparte a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE Controparte SET "
//					+ "campo=value "
//					+ "WHERE codiceControparte="+a.getCodiceControparte();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(Controparte a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceControparte() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
} 
