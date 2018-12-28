package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import invoicemanager.model.fatturazione.Cliente;

public class WriteCliente {
	private Connection c;
	
	public WriteCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}
	
	public void add(Cliente a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			Statement stmt = c.createStatement();
			String sql;
			if (!exist)
				sql = "INSERT INTO Clienti "
						+ "(codiceCliente, descrizione, dataInserimento, dataUltimoAggiornamento, codiceTipoCliente, codiceUfficioCommerciale, codiceResaMerce, "
						+ "codiceImballo, codiceRaggruppamento, fatturato, fido, partitaIVA, codiceFiscale, codicePagamento, sinonimo, codiceBanca, numeroFattureEmesse, "
						+ "codiceEsenzioneIVA, imponibileNonEsente, imponibileEsente, importoIVA, codiceClassificazione, costoVenduto, codiceAgente, "
						+ "percentualeProvvigioneAgente, scontoLegatoProvvigioniAgente, numeroCopieFattura, indicatoreAddebitoSpeseIncasso, "
						+ "indicatoreAddebitoSpeseBolli, codiceListino, codiceVettore, codiceAffidabilita, codiceISO, partitaIVAEstero, codiceDivisa, "
						+ "dataScadenzaSpostataAgosto, dataScadenzaSpostataDicembre, codiceRetrocessione, codiceCommissione, codiceLingua, note, codiceStato, "
						+ "indicatoreInviataInformativaPrivacy, indicatoreRicevutaInformativaPrivacy, codiceClienteRiferimento, dataUltimaModifica, "
						+ "indicatoreInibizione, loginInserimento, loginModifica, indicatoreScorporoIVA, indicatoreIVADifferita, indicatoreEmail, inputInibito, "
						+ "indicatoreEdi, partitaIvaEdi, qualificatoreEdi, identificativoFornitoreEdi, tipoFornitoreEdi, identificativoIntestatarioFatturaEdi, "
						+ "tipoIntestatarioFatturaEdi, identificativoPuntoConsegnaEdi, tipoPuntoConsegnaEdi) "
						+ "VALUES ("+
					"'"+a.getCodiceCliente()
					+"','"+a.getCodiceCliente()
					+"','"+a.getDescrizione()
					+"','"+a.getDataInserimento()
					+"','"+a.getDataUltimoAggiornamento()
					+"','"+a.getCodiceTipoCliente()
					+"','"+a.getCodiceUfficioCommerciale()
					+"','"+a.getCodiceResaMerce()
					+"','"+a.getCodiceImballo()
					+"','"+a.getCodiceRaggruppamento()
					+"','"+a.getFatturato()
					+"','"+a.getFido()
					+"','"+a.getPartitaIVA()
					+"','"+a.getCodiceFiscale()
					+"','"+a.getCodicePagamento()
					+"','"+a.getSinonimo()
					+"','"+a.getCodiceBanca()
					+"','"+a.getNumeroFattureEmesse()
					+"','"+a.getCodiceEsenzioneIVA()
					+"','"+a.getImponibileNonEsente()
					+"','"+a.getImponibileEsente()
					+"','"+a.getImportoIVA()
					+"','"+a.getCodiceClassificazione()
					+"','"+a.getCostoVenduto()
					+"','"+a.getCodiceAgente()
					+"','"+a.getPercentualeProvvigioneAgente()
					+"','"+a.getScontoLegatoProvvigioniAgente()
					+"','"+a.getNumeroCopieFattura()
					+"','"+a.isIndicatoreAddebitoSpeseIncasso()
					+"','"+a.isIndicatoreAddebitoSpeseBolli()
					+"','"+a.getCodiceListino()
					+"','"+a.getCodiceVettore()
					+"','"+a.getCodiceAffidabilita()
					+"','"+a.getCodiceISO()
					+"','"+a.getPartitaIVAEstero()
					+"','"+a.getCodiceDivisa()
					+"','"+a.getDataScadenzaSpostataAgosto()
					+"','"+a.getDataScadenzaSpostataDicembre()
					+"','"+a.getCodiceRetrocessione()
					+"','"+a.getCodiceCommissione()
					+"','"+a.getCodiceLingua()
					+"','"+a.getNote()
					+"','"+a.getCodiceStato()
					+"','"+a.isIndicatoreInviataInformativaPrivacy()
					+"','"+a.isIndicatoreRicevutaInformativaPrivacy()
					+"','"+a.getCodiceClienteRiferimento()
					+"','"+a.getDataUltimaModifica()
					+"','"+a.isIndicatoreInibizione()
					+"','"+a.getLoginInserimento()
					+"','"+a.getLoginModifica()
					+"','"+a.isIndicatoreScorporoIVA()
					+"','"+a.isIndicatoreIVADifferita()
					+"','"+a.isIndicatoreEmail()
					+"','"+a.isInputInibito()
					+"','"+a.isIndicatoreEdi()
					+"','"+a.getPartitaIvaEdi()
					+"','"+a.getQualificatoreEdi()
					+"','"+a.getIdentificativoFornitoreEdi()
					+"','"+a.getTipoFornitoreEdi()
					+"','"+a.getIdentificativoIntestatarioFatturaEdi()
					+"','"+a.getTipoIntestatarioFatturaEdi()
					+"','"+a.getIdentificativoPuntoConsegnaEdi()
					+"','"+a.getTipoPuntoConsegnaEdi()
					+"');";
			else
				sql = "UPDATE auto SET stato = 'Disponibile' WHERE codiceCliente='" + a.getCodiceCliente() + "';";
			stmt.executeUpdate(sql);
			
			stmt.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
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
			c.close();
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
	        c.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
}