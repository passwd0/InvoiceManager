package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Stato;


public class ReadStato {
	private Connection c;

	public ReadStato() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Stato> read() {
		List<Stato> liststato = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Stato");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceStat = rs.getString("codiceStat");
String descrizion = rs.getString("descrizion");
ts = rs.getTimestamp("dataInseriment");
LocalDateTime dataInseriment = null;
if (ts != null)
dataInseriment = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModific");
LocalDateTime dataUltimaModific = null;
if (ts != null)
dataUltimaModific = ts.toLocalDateTime();
Stato stato = new Stato(codiceStat, descrizion, dataInseriment, dataUltimaModific);

		liststato.add(stato);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return liststato;
	}

}
