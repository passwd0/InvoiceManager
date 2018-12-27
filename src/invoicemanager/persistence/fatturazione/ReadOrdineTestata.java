package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.OrdineTestata;


public class ReadOrdineTestata {
	private Connection c;

	public ReadOrdineTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<OrdineTestata> read() {
		List<OrdineTestata> listordineTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM OrdineTestata");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroOrdine = rs.getInt("numeroOrdine");
ts = rs.getTimestamp("dataOrdine");
LocalDateTime dataOrdine = null;
if (ts != null)
dataOrdine = ts.toLocalDateTime();
boolean indicatoreStatoAvanzamento = rs.getBoolean("indicatoreStatoAvanzamento");
String codiceClienteFatturazione = rs.getString("codiceClienteFatturazione");
String descrizione = rs.getString("descrizione");
String codiceEsenzioneIva = rs.getString("codiceEsenzioneIva");
String codiceAgente = rs.getString("codiceAgente");
float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
float percentualeSconto = rs.getFloat("percentualeSconto");
float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
int numeroCopieFattura = rs.getInt("numeroCopieFattura");
boolean indicatoreAddebitoBolli = rs.getBoolean("indicatoreAddebitoBolli");
boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
int codiceListino = rs.getInt("codiceListino");
String codiceResa = rs.getString("codiceResa");
String codiceVettore = rs.getString("codiceVettore");
String codiceCausale = rs.getString("codiceCausale");
String codicePagamento = rs.getString("codicePagamento");
String codiceBanca = rs.getString("codiceBanca");
ts = rs.getTimestamp("dataConsegna");
LocalDateTime dataConsegna = null;
if (ts != null)
dataConsegna = ts.toLocalDateTime();
String causaleTrasporto = rs.getString("causaleTrasporto");
String codiceDivisa = rs.getString("codiceDivisa");
boolean indicatoreConsegnaParziale = rs.getBoolean("indicatoreConsegnaParziale");
boolean indicatoreRaggruppamentoConsegne = rs.getBoolean("indicatoreRaggruppamentoConsegne");
String codiceAgenteVecchio = rs.getString("codiceAgenteVecchio");
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
String loginInserimento = rs.getString("loginInserimento");
String loginModifica = rs.getString("loginModifica");
String codiceLingua = rs.getString("codiceLingua");
String revisione = rs.getString("revisione");
String attenzione = rs.getString("attenzione");
boolean indicatoreOrdineTrading = rs.getBoolean("indicatoreOrdineTrading");
String codice = rs.getString("ordineDettagli");
List<OrdineDettaglio> ordineDettagli = list.stream().filter(x->x.getList<OrdineDettaglio>().equals(codice)).findFirst().get();
OrdineTestata ordineTestata = new OrdineTestata(numeroOrdine, dataOrdine, indicatoreStatoAvanzamento, codiceClienteFatturazione, descrizione, codiceEsenzioneIva, codiceAgente, percentualeProvvigione, percentualeSconto, percentualeScontoPagamento, numeroCopieFattura, indicatoreAddebitoBolli, indicatoreAddebitoSpeseIncasso, codiceListino, codiceResa, codiceVettore, codiceCausale, codicePagamento, codiceBanca, dataConsegna, causaleTrasporto, codiceDivisa, indicatoreConsegnaParziale, indicatoreRaggruppamentoConsegne, codiceAgenteVecchio, codiceClienteSpedizione, nomeSpedizione, indirizzoSpedizione, capSpedizione, cittaSpedizione, provinciaSpedizione, codiceNazioneSpedizione, dataInserimento, dataUltimaModifica, note, loginInserimento, loginModifica, codiceLingua, revisione, attenzione, indicatoreOrdineTrading, ordineDettagli);

		listordineTestata.add(ordineTestata);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listordineTestata;
	}

}
