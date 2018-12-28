package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.TipoCliente;

public class WriteTipoCliente {
	private Connection c;

	public WriteTipoCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(TipoCliente a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO TipoCliente "
					+ "VALUES ("
					+"','"+a.getCodiceTipoCliente()
					+"','"+a.getDescrizione()
					+"','"+a.getDataInserimento()
					+"','"+a.getDataUltimaModifica()
					+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceTipoCliente=\'" + a.getCodiceTipoCliente() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(TipoCliente a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE TipoCliente SET "
					+ "campo=value "
					+ "WHERE codiceTipoCliente="+a.getCodiceTipoCliente();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(TipoCliente a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceTipoCliente() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
