package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.ResaMerce;


public class ReadResaMerce {
	private Connection c;

	public ReadResaMerce() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<ResaMerce> read() {
		List<ResaMerce> listresaMerce = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ResaMerce");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceResa = rs.getString("codiceResa");
String descrizione = rs.getString("descrizione");
Stato stato = Stato.valueOf(rs.getString("stato"));
float percentualeAddebito = rs.getFloat("percentualeAddebito");
float importoMinimo = rs.getFloat("importoMinimo");
boolean indicatoreProvvigione = rs.getBoolean("indicatoreProvvigione");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
()
ResaMerce resaMerce = new ResaMerce(codiceResa, descrizione, stato, percentualeAddebito, importoMinimo, indicatoreProvvigione, dataInserimento, dataUltimaModifica);

		listresaMerce.add(resaMerce);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listresaMerce;
	}

}
