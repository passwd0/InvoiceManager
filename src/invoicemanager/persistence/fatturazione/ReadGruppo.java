package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Gruppo;


public class ReadGruppo {
	private Connection c;

	public ReadGruppo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Gruppo> read() {
		List<Gruppo> listgruppo = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Gruppo");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceGruppo = rs.getString("codiceGruppo");
				String descrizione = rs.getString("descrizione");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				Gruppo gruppo = new Gruppo(codiceGruppo, descrizione, dataInserimento, dataUltimaModifica);

				listgruppo.add(gruppo);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listgruppo;
	}

}
