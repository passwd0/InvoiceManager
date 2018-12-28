package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.FatturaDettaglio;

public class WriteFatturaDettaglio {
	private Connection c;

	public WriteFatturaDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(FatturaDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO FatturaDettaglio "
+ "VALUES ("
+"','"+a.getNumeroRigaFattura()
+"','"+a.getCodiceTipoRigaDocumento()
+"','"+a.getCodiceArticolo()
+"','"+a.getCosto()
+"','"+a.getNumeroOrdine()
+"','"+a.getNumeroRigaOrdine()
+"','"+a.getDataOrdine()
+"','"+a.getQuantitaDaConsegnare()
+"','"+a.getIndicatoreEvasione()
+"','"+a.getDescrizione()
+"','"+a.getQuantita()
+"','"+a.getPrezzo()
+"','"+a.getCodiceIva()
+"','"+a.getCodiceContropartitaContabile()
+"','"+a.getPercentualeProvvigione()
+"','"+a.getPercentualeScontoCliente()
+"','"+a.getPercentualeScontoArticolo()
+"','"+a.getPercentualeScontoPagamento()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceFatturaDettaglio=\'" + a.getCodiceFatturaDettaglio() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(FatturaDettaglio a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE FatturaDettaglio SET "
					+ "campo=value "
					+ "WHERE codiceFatturaDettaglio="+a.getCodiceFatturaDettaglio();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(FatturaDettaglio a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceFatturaDettaglio() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
