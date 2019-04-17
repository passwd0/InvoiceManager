package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.FatturaProformaTestata;
import invoicemanager.utils.Utils;

public class WriteFatturaProformaTestata {
	private Connection c;

	public WriteFatturaProformaTestata()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(FatturaProformaTestata a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaProformaTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroFattura());
		ps.setDate(2, Utils.convertToDatabaseColumn(a.getDataFattura()));
		ps.setBoolean(3, a.isIndicatoreStatoAvanzamento());
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
		ps.setInt(14, a.getNumeroCopieFattura());
		ps.setBoolean(15, a.isIndicatoreAddebitoBolli());
		ps.setBoolean(16, a.isIndicatoreAddebitoSpeseIncasso());
		ps.setBoolean(17, a.isIndicatoreScaricoMagazzino());
		ps.setInt(18, a.getCodiceListino());
		ps.setString(19, a.getCodiceResa());
		ps.setString(20, a.getCodiceVettore());
		ps.setBoolean(21, a.isIndicatoreFatturaAccompagnatoria());
		ps.setString(22, a.getCodicePagamento());
		ps.setString(23, a.getCodiceBanca());
		ps.setInt(24, a.getNumeroDDT());
		ps.setDate(25, Utils.convertToDatabaseColumn(a.getDataDDT()));
		ps.setString(26, a.getCodiceImballo());
		ps.setFloat(27, a.getPesoColli());
		ps.setFloat(28, a.getNumeroColli());
		ps.setFloat(29, a.getAcconto());
		ps.setString(30, a.getCodiceDivisa());
		ps.setFloat(31, a.getCambio());
		ps.setString(32, a.getCodiceClienteSpedizione());
		ps.setString(33, a.getNomeSpedizione());
		ps.setString(34, a.getIndirizzoSpedizione());
		ps.setString(35, a.getCapSpedizione());
		ps.setString(36, a.getCittaSpedizione());
		ps.setString(37, a.getProvinciaSpedizione());
		ps.setString(38, a.getCodiceNazioneSpedizione());
		ps.setDate(39, Utils.convertToDatabaseColumn(a.getDataInserimento()));
		ps.setDate(40, Utils.convertToDatabaseColumn(a.getDataUltimaModifica()));
		ps.setString(41, a.getNote());
		ps.setString(42, a.getCodiceLingua());
		ps.setBoolean(43, a.isIndicatoreFatturazioneDifferita());
		ps.setBoolean(44, a.isIndicatoreEdi());
		ps.setString(45, a.getCodiceFilialeEdi());
		ps.setBoolean(46, a.isIndicatoreEmail());
		ps.setBoolean(47, a.isIndicatorePA());
		ps.setBoolean(48, a.isIndicatoreXML());
		ps.setBoolean(49, a.isIndicatorePlafond());

			res = ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
		}

	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.FatturaProformaTestata (\r\n" +
    			"	\"NumeroFattura\" INTEGER NOT NULL,\r\n" +
    			"	\"DataFattura\" Date NOT NULL,\r\n" +
    			"	\"Sezionale\" INTEGER NOT NULL,\r\n" +
    			"	\"IndicatoreStatoAvanzamento\" Boolean NULL,\r\n" +
    			"	\"CodiceClienteFatturazione\" varchar(25) NOT NULL,\r\n" +
    			"	\"CodiceEsenzioneIva\" varchar(25) NULL,\r\n" +
    			"	\"CodiceAgente\" varchar(25) NULL,\r\n" +
    			"	\"CodiceCausale\" varchar(25) NULL,\r\n" +
    			"	\"CodiceCausalePrelievi\" varchar(25) NULL,\r\n" +
    			"	\"PercentualeSconto\" Float NULL,\r\n" +
    			"	\"PercentualeScontoPagamento\" Float NULL,\r\n" +
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" +
    			"	\"Descrizione\" varchar(25) NULL,\r\n" +
    			"	\"NumeroCopieFattura\" INTEGER NULL,\r\n" +
    			"	\"IndicatoreAddebitoBolli\" Boolean NULL,\r\n" +
    			"	\"IndicatoreAddebitoSpeseIncasso\" Boolean NULL,\r\n" +
    			"	\"IndicatoreScaricoMagazzino\" Boolean NULL,\r\n" +
    			"	\"CodiceListino\" INTEGER NULL,\r\n" +
    			"	\"CodiceResa\" varchar(25) NULL,\r\n" +
    			"	\"CodiceVettore\" varchar(25) NULL,\r\n" +
    			"	\"IndicatoreFatturaAccompagnatoria\" Boolean NULL,\r\n" +
    			"	\"CodicePagamento\" varchar(25) NULL,\r\n" +
    			"	\"CodiceBanca\" varchar(25) NULL,\r\n" +
    			"	\"NumeroDDT\" INTEGER NULL,\r\n" +
    			"	\"DataDDT\" Date NULL,\r\n" +
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
    			"	\"DataInserimento\" Date NULL,\r\n" +
    			"	\"DataUltimaModifica\" Date NULL,\r\n" +
    			"	\"Note\" varchar(25) NULL,\r\n" +
    			"	\"CodiceLingua\" varchar(25) NULL,\r\n" +
    			"	\"IndicatoreFatturazioneDifferita\" Boolean NULL,\r\n" +
    			"	\"IndicatoreEdi\" Boolean NULL,\r\n" +
    			"	\"CodiceFilialeEdi\" varchar(25) NULL,\r\n" +
    			"	\"IndicatoreEmail\" Boolean NULL,\r\n" +
    			"	\"IndicatorePA\" Boolean NULL,\r\n" +
    			"	\"IndicatoreXML\" Boolean NULL,\r\n" +
    			"	\"IndicatorePlafond\" Boolean NULL, \r\n" +
    			"   Primary Key (\"NumeroFattura\", \"DataFattura\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}


}
