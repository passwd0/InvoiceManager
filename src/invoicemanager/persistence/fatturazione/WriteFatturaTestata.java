package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.FatturaTestata;

public class WriteFatturaTestata {
	private Connection c;

	public WriteFatturaTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(FatturaTestata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO FatturaTestata "
+ "VALUES ("
+"','"+a.getNumeroFatturazione()
+"','"+a.getDataFattura()
+"','"+a.getIndicatoreStatoAvanzamento()
+"','"+a.getCodiceClienteFatturazione()
+"','"+a.getCodiceEsenzioneIva()
+"','"+a.getCodiceAgente()
+"','"+a.getCodiceCausale()
+"','"+a.getCodiceCausalePrelievi()
+"','"+a.getPercentualeSconto()
+"','"+a.getPercentualeScontoPagamento()
+"','"+a.getPercentualeProvvigione()
+"','"+a.getDescrizione()
+"','"+a.getIndicatoreAddebitoBolli()
+"','"+a.getIndicatoreAddebitoSpeseIncasso()
+"','"+a.getIndicatoreScaricoMagazzino()
+"','"+a.getCodiceListino()
+"','"+a.getCodiceResa()
+"','"+a.getCodiceVettore()
+"','"+a.getIndicatoreFatturaAccompagnatoria()
+"','"+a.getCodicePagamento()
+"','"+a.getCodiceBanca()
+"','"+a.getCodiceImballo()
+"','"+a.getPesoColli()
+"','"+a.getNumeroColli()
+"','"+a.getAcconto()
+"','"+a.getCodiceDivisa()
+"','"+a.getCambio()
+"','"+a.getCodiceClienteSpedizione()
+"','"+a.getNomeSpedizione()
+"','"+a.getIndirizzoSpedizione()
+"','"+a.getCapSpedizione()
+"','"+a.getCittaSpedizione()
+"','"+a.getProvinciaSpedizione()
+"','"+a.getCodiceNazioneSpedizione()
+"','"+a.getDataInserimento()
+"','"+a.getDataUltimaModifica()
+"','"+a.getNote()
+"','"+a.getIndicatoreFatturazioneDifferita()
+"','"+a.getIndicatoreEmail()
+"','"+a.getIndicatorePa()
+"','"+a.getFatturadettaglio()
+"','"+a.getSpeseTrasporto()
+"','"+a.getSpeseImballo()
+"','"+a.getSpeseIncasso()
+"','"+a.getSpeseBolli()
+"','"+a.getOmaggi()
+"','"+a.getTotalePagato()
+"','"+a.getDataScadenza()
+"','"+a.getImportoScadenza()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceFatturaTestata=\'" + a.getCodiceFatturaTestata() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(FatturaTestata a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE FatturaTestata SET "
					+ "campo=value "
					+ "WHERE codiceFatturaTestata="+a.getCodiceFatturaTestata();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(FatturaTestata a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceFatturaTestata() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
