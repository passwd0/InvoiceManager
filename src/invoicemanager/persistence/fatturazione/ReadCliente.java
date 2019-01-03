package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Cliente;


public class ReadCliente {
	private Connection c;

	public ReadCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Cliente> read() {
		List<Cliente> listcliente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Cliente");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceCliente = rs.getString("codiceCliente");
String descrizione = rs.getString("descrizione");
String codice = rs.getString("tipoCliente");
TipoCliente tipoCliente = listaTipoCliente.stream().filter(x->x.getCodiceTipoCliente().equals(codice)).findFirst().get();
String codice = rs.getString("resaMerce");
ResaMerce resaMerce = listaResaMerce.stream().filter(x->x.getCodiceResaMerce().equals(codice)).findFirst().get();
String codice = rs.getString("imballo");
Imballo imballo = listaImballo.stream().filter(x->x.getCodiceImballo().equals(codice)).findFirst().get();
String codice = rs.getString("raggruppamento");
RaggruppamentoClienteFornitore raggruppamento = listaRaggruppamentoClienteFornitore.stream().filter(x->x.getCodiceRaggruppamentoClienteFornitore().equals(codice)).findFirst().get();
float fatturato = rs.getFloat("fatturato");
float fido = rs.getFloat("fido");
String partitaIVA = rs.getString("partitaIVA");
String codiceFiscale = rs.getString("codiceFiscale");
String codice = rs.getString("pagamento");
Pagamento pagamento = listaPagamento.stream().filter(x->x.getCodicePagamento().equals(codice)).findFirst().get();
String codice = rs.getString("banca");
Banca banca = listaBanca.stream().filter(x->x.getCodiceBanca().equals(codice)).findFirst().get();
int numeroFattureEmesse = rs.getInt("numeroFattureEmesse");
String codice = rs.getString("iva");
Iva iva = listaIva.stream().filter(x->x.getCodiceIva().equals(codice)).findFirst().get();
float imponibileNonEsente = rs.getFloat("imponibileNonEsente");
float imponibileEsente = rs.getFloat("imponibileEsente");
float importoIVA = rs.getFloat("importoIVA");
String codiceClassificazione = rs.getString("codiceClassificazione");
String codice = rs.getString("agente");
Agente agente = listaAgente.stream().filter(x->x.getCodiceAgente().equals(codice)).findFirst().get();
float percentualeProvvigioneAgente = rs.getFloat("percentualeProvvigioneAgente");
float scontoLegatoProvvigioniAgente = rs.getFloat("scontoLegatoProvvigioniAgente");
int numeroCopieFattura = rs.getInt("numeroCopieFattura");
boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
boolean indicatoreAddebitoSpeseBolli = rs.getBoolean("indicatoreAddebitoSpeseBolli");
String codice = rs.getString("listino");
Listino listino = listaListino.stream().filter(x->x.getCodiceListino().equals(codice)).findFirst().get();
String codice = rs.getString("vettore");
Vettore vettore = listaVettore.stream().filter(x->x.getCodiceVettore().equals(codice)).findFirst().get();
String codiceAffidabilita = rs.getString("codiceAffidabilita");
String codice = rs.getString("iso");
Iso iso = listaIso.stream().filter(x->x.getCodiceIso().equals(codice)).findFirst().get();
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
LocalDate dataUltimaFattura = rs.getDate("dataUltimaFattura")).toLocalDate();
float importoUltimaFattura = rs.getFloat("importoUltimaFattura");
float importoPlafond = rs.getFloat("importoPlafond");
String numeroUltimaFattura = rs.getString("numeroUltimaFattura");
LocalDate dataInizioPlafond = rs.getDate("dataInizioPlafond")).toLocalDate();
boolean indicatoreFattureXML = rs.getBoolean("indicatoreFattureXML");
boolean indicatoreDdtEmail = rs.getBoolean("indicatoreDdtEmail");
boolean indicatorePlafond = rs.getBoolean("indicatorePlafond");
String codiceDestinatarioXml = rs.getString("codiceDestinatarioXml");
String codiceEORI = rs.getString("codiceEORI");
String codice = rs.getString("stabileOrganizzazione");
StabileOrganizzazione stabileOrganizzazione = listaStabileOrganizzazione.stream().filter(x->x.getCodiceStabileOrganizzazione().equals(codice)).findFirst().get();
String codice = rs.getString("rappresentanteFiscale");
RappresentanteFiscale rappresentanteFiscale = listaRappresentanteFiscale.stream().filter(x->x.getCodiceRappresentanteFiscale().equals(codice)).findFirst().get();
String codice = rs.getString("terzoIntermediario");
TerzoIntermediario terzoIntermediario = listaTerzoIntermediario.stream().filter(x->x.getCodiceTerzoIntermediario().equals(codice)).findFirst().get();
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModificaa");
LocalDateTime dataUltimaModificaa = null;
if (ts != null)
dataUltimaModificaa = ts.toLocalDateTime();
(List<TipoCliente> listaTipoCliente, List<ResaMerce> listaResaMerce, List<Imballo> listaImballo, List<RaggruppamentoClienteFornitore> listaRaggruppamentoClienteFornitore, List<Pagamento> listaPagamento, List<Banca> listaBanca, List<Iva> listaIva, List<Agente> listaAgente, List<Listino> listaListino, List<Vettore> listaVettore, List<Iso> listaIso, List<StabileOrganizzazione> listaStabileOrganizzazione, List<RappresentanteFiscale> listaRappresentanteFiscale, List<TerzoIntermediario> listaTerzoIntermediario,)
Cliente cliente = new Cliente(codiceCliente, descrizione, tipoCliente, resaMerce, imballo, raggruppamento, fatturato, fido, partitaIVA, codiceFiscale, pagamento, banca, numeroFattureEmesse, iva, imponibileNonEsente, imponibileEsente, importoIVA, codiceClassificazione, agente, percentualeProvvigioneAgente, scontoLegatoProvvigioniAgente, numeroCopieFattura, indicatoreAddebitoSpeseIncasso, indicatoreAddebitoSpeseBolli, listino, vettore, codiceAffidabilita, iso, partitaIVAEstero, codiceDivisa, dataScadenzaSpostataAgosto, dataScadenzaSpostataDicembre, codiceLingua, note, stato, indicatoreInviataInformativaPrivacy, indicatoreRicevutaInformativaPrivacy, indicatoreScorporoIVA, indicatoreIVADifferita, indicatoreEmail, inputInibito, indicatoreFatturePA, dataUltimaFattura, importoUltimaFattura, importoPlafond, numeroUltimaFattura, dataInizioPlafond, indicatoreFattureXML, indicatoreDdtEmail, indicatorePlafond, codiceDestinatarioXml, codiceEORI, stabileOrganizzazione, rappresentanteFiscale, terzoIntermediario, dataInserimento, dataUltimaModificaa);

		listcliente.add(cliente);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcliente;
	}

}
