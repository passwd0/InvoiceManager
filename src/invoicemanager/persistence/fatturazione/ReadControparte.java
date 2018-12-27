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
		c = DBConnect.getConnection();
	}

	public List<Controparte> read() {
		List<Controparte> listcontroparte = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Controparte");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceContropart = rs.getString("codiceContropart");
String descrizion = rs.getString("descrizion");
String codice = rs.getString("codiceStat");
Stato codiceStat = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
String codiceContoCOG = rs.getString("codiceContoCOG");
int progressivoRelazioniCOGECO = rs.getInt("progressivoRelazioniCOGECO");
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
String loginInseriment = rs.getString("loginInseriment");
Controparte controparte = new Controparte(codiceContropart, descrizion, codiceStat, codiceContoCOG, progressivoRelazioniCOGECO, dataInseriment, dataUltimaModific, loginInseriment);

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
