package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.RaggruppamentoClienteFornitore;


public class ReadRaggruppamentoClienteFornitore {
	private Connection c;

	public ReadRaggruppamentoClienteFornitore() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<RaggruppamentoClienteFornitore> read() {
		List<RaggruppamentoClienteFornitore> listraggruppamentoClienteFornitore = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM RaggruppamentoClienteFornitore");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceRaggruppamento = rs.getString("codiceRaggruppamento");
String descrizione = rs.getString("descrizione");
String codice = rs.getString("codiceStato");
Stato codiceStato = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
String loginInserimento = rs.getString("loginInserimento");
RaggruppamentoClienteFornitore raggruppamentoClienteFornitore = new RaggruppamentoClienteFornitore(codiceRaggruppamento, descrizione, codiceStato, dataInserimento, dataUltimaModifica, loginInserimento);

		listraggruppamentoClienteFornitore.add(raggruppamentoClienteFornitore);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listraggruppamentoClienteFornitore;
	}

}