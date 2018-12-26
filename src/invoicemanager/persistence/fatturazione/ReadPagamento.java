package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Pagamento;


public class ReadPagamento {
	private Connection c;

	public ReadPagamento() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Pagamento> read() {
		List<Pagamento> listpagamento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Pagamento");
			Timestamp ts;
	         while ( rs.next() ) {

String codicePagament = rs.getString("codicePagament");
String descrizion = rs.getString("descrizion");
String codice = rs.getString("codiceStat");
Stato codiceStat = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
String codice = rs.getString("codiceTipoPagament");
TipoPagamento codiceTipoPagament = list.stream().filter(x->x.getTipoPagamento().equals(codice)).findFirst().get();
boolean indicatoreScadenzaAVist = rs.getBoolean("indicatoreScadenzaAVist");
String giornoMes = rs.getString("giornoMes");
int numeroGiorn = rs.getInt("numeroGiorn");
int numeroScadenz = rs.getInt("numeroScadenz");
float scont = rs.getFloat("scont");
boolean scadenzaIVAPrimaRat = rs.getBoolean("scadenzaIVAPrimaRat");
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
String loginInseriment = rs.getString("loginInseriment");
Pagamento pagamento = new Pagamento(codicePagament, descrizion, codiceStat, codiceTipoPagament, indicatoreScadenzaAVist, giornoMes, numeroGiorn, numeroScadenz, scont, scadenzaIVAPrimaRat, dataInseriment, dataUltimaModific, loginInseriment);

		listpagamento.add(pagamento);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listpagamento;
	}

}
