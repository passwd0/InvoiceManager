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
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
			ps.setInt(1, a.getNumeroFatturazione());
			ps.setDate(2, Date.valueOf(a.getDataFattura()));
			ps.setString(3, a.getCodiceStatoAvanzamento());
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
			ps.setString(35, a.getNote());
			ps.setBoolean(36, a.isIndicatoreFatturazioneDifferita());
			ps.setBoolean(37, a.isIndicatoreEmail());
			ps.setBoolean(38, a.isIndicatorePa());
			ps.setFloat(39, a.getSpeseTrasporto());
			ps.setFloat(40, a.getSpeseImballo());
			ps.setFloat(41, a.getSpeseIncasso());
			ps.setFloat(42, a.getSpeseBolli());
			ps.setFloat(43, a.getOmaggi());
			ps.setFloat(44, a.getTotalePagato());
			ps.setDate(45, Date.valueOf(a.getDataScadenza()));
			ps.setFloat(46, a.getImportoScadenza());
			ps.setTimestamp(47, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(48, Utils.toTimestamp(a.getDataUltimaModifica()));

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
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.FatturaTestata (\r\n" + 
    			"	\"NumeroFatturazione\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"DataFattura\" Date NOT NULL Primary Key,\r\n" + 
    			"	\"CodiceStatoAvanzamento\" varchar(25) NULL,\r\n" + 
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
    			"	\"DataUltimaModifica\" Timestamp NULL,\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
} 
