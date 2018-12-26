package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Imballo;


public class ReadImballo {
	private Connection c;

	public ReadImballo() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Imballo> read() {
		List<Imballo> listimballo = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Imballo");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceImball = rs.getString("codiceImball");
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
Imballo imballo = new Imballo(codiceImball, descrizion, codiceStat, dataInseriment, dataUltimaModific, loginInseriment);

		listimballo.add(imballo);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listimballo;
	}

}
