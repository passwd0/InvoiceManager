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
		c = DBConnect.connect();
	}

	public List<Stato> read() {
		List<Stato> liststato = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Stato");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceStato = rs.getString("codiceStato");
String descrizione = rs.getString("descrizione");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
Stato stato = new Stato(codiceStato, descrizione, dataInserimento, dataUltimaModifica);

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
