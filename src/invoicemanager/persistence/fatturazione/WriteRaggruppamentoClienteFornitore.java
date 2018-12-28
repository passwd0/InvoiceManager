package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.RaggruppamentoClienteFornitore;

public class WriteRaggruppamentoClienteFornitore {
	private Connection c;

	public WriteRaggruppamentoClienteFornitore() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(RaggruppamentoClienteFornitore a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO RaggruppamentoClienteFornitore "
+ "VALUES ("
+"','"+a.getCodiceRaggruppamento()
+"','"+a.getDescrizione()
+"','"+a.getCodiceStato()
+"','"+a.getDataInserimento()
+"','"+a.getDataUltimaModifica()
+"','"+a.getLoginInserimento()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceRaggruppamentoClienteFornitore=\'" + a.getCodiceRaggruppamentoClienteFornitore() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(RaggruppamentoClienteFornitore a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE RaggruppamentoClienteFornitore SET "
					+ "campo=value "
					+ "WHERE codiceRaggruppamentoClienteFornitore="+a.getCodiceRaggruppamentoClienteFornitore();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(RaggruppamentoClienteFornitore a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceRaggruppamentoClienteFornitore() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
