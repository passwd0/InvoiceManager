package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.OrdineDettaglio;
import invoicemanager.utils.Utils;

public class WriteOrdineDettaglio {
	private Connection c;

	public WriteOrdineDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(OrdineDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO OrdineDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
	    	ps.setInt(1, a.getNumeroOrdine());
	    	ps.setTimestamp(2, Utils.toTimestamp(a.getDataOrdine()));
	    	ps.setInt(3, a.getNumeroRigaOrdine());
	    	ps.setString(4, a.getCodiceTipoRigaDocumento());
	    	ps.setString(5, a.getCodiceMagazzino());
	    	ps.setString(6, a.getCodiceArticolo());
	    	ps.setFloat(7, a.getQuantitaConsegnata());
	    	ps.setBoolean(8, a.isIndicatoreEvasione());
	    	ps.setString(9, a.getDescrizione());
	    	ps.setTimestamp(10, Utils.toTimestamp(a.getDataConsegna()));
	    	ps.setFloat(11, a.getQuantita());
	    	ps.setString(12, a.getCodiceUnitaMisura());
	    	ps.setFloat(13, a.getPrezzo());
	    	ps.setString(14, a.getCodiceIva());
	    	ps.setString(15, a.getCodiceContropartitaContabile());
	    	ps.setFloat(16, a.getPercentualeProvvigione());
	    	ps.setFloat(17, a.getPercentualeScontoCliente());
	    	ps.setFloat(18, a.getPercentualeScontoArticolo());
	    	ps.setFloat(19, a.getPercentualeScontoPagamento());
	    	ps.setString(20, a.getDescrizioneAggiuntiva());
	    	ps.setBoolean(21, a.isIndicatoreCoordinamento());
	    	ps.setBoolean(22, a.isIndicatoreOrdineDaFatturare());
	    	ps.setFloat(23, a.getQuantitaVariata());
	    	ps.setInt(24, a.getNumeroPreventivo());
	    	ps.setInt(25, a.getNumeroRigaPreventivo());
	    	ps.setTimestamp(26, Utils.toTimestamp(a.getDataPreventivo()));
	    	ps.setFloat(27, a.getQuantitaEvasa());
	    	ps.setBoolean(28, a.isIndicatoreEvasionePreventivi());
	    	ps.setBoolean(29, a.isIndicatoreEvasioneRigheNote());
	    	ps.setBoolean(30, a.isIndicatoreNoConferma());
	    	ps.setTimestamp(31, Utils.toTimestamp(a.getDataInserimento()));
	    	ps.setTimestamp(32, Utils.toTimestamp(a.getDataUltimaModifica()));
	    	ps.setString(33, a.getLoginInserimento());
	    	ps.setString(34, a.getLoginModifica());
	    	ps.setTimestamp(35, Utils.toTimestamp(a.getDataConsegnaSchedulatore()));
	    	ps.setTimestamp(36, Utils.toTimestamp(a.getDataConsegnaProposta()));
	    	ps.setBoolean(37, a.isIndicatoreBloccato());
	    	ps.setBoolean(38, a.isIndicatoreOrdineTrading());
	    	ps.setTimestamp(39, Utils.toTimestamp(a.getDataInizioSchedulatore()));
	    	ps.setString(40, a.getCodiceArticoloBis());

			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(OrdineDettaglio a) throws ClassNotFoundException, SQLException {
		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE OrdineDettaglio SET "
//					+ "campo=value "
//					+ "WHERE codiceOrdineDettaglio="+a.getCodiceOrdineDettaglio();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(OrdineDettaglio a) throws ClassNotFoundException, SQLException {
		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceOrdineDettaglio() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
