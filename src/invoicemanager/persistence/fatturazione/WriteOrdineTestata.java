package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.OrdineTestata;

public class WriteOrdineTestata {
	private Connection c;

	public WriteOrdineTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(OrdineTestata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO OrdineTestata "
+ "VALUES ("
+"','"+a.getNumeroOrdine()
+"','"+a.getDataOrdine()
+"','"+a.getIndicatoreStatoAvanzamento()
+"','"+a.getCodiceClienteFatturazione()
+"','"+a.getDescrizione()
+"','"+a.getCodiceEsenzioneIva()
+"','"+a.getCodiceAgente()
+"','"+a.getPercentualeProvvigione()
+"','"+a.getPercentualeSconto()
+"','"+a.getPercentualeScontoPagamento()
+"','"+a.getNumeroCopieFattura()
+"','"+a.getIndicatoreAddebitoBolli()
+"','"+a.getIndicatoreAddebitoSpeseIncasso()
+"','"+a.getCodiceListino()
+"','"+a.getCodiceResa()
+"','"+a.getCodiceVettore()
+"','"+a.getCodiceCausale()
+"','"+a.getCodicePagamento()
+"','"+a.getCodiceBanca()
+"','"+a.getDataConsegna()
+"','"+a.getCausaleTrasporto()
+"','"+a.getCodiceDivisa()
+"','"+a.getIndicatoreConsegnaParziale()
+"','"+a.getIndicatoreRaggruppamentoConsegne()
+"','"+a.getCodiceAgenteVecchio()
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
+"','"+a.getLoginModifica()
+"','"+a.getCodiceLingua()
+"','"+a.getRevisione()
+"','"+a.getAttenzione()
+"','"+a.getIndicatoreOrdineTrading()
+"','"+a.getOrdineDettagli()
+"\');";
			else
				sql = "UPDATE auto SET stato = \'Disponibile\' WHERE codiceOrdineTestata=\'" + a.getCodiceOrdineTestata() + "\';";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(OrdineTestata a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE OrdineTestata SET "
					+ "campo=value "
					+ "WHERE codiceOrdineTestata="+a.getCodiceOrdineTestata();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(OrdineTestata a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceOrdineTestata() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
} 
