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

int numeroOrdin = rs.getInt("numeroOrdin");
ts = rs.getTimestamp("dataOrdin");
LocalDateTime dataOrdin = null;
if (ts != null)
dataOrdin = ts.toLocalDateTime();
boolean indicatoreStatoAvanzament = rs.getBoolean("indicatoreStatoAvanzament");
String codiceClienteFatturazion = rs.getString("codiceClienteFatturazion");
String descrizion = rs.getString("descrizion");
String codiceEsenzioneIv = rs.getString("codiceEsenzioneIv");
String codiceAgent = rs.getString("codiceAgent");
float percentualeProvvigion = rs.getFloat("percentualeProvvigion");
float percentualeScont = rs.getFloat("percentualeScont");
float percentualeScontoPagament = rs.getFloat("percentualeScontoPagament");
int numeroCopieFattur = rs.getInt("numeroCopieFattur");
boolean indicatoreAddebitoBoll = rs.getBoolean("indicatoreAddebitoBoll");
boolean indicatoreAddebitoSpeseIncass = rs.getBoolean("indicatoreAddebitoSpeseIncass");
int codiceListin = rs.getInt("codiceListin");
String codiceRes = rs.getString("codiceRes");
String codiceVettor = rs.getString("codiceVettor");
String codiceCausal = rs.getString("codiceCausal");
String codicePagament = rs.getString("codicePagament");
String codiceBanc = rs.getString("codiceBanc");
ts = rs.getTimestamp("dataConsegn");
LocalDateTime dataConsegn = null;
if (ts != null)
dataConsegn = ts.toLocalDateTime();
String causaleTrasport = rs.getString("causaleTrasport");
String codiceDivis = rs.getString("codiceDivis");
boolean indicatoreConsegnaParzial = rs.getBoolean("indicatoreConsegnaParzial");
boolean indicatoreRaggruppamentoConsegn = rs.getBoolean("indicatoreRaggruppamentoConsegn");
String codiceAgenteVecchi = rs.getString("codiceAgenteVecchi");
String codiceClienteSpedizion = rs.getString("codiceClienteSpedizion");
String nomeSpedizion = rs.getString("nomeSpedizion");
String indirizzoSpedizion = rs.getString("indirizzoSpedizion");
String capSpedizion = rs.getString("capSpedizion");
String cittaSpedizion = rs.getString("cittaSpedizion");
String provinciaSpedizion = rs.getString("provinciaSpedizion");
String codiceNazioneSpedizion = rs.getString("codiceNazioneSpedizion");
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
String not = rs.getString("not");
String loginInseriment = rs.getString("loginInseriment");
String loginModific = rs.getString("loginModific");
String codiceLingu = rs.getString("codiceLingu");
String revision = rs.getString("revision");
String attenzion = rs.getString("attenzion");
boolean indicatoreOrdineTradin = rs.getBoolean("indicatoreOrdineTradin");
String codice = rs.getString("ordineDettagl");
List<OrdineDettaglio> ordineDettagl = list.stream().filter(x->x.getList<OrdineDettaglio>().equals(codice)).findFirst().get();
OrdineTestata ordineTestata = new OrdineTestata(numeroOrdin, dataOrdin, indicatoreStatoAvanzament, codiceClienteFatturazion, descrizion, codiceEsenzioneIv, codiceAgent, percentualeProvvigion, percentualeScont, percentualeScontoPagament, numeroCopieFattur, indicatoreAddebitoBoll, indicatoreAddebitoSpeseIncass, codiceListin, codiceRes, codiceVettor, codiceCausal, codicePagament, codiceBanc, dataConsegn, causaleTrasport, codiceDivis, indicatoreConsegnaParzial, indicatoreRaggruppamentoConsegn, codiceAgenteVecchi, codiceClienteSpedizion, nomeSpedizion, indirizzoSpedizion, capSpedizion, cittaSpedizion, provinciaSpedizion, codiceNazioneSpedizion, dataInseriment, dataUltimaModific, not, loginInseriment, loginModific, codiceLingu, revision, attenzion, indicatoreOrdineTradin, ordineDettagl);

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
