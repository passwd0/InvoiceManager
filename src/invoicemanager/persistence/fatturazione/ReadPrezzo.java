package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Prezzo;


public class ReadPrezzo {
	private Connection c;

	public ReadPrezzo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Prezzo> read() {
		List<Prezzo> listprezzo = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Prezzo");
			Timestamp ts;
	         while ( rs.next() ) {

				int id = rs.getInt("id");
				int codiceListinoPersonalizzato = rs.getInt("codiceListinoPersonalizzato");
				float prezzof = rs.getFloat("prezzo");
				
				Prezzo prezzo = new Prezzo(id, codiceListinoPersonalizzato, prezzof);

				listprezzo.add(prezzo);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listprezzo;
	}

}
