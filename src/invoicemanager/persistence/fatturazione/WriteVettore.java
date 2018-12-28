package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Vettore;

public class WriteVettore {
	private Connection c;

	public WriteVettore() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Vettore a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO Vettore "
+ "VALUES ("
+"','"+a.getCodiceVettore()
+"','"+a.getDescrizione()
+"','"+a.getCodiceStato()
+"','"+a.getVia()
+"','"+a.getCitta()
+"','"+a.getDataInserimento()
+"','"+a.getDataUltimaModifica()
+"','"+a.getLoginInserimento()
+"','"+a.getLoginModifica()
+"','"+a.getPartitaIva()
+"','"+a.getIscrizione()
+"','"+a.getTelefono()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceVettore=\'" + a.getCodiceVettore() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Vettore a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Vettore SET "
					+ "campo=value "
					+ "WHERE codiceVettore="+a.getCodiceVettore();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Vettore a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceVettore() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
