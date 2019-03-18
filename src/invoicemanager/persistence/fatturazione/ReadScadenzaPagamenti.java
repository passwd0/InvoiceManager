package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.ScadenzaPagamenti;


public class ReadScadenzaPagamenti {
	private Connection c;

	public ReadScadenzaPagamenti() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<ScadenzaPagamenti> read() {
		List<ScadenzaPagamenti> listscadenzaPagamenti = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ScadenzaPagamenti");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroFattura = rs.getInt("numeroFattura");
				LocalDate dataFattura = rs.getDate("dataFattura").toLocalDate();
				LocalDate dataScadenza = rs.getDate("dataScadenza").toLocalDate();
				float importoScadenza = rs.getFloat("importoScadenza");
				
				ScadenzaPagamenti scadenzaPagamenti = new ScadenzaPagamenti(numeroFattura, dataFattura, dataScadenza, importoScadenza);

				listscadenzaPagamenti.add(scadenzaPagamenti);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listscadenzaPagamenti;
	}

}
