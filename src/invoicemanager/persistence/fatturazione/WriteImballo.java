package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Imballo;

public class WriteImballo {
	private Connection c;

	public WriteImballo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Imballo a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO Imballo "
+ "VALUES ("
+"','"+a.getCodiceImballo()
+"','"+a.getDescrizione()
+"','"+a.getCodiceStato()
+"','"+a.getDataInserimento()
+"','"+a.getDataUltimaModifica()
+"','"+a.getLoginInserimento()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceImballo=\'" + a.getCodiceImballo() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Imballo a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Imballo SET "
					+ "campo=value "
					+ "WHERE codiceImballo="+a.getCodiceImballo();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Imballo a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceImballo() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
