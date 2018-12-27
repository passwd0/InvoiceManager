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
		c = DBConnect.getConnection();
	}

	public List<RaggruppamentoClienteFornitore> read() {
		List<RaggruppamentoClienteFornitore> listraggruppamentoClienteFornitore = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM RaggruppamentoClienteFornitore");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceRaggruppament = rs.getString("codiceRaggruppament");
String descrizion = rs.getString("descrizion");
String codice = rs.getString("codiceStat");
Stato codiceStat = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
String loginInseriment = rs.getString("loginInseriment");
RaggruppamentoClienteFornitore raggruppamentoClienteFornitore = new RaggruppamentoClienteFornitore(codiceRaggruppament, descrizion, codiceStat, dataInseriment, dataUltimaModific, loginInseriment);

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
