package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Controparte;


public class ReadControparte {
	private Connection c;

	public ReadControparte() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Controparte> read() {
		List<Controparte> listcontroparte = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Controparte");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceControparte = rs.getString("codiceControparte");
String descrizione = rs.getString("descrizione");
String codice = rs.getString("codiceStato");
Stato codiceStato = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
String codiceContoCOGE = rs.getString("codiceContoCOGE");
int progressivoRelazioniCOGECOA = rs.getInt("progressivoRelazioniCOGECOA");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
String loginInserimento = rs.getString("loginInserimento");
Controparte controparte = new Controparte(codiceControparte, descrizione, codiceStato, codiceContoCOGE, progressivoRelazioniCOGECOA, dataInserimento, dataUltimaModifica, loginInserimento);

		listcontroparte.add(controparte);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcontroparte;
	}

}
