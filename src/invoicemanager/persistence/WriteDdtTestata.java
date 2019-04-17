package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.DdtTestata;
import invoicemanager.utils.Utils;

public class WriteDdtTestata {
	private Connection c;

	public WriteDdtTestata()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(DdtTestata a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO DdtTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, a.getNumeroDDT());
			ps.setTimestamp(2, Utils.toTimestamp(a.getDataDDT()));
			ps.setString(3, a.getStatoAvanzamento().name());
			ps.setString(4, a.getCodiceCausale());
			ps.setString(5, a.getCodiceCausalePrelievi());
			ps.setString(6, a.getCodiceClienteFatturazione());
			ps.setString(7, a.getCodiceEsenzioneIva());
			ps.setString(8, a.getCodiceAgente());
			ps.setFloat(9, a.getPercentualeProvvigione());
			ps.setFloat(10, a.getPercentualeSconto());
			ps.setInt(11, a.getNumeroCopieFattura());
			ps.setBoolean(12, a.isIndicatoreAddebitoBolli());
			ps.setBoolean(13, a.isIndicatoreAddebitoSpeseIncasso());
			ps.setInt(14, a.getCodiceListino());
			ps.setString(15, a.getCodiceResa());
			ps.setString(16, a.getCodiceVettore());
			ps.setString(17, a.getCodiceImballo());
			ps.setString(18, a.getCodicePagamento());
			ps.setString(19, a.getCodiceBanca());
			ps.setInt(20, a.getNumeroFattura());
			ps.setDate(21, Utils.convertToDatabaseColumn(a.getDataFattura()));
			ps.setString(22, a.getCodiceDivisa());
			ps.setString(23, a.getCausaleTrasporto());
			ps.setFloat(24, a.getPesoColli());
			ps.setString(25, a.getDescrizione());
			ps.setInt(26, a.getNumeroColli());
			ps.setBoolean(27, a.isIndicatorePreventivoDaConferma());
			ps.setBoolean(28, a.isIndicatoreBollaVisione());
			ps.setString(29, a.getCodiceClienteSpedizione());
			ps.setString(30, a.getNomeSpedizione());
			ps.setString(31, a.getIndirizzoSpedizione());
			ps.setString(32, a.getCapSpedizione());
			ps.setString(33, a.getCittaSpedizione());
			ps.setString(34, a.getProvinciaSpedizione());
			ps.setString(35, a.getCodiceNazioneSpedizione());
			ps.setString(36, a.getNote());
			ps.setString(37, a.getCodiceLingua());
			ps.setInt(38, a.getNumeroDdtDeposito());
			ps.setString(39, a.getCodiceDeposito());
			ps.setString(40, a.getNoteCaricamento());
			ps.setString(41, a.getCodiceFilialeEdi());
			ps.setTimestamp(42, Utils.toTimestamp(a.getDataCaricamento()));
			ps.setString(43, a.getUnitaMisuraPesoColli());
			ps.setTimestamp(44, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(45, Utils.toTimestamp(a.getDataUltimaModifica()));

	    	res = ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
	}

	public void set(DdtTestata a) throws ClassNotFoundException, SQLException {
		try {
//			stmt.executeUpdate();
//			stmt.close();
//			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(DdtTestata a) throws ClassNotFoundException, SQLException {
		try {
//	        Statement stmt = c.createStatement();
//	    	stmt.executeUpdate();
//	    	stmt.close();
//	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.DdtTestata (\r\n" + 
    			"	\"id\" serial NOT NULL,\r\n" + 
    			"	\"NumeroDDT\" INTEGER NOT NULL,\r\n" + 
    			"	\"DataDDT\" Timestamp NOT NULL,\r\n" + 
    			"	\"StatoAvanzamento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCausale\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCausalePrelievi\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceClienteFatturazione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceEsenzioneIva\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceAgente\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"PercentualeSconto\" Float NULL,\r\n" + 
    			"	\"NumeroCopieFattura\" INTEGER NULL,\r\n" + 
    			"	\"IndicatoreAddebitoBolli\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreAddebitoSpeseIncasso\" Boolean NULL,\r\n" + 
    			"	\"CodiceListino\" INTEGER NULL,\r\n" + 
    			"	\"CodiceResa\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceVettore\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceImballo\" varchar(25) NULL,\r\n" + 
    			"	\"CodicePagamento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceBanca\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroFattura\" INTEGER NULL,\r\n" + 
    			"	\"DataFattura\" Date NULL,\r\n" + 
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
    			"	\"CausaleTrasporto\" varchar(25) NULL,\r\n" + 
    			"	\"PesoColli\" Float NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroColli\" INTEGER NULL,\r\n" + 
    			"	\"IndicatorePreventivoDaConferma\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreBollaVisione\" Boolean NULL,\r\n" + 
    			"	\"CodiceClienteSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"NomeSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"IndirizzoSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CapSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CittaSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"ProvinciaSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceNazioneSpedizione\" varchar(25) NULL,\r\n" + 
    			"	\"Note\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceLingua\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroDdtDeposito\" INTEGER NULL,\r\n" + 
    			"	\"CodiceDeposito\" varchar(25) NULL,\r\n" + 
    			"	\"NoteCaricamento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceFilialeEdi\" varchar(25) NULL,\r\n" + 
    			"	\"DataCaricamento\" Timestamp NULL,\r\n" + 
    			"	\"UnitaMisuraPesoColli\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"    Primary Key (\"NumeroDDT\", \"DataDDT\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
} 
