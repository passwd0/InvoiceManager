package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Agente;
import invoicemanager.model.fatturazione.Banca;
import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.Imballo;
import invoicemanager.model.fatturazione.Iso;
import invoicemanager.model.fatturazione.Iva;
import invoicemanager.model.fatturazione.Listino;
import invoicemanager.model.fatturazione.ListinoArticolo;
import invoicemanager.model.fatturazione.Pagamento;
import invoicemanager.model.fatturazione.RaggruppamentoClienteFornitore;
import invoicemanager.model.fatturazione.RappresentanteFiscale;
import invoicemanager.model.fatturazione.ResaMerce;
import invoicemanager.model.fatturazione.StabileOrganizzazione;
import invoicemanager.model.fatturazione.Stato;
import invoicemanager.model.fatturazione.TerzoIntermediario;
import invoicemanager.model.fatturazione.TipoCliente;
import invoicemanager.model.fatturazione.Vettore;


public class ReadCliente {
	private Connection c;

	public ReadCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Cliente> read(List<TipoCliente> listaTipoCliente, List<ResaMerce> listaResaMerce, List<Imballo> listaImballo, 
			List<RaggruppamentoClienteFornitore> listaRaggruppamentoClienteFornitore, List<Pagamento> listaPagamento, List<Banca> listaBanca, 
			List<Iva> listaIva, List<Agente> listaAgente, List<Vettore> listaVettore, List<Iso> listaIso, 
			List<StabileOrganizzazione> listaStabileOrganizzazione, List<RappresentanteFiscale> listaRappresentanteFiscale, 
			List<TerzoIntermediario> listaTerzoIntermediario) {
		List<Cliente> listcliente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Cliente");
			Timestamp ts;
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
				boolean indicatoreInviataInformativaPrivacy = rs.getBoolean("indicatoreInviataInformativaPrivacy");
				boolean indicatoreRicevutaInformativaPrivacy = rs.getBoolean("indicatoreRicevutaInformativaPrivacy");
				boolean indicatoreScorporoIVA = rs.getBoolean("indicatoreScorporoIVA");
				boolean indicatoreIVADifferita = rs.getBoolean("indicatoreIVADifferita");
				boolean indicatoreEmail = rs.getBoolean("indicatoreEmail");
				boolean inputInibito = rs.getBoolean("inputInibito");
				boolean indicatoreFatturePA = rs.getBoolean("indicatoreFatturePA");
				LocalDate dataUltimaFattura = rs.getDate("dataUltimaFattura").toLocalDate();
				float importoUltimaFattura = rs.getFloat("importoUltimaFattura");
				float importoPlafond = rs.getFloat("importoPlafond");
				String numeroUltimaFattura = rs.getString("numeroUltimaFattura");
				LocalDate dataInizioPlafond = rs.getDate("dataInizioPlafond").toLocalDate();
				boolean indicatoreFattureXML = rs.getBoolean("indicatoreFattureXML");
				boolean indicatoreDdtEmail = rs.getBoolean("indicatoreDdtEmail");
				boolean indicatorePlafond = rs.getBoolean("indicatorePlafond");
				String codiceDestinatarioXml = rs.getString("codiceDestinatarioXml");
				String codiceEORI = rs.getString("codiceEORI");
				int codiceStabileOrganizzazione = rs.getInt("CodiceStabileOrganizzazione");
				StabileOrganizzazione stabileOrganizzazione = listaStabileOrganizzazione.stream().filter(x->x.getCodice()==codiceStabileOrganizzazione).findFirst().orElse(null);
				int codiceRappresentanteFiscale = rs.getInt("codiceRappresentanteFiscale");
				RappresentanteFiscale rappresentanteFiscale = listaRappresentanteFiscale.stream().filter(x->x.getCodice() ==  codiceRappresentanteFiscale).findFirst().orElse(null);
				int codiceTerzoIntermediario = rs.getInt("codiceTerzoIntermediario");
				TerzoIntermediario terzoIntermediario = listaTerzoIntermediario.stream().filter(x->x.getCodice() == codiceTerzoIntermediario).findFirst().orElse(null);
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();
				Cliente cliente = new Cliente(codiceCliente, descrizione, tipoCliente, resaMerce, imballo, raggruppamento, fatturato, fido, partitaIVA, codiceFiscale, pagamento, banca, numeroFattureEmesse, iva, imponibileNonEsente, imponibileEsente, importoIVA, codiceClassificazione, agente, percentualeProvvigioneAgente, scontoLegatoProvvigioniAgente, numeroCopieFattura, indicatoreAddebitoSpeseIncasso, indicatoreAddebitoSpeseBolli, progressivo, vettore, codiceAffidabilita, iso, partitaIVAEstero, codiceDivisa, dataScadenzaSpostataAgosto, dataScadenzaSpostataDicembre, codiceLingua, note, stato, indicatoreInviataInformativaPrivacy, indicatoreRicevutaInformativaPrivacy, indicatoreScorporoIVA, indicatoreIVADifferita, indicatoreEmail, inputInibito, indicatoreFatturePA, dataUltimaFattura, importoUltimaFattura, importoPlafond, numeroUltimaFattura, dataInizioPlafond, indicatoreFattureXML, indicatoreDdtEmail, indicatorePlafond, codiceDestinatarioXml, codiceEORI, stabileOrganizzazione, rappresentanteFiscale, terzoIntermediario);

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
