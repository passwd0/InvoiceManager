package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
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
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Cliente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
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
			ps.setString(25, a.getCodiceListino());
			ps.setString(26, a.getCodiceVettore());
			ps.setString(27, a.getCodiceAffidabilita());
			ps.setString(28, a.getCodiceIso());
			ps.setString(29, a.getPartitaIVAEstero());
			ps.setString(30, a.getCodiceDivisa());
			ps.setInt(31, a.getDataScadenzaSpostataAgosto());
			ps.setInt(32, a.getDataScadenzaSpostataDicembre());
			ps.setString(33, a.getCodiceLingua());
			ps.setString(34, a.getNote());
			ps.setString(35, a.getStato());
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
			ps.setString(53, a.getStabileOrganizzazione());
			ps.setString(54, a.getRappresentanteFiscale());
			ps.setString(55, a.getTerzoIntermediario());
			ps.setTimestamp(56, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(57, Utils.toTimestamp(a.getDataUltimaModificaa()));

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