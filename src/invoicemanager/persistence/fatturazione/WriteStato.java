package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Stato;

public class WriteStato {
	private Connection c;

	public WriteStato() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Stato a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO Stato "
					+ "VALUES ("
					+"','"+a.getCodiceStato()
					+"','"+a.getDescrizione()
					+"','"+a.getDataInserimento()
					+"','"+a.getDataUltimaModifica()
					+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceStato=\'" + a.getCodiceStato() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Stato a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Stato SET "
					+ "campo=value "
					+ "WHERE codiceStato="+a.getCodiceStato();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Stato a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceStato() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
