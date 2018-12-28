package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Controparte;

public class WriteControparte {
	private Connection c;

	public WriteControparte() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Controparte a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO Controparte "
+ "VALUES ("
+"','"+a.getCodiceControparte()
+"','"+a.getDescrizione()
+"','"+a.getCodiceStato()
+"','"+a.getCodiceContoCOGE()
+"','"+a.getProgressivoRelazioniCOGECOA()
+"','"+a.getDataInserimento()
+"','"+a.getDataUltimaModifica()
+"','"+a.getLoginInserimento()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceControparte=\'" + a.getCodiceControparte() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Controparte a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Controparte SET "
					+ "campo=value "
					+ "WHERE codiceControparte="+a.getCodiceControparte();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Controparte a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceControparte() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
