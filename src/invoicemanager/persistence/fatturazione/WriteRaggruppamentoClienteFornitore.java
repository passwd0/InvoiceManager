package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.RaggruppamentoClienteFornitore;
import invoicemanager.utils.Utils;

public class WriteRaggruppamentoClienteFornitore {
	private Connection c;

	public WriteRaggruppamentoClienteFornitore() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(RaggruppamentoClienteFornitore a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO RaggruppamentoClienteFornitore VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceRaggruppamento());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getStato().name());
			ps.setTimestamp(4, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(5, Utils.toTimestamp(a.getDataUltimaModifica()));

			ps.executeUpdate();
			ps.close();
			c.commit();
	    } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	    }
	}

	public void set(RaggruppamentoClienteFornitore a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE RaggruppamentoClienteFornitore SET "
//					+ "campo=value "
//					+ "WHERE codiceRaggruppamentoClienteFornitore="+a.getCodiceRaggruppamento();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(RaggruppamentoClienteFornitore a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceRaggruppamento() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.RaggruppamentoClienteFornitore (\r\n" + 
    			"	\"CodiceRaggruppamento\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
} 
