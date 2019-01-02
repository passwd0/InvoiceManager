package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.OrdineTestata;
import invoicemanager.utils.Utils;

public class WriteOrdineTestata {
	private Connection c;

	public WriteOrdineTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(OrdineTestata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO OrdineTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
			ps.setInt(1, a.getNumeroOrdine());
			ps.setDate(2, Date.valueOf(a.getDataOrdine()));
			ps.setString(3, a.getCodiceStatoAvanzamento());
			ps.setString(4, a.getCodiceClienteFatturazione());
			ps.setString(5, a.getDescrizione());
			ps.setString(6, a.getCodiceEsenzioneIva());
			ps.setString(7, a.getCodiceAgente());
			ps.setFloat(8, a.getPercentualeProvvigione());
			ps.setFloat(9, a.getPercentualeSconto());
			ps.setFloat(10, a.getPercentualeScontoPagamento());
			ps.setInt(11, a.getNumeroCopieFattura());
			ps.setBoolean(12, a.isIndicatoreAddebitoBolli());
			ps.setBoolean(13, a.isIndicatoreAddebitoSpeseIncasso());
			ps.setInt(14, a.getCodiceListino());
			ps.setString(15, a.getCodiceResa());
			ps.setString(16, a.getCodiceVettore());
			ps.setString(17, a.getCodiceCausale());
			ps.setString(18, a.getCodicePagamento());
			ps.setString(19, a.getCodiceBanca());
			ps.setDate(20, Date.valueOf(a.getDataConsegna()));
			ps.setString(21, a.getCausaleTrasporto());
			ps.setString(22, a.getCodiceDivisa());
			ps.setBoolean(23, a.isIndicatoreConsegnaParziale());
			ps.setBoolean(24, a.isIndicatoreRaggruppamentoConsegne());
			ps.setString(25, a.getCodiceAgenteVecchio());
			ps.setString(26, a.getCodiceClienteSpedizione());
			ps.setString(27, a.getNomeSpedizione());
			ps.setString(28, a.getIndirizzoSpedizione());
			ps.setString(29, a.getCapSpedizione());
			ps.setString(30, a.getCittaSpedizione());
			ps.setString(31, a.getProvinciaSpedizione());
			ps.setString(32, a.getCodiceNazioneSpedizione());
			ps.setString(33, a.getNote());
			ps.setString(34, a.getLoginInserimento());
			ps.setString(35, a.getLoginModifica());
			ps.setString(36, a.getCodiceLingua());
			ps.setString(37, a.getRevisione());
			ps.setString(38, a.getAttenzione());
			ps.setBoolean(39, a.isIndicatoreOrdineTrading());
			ps.setTimestamp(40, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(41, Utils.toTimestamp(a.getDataUltimaModifica()));

			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(OrdineTestata a) throws ClassNotFoundException, SQLException {
		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE OrdineTestata SET "
//					+ "campo=value "
//					+ "WHERE codiceOrdineTestata="+a.getCodiceOrdineTestata();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(OrdineTestata a) throws ClassNotFoundException, SQLException {
		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceOrdineTestata() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
