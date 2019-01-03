package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.PreventivoTestata;


public class ReadPreventivoTestata {
	private Connection c;

	public ReadPreventivoTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<PreventivoTestata> read() {
		List<PreventivoTestata> listpreventivoTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PreventivoTestata");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroPreventivo = rs.getInt("numeroPreventivo");
LocalDate dataPreventivo = rs.getDate("dataPreventivo")).toLocalDate();
boolean indicatoreStatoAvanzamento = rs.getBoolean("indicatoreStatoAvanzamento");
LocalDate dataConsegna = rs.getDate("dataConsegna")).toLocalDate();
LocalDate dataValidita = rs.getDate("dataValidita")).toLocalDate();
String periodoValidita = rs.getString("periodoValidita");
boolean indicatoreUtilizzoDataValidita = rs.getBoolean("indicatoreUtilizzoDataValidita");
String codiceCliente = rs.getString("codiceCliente");
String attenzione = rs.getString("attenzione");
String oggetto = rs.getString("oggetto");
String riferimentoInterno = rs.getString("riferimentoInterno");
String numeroInterno = rs.getString("numeroInterno");
String codiceIVA = rs.getString("codiceIVA");
String codiceAgente = rs.getString("codiceAgente");
String codiceResa = rs.getString("codiceResa");
String codiceVettore = rs.getString("codiceVettore");
String codicePagamento = rs.getString("codicePagamento");
String codiceBanca = rs.getString("codiceBanca");
String codiceCausale = rs.getString("codiceCausale");
String codiceCausalePrelievo = rs.getString("codiceCausalePrelievo");
boolean codiceListino = rs.getBoolean("codiceListino");
String descrizioneOrdine = rs.getString("descrizioneOrdine");
String codiceDivisa = rs.getString("codiceDivisa");
float cambio = rs.getFloat("cambio");
String numeroFax = rs.getString("numeroFax");
String venditore = rs.getString("venditore");
boolean indicatoreAddebitoBolli = rs.getBoolean("indicatoreAddebitoBolli");
boolean indicatoreAddebitoSpeseIncasso = rs.getBoolean("indicatoreAddebitoSpeseIncasso");
String note = rs.getString("note");
String codiceClienteSpedizione = rs.getString("codiceClienteSpedizione");
String nomeSpedizione = rs.getString("nomeSpedizione");
String indirizzoSpedizione = rs.getString("indirizzoSpedizione");
String capSpedizione = rs.getString("capSpedizione");
String cittaSpedizione = rs.getString("cittaSpedizione");
String provinciaSpedizione = rs.getString("provinciaSpedizione");
String codiceNazioneSpedizione = rs.getString("codiceNazioneSpedizione");
String loginInserimento = rs.getString("loginInserimento");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
()
PreventivoTestata preventivoTestata = new PreventivoTestata(numeroPreventivo, dataPreventivo, indicatoreStatoAvanzamento, dataConsegna, dataValidita, periodoValidita, indicatoreUtilizzoDataValidita, codiceCliente, attenzione, oggetto, riferimentoInterno, numeroInterno, codiceIVA, codiceAgente, codiceResa, codiceVettore, codicePagamento, codiceBanca, codiceCausale, codiceCausalePrelievo, codiceListino, descrizioneOrdine, codiceDivisa, cambio, numeroFax, venditore, indicatoreAddebitoBolli, indicatoreAddebitoSpeseIncasso, note, codiceClienteSpedizione, nomeSpedizione, indirizzoSpedizione, capSpedizione, cittaSpedizione, provinciaSpedizione, codiceNazioneSpedizione, loginInserimento, dataInserimento, dataUltimaModifica);

		listpreventivoTestata.add(preventivoTestata);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listpreventivoTestata;
	}

}
