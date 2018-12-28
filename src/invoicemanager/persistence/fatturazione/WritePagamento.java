package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Pagamento;

public class WritePagamento {
	private Connection c;

	public WritePagamento() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Pagamento a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO Pagamento "
+ "VALUES ("
+"','"+a.getCodicePagamento()
+"','"+a.getDescrizione()
+"','"+a.getCodiceStato()
+"','"+a.getCodiceTipoPagamento()
+"','"+a.getIndicatoreScadenzaAVista()
+"','"+a.getGiornoMese()
+"','"+a.getNumeroGiorni()
+"','"+a.getNumeroScadenze()
+"','"+a.getSconto()
+"','"+a.getScadenzaIVAPrimaRata()
+"','"+a.getDataInserimento()
+"','"+a.getDataUltimaModifica()
+"','"+a.getLoginInserimento()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codicePagamento=\'" + a.getCodicePagamento() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Pagamento a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Pagamento SET "
					+ "campo=value "
					+ "WHERE codicePagamento="+a.getCodicePagamento();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Pagamento a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodicePagamento() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
