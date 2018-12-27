package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.OrdineDettaglio;


public class ReadOrdineDettaglio {
	private Connection c;

	public ReadOrdineDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<OrdineDettaglio> read() {
		List<OrdineDettaglio> listordineDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM OrdineDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
OrdineDettaglio ordineDettaglio = new OrdineDettaglio(numeroRigaOrdine);

		listordineDettaglio.add(ordineDettaglio);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listordineDettaglio;
	}

}
