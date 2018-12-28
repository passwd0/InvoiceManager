package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.DdtTestata;

public class WriteDdtTestata {
	private Connection c;

	public WriteDdtTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(DdtTestata a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO DdtTestata "
+ "VALUES ("
+"','"+a.getNumeroDDT()
+"','"+a.getDataDDT()
+"','"+a.getIndicatoreStatoAvanzamento()
+"','"+a.getCodiceCausale()
+"','"+a.getCodiceCausalePrelievi()
+"','"+a.getCodiceClienteFatturazione()
+"','"+a.getCodiceEsenzioneIva()
+"','"+a.getCodiceAgente()
+"','"+a.getPercentualeProvvigione()
+"','"+a.getPercentualeSconto()
+"','"+a.getNumeroCopieFattura()
+"','"+a.getIndicatoreAddebitoBolli()
+"','"+a.getIndicatoreAddebitoSpeseIncasso()
+"','"+a.getCodiceListino()
+"','"+a.getCodiceResa()
+"','"+a.getCodiceVettore()
+"','"+a.getCodiceImballo()
+"','"+a.getCodicePagamento()
+"','"+a.getCodiceBanca()
+"','"+a.getNumeroFattura()
+"','"+a.getDataFattura()
+"','"+a.getCodiceDivisa()
+"','"+a.getCausaleTrasporto()
+"','"+a.getPesoColli()
+"','"+a.getDescrizione()
+"','"+a.getNumeroColli()
+"','"+a.getIndicatorePreventivoDaConferma()
+"','"+a.getIndicatoreBollaVisione()
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
+"','"+a.getLoginInserimento()
+"','"+a.getOginModifica()
+"','"+a.getCodiceLingua()
+"','"+a.getNumeroDdtDeposito()
+"','"+a.getCodiceDeposito()
+"','"+a.getNoteCaricamento()
+"','"+a.getCodiceFilialeEdi()
+"','"+a.getDataCaricamento()
+"','"+a.getUnitaMisuraPesoColli()
+"','"+a.getDdtDettagli()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceDdtTestata=\'" + a.getCodiceDdtTestata() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(DdtTestata a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE DdtTestata SET "
					+ "campo=value "
					+ "WHERE codiceDdtTestata="+a.getCodiceDdtTestata();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(DdtTestata a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceDdtTestata() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
