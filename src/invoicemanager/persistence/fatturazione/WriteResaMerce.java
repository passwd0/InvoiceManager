package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.ResaMerce;

public class WriteResaMerce {
	private Connection c;

	public WriteResaMerce() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(ResaMerce a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO ResaMerce "
+ "VALUES ("
+"','"+a.getCodiceResa()
+"','"+a.getDescrizione()
+"','"+a.getCodiceStato()
+"','"+a.getPercentualeAddebito()
+"','"+a.getImportoMinimo()
+"','"+a.getIndicatoreProvvigione()
+"','"+a.getDataInserimento()
+"','"+a.getDataUltimaModifica()
+"','"+a.getLoginInserimento()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceResaMerce=\'" + a.getCodiceResaMerce() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(ResaMerce a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE ResaMerce SET "
					+ "campo=value "
					+ "WHERE codiceResaMerce="+a.getCodiceResaMerce();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(ResaMerce a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceResaMerce() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
