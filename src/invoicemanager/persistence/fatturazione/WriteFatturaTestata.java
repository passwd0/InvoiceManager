package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.FatturaTestata;
import invoicemanager.utils.Utils;

public class WriteFatturaTestata {
	private Connection c;

	public WriteFatturaTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(FatturaTestata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, a.getNumeroFatturazione());
			ps.setDate(2, Date.valueOf(a.getDataFattura()));
			ps.setString(3, a.getCodiceStatoAvanzamento());
			ps.setInt(4, a.getSezionale());
			ps.setString(5, a.getCodiceClienteFatturazione());
			ps.setString(6, a.getCodiceEsenzioneIva());
			ps.setString(7, a.getCodiceAgente());
			ps.setString(8, a.getCodiceCausale());
			ps.setString(9, a.getCodiceCausalePrelievi());
			ps.setFloat(10, a.getPercentualeSconto());
			ps.setFloat(11, a.getPercentualeScontoPagamento());
			ps.setFloat(12, a.getPercentualeProvvigione());
			ps.setString(13, a.getDescrizione());
			ps.setBoolean(14, a.isIndicatoreAddebitoBolli());
			ps.setBoolean(15, a.isIndicatoreAddebitoSpeseIncasso());
			ps.setBoolean(16, a.isIndicatoreScaricoMagazzino());
			ps.setInt(17, a.getCodiceListino());
			ps.setString(18, a.getCodiceResa());
			ps.setString(19, a.getCodiceVettore());
			ps.setBoolean(20, a.isIndicatoreFatturaAccompagnatoria());
			ps.setString(21, a.getCodicePagamento());
			ps.setString(22, a.getCodiceBanca());
			ps.setString(23, a.getCodiceImballo());
			ps.setFloat(24, a.getPesoColli());
			ps.setFloat(25, a.getNumeroColli());
			ps.setFloat(26, a.getAcconto());
			ps.setString(27, a.getCodiceDivisa());
			ps.setFloat(28, a.getCambio());
			ps.setString(29, a.getCodiceClienteSpedizione());
			ps.setString(30, a.getNomeSpedizione());
			ps.setString(31, a.getIndirizzoSpedizione());
			ps.setString(32, a.getCapSpedizione());
			ps.setString(33, a.getCittaSpedizione());
			ps.setString(34, a.getProvinciaSpedizione());
			ps.setString(35, a.getCodiceNazioneSpedizione());
			ps.setString(36, a.getNote());
			ps.setBoolean(37, a.isIndicatoreFatturazioneDifferita());
			ps.setBoolean(38, a.isIndicatoreEmail());
			ps.setBoolean(39, a.isIndicatorePa());
			ps.setFloat(40, a.getSpeseTrasporto());
			ps.setFloat(41, a.getSpeseImballo());
			ps.setFloat(42, a.getSpeseIncasso());
			ps.setFloat(43, a.getSpeseBolli());
			ps.setFloat(44, a.getOmaggi());
			ps.setFloat(45, a.getTotalePagato());
			ps.setDate(46, Date.valueOf(a.getDataScadenza()));
			ps.setFloat(47, a.getImportoScadenza());
			ps.setTimestamp(48, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(49, Utils.toTimestamp(a.getDataUltimaModifica()));

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

	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.FatturaTestata (\r\n" +
    			"	\"NumeroFatturazione\" INTEGER NOT NULL,\r\n" +
    			"	\"DataFattura\" Date NOT NULL ,\r\n" +
    			"	\"CodiceStatoAvanzamento\" varchar(25) NULL,\r\n" +
    			"	\"Sezionale\" INTEGER NOT NULL,\r\n" +
    			"	\"CodiceClienteFatturazione\" varchar(25) NOT NULL,\r\n" +
    			"	\"CodiceEsenzioneIva\" varchar(25) NULL,\r\n" +
    			"	\"CodiceAgente\" varchar(25) NULL,\r\n" +
    			"	\"CodiceCausale\" varchar(25) NULL,\r\n" +
    			"	\"CodiceCausalePrelievi\" varchar(25) NULL,\r\n" +
    			"	\"PercentualeSconto\" Float NULL,\r\n" +
    			"	\"PercentualeScontoPagamento\" Float NULL,\r\n" +
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" +
    			"	\"Descrizione\" varchar(25) NULL,\r\n" +
    			"	\"IndicatoreAddebitoBolli\" Boolean NULL,\r\n" +
    			"	\"IndicatoreAddebitoSpeseIncasso\" Boolean NULL,\r\n" +
    			"	\"IndicatoreScaricoMagazzino\" Boolean NULL,\r\n" +
    			"	\"CodiceListino\" INTEGER NULL,\r\n" +
    			"	\"CodiceResa\" varchar(25) NULL,\r\n" +
    			"	\"CodiceVettore\" varchar(25) NULL,\r\n" +
    			"	\"IndicatoreFatturaAccompagnatoria\" Boolean NULL,\r\n" +
    			"	\"CodicePagamento\" varchar(25) NULL,\r\n" +
    			"	\"CodiceBanca\" varchar(25) NULL,\r\n" +
    			"	\"CodiceImballo\" varchar(25) NULL,\r\n" +
    			"	\"PesoColli\" Float NULL,\r\n" +
    			"	\"NumeroColli\" Float NULL,\r\n" +
    			"	\"Acconto\" Float NULL,\r\n" +
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" +
    			"	\"Cambio\" Float NULL,\r\n" +
    			"	\"CodiceClienteSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"NomeSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"IndirizzoSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"CapSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"CittaSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"ProvinciaSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"CodiceNazioneSpedizione\" varchar(25) NULL,\r\n" +
    			"	\"Note\" varchar(25) NULL,\r\n" +
    			"	\"IndicatoreFatturazioneDifferita\" Boolean NULL,\r\n" +
    			"	\"IndicatoreEmail\" Boolean NULL,\r\n" +
    			"	\"IndicatorePa\" Boolean NULL,\r\n" +
    			"	\"SpeseTrasporto\" Float NULL,\r\n" +
    			"	\"SpeseImballo\" Float NULL,\r\n" +
    			"	\"SpeseIncasso\" Float NULL,\r\n" +
    			"	\"SpeseBolli\" Float NULL,\r\n" +
    			"	\"Omaggi\" Float NULL,\r\n" +
    			"	\"TotalePagato\" Float NULL,\r\n" +
    			"	\"DataScadenza\" Date NULL,\r\n" +
    			"	\"ImportoScadenza\" Float NULL,\r\n" +
    			"	\"DataInserimento\" Timestamp NULL,\r\n" +
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" +
    			"    Primary Key (\"NumeroFatturazione\", \"DataFattura\") \r\n " +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}


}
