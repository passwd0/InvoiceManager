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
		c = DBConnect.getConnection();
	}

	public List<FatturaTestata> read() {
		List<FatturaTestata> listfatturaTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaTestata");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroFatturazion = rs.getInt("numeroFatturazion");
ts = rs.getTimestamp("dataFattur");
LocalDateTime dataFattur = null;
if (ts != null)
dataFattur = ts.toLocalDateTime();
String codice = rs.getString("indicatoreStatoAvanzament");
Char indicatoreStatoAvanzament = list.stream().filter(x->x.getChar().equals(codice)).findFirst().get();
String codiceClienteFatturazion = rs.getString("codiceClienteFatturazion");
String codiceEsenzioneIv = rs.getString("codiceEsenzioneIv");
String codiceAgent = rs.getString("codiceAgent");
String codiceCausal = rs.getString("codiceCausal");
String codiceCausalePreliev = rs.getString("codiceCausalePreliev");
float percentualeScont = rs.getFloat("percentualeScont");
float percentualeScontoPagament = rs.getFloat("percentualeScontoPagament");
float percentualeProvvigion = rs.getFloat("percentualeProvvigion");
String descrizion = rs.getString("descrizion");
boolean indicatoreAddebitoBoll = rs.getBoolean("indicatoreAddebitoBoll");
boolean indicatoreAddebitoSpeseIncass = rs.getBoolean("indicatoreAddebitoSpeseIncass");
boolean indicatoreScaricoMagazzin = rs.getBoolean("indicatoreScaricoMagazzin");
int codiceListin = rs.getInt("codiceListin");
String codiceRes = rs.getString("codiceRes");
String codiceVettor = rs.getString("codiceVettor");
boolean indicatoreFatturaAccompagnatori = rs.getBoolean("indicatoreFatturaAccompagnatori");
String codicePagament = rs.getString("codicePagament");
String codiceBanc = rs.getString("codiceBanc");
String codiceImball = rs.getString("codiceImball");
float pesoColl = rs.getFloat("pesoColl");
float numeroColl = rs.getFloat("numeroColl");
float accont = rs.getFloat("accont");
String codiceDivis = rs.getString("codiceDivis");
float cambi = rs.getFloat("cambi");
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
boolean indicatoreFatturazioneDifferit = rs.getBoolean("indicatoreFatturazioneDifferit");
boolean indicatoreEmai = rs.getBoolean("indicatoreEmai");
boolean indicatoreP = rs.getBoolean("indicatoreP");
String codice = rs.getString("fatturadettagli");
List<FatturaDettaglio> fatturadettagli = list.stream().filter(x->x.getList<FatturaDettaglio>().equals(codice)).findFirst().get();
float speseTrasport = rs.getFloat("speseTrasport");
float speseImball = rs.getFloat("speseImball");
float speseIncass = rs.getFloat("speseIncass");
float speseBoll = rs.getFloat("speseBoll");
float omagg = rs.getFloat("omagg");
float totalePagat = rs.getFloat("totalePagat");
String codice = rs.getString("dataScadenz");
LocalDate dataScadenz = list.stream().filter(x->x.getLocalDate().equals(codice)).findFirst().get();
float importoScadenz = rs.getFloat("importoScadenz");
FatturaTestata fatturaTestata = new FatturaTestata(numeroFatturazion, dataFattur, indicatoreStatoAvanzament, codiceClienteFatturazion, codiceEsenzioneIv, codiceAgent, codiceCausal, codiceCausalePreliev, percentualeScont, percentualeScontoPagament, percentualeProvvigion, descrizion, indicatoreAddebitoBoll, indicatoreAddebitoSpeseIncass, indicatoreScaricoMagazzin, codiceListin, codiceRes, codiceVettor, indicatoreFatturaAccompagnatori, codicePagament, codiceBanc, codiceImball, pesoColl, numeroColl, accont, codiceDivis, cambi, codiceClienteSpedizion, nomeSpedizion, indirizzoSpedizion, capSpedizion, cittaSpedizion, provinciaSpedizion, codiceNazioneSpedizion, dataInseriment, dataUltimaModific, not, indicatoreFatturazioneDifferit, indicatoreEmai, indicatoreP, fatturadettagli, speseTrasport, speseImball, speseIncass, speseBoll, omagg, totalePagat, dataScadenz, importoScadenz);

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
