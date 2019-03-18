package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.FatturaDettaglio;
import invoicemanager.utils.Utils;

public class WriteFatturaDettaglio {
	private Connection c;

	public WriteFatturaDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(FatturaDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
			ps.setInt(1, a.getNumeroFattura());
			ps.setDate(2, Date.valueOf(a.getDataFattura()));
			ps.setInt(3, a.getNumeroRigaFattura());
			ps.setString(4, a.getCodiceTipoRigaDocumento());
			ps.setString(5, a.getCodiceArticolo());
			ps.setFloat(6, a.getCosto());
			ps.setInt(7, a.getNumeroOrdine());
			ps.setInt(8, a.getNumeroRigaOrdine());
			ps.setDate(9, Date.valueOf(a.getDataOrdine()));
			ps.setFloat(10, a.getQuantitaDaConsegnare());
			ps.setBoolean(11, a.isIndicatoreEvasione());
			ps.setString(12, a.getDescrizione());
			ps.setFloat(13, a.getQuantita());
			ps.setFloat(14, a.getPrezzo());
			ps.setString(15, a.getCodiceIva());
			ps.setString(16, a.getCodiceContropartitaContabile());
			ps.setFloat(17, a.getPercentualeProvvigione());
			ps.setFloat(18, a.getPercentualeScontoCliente());
			ps.setFloat(19, a.getPercentualeScontoArticolo());
			ps.setFloat(20, a.getPercentualeScontoPagamento());
			ps.setString(21, a.getCodiceUnitaMisura());
			ps.setString(22, a.getSerialNumber());
			ps.setBoolean(23, a.isIndicatoreNoConferma());
			ps.setString(24, a.getCodiceMagazzino());
			ps.setInt(25, a.getNumeroDdt());
			ps.setTimestamp(26, Utils.toTimestamp(a.getDataDdt()));
			ps.setInt(27, a.getNumeroRigaDdt());
			ps.setString(28, a.getCodicePercipiente());
			ps.setString(29, a.getCodiceCassaPrevidenziale());
			ps.setString(30, a.getCodiceCdc());
			ps.setString(31, a.getContoRicavoUsato());
			ps.setString(32, a.getRicavoUsato());
			ps.setInt(33, a.getCodiceOrdine());
			ps.setInt(34, a.getCodiceContratto());
			ps.setInt(35, a.getCodiceConvezione());
			ps.setInt(36, a.getCodiceRicezione());
			ps.setInt(37, a.getCodiceFatturaCollegata());
			ps.setInt(38, a.getCodiceAltriDatiGestionali());
			ps.setTimestamp(39, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(40, Utils.toTimestamp(a.getDataUltimaModifica()));

			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(FatturaDettaglio a) throws ClassNotFoundException, SQLException {
		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE FatturaDettaglio SET "
//					+ "campo=value "
//					+ "WHERE codiceFatturaDettaglio="+a.getCodiceFatturaDettaglio();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(FatturaDettaglio a) throws ClassNotFoundException, SQLException {
		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceFatturaDettaglio() + ";";
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
    	String sql = "Create table public.FatturaDettaglio (\r\n" + 
    			"	\"NumeroFattura\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"DataFattura\" Date NOT NULL Primary Key,\r\n" + 
    			"	\"NumeroRigaFattura\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"CodiceTipoRigaDocumento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NULL,\r\n" + 
    			"	\"Costo\" Float NULL,\r\n" + 
    			"	\"NumeroOrdine\" INTEGER NULL,\r\n" + 
    			"	\"NumeroRigaOrdine\" INTEGER NULL,\r\n" + 
    			"	\"DataOrdine\" Date NULL,\r\n" + 
    			"	\"QuantitaDaConsegnare\" Float NULL,\r\n" + 
    			"	\"IndicatoreEvasione\" Boolean NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Quantita\" Float NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL,\r\n" + 
    			"	\"CodiceIva\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceContropartitaContabile\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoCliente\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoArticolo\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoPagamento\" Float NULL,\r\n" + 
    			"	\"CodiceUnitaMisura\" varchar(25) NULL,\r\n" + 
    			"	\"SerialNumber\" varchar(25) NULL,\r\n" + 
    			"	\"IndicatoreNoConferma\" Boolean NULL,\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"NumeroDdt\" INTEGER NULL,\r\n" + 
    			"	\"DataDdt\" Timestamp NULL,\r\n" + 
    			"	\"NumeroRigaDdt\" INTEGER NULL,\r\n" + 
    			"	\"CodicePercipiente\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCassaPrevidenziale\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCdc\" varchar(25) NULL,\r\n" + 
    			"	\"ContoRicavoUsato\" varchar(25) NULL,\r\n" + 
    			"	\"RicavoUsato\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceOrdine\" INTEGER NULL,\r\n" + 
    			"	\"CodiceContratto\" INTEGER NULL,\r\n" + 
    			"	\"CodiceConvezione\" INTEGER NULL,\r\n" + 
    			"	\"CodiceRicezione\" INTEGER NULL,\r\n" + 
    			"	\"CodiceFatturaCollegata\" INTEGER NULL,\r\n" + 
    			"	\"CodiceAltriDatiGestionali\" INTEGER NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
} 
