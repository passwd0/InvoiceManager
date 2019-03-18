package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.FatturaProformaTestata;

public class WriteFatturaProformaTestata {
	private Connection c;

	public WriteFatturaProformaTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(FatturaProformaTestata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaProformaTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setInt(1, a.getNumeroFattura());
		ps.setDate(2, Date.valueOf(a.getDataFattura()));
		ps.setBoolean(3, a.isIndicatoreStatoAvanzamento());
		ps.setString(4, a.getCodiceClienteFatturazione());
		ps.setString(5, a.getCodiceEsenzioneIva());
		ps.setString(6, a.getCodiceAgente());
		ps.setString(7, a.getCodiceCausale());
		ps.setString(8, a.getCodiceCausalePrelievi());
		ps.setFloat(9, a.getPercentualeSconto());
		ps.setFloat(10, a.getPercentualeScontoPagamento());
		ps.setFloat(11, a.getPercentualeProvvigione());
		ps.setString(12, a.getDescrizione());
		ps.setInt(13, a.getNumeroCopieFattura());
		ps.setBoolean(14, a.isIndicatoreAddebitoBolli());
		ps.setBoolean(15, a.isIndicatoreAddebitoSpeseIncasso());
		ps.setBoolean(16, a.isIndicatoreScaricoMagazzino());
		ps.setInt(17, a.getCodiceListino());
		ps.setString(18, a.getCodiceResa());
		ps.setString(19, a.getCodiceVettore());
		ps.setBoolean(20, a.isIndicatoreFatturaAccompagnatoria());
		ps.setString(21, a.getCodicePagamento());
		ps.setString(22, a.getCodiceBanca());
		ps.setInt(23, a.getNumeroDDT());
		ps.setDate(24, Date.valueOf(a.getDataDDT()));
		ps.setString(25, a.getCodiceImballo());
		ps.setFloat(26, a.getPesoColli());
		ps.setFloat(27, a.getNumeroColli());
		ps.setFloat(28, a.getAcconto());
		ps.setString(29, a.getCodiceDivisa());
		ps.setFloat(30, a.getCambio());
		ps.setString(31, a.getCodiceClienteSpedizione());
		ps.setString(32, a.getNomeSpedizione());
		ps.setString(33, a.getIndirizzoSpedizione());
		ps.setString(34, a.getCapSpedizione());
		ps.setString(35, a.getCittaSpedizione());
		ps.setString(36, a.getProvinciaSpedizione());
		ps.setString(37, a.getCodiceNazioneSpedizione());
		ps.setDate(38, Date.valueOf(a.getDataInserimento()));
		ps.setDate(39, Date.valueOf(a.getDataUltimaModifica()));
		ps.setString(40, a.getNote());
		ps.setString(41, a.getCodiceLingua());
		ps.setBoolean(42, a.isIndicatoreFatturazioneDifferita());
		ps.setBoolean(43, a.isIndicatoreEdi());
		ps.setString(44, a.getCodiceFilialeEdi());
		ps.setBoolean(45, a.isIndicatoreEmail());
		ps.setBoolean(46, a.isIndicatorePA());
		ps.setBoolean(47, a.isIndicatoreXML());
		ps.setBoolean(48, a.isIndicatorePlafond());

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
	
	public void createDB() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.FatturaProformaTestata (\r\n" + 
    			"	\"NumeroFattura\" INTEGER NOT NULL,\r\n" + 
    			"	\"DataFattura\" Date NOT NULL,\r\n" + 
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
