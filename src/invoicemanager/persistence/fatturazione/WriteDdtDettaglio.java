package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.DdtDettaglio;
import invoicemanager.utils.Utils;

public class WriteDdtDettaglio {
	private Connection c;

	public WriteDdtDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(DdtDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO DdtDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
	    	ps.setInt(1, a.getNumeroRigaDDT());
	    	ps.setString(2, a.getCodiceTipoRigaDocumento());
	    	ps.setString(3, a.getCodiceArticolo());
	    	ps.setString(4, a.getCodiceMagazzino());
	    	ps.setFloat(5, a.getCosto());
	    	ps.setInt(6, a.getNumeroOrdine());
	    	ps.setInt(7, a.getNumeroRigaOrdine());
	    	ps.setTimestamp(8, Utils.toTimestamp(a.getDataOrdine()));
	    	ps.setFloat(9, a.getQuantitaDaConsegnare());
	    	ps.setBoolean(10, a.isIndicatoreEvasione());
	    	ps.setString(11, a.getDescrizione());
	    	ps.setFloat(12, a.getQuantita());
	    	ps.setFloat(13, a.getPrezzo());
	    	ps.setString(14, a.getCodiceIva());
	    	ps.setString(15, a.getCodiceContropartitaContabile());
	    	ps.setFloat(16, a.getPercentualeProvvigione());
	    	ps.setFloat(17, a.getPercentualeScontoCliente());
	    	ps.setFloat(18, a.getPercentualeScontoArticolo());
	    	ps.setFloat(19, a.getPercentualeScontoPagamento());
	    	ps.setString(20, a.getDescrizioneAggiuntiva());
	    	ps.setString(21, a.getCodiceUnitaMisura());
	    	ps.setString(22, a.getSerialNumber());
	    	ps.setTimestamp(23, Utils.toTimestamp(a.getDataInserimento()));
	    	ps.setTimestamp(24, Utils.toTimestamp(a.getDataUltimaModifica()));
	    	ps.setString(25, a.getLoginInserimento());
	    	ps.setString(26, a.getLoginModifica());
	    	ps.setBoolean(27, a.isIndicatorePrelevatoVendita());
	    	ps.setString(28, a.getPesoLordo());

			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(DdtDettaglio a) throws ClassNotFoundException, SQLException {
		try {
			
			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(DdtDettaglio a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceDdtDettaglio() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
