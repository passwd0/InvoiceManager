package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.TipoCliente;
import invoicemanager.utils.Utils;

public class WriteCliente {
	private Connection c;
	
	public WriteCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}
	
	public void add(Cliente a, boolean exist, List<TipoCliente> tipiCliente) throws ClassNotFoundException, SQLException {
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
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
			
			ps.setString(1, a.getCodiceCliente());
			ps.setString(2, a.getDescrizione());
			ps.setTimestamp(3, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(4, Utils.toTimestamp(a.getDataUltimoAggiornamento()));
			ps.setString(5, a.getCodiceTipoCliente());
			ps.setString(6, a.getCodiceResaMerce());
			ps.setString(7, a.getCodiceImballo());
			ps.setString(8, a.getCodiceRaggruppamento());
			ps.setFloat(9, a.getFatturato());
			ps.setFloat(10, a.getFido());
			ps.setString(11, a.getPartitaIVA());
			ps.setString(12, a.getCodiceFiscale());
			ps.setString(13, a.getCodicePagamento());
			ps.setString(14, a.getCodiceBanca());
			ps.setInt(15, a.getNumeroFattureEmesse());
			ps.setString(16, a.getCodiceIva());
			ps.setFloat(17, a.getImponibileNonEsente());
			ps.setFloat(18, a.getImponibileEsente());
			ps.setFloat(19, a.getImportoIVA());
			ps.setString(20, a.getCodiceClassificazione());
			ps.setString(21, a.getCodiceAgente());
			ps.setFloat(22, a.getPercentualeProvvigioneAgente());
			ps.setFloat(23, a.getScontoLegatoProvvigioniAgente());
			ps.setInt(24, a.getNumeroCopieFattura());
			ps.setBoolean(25, a.isIndicatoreAddebitoSpeseIncasso());
			ps.setBoolean(26, a.isIndicatoreAddebitoSpeseBolli());
			ps.setInt(27, a.getCodiceListino());
			ps.setString(28, a.getCodiceVettore());
			ps.setString(29, a.getCodiceAffidabilita());
			ps.setString(30, a.getCodiceIso());
			ps.setString(31, a.getPartitaIVAEstero());
			ps.setString(32, a.getCodiceDivisa());
			ps.setInt(33, a.getDataScadenzaSpostataAgosto());
			ps.setInt(34, a.getDataScadenzaSpostataDicembre());
			ps.setString(35, a.getCodiceLingua());
			ps.setString(36, a.getNote());
			ps.setString(37, a.getStato().name());
			ps.setBoolean(38, a.isIndicatoreInviataInformativaPrivacy());
			ps.setBoolean(39, a.isIndicatoreRicevutaInformativaPrivacy());
			ps.setBoolean(40, a.isIndicatoreScorporoIVA());
			ps.setBoolean(41, a.isIndicatoreIVADifferita());
			ps.setBoolean(42, a.isIndicatoreEmail());
			ps.setBoolean(43, a.isInputInibito());

			ps.executeUpdate();
			ps.close();
			c.commit();
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
}