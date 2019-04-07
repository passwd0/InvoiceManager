package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
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

	    	PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, a.getId());
	    	ps.setInt(2, a.getNumeroFatturazione());
			ps.setDate(3, Utils.convertToDatabaseColumn(a.getDataFattura()));
			ps.setString(4, a.getStatoAvanzamento().name());
			ps.setInt(5, a.getSezionale());
			ps.setString(6, a.getCodiceClienteFatturazione());
			ps.setString(7, a.getCodiceEsenzioneIva());
			ps.setString(8, a.getCodiceAgente());
			ps.setString(9, a.getCodiceCausale());
			ps.setString(10, a.getCodiceCausalePrelievi());
			ps.setFloat(11, a.getPercentualeSconto());
			ps.setFloat(12, a.getPercentualeScontoPagamento());
			ps.setFloat(13, a.getPercentualeProvvigione());
			ps.setString(14, a.getDescrizione());
			ps.setBoolean(15, a.isIndicatoreAddebitoBolli());
			ps.setBoolean(16, a.isIndicatoreAddebitoSpeseIncasso());
			ps.setBoolean(17, a.isIndicatoreScaricoMagazzino());
			ps.setInt(18, a.getCodiceListino());
			ps.setString(19, a.getCodiceResa());
			ps.setString(20, a.getCodiceVettore());
			ps.setBoolean(21, a.isIndicatoreFatturaAccompagnatoria());
			ps.setString(22, a.getCodicePagamento());
			ps.setString(23, a.getCodiceBanca());
			ps.setString(24, a.getCodiceImballo());
			ps.setFloat(25, a.getPesoColli());
			ps.setFloat(26, a.getNumeroColli());
			ps.setFloat(27, a.getAcconto());
			ps.setString(28, a.getCodiceDivisa());
			ps.setFloat(29, a.getCambio());
			ps.setString(30, a.getCodiceClienteSpedizione());
			ps.setString(31, a.getNomeSpedizione());
			ps.setString(32, a.getIndirizzoSpedizione());
			ps.setString(33, a.getCapSpedizione());
			ps.setString(34, a.getCittaSpedizione());
			ps.setString(35, a.getProvinciaSpedizione());
			ps.setString(36, a.getCodiceNazioneSpedizione());
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

			if (a.getDataScadenza() != null)
				ps.setDate(47, Utils.convertToDatabaseColumn(a.getDataScadenza()));
			else
				ps.setDate(47, null);


			ps.setFloat(48, a.getImportoScadenza());
			ps.setTimestamp(49, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(50, Utils.toTimestamp(a.getDataUltimaModifica()));

	    	ps.executeUpdate();
			ps.close();
			c.commit();

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
    			"   \"IdFatturaTestata\" serial, \r\n" +
    			"	\"NumeroFatturazione\" INTEGER NOT NULL,\r\n" +
    			"	\"DataFattura\" Date NOT NULL ,\r\n" +
    			"	\"StatoAvanzamento\" varchar(25) NULL,\r\n" +
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
