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

String codiceControparte = rs.getString("codiceControparte");
String descrizione = rs.getString("descrizione");
Stato stato = Stato.valueOf(rs.getString("stato"));
String codiceContoCOGE = rs.getString("codiceContoCOGE");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
()
Controparte controparte = new Controparte(codiceControparte, descrizione, stato, codiceContoCOGE, dataInserimento, dataUltimaModifica);

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
