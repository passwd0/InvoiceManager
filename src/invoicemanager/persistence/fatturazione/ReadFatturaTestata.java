package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.FatturaTestata;


public class ReadFatturaTestata {
	private Connection c;

	public ReadFatturaTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<FatturaTestata> read() {
		List<FatturaTestata> listfatturaTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaTestata");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroFatturazione = rs.getInt("numeroFatturazione");
ts = rs.getTimestamp("dataFattura");
LocalDateTime dataFattura = null;
if (ts != null)
dataFattura = ts.toLocalDateTime();
String codice = rs.getString("indicatoreStatoAvanzamento");
Char indicatoreStatoAvanzamento = list.stream().filter(x->x.getChar().equals(codice)).findFirst().get();
String codiceClienteFatturazione = rs.getString("codiceClienteFatturazione");
String codiceEsenzioneIva = rs.getString("codiceEsenzioneIva");
String codiceAgente = rs.getString("codiceAgente");
String codiceCausale = rs.getString("codiceCausale");
String codiceCausalePrelievi = rs.getString("codiceCausalePrelievi");
float percentualeSconto = rs.getFloat("percentualeSconto");
float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
String descrizione = rs.getString("descrizione");
boolean indicatoreAddebitoBolli = rs.getBoolean("indicatoreAddebitoBolli");
boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
boolean indicatoreScaricoMagazzino = rs.getBoolean("indicatoreScaricoMagazzino");
int codiceListino = rs.getInt("codiceListino");
String codiceResa = rs.getString("codiceResa");
String codiceVettore = rs.getString("codiceVettore");
boolean indicatoreFatturaAccompagnatoria = rs.getBoolean("indicatoreFatturaAccompagnatoria");
String codicePagamento = rs.getString("codicePagamento");
String codiceBanca = rs.getString("codiceBanca");
String codiceImballo = rs.getString("codiceImballo");
float pesoColli = rs.getFloat("pesoColli");
float numeroColli = rs.getFloat("numeroColli");
float acconto = rs.getFloat("acconto");
String codiceDivisa = rs.getString("codiceDivisa");
float cambio = rs.getFloat("cambio");
String codiceClienteSpedizione = rs.getString("codiceClienteSpedizione");
String nomeSpedizione = rs.getString("nomeSpedizione");
String indirizzoSpedizione = rs.getString("indirizzoSpedizione");
String capSpedizione = rs.getString("capSpedizione");
String cittaSpedizione = rs.getString("cittaSpedizione");
String provinciaSpedizione = rs.getString("provinciaSpedizione");
String codiceNazioneSpedizione = rs.getString("codiceNazioneSpedizione");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
String note = rs.getString("note");
boolean indicatoreFatturazioneDifferita = rs.getBoolean("indicatoreFatturazioneDifferita");
boolean indicatoreEmail = rs.getBoolean("indicatoreEmail");
boolean indicatorePa = rs.getBoolean("indicatorePa");
String codice = rs.getString("fatturadettaglio");
List<FatturaDettaglio> fatturadettaglio = list.stream().filter(x->x.getList<FatturaDettaglio>().equals(codice)).findFirst().get();
float speseTrasporto = rs.getFloat("speseTrasporto");
float speseImballo = rs.getFloat("speseImballo");
float speseIncasso = rs.getFloat("speseIncasso");
float speseBolli = rs.getFloat("speseBolli");
float omaggi = rs.getFloat("omaggi");
float totalePagato = rs.getFloat("totalePagato");
String codice = rs.getString("dataScadenza");
LocalDate dataScadenza = list.stream().filter(x->x.getLocalDate().equals(codice)).findFirst().get();
float importoScadenza = rs.getFloat("importoScadenza");
FatturaTestata fatturaTestata = new FatturaTestata(numeroFatturazione, dataFattura, indicatoreStatoAvanzamento, codiceClienteFatturazione, codiceEsenzioneIva, codiceAgente, codiceCausale, codiceCausalePrelievi, percentualeSconto, percentualeScontoPagamento, percentualeProvvigione, descrizione, indicatoreAddebitoBolli, indicatoreAddebitoSpeseIncasso, indicatoreScaricoMagazzino, codiceListino, codiceResa, codiceVettore, indicatoreFatturaAccompagnatoria, codicePagamento, codiceBanca, codiceImballo, pesoColli, numeroColli, acconto, codiceDivisa, cambio, codiceClienteSpedizione, nomeSpedizione, indirizzoSpedizione, capSpedizione, cittaSpedizione, provinciaSpedizione, codiceNazioneSpedizione, dataInserimento, dataUltimaModifica, note, indicatoreFatturazioneDifferita, indicatoreEmail, indicatorePa, fatturadettaglio, speseTrasporto, speseImballo, speseIncasso, speseBolli, omaggi, totalePagato, dataScadenza, importoScadenza);

		listfatturaTestata.add(fatturaTestata);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaTestata;
	}

}
