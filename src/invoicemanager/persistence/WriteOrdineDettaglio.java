package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.OrdineDettaglio;
import invoicemanager.utils.Utils;

public class WriteOrdineDettaglio {
	private Connection c;

	public WriteOrdineDettaglio()  {
		try { c = DBConnect.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(OrdineDettaglio a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO OrdineDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, a.getNumeroOrdine());
			ps.setDate(2, Utils.convertToDatabaseColumn(a.getDataOrdine()));
			ps.setInt(3, a.getNumeroRigaOrdine());
			ps.setString(4, a.getCodiceTipoRigaDocumento());
			ps.setString(5, a.getCodiceMagazzino());
			ps.setString(6, a.getCodiceArticolo());
			ps.setFloat(7, a.getQuantitaConsegnata());
			ps.setBoolean(8, a.isIndicatoreEvasione());
			ps.setString(9, a.getDescrizione());
			ps.setDate(10, Utils.convertToDatabaseColumn(a.getDataConsegna()));
			ps.setFloat(11, a.getQuantita());
			ps.setString(12, a.getCodiceUnitaMisura());
			ps.setFloat(13, a.getPrezzo());
			ps.setString(14, a.getCodiceIva());
			ps.setString(15, a.getCodiceContropartitaContabile());
			ps.setFloat(16, a.getPercentualeProvvigione());
			ps.setFloat(17, a.getPercentualeScontoCliente());
			ps.setFloat(18, a.getPercentualeScontoArticolo());
			ps.setFloat(19, a.getPercentualeScontoPagamento());
			ps.setString(20, a.getDescrizioneAggiuntiva());
			ps.setBoolean(21, a.isIndicatoreCoordinamento());
			ps.setBoolean(22, a.isIndicatoreOrdineDaFatturare());
			ps.setFloat(23, a.getQuantitaVariata());
			ps.setInt(24, a.getNumeroPreventivo());
			ps.setInt(25, a.getNumeroRigaPreventivo());
			ps.setDate(26, Utils.convertToDatabaseColumn(a.getDataPreventivo()));
			ps.setFloat(27, a.getQuantitaEvasa());
			ps.setBoolean(28, a.isIndicatoreEvasionePreventivi());
			ps.setBoolean(29, a.isIndicatoreEvasioneRigheNote());
			ps.setBoolean(30, a.isIndicatoreNoConferma());
			ps.setDate(31, Utils.convertToDatabaseColumn(a.getDataConsegnaSchedulatore()));
			ps.setDate(32, Utils.convertToDatabaseColumn(a.getDataConsegnaProposta()));
			ps.setBoolean(33, a.isIndicatoreBloccato());
			ps.setBoolean(34, a.isIndicatoreOrdineTrading());
			ps.setDate(35, Utils.convertToDatabaseColumn(a.getDataInizioSchedulatore()));
			ps.setString(36, a.getCodiceArticoloBis());
			ps.setTimestamp(37, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(38, Utils.toTimestamp(a.getDataUltimaModifica()));


			res = ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
	}

	public void set(OrdineDettaglio a) throws ClassNotFoundException, SQLException {
		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE OrdineDettaglio SET "
//					+ "campo=value "
//					+ "WHERE codiceOrdineDettaglio="+a.getCodiceOrdineDettaglio();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(OrdineDettaglio a) throws ClassNotFoundException, SQLException {
		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceOrdineDettaglio() + ";";
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
    	String sql = "Create table public.OrdineDettaglio (\r\n" + 
    			"	\"NumeroOrdine\" INTEGER NOT NULL,\r\n" + 
    			"	\"DataOrdine\" Date NOT NULL ,\r\n" + 
    			"	\"NumeroRigaOrdine\" INTEGER NOT NULL ,\r\n" + 
    			"	\"CodiceTipoRigaDocumento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NULL,\r\n" + 
    			"	\"QuantitaConsegnata\" Float NULL,\r\n" + 
    			"	\"IndicatoreEvasione\" Boolean NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"DataConsegna\" Date NULL,\r\n" + 
    			"	\"Quantita\" Float NULL,\r\n" + 
    			"	\"CodiceUnitaMisura\" varchar(25) NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL,\r\n" + 
    			"	\"CodiceIva\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceContropartitaContabile\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoCliente\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoArticolo\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoPagamento\" Float NULL,\r\n" + 
    			"	\"DescrizioneAggiuntiva\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreCoordinamento\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreOrdineDaFatturare\" Boolean NULL,\r\n" + 
    			"	\"QuantitaVariata\" Float NULL,\r\n" + 
    			"	\"NumeroPreventivo\" INTEGER NULL,\r\n" + 
    			"	\"NumeroRigaPreventivo\" INTEGER NULL,\r\n" + 
    			"	\"DataPreventivo\" Date NULL,\r\n" + 
    			"	\"QuantitaEvasa\" Float NULL,\r\n" + 
    			"	\"IndicatoreEvasionePreventivi\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreEvasioneRigheNote\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreNoConferma\" Boolean NULL,\r\n" + 
    			"	\"DataConsegnaSchedulatore\" Date NULL,\r\n" + 
    			"	\"DataConsegnaProposta\" Date NULL,\r\n" + 
    			"	\"IndicatoreBloccato\" Boolean NULL,\r\n" + 
    			"	\"IndicatoreOrdineTrading\" Boolean NULL,\r\n" + 
    			"	\"DataInizioSchedulatore\" Date NULL,\r\n" + 
    			"	\"CodiceArticoloBis\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"NumeroOrdine\",\"DataOrdine\",\"NumeroRigaOrdine\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
} 
