package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.TipoPagamento;

public class WriteTipoPagamento {
	private Connection c;

	public WriteTipoPagamento() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(TipoPagamento a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO TipoPagamento "
+ "VALUES ("
+"','"+a.getCodiceTipoPagamento()
+"','"+a.getDescrizione()
+"','"+a.getDataInserimento()
+"','"+a.getDataUltimaModifica()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceTipoPagamento=\'" + a.getCodiceTipoPagamento() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(TipoPagamento a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE TipoPagamento SET "
					+ "campo=value "
					+ "WHERE codiceTipoPagamento="+a.getCodiceTipoPagamento();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(TipoPagamento a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceTipoPagamento() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
