package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.FatturaTestata;
import invoicemanager.utils.Utils;

public class WriteFatturaTestata {
	private Connection c;

	public WriteFatturaTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(FatturaTestata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO FattureTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");

	    	ps.setInt(1, a.getNumeroFatturazione());
	    	ps.setTimestamp(2, Utils.toTimestamp(a.getDataFattura()));
	    	ps.setString(3, a.getStatoAvanzamento().name());
	    	ps.setString(4, a.getCodiceClienteFatturazione());
	    	ps.setString(5, a.getCodiceEsenzioneIva());
	    	ps.setString(6, a.getCodiceAgente());
	    	ps.setString(7, a.getCodiceCausale());
	    	ps.setString(8, a.getCodiceCausalePrelievi());
	    	ps.setFloat(9, a.getPercentualeSconto());
	    	ps.setFloat(10, a.getPercentualeScontoPagamento());
	    	ps.setFloat(11, a.getPercentualeProvvigione());
	    	ps.setString(12, a.getDescrizione());
	    	ps.setBoolean(13, a.isIndicatoreAddebitoBolli());
	    	ps.setBoolean(14, a.isIndicatoreAddebitoSpeseIncasso());
	    	ps.setBoolean(15, a.isIndicatoreScaricoMagazzino());
	    	ps.setInt(16, a.getCodiceListino());
	    	ps.setString(17, a.getCodiceResa());
	    	ps.setString(18, a.getCodiceVettore());
	    	ps.setBoolean(19, a.isIndicatoreFatturaAccompagnatoria());
	    	ps.setString(20, a.getCodicePagamento());
	    	ps.setString(21, a.getCodiceBanca());
	    	ps.setString(22, a.getCodiceImballo());
	    	ps.setFloat(23, a.getPesoColli());
	    	ps.setFloat(24, a.getNumeroColli());
	    	ps.setFloat(25, a.getAcconto());
	    	ps.setString(26, a.getCodiceDivisa());
	    	ps.setFloat(27, a.getCambio());
	    	ps.setString(28, a.getCodiceClienteSpedizione());
	    	ps.setString(29, a.getNomeSpedizione());
	    	ps.setString(30, a.getIndirizzoSpedizione());
	    	ps.setString(31, a.getCapSpedizione());
	    	ps.setString(32, a.getCittaSpedizione());
	    	ps.setString(33, a.getProvinciaSpedizione());
	    	ps.setString(34, a.getCodiceNazioneSpedizione());
	    	ps.setTimestamp(35, Utils.toTimestamp(a.getDataInserimento()));
	    	ps.setTimestamp(36, Utils.toTimestamp(a.getDataUltimaModifica()));
	    	ps.setString(37, a.getNote());
	    	ps.setBoolean(38, a.isIndicatoreFatturazioneDifferita());
	    	ps.setBoolean(39, a.isIndicatoreEmail());
	    	ps.setBoolean(40, a.isIndicatorePa());
	    	ps.setFloat(41, a.getSpeseTrasporto());
	    	ps.setFloat(42, a.getSpeseImballo());
	    	ps.setFloat(43, a.getSpeseIncasso());
	    	ps.setFloat(44, a.getSpeseBolli());
	    	ps.setFloat(45, a.getOmaggi());
	    	ps.setFloat(46, a.getTotalePagato());
	    	ps.setDate(47, Date.valueOf(a.getDataScadenza()));
	    	ps.setFloat(48, a.getImportoScadenza());

	    	ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(FatturaTestata a) throws ClassNotFoundException, SQLException {
		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE FatturaTestata SET "
//					+ "campo=value "
//					+ "WHERE codiceFatturaTestata="+a.getCodiceFatturaTestata();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(FatturaTestata a) throws ClassNotFoundException, SQLException {
		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceFatturaTestata() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
