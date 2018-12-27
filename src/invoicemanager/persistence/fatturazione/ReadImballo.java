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

String codiceImballo = rs.getString("codiceImballo");
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
Imballo imballo = new Imballo(codiceImballo, descrizione, codiceStato, dataInserimento, dataUltimaModifica, loginInserimento);

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
