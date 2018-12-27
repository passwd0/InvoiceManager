package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.DdtTestata;


public class ReadDdtTestata {
	private Connection c;

	public ReadDdtTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<DdtTestata> read() {
		List<DdtTestata> listddtTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM DdtTestata");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroDD = rs.getInt("numeroDD");
ts = rs.getTimestamp("dataDD");
LocalDateTime dataDD = null;
if (ts != null)
dataDD = ts.toLocalDateTime();
boolean indicatoreStatoAvanzament = rs.getBoolean("indicatoreStatoAvanzament");
String codiceCausal = rs.getString("codiceCausal");
String codiceCausalePreliev = rs.getString("codiceCausalePreliev");
String codiceClienteFatturazion = rs.getString("codiceClienteFatturazion");
String codiceEsenzioneIv = rs.getString("codiceEsenzioneIv");
String codiceAgent = rs.getString("codiceAgent");
float percentualeProvvigion = rs.getFloat("percentualeProvvigion");
float percentualeScont = rs.getFloat("percentualeScont");
int numeroCopieFattur = rs.getInt("numeroCopieFattur");
boolean indicatoreAddebitoBoll = rs.getBoolean("indicatoreAddebitoBoll");
boolean indicatoreAddebitoSpeseIncass = rs.getBoolean("indicatoreAddebitoSpeseIncass");
int codiceListin = rs.getInt("codiceListin");
String codiceRes = rs.getString("codiceRes");
String codiceVettor = rs.getString("codiceVettor");
String codiceImball = rs.getString("codiceImball");
String codicePagament = rs.getString("codicePagament");
String codiceBanc = rs.getString("codiceBanc");
int numeroFattur = rs.getInt("numeroFattur");
ts = rs.getTimestamp("dataFattur");
LocalDateTime dataFattur = null;
if (ts != null)
dataFattur = ts.toLocalDateTime();
String codiceDivis = rs.getString("codiceDivis");
String causaleTrasport = rs.getString("causaleTrasport");
float pesoColl = rs.getFloat("pesoColl");
String descrizion = rs.getString("descrizion");
int numeroColl = rs.getInt("numeroColl");
boolean indicatorePreventivoDaConferm = rs.getBoolean("indicatorePreventivoDaConferm");
boolean indicatoreBollaVision = rs.getBoolean("indicatoreBollaVision");
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
String oginModific = rs.getString("oginModific");
String codiceLingu = rs.getString("codiceLingu");
int numeroDdtDeposit = rs.getInt("numeroDdtDeposit");
String codiceDeposit = rs.getString("codiceDeposit");
String noteCaricament = rs.getString("noteCaricament");
String codiceFilialeEd = rs.getString("codiceFilialeEd");
ts = rs.getTimestamp("dataCaricament");
LocalDateTime dataCaricament = null;
if (ts != null)
dataCaricament = ts.toLocalDateTime();
String unitaMisuraPesoColl = rs.getString("unitaMisuraPesoColl");
String codice = rs.getString("ddtDettagl");
List<DdtDettaglio> ddtDettagl = list.stream().filter(x->x.getList<DdtDettaglio>().equals(codice)).findFirst().get();
DdtTestata ddtTestata = new DdtTestata(numeroDD, dataDD, indicatoreStatoAvanzament, codiceCausal, codiceCausalePreliev, codiceClienteFatturazion, codiceEsenzioneIv, codiceAgent, percentualeProvvigion, percentualeScont, numeroCopieFattur, indicatoreAddebitoBoll, indicatoreAddebitoSpeseIncass, codiceListin, codiceRes, codiceVettor, codiceImball, codicePagament, codiceBanc, numeroFattur, dataFattur, codiceDivis, causaleTrasport, pesoColl, descrizion, numeroColl, indicatorePreventivoDaConferm, indicatoreBollaVision, codiceClienteSpedizion, nomeSpedizion, indirizzoSpedizion, capSpedizion, cittaSpedizion, provinciaSpedizion, codiceNazioneSpedizion, dataInseriment, dataUltimaModific, not, loginInseriment, oginModific, codiceLingu, numeroDdtDeposit, codiceDeposit, noteCaricament, codiceFilialeEd, dataCaricament, unitaMisuraPesoColl, ddtDettagl);

		listddtTestata.add(ddtTestata);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listddtTestata;
	}

}
