package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.PreventivoTestata;
import invoicemanager.utils.Utils;

public class WritePreventivoTestata {
	private Connection c;

	public WritePreventivoTestata()  {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(PreventivoTestata a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO PreventivoTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroPreventivo());
		ps.setDate(2, Utils.convertToDatabaseColumn(a.getDataPreventivo()));
		ps.setBoolean(3, a.isIndicatoreStatoAvanzamento());
		ps.setDate(4, Utils.convertToDatabaseColumn(a.getDataConsegna()));
		ps.setDate(5, Utils.convertToDatabaseColumn(a.getDataValidita()));
		ps.setString(6, a.getPeriodoValidita());
		ps.setBoolean(7, a.isIndicatoreUtilizzoDataValidita());
		ps.setString(8, a.getCodiceCliente());
		ps.setString(9, a.getAttenzione());
		ps.setString(10, a.getOggetto());
		ps.setString(11, a.getRiferimentoInterno());
		ps.setString(12, a.getNumeroInterno());
		ps.setString(13, a.getCodiceIVA());
		ps.setString(14, a.getCodiceAgente());
		ps.setString(15, a.getCodiceResa());
		ps.setString(16, a.getCodiceVettore());
		ps.setString(17, a.getCodicePagamento());
		ps.setString(18, a.getCodiceBanca());
		ps.setString(19, a.getCodiceCausale());
		ps.setString(20, a.getCodiceCausalePrelievo());
		ps.setBoolean(21, a.isCodiceListino());
		ps.setString(22, a.getDescrizioneOrdine());
		ps.setString(23, a.getCodiceDivisa());
		ps.setFloat(24, a.getCambio());
		ps.setString(25, a.getNumeroFax());
		ps.setString(26, a.getVenditore());
		ps.setBoolean(27, a.isIndicatoreAddebitoBolli());
		ps.setBoolean(28, a.isIndicatoreAddebitoSpeseIncasso());
		ps.setString(29, a.getNote());
		ps.setString(30, a.getCodiceClienteSpedizione());
		ps.setString(31, a.getNomeSpedizione());
		ps.setString(32, a.getIndirizzoSpedizione());
		ps.setString(33, a.getCapSpedizione());
		ps.setString(34, a.getCittaSpedizione());
		ps.setString(35, a.getProvinciaSpedizione());
		ps.setString(36, a.getCodiceNazioneSpedizione());
		ps.setString(37, a.getLoginInserimento());
		ps.setTimestamp(38, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(39, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.PreventivoTestata (\r\n" + 
    			"	\"NumeroPreventivo\" INTEGER NOT NULL ,\r\n" + 
    			"	\"DataPreventivo\" Date NOT NULL ,\r\n" + 
    			"	\"IndicatoreStatoAvanzamento\" Boolean NULL,\r\n" + 
    			"	\"DataConsegna\" Date NULL,\r\n" + 
    			"	\"DataValidita\" Date NULL,\r\n" + 
    			"	\"PeriodoValidita\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreUtilizzoDataValidita\" Boolean NULL,\r\n" + 
    			"	\"CodiceCliente\" varchar(25) NULL,\r\n" + 
    			"	\"Attenzione\" varchar(25) NULL,\r\n" + 
    			"	\"Oggetto\" varchar(25) NULL,\r\n" + 
    			"	\"RiferimentoInterno\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroInterno\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceIVA\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceAgente\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceResa\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceVettore\" varchar(25) NULL,\r\n" + 
    			"	\"CodicePagamento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceBanca\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCausale\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCausalePrelievo\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceListino\" Boolean NULL,\r\n" + 
    			"	\"DescrizioneOrdine\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
    			"	\"Cambio\" Float NULL,\r\n" + 
    			"	\"NumeroFax\" varchar(25) NULL,\r\n" + 
    			"	\"Venditore\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreAddebitoBolli\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreAddebitoSpeseIncasso\" Boolean NULL,\r\n" + 
    			"	\"Note\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceClienteSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"NomeSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"IndirizzoSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CapSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CittaSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"ProvinciaSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceNazioneSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"LoginInserimento\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"NumeroPreventivo\", \"DataPreventivo\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
}
