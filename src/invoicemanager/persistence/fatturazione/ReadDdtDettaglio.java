package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.DdtDettaglio;


public class ReadDdtDettaglio {
	private Connection c;

	public ReadDdtDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<DdtDettaglio> read() {
		List<DdtDettaglio> listddtDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM DdtDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroRigaDDT = rs.getInt("numeroRigaDDT");
DdtDettaglio ddtDettaglio = new DdtDettaglio(numeroRigaDDT);

		listddtDettaglio.add(ddtDettaglio);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listddtDettaglio;
	}

}
