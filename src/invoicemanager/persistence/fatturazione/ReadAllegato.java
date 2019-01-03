package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Allegato;


public class ReadAllegato {
	private Connection c;

	public ReadAllegato() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Allegato> read() {
		List<Allegato> listallegato = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Allegato");
			Timestamp ts;
	         while ( rs.next() ) {

String nomeAllegato = rs.getString("nomeAllegato");
String pathAllegato = rs.getString("pathAllegato");

Allegato allegato = new Allegato(nomeAllegato, pathAllegato);

		listallegato.add(allegato);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listallegato;
	}

}
