package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.utils.Utils;

public class WriteCliente {
	private Connection c;
	
	public WriteCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}
	
	public void add(Cliente a, boolean exist){
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Cliente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
	    	ps.setString(1, a.getCodiceCliente());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getCodiceTipoCliente());
			ps.setString(4, a.getCodiceResaMerce());
			ps.setString(5, a.getCodiceImballo());
			ps.setString(6, a.getCodiceRaggruppamento());
			ps.setFloat(7, a.getFatturato());
			ps.setFloat(8, a.getFido());
			ps.setString(9, a.getPartitaIVA());
			ps.setString(10, a.getCodiceFiscale());
			ps.setString(11, a.getCodicePagamento());
			ps.setString(12, a.getCodiceBanca());
			ps.setInt(13, a.getNumeroFattureEmesse());
			ps.setString(14, a.getCodiceIva());
			ps.setFloat(15, a.getImponibileNonEsente());
			ps.setFloat(16, a.getImponibileEsente());
			ps.setFloat(17, a.getImportoIVA());
			ps.setString(18, a.getCodiceClassificazione());
			ps.setString(19, a.getCodiceAgente());
			ps.setFloat(20, a.getPercentualeProvvigioneAgente());
			ps.setFloat(21, a.getScontoLegatoProvvigioniAgente());
			ps.setInt(22, a.getNumeroCopieFattura());
			ps.setBoolean(23, a.isIndicatoreAddebitoSpeseIncasso());
			ps.setBoolean(24, a.isIndicatoreAddebitoSpeseBolli());
			ps.setInt(25, a.getProgressivo());
			ps.setString(26, a.getCodiceVettore());
			ps.setString(27, a.getCodiceAffidabilita());
			ps.setString(28, a.getCodiceIso());
			ps.setString(29, a.getPartitaIVAEstero());
			ps.setString(30, a.getCodiceDivisa());
			ps.setInt(31, a.getDataScadenzaSpostataAgosto());
			ps.setInt(32, a.getDataScadenzaSpostataDicembre());
			ps.setString(33, a.getCodiceLingua());
			ps.setString(34, a.getNote());
			ps.setString(35, a.getStato().name());
			ps.setBoolean(36, a.isIndicatoreInviataInformativaPrivacy());
			ps.setBoolean(37, a.isIndicatoreRicevutaInformativaPrivacy());
			ps.setBoolean(38, a.isIndicatoreScorporoIVA());
			ps.setBoolean(39, a.isIndicatoreIVADifferita());
			ps.setBoolean(40, a.isIndicatoreEmail());
			ps.setBoolean(41, a.isInputInibito());
			ps.setBoolean(42, a.isIndicatoreFatturePA());
			ps.setDate(43, Date.valueOf(a.getDataUltimaFattura()));
			ps.setFloat(44, a.getImportoUltimaFattura());
			ps.setFloat(45, a.getImportoPlafond());
			ps.setString(46, a.getNumeroUltimaFattura());
			ps.setDate(47, Date.valueOf(a.getDataInizioPlafond()));
			ps.setBoolean(48, a.isIndicatoreFattureXML());
			ps.setBoolean(49, a.isIndicatoreDdtEmail());
			ps.setBoolean(50, a.isIndicatorePlafond());
			ps.setString(51, a.getCodiceDestinatarioXml());
			ps.setString(52, a.getCodiceEORI());
			ps.setInt(53, a.getCodiceStabileOrganizzazione());
			ps.setInt(54, a.getCodiceRappresentanteFiscale());
			ps.setInt(55, a.getCodiceTerzoIntermediario());
			ps.setTimestamp(56, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(57, Utils.toTimestamp(a.getDataUltimaModifica()));

			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  e.getStackTrace();
	    	  //Utils.createAlertFailWriteDB();
	      }
	}
	
	public void set(Cliente a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;
			
			sql = "UPDATE Cliente SET "
					+ "campo=value " 
					+ "WHERE codiceCliente="+a.getCodiceCliente();
			stmt.executeUpdate(sql);
			
			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}
	
	public void delete(Cliente a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = 'Eliminato' WHERE id = " + a.getCodiceCliente() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
	
	public void createDB() {
		try {
			Statement stmt = c.createStatement();
			String sql = "Create table public.Cliente (\r\n" + 
					"	\"CodiceCliente\" varchar(25) NOT NULL Primary Key,\r\n" + 
					"	\"Descrizione\" varchar(25) NULL,\r\n" + 
					"	\"CodiceTipoCliente\" varchar(25) NULL,\r\n" + 
					"	\"CodiceResaMerce\" varchar(25) NULL,\r\n" + 
					"	\"CodiceImballo\" varchar(25) NULL,\r\n" + 
					"	\"CodiceRaggruppamento\" varchar(25) NULL,\r\n" + 
					"	\"Fatturato\" Float NULL,\r\n" + 
					"	\"Fido\" Float NULL,\r\n" + 
					"	\"PartitaIVA\" varchar(25) NULL,\r\n" + 
					"	\"CodiceFiscale\" varchar(25) NULL,\r\n" + 
					"	\"CodicePagamento\" varchar(25) NULL,\r\n" + 
					"	\"CodiceBanca\" varchar(25) NULL,\r\n" + 
					"	\"NumeroFattureEmesse\" INTEGER NULL,\r\n" + 
					"	\"CodiceIva\" varchar(25) NULL,\r\n" + 
					"	\"ImponibileNonEsente\" Float NULL,\r\n" + 
					"	\"ImponibileEsente\" Float NULL,\r\n" + 
					"	\"ImportoIVA\" Float NULL,\r\n" + 
					"	\"CodiceClassificazione\" varchar(25) NULL,\r\n" + 
					"	\"CodiceAgente\" varchar(25) NULL,\r\n" + 
					"	\"PercentualeProvvigioneAgente\" Float NULL,\r\n" + 
					"	\"ScontoLegatoProvvigioniAgente\" Float NULL,\r\n" + 
					"	\"NumeroCopieFattura\" INTEGER NULL,\r\n" + 
					"	\"IndicatoreAddebitoSpeseIncasso\" Boolean NULL,\r\n" + 
					"	\"IndicatoreAddebitoSpeseBolli\" Boolean NULL,\r\n" + 
					"	\"Progressivo\" INTEGER NULL,\r\n" + 
					"	\"CodiceVettore\" varchar(25) NULL,\r\n" + 
					"	\"CodiceAffidabilita\" varchar(25) NULL,\r\n" + 
					"	\"CodiceIso\" varchar(25) NULL,\r\n" + 
					"	\"PartitaIVAEstero\" varchar(25) NULL,\r\n" + 
					"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
					"	\"DataScadenzaSpostataAgosto\" INTEGER NULL,\r\n" + 
					"	\"DataScadenzaSpostataDicembre\" INTEGER NULL,\r\n" + 
					"	\"CodiceLingua\" varchar(25) NULL,\r\n" + 
					"	\"Note\" varchar(25) NULL,\r\n" + 
					"	\"Stato\" varchar(25) NULL,\r\n" + 
					"	\"IndicatoreInviataInformativaPrivacy\" Boolean NULL,\r\n" + 
					"	\"IndicatoreRicevutaInformativaPrivacy\" Boolean NULL,\r\n" + 
					"	\"IndicatoreScorporoIVA\" Boolean NULL,\r\n" + 
					"	\"IndicatoreIVADifferita\" Boolean NULL,\r\n" + 
					"	\"IndicatoreEmail\" Boolean NULL,\r\n" + 
					"	\"InputInibito\" Boolean NULL,\r\n" + 
					"	\"IndicatoreFatturePA\" Boolean NULL,\r\n" + 
					"	\"DataUltimaFattura\" Date NULL,\r\n" + 
					"	\"ImportoUltimaFattura\" Float NULL,\r\n" + 
					"	\"ImportoPlafond\" Float NULL,\r\n" + 
					"	\"NumeroUltimaFattura\" varchar(25) NULL,\r\n" + 
					"	\"DataInizioPlafond\" Date NULL,\r\n" + 
					"	\"IndicatoreFattureXML\" Boolean NULL,\r\n" + 
					"	\"IndicatoreDdtEmail\" Boolean NULL,\r\n" + 
					"	\"IndicatorePlafond\" Boolean NULL,\r\n" + 
					"	\"CodiceDestinatarioXml\" varchar(25) NULL,\r\n" + 
					"	\"CodiceEORI\" varchar(25) NULL,\r\n" + 
					"	\"CodiceStabileOrganizzazione\" INTEGER NULL,\r\n" + 
					"	\"CodiceRappresentanteFiscale\" INTEGER NULL,\r\n" + 
					"	\"CodiceTerzoIntermediario\" INTEGER NULL,\r\n" + 
					"	\"DataInserimento\" Timestamp NULL,\r\n" + 
					"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
					");";
			stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
}