package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.DdtDettaglio;
import invoicemanager.utils.Utils;

public class WriteDdtDettaglio {
	private Connection c;

	public WriteDdtDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(DdtDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO DdtDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
	    	ps.setInt(1, a.getNumeroDDT());
	    	ps.setTimestamp(2, Utils.toTimestamp(a.getDataDDT()));
			ps.setInt(3, a.getNumeroRigaDDT());
	    	ps.setString(4, a.getCodiceTipoRigaDocumento());
	    	ps.setString(5, a.getCodiceArticolo());
	    	ps.setString(6, a.getCodiceMagazzino());
	    	ps.setFloat(7, a.getCosto());
	    	ps.setInt(8, a.getNumeroOrdine());
	    	ps.setInt(9, a.getNumeroRigaOrdine());
	    	ps.setTimestamp(10, Utils.toTimestamp(a.getDataOrdine()));
	    	ps.setFloat(12, a.getQuantitaDaConsegnare());
	    	ps.setBoolean(13, a.isIndicatoreEvasione());
	    	ps.setString(14, a.getDescrizione());
	    	ps.setFloat(15, a.getQuantita());
	    	ps.setFloat(16, a.getPrezzo());
	    	ps.setString(17, a.getCodiceIva());
	    	ps.setString(18, a.getCodiceContropartitaContabile());
	    	ps.setFloat(19, a.getPercentualeProvvigione());
	    	ps.setFloat(20, a.getPercentualeScontoCliente());
	    	ps.setFloat(21, a.getPercentualeScontoArticolo());
	    	ps.setFloat(22, a.getPercentualeScontoPagamento());
	    	ps.setString(23, a.getDescrizioneAggiuntiva());
	    	ps.setString(24, a.getCodiceUnitaMisura());
	    	ps.setString(25, a.getSerialNumber());
	    	ps.setTimestamp(26, Utils.toTimestamp(a.getDataInserimento()));
	    	ps.setTimestamp(27, Utils.toTimestamp(a.getDataUltimaModifica()));
	    	ps.setString(28, a.getLoginInserimento());
	    	ps.setString(29, a.getLoginModifica());
	    	ps.setBoolean(30, a.isIndicatorePrelevatoVendita());
	    	ps.setString(31, a.getPesoLordo());

			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(DdtDettaglio a) throws ClassNotFoundException, SQLException {
		try {
			
//			ps.executeUpdate();
//			ps.close();
//			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(DdtDettaglio a) throws ClassNotFoundException, SQLException {
		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceDdtDettaglio() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
