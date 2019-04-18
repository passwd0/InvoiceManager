package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import invoicemanager.model.Agente;
import invoicemanager.model.Banca;
import invoicemanager.model.Cliente;
import invoicemanager.model.Contatto;
import invoicemanager.model.Imballo;
import invoicemanager.model.Iso;
import invoicemanager.model.Iva;
import invoicemanager.model.Pagamento;
import invoicemanager.model.RaggruppamentoClienteFornitore;
import invoicemanager.model.RappresentanteFiscale;
import invoicemanager.model.ResaMerce;
import invoicemanager.model.StabileOrganizzazione;
import invoicemanager.model.Stato;
import invoicemanager.model.TerzoIntermediario;
import invoicemanager.model.TipoCliente;
import invoicemanager.model.Vettore;
import invoicemanager.utils.Utils;

public class ClienteDao {
	private Connection c;

	public ClienteDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Cliente a) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Cliente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
			ps.setInt(25, a.getProgressivo());
			ps.setString(26, a.getCodiceVettore());
			ps.setString(27, a.getCodiceAffidabilita());
			ps.setString(28, a.getCodiceIso());
			ps.setString(29, a.getPartitaIVAEstero());
			ps.setString(30, a.getCodiceDivisa());
			ps.setInt(31, a.getDataScadenzaSpostataAgosto());
			ps.setInt(32, a.getDataScadenzaSpostataDicembre());
			ps.setString(33, a.getCodiceLingua());
			ps.setString(34, a.getNote());
			ps.setString(35, a.getStato().name());
			ps.setBoolean(36, a.isIndicatoreInviataInformativaPrivacy());
			ps.setBoolean(37, a.isIndicatoreRicevutaInformativaPrivacy());
			ps.setBoolean(38, a.isIndicatoreScorporoIVA());
			ps.setBoolean(39, a.isIndicatoreIVADifferita());
			ps.setBoolean(40, a.isIndicatoreEmail());
			ps.setBoolean(41, a.isInputInibito());
			ps.setBoolean(42, a.isIndicatoreFatturePA());
			ps.setDate(43, a.getDataUltimaFattura());
			ps.setFloat(44, a.getImportoUltimaFattura());
			ps.setFloat(45, a.getImportoPlafond());
			ps.setString(46, a.getNumeroUltimaFattura());
			ps.setDate(47, a.getDataInizioPlafond());
			ps.setBoolean(48, a.isIndicatoreFattureXML());
			ps.setBoolean(49, a.isIndicatoreDdtEmail());
			ps.setBoolean(50, a.isIndicatorePlafond());
			ps.setString(51, a.getCodiceDestinatarioXml());
			ps.setString(52, a.getCodiceEORI());
			ps.setInt(53, a.getCodiceStabileOrganizzazione());
			ps.setInt(54, a.getCodiceRappresentanteFiscale());
			ps.setInt(55, a.getCodiceTerzoIntermediario());
			ps.setTimestamp(56, a.getDataInserimento());
			ps.setTimestamp(57, a.getDataUltimaModifica());

			res = ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  e.getStackTrace();
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
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
	
	public void createTable() {
		try {
			Statement stmt = c.createStatement();
			String sql = "Create table public.Cliente (\r\n" + 
					"	\"CodiceCliente\" varchar(25) NOT NULL Primary Key,\r\n" + 
					"	\"Descrizione\" varchar(25) NULL,\r\n" + 
					"	\"CodiceTipoCliente\" varchar(25) NULL,\r\n" + 
					"	\"CodiceResaMerce\" varchar(25) NULL,\r\n" + 
					"	\"CodiceImballo\" varchar(25) NULL,\r\n" + 
					"	\"CodiceRaggruppamento\" varchar(25) NULL,\r\n" + 
					"	\"Fatturato\" Float NULL,\r\n" + 
					"	\"Fido\" Float NULL,\r\n" + 
					"	\"PartitaIVA\" varchar(25) NULL,\r\n" + 
					"	\"CodiceFiscale\" varchar(25) NULL,\r\n" + 
					"	\"CodicePagamento\" varchar(25) NULL,\r\n" + 
					"	\"CodiceBanca\" varchar(25) NULL,\r\n" + 
					"	\"NumeroFattureEmesse\" INTEGER NULL,\r\n" + 
					"	\"CodiceIva\" varchar(25) NULL,\r\n" + 
					"	\"ImponibileNonEsente\" Float NULL,\r\n" + 
					"	\"ImponibileEsente\" Float NULL,\r\n" + 
					"	\"ImportoIVA\" Float NULL,\r\n" + 
					"	\"CodiceClassificazione\" varchar(25) NULL,\r\n" + 
					"	\"CodiceAgente\" varchar(25) NULL,\r\n" + 
					"	\"PercentualeProvvigioneAgente\" Float NULL,\r\n" + 
					"	\"ScontoLegatoProvvigioniAgente\" Float NULL,\r\n" + 
					"	\"NumeroCopieFattura\" INTEGER NULL,\r\n" + 
					"	\"IndicatoreAddebitoSpeseIncasso\" Boolean NULL,\r\n" + 
					"	\"IndicatoreAddebitoSpeseBolli\" Boolean NULL,\r\n" + 
					"	\"Progressivo\" INTEGER NULL,\r\n" + 
					"	\"CodiceVettore\" varchar(25) NULL,\r\n" + 
					"	\"CodiceAffidabilita\" varchar(25) NULL,\r\n" + 
					"	\"CodiceIso\" varchar(25) NULL,\r\n" + 
					"	\"PartitaIVAEstero\" varchar(25) NULL,\r\n" + 
					"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
					"	\"DataScadenzaSpostataAgosto\" INTEGER NULL,\r\n" + 
					"	\"DataScadenzaSpostataDicembre\" INTEGER NULL,\r\n" + 
					"	\"CodiceLingua\" varchar(25) NULL,\r\n" + 
					"	\"Note\" varchar(25) NULL,\r\n" + 
					"	\"Stato\" varchar(25) NULL,\r\n" + 
					"	\"IndicatoreInviataInformativaPrivacy\" Boolean NULL,\r\n" + 
					"	\"IndicatoreRicevutaInformativaPrivacy\" Boolean NULL,\r\n" + 
					"	\"IndicatoreScorporoIVA\" Boolean NULL,\r\n" + 
					"	\"IndicatoreIVADifferita\" Boolean NULL,\r\n" + 
					"	\"IndicatoreEmail\" Boolean NULL,\r\n" + 
					"	\"InputInibito\" Boolean NULL,\r\n" + 
					"	\"IndicatoreFatturePA\" Boolean NULL,\r\n" + 
					"	\"DataUltimaFattura\" Date NULL,\r\n" + 
					"	\"ImportoUltimaFattura\" Float NULL,\r\n" + 
					"	\"ImportoPlafond\" Float NULL,\r\n" + 
					"	\"NumeroUltimaFattura\" varchar(25) NULL,\r\n" + 
					"	\"DataInizioPlafond\" Date NULL,\r\n" + 
					"	\"IndicatoreFattureXML\" Boolean NULL,\r\n" + 
					"	\"IndicatoreDdtEmail\" Boolean NULL,\r\n" + 
					"	\"IndicatorePlafond\" Boolean NULL,\r\n" + 
					"	\"CodiceDestinatarioXml\" varchar(25) NULL,\r\n" + 
					"	\"CodiceEORI\" varchar(25) NULL,\r\n" + 
					"	\"CodiceStabileOrganizzazione\" INTEGER NULL,\r\n" + 
					"	\"CodiceRappresentanteFiscale\" INTEGER NULL,\r\n" + 
					"	\"CodiceTerzoIntermediario\" INTEGER NULL,\r\n" + 
					"	\"DataInserimento\" Timestamp NULL,\r\n" + 
					"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
					");";
			stmt.executeUpdate(sql);
	    	stmt.close();
	        c.commit();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
	public List<Cliente> read(List<TipoCliente> listaTipoCliente, List<ResaMerce> listaResaMerce, List<Imballo> listaImballo, 
			List<RaggruppamentoClienteFornitore> listaRaggruppamentoClienteFornitore, List<Pagamento> listaPagamento, List<Banca> listaBanca, 
			List<Iva> listaIva, List<Agente> listaAgente, List<Vettore> listaVettore, List<Iso> listaIso, 
			List<StabileOrganizzazione> listaStabileOrganizzazione, List<RappresentanteFiscale> listaRappresentanteFiscale, 
			List<TerzoIntermediario> listaTerzoIntermediario, List<Contatto> listaContatti) {
		List<Cliente> listcliente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Cliente");
	         while ( rs.next() ) {

				String codiceCliente = rs.getString("codiceCliente");
				String descrizione = rs.getString("descrizione");
				String codice = rs.getString("codiceTipoCliente");
				TipoCliente tipoCliente = listaTipoCliente.stream().filter(x->x.getCodiceTipoCliente().equals(codice)).findFirst().orElse(null);
				String codiceResaMerce = rs.getString("codiceResaMerce");
				ResaMerce resaMerce = listaResaMerce.stream().filter(x->x.getCodiceResa().equals(codiceResaMerce)).findFirst().orElse(null);
				String codiceImballo = rs.getString("codiceImballo");
				Imballo imballo = listaImballo.stream().filter(x->x.getCodiceImballo().equals(codiceImballo)).findFirst().orElse(null);
				String codiceRaggruppamento = rs.getString("codiceRaggruppamento");
				RaggruppamentoClienteFornitore raggruppamento = listaRaggruppamentoClienteFornitore.stream().filter(x->x.getCodiceRaggruppamento().equals(codiceRaggruppamento)).findFirst().orElse(null);
				float fatturato = rs.getFloat("fatturato");
				float fido = rs.getFloat("fido");
				String partitaIVA = rs.getString("partitaIVA");
				String codiceFiscale = rs.getString("codiceFiscale");
				String codicePagamento = rs.getString("codicePagamento");
				Pagamento pagamento = listaPagamento.stream().filter(x->x.getCodicePagamento().equals(codicePagamento)).findFirst().orElse(null);
				String codiceBanca = rs.getString("codiceBanca");
				Banca banca = listaBanca.stream().filter(x->x.getCodiceBanca().equals(codiceBanca)).findFirst().orElse(null);
				int numeroFattureEmesse = rs.getInt("numeroFattureEmesse");
				String codiceIva = rs.getString("codiceIva");
				Iva iva = listaIva.stream().filter(x->x.getCodiceIva().equals(codiceIva)).findFirst().orElse(null);
				float imponibileNonEsente = rs.getFloat("imponibileNonEsente");
				float imponibileEsente = rs.getFloat("imponibileEsente");
				float importoIVA = rs.getFloat("importoIVA");
				String codiceClassificazione = rs.getString("codiceClassificazione");
				String codiceAgente = rs.getString("codiceAgente");
				Agente agente = listaAgente.stream().filter(x->x.getCodiceAgente().equals(codiceAgente)).findFirst().orElse(null);
				float percentualeProvvigioneAgente = rs.getFloat("percentualeProvvigioneAgente");
				float scontoLegatoProvvigioniAgente = rs.getFloat("scontoLegatoProvvigioniAgente");
				int numeroCopieFattura = rs.getInt("numeroCopieFattura");
				boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
				boolean indicatoreAddebitoSpeseBolli = rs.getBoolean("indicatoreAddebitoSpeseBolli");
				int progressivo = rs.getInt("progressivo");
				String codiceVettore = rs.getString("codiceVettore");
				Vettore vettore = listaVettore.stream().filter(x->x.getCodiceVettore().equals(codiceVettore)).findFirst().orElse(null);
				String codiceAffidabilita = rs.getString("codiceAffidabilita");
				String codiceIso = rs.getString("codiceIso");
				Iso iso = listaIso.stream().filter(x->x.getCodiceIso().equals(codiceIso)).findFirst().orElse(null);
				String partitaIVAEstero = rs.getString("partitaIVAEstero");
				String codiceDivisa = rs.getString("codiceDivisa");
				int dataScadenzaSpostataAgosto = rs.getInt("dataScadenzaSpostataAgosto");
				int dataScadenzaSpostataDicembre = rs.getInt("dataScadenzaSpostataDicembre");
				String codiceLingua = rs.getString("codiceLingua");
				String note = rs.getString("note");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				List<Contatto> contatti = listaContatti.stream().filter(x->x.getCodiceConto().equals(codiceCliente)).collect(Collectors.toList());
				boolean indicatoreInviataInformativaPrivacy = rs.getBoolean("indicatoreInviataInformativaPrivacy");
				boolean indicatoreRicevutaInformativaPrivacy = rs.getBoolean("indicatoreRicevutaInformativaPrivacy");
				boolean indicatoreScorporoIVA = rs.getBoolean("indicatoreScorporoIVA");
				boolean indicatoreIVADifferita = rs.getBoolean("indicatoreIVADifferita");
				boolean indicatoreEmail = rs.getBoolean("indicatoreEmail");
				boolean inputInibito = rs.getBoolean("inputInibito");
				boolean indicatoreFatturePA = rs.getBoolean("indicatoreFatturePA");
				Date dataUltimaFattura = rs.getDate("dataUltimaFattura");
				float importoUltimaFattura = rs.getFloat("importoUltimaFattura");
				float importoPlafond = rs.getFloat("importoPlafond");
				String numeroUltimaFattura = rs.getString("numeroUltimaFattura");
				Date dataInizioPlafond = rs.getDate("dataInizioPlafond");
				boolean indicatoreFattureXML = rs.getBoolean("indicatoreFattureXML");
				boolean indicatoreDdtEmail = rs.getBoolean("indicatoreDdtEmail");
				boolean indicatorePlafond = rs.getBoolean("indicatorePlafond");
				String codiceDestinatarioXml = rs.getString("codiceDestinatarioXml");
				String codiceEORI = rs.getString("codiceEORI");
				int codiceStabileOrganizzazione = rs.getInt("CodiceStabileOrganizzazione");
				StabileOrganizzazione stabileOrganizzazione = listaStabileOrganizzazione.stream().filter(x->x.getCodice()==codiceStabileOrganizzazione).findFirst().orElse(null);
				int codiceRappresentanteFiscale = rs.getInt("codiceRappresentanteFiscale");
				RappresentanteFiscale rappresentanteFiscale = listaRappresentanteFiscale.stream().filter(x->x.getCodice()==codiceRappresentanteFiscale).findFirst().orElse(null);
				int codiceTerzoIntermediario = rs.getInt("codiceTerzoIntermediario");
				TerzoIntermediario terzoIntermediario = listaTerzoIntermediario.stream().filter(x->x.getCodice()==codiceTerzoIntermediario).findFirst().orElse(null);
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				Cliente cliente = new Cliente(codiceCliente, descrizione, tipoCliente, resaMerce, imballo, raggruppamento, fatturato, fido, partitaIVA, 
						codiceFiscale, pagamento, banca, numeroFattureEmesse, iva, imponibileNonEsente, imponibileEsente, importoIVA, codiceClassificazione, 
						agente, percentualeProvvigioneAgente, scontoLegatoProvvigioniAgente, numeroCopieFattura, indicatoreAddebitoSpeseIncasso, 
						indicatoreAddebitoSpeseBolli, progressivo, vettore, codiceAffidabilita, iso, partitaIVAEstero, codiceDivisa, dataScadenzaSpostataAgosto, 
						dataScadenzaSpostataDicembre, codiceLingua, note, stato, contatti, indicatoreInviataInformativaPrivacy, indicatoreRicevutaInformativaPrivacy, 
						indicatoreScorporoIVA, indicatoreIVADifferita, indicatoreEmail, inputInibito, indicatoreFatturePA, dataUltimaFattura, importoUltimaFattura, 
						importoPlafond, numeroUltimaFattura, dataInizioPlafond, indicatoreFattureXML, indicatoreDdtEmail, indicatorePlafond, 
						codiceDestinatarioXml, codiceEORI, stabileOrganizzazione, rappresentanteFiscale, terzoIntermediario, dataInserimento, 
						dataUltimaModifica);

				listcliente.add(cliente);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcliente;
	}
}
