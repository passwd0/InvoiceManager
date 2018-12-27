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

String codicePagamento = rs.getString("codicePagamento");
String descrizione = rs.getString("descrizione");
String codice = rs.getString("codiceStato");
Stato codiceStato = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
String codice = rs.getString("codiceTipoPagamento");
TipoPagamento codiceTipoPagamento = list.stream().filter(x->x.getTipoPagamento().equals(codice)).findFirst().get();
boolean indicatoreScadenzaAVista = rs.getBoolean("indicatoreScadenzaAVista");
String giornoMese = rs.getString("giornoMese");
int numeroGiorni = rs.getInt("numeroGiorni");
int numeroScadenze = rs.getInt("numeroScadenze");
float sconto = rs.getFloat("sconto");
boolean scadenzaIVAPrimaRata = rs.getBoolean("scadenzaIVAPrimaRata");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
String loginInserimento = rs.getString("loginInserimento");
Pagamento pagamento = new Pagamento(codicePagamento, descrizione, codiceStato, codiceTipoPagamento, indicatoreScadenzaAVista, giornoMese, numeroGiorni, numeroScadenze, sconto, scadenzaIVAPrimaRata, dataInserimento, dataUltimaModifica, loginInserimento);

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
