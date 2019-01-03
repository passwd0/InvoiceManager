package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.DdtTestata;
import invoicemanager.utils.Utils;

public class WriteDdtTestata {
	private Connection c;

	public WriteDdtTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(DdtTestata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO DdtTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
			ps.setInt(1, a.getNumeroDDT());
			ps.setTimestamp(2, Utils.toTimestamp(a.getDataDDT()));
			ps.setBoolean(3, a.isIndicatoreStatoAvanzamento());
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
			ps.setDate(21, Date.valueOf(a.getDataFattura()));
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
			ps.setTimestamp(45, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(46, Utils.toTimestamp(a.getDataUltimaModifica()));

	    	ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
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
} 
