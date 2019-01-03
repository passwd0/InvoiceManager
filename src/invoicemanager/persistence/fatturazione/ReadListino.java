package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Listino;


public class ReadListino {
	private Connection c;

	public ReadListino() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Listino> read() {
		List<Listino> listlistino = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Listino");
			Timestamp ts;
	         while ( rs.next() ) {

Listino listino = new Listino();

		listlistino.add(listino);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listlistino;
	}

}
