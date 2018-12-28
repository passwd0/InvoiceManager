package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
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
	
	public void add(Cliente a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO Clienti "
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
					+ "VALUES (");
			
			ps.setString(1, a.getCodiceCliente());
			ps.setString(2, a.getDescrizione());
			ps.setTimestamp(3, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(4, Utils.toTimestamp(a.getDataUltimoAggiornamento()));
			ps.setString(5, a.getCodiceTipoCliente());
			ps.setString(6, a.getCodiceResaMerce());
			ps.setString(7, a.getCodiceImballo());
			ps.setString(8, a.getCodiceRaggruppamento());
			ps.setString(9, a.getFatturato());
			ps.setString(10, a.getFido());
			ps.setString(11, a.getPartitaIVA());
			ps.setString(12, a.getCodiceFiscale());
			ps.setString(13, a.getCodicePagamento());
			ps.setString(14, a.getCodiceBanca());
			ps.setString(15, a.getNumeroFattureEmesse());
			ps.setString(16, a.getCodiceEsenzioneIVA());
			ps.setFloat(17, a.getImponibileNonEsente());
			ps.setFloat(18, a.getImponibileEsente());
			ps.setFloat(19, a.getImportoIVA());
			ps.setString(20, a.getCodiceClassificazione());
			ps.setString(21, a.getCodiceAgente());
			ps.setString(22, a.getPercentualeProvvigioneAgente());
			ps.setString(23, a.getScontoLegatoProvvigioniAgente());
			ps.setString(24, a.getNumeroCopieFattura());
			ps.setString(25, a.getIndicatoreAddebitoSpeseIncasso());
			ps.setString(26, a.getIndicatoreAddebitoSpeseBolli());
			ps.setString(27, a.getCodiceListino());
			ps.setString(28, a.getCodiceVettore());
			ps.setString(29, a.getCodiceAffidabilita());
			ps.setString(30, a.getCodiceISO());
			ps.setString(31, a.getPartitaIVAEstero());
			ps.setString(32, a.getCodiceDivisa());
			ps.setString(33, a.getDataScadenzaSpostataAgosto());
			ps.setString(34, a.getDataScadenzaSpostataDicembre());
			ps.setString(35, a.getCodiceLingua());
			ps.setString(36, a.getNote());
			ps.setString(37, a.getCodiceStato());
			ps.setBoolean(38, a.getIndicatoreInviataInformativaPrivacy());
			ps.setString(39, a.getIndicatoreRicevutaInformativaPrivacy());
			ps.setString(40, a.getIndicatoreScorporoIVA());
			ps.setString(41, a.getIndicatoreIVADifferita());
			ps.setString(42, a.getIndicatoreEmail());
			ps.setString(43, a.getInputInibito());

			ps.executeUpdate();
			ps.close();
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