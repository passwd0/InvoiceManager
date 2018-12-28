package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Pagamento;
import invoicemanager.utils.Utils;

public class WritePagamento {
	private Connection c;

	public WritePagamento() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Pagamento a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Pagamenti VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
	    	ps.setString(1, a.getCodicePagamento());
	    	ps.setString(2, a.getDescrizione());
	    	ps.setString(3, a.getCodiceStato().name());
	    	ps.setString(4, a.getCodiceTipoPagamento());
	    	ps.setBoolean(5, a.isIndicatoreScadenzaAVista());
	    	ps.setString(6, a.getGiornoMese());
	    	ps.setInt(7, a.getNumeroGiorni());
	    	ps.setInt(8, a.getNumeroScadenze());
	    	ps.setFloat(9, a.getSconto());
	    	ps.setBoolean(10, a.isScadenzaIVAPrimaRata());
	    	ps.setTimestamp(11, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(12, Utils.toTimestamp(a.getDataUltimaModifica()));

			ps.executeUpdate();
			ps.close();
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
