package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.DdtDettaglio;

public class WriteDdtDettaglio {
	private Connection c;

	public WriteDdtDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(DdtDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO DdtDettaglio "
					+ "VALUES ("
					+"','"+a.getNumeroRigaDDT()
					+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceDdtDettaglio=\'" + a.getCodiceDdtDettaglio() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(DdtDettaglio a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE DdtDettaglio SET "
					+ "campo=value "
					+ "WHERE codiceDdtDettaglio="+a.getCodiceDdtDettaglio();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(DdtDettaglio a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceDdtDettaglio() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
