package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Iso;


public class ReadIso {
	private Connection c;

	public ReadIso() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Iso> read() {
		List<Iso> listiso = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Iso");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceISO = rs.getString("codiceISO");
String descrizione = rs.getString("descrizione");
Stato stato = Stato.valueOf(rs.getString("stato"));
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
()
Iso iso = new Iso(codiceISO, descrizione, stato, dataInserimento, dataUltimaModifica);

		listiso.add(iso);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listiso;
	}

}
