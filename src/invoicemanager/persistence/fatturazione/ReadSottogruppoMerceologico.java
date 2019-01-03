package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.SottogruppoMerceologico;


public class ReadSottogruppoMerceologico {
	private Connection c;

	public ReadSottogruppoMerceologico() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<SottogruppoMerceologico> read() {
		List<SottogruppoMerceologico> listsottogruppoMerceologico = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM SottogruppoMerceologico");
			Timestamp ts;
	         while ( rs.next() ) {

String codiceSottogruppoMerceologico = rs.getString("codiceSottogruppoMerceologico");
String descrizione = rs.getString("descrizione");
boolean codiceStato = rs.getBoolean("codiceStato");
float sconto = rs.getFloat("sconto");
float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
String loginInserimento = rs.getString("loginInserimento");
()
SottogruppoMerceologico sottogruppoMerceologico = new SottogruppoMerceologico(codiceSottogruppoMerceologico, descrizione, codiceStato, sconto, percentualeProvvigione, dataInserimento, dataUltimaModifica, loginInserimento);

		listsottogruppoMerceologico.add(sottogruppoMerceologico);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listsottogruppoMerceologico;
	}

}
