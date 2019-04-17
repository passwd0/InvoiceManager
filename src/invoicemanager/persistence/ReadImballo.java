package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Imballo;
import invoicemanager.model.Stato;


public class ReadImballo {
	private Connection c;

	public ReadImballo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
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
				Stato stato = Stato.valueOf(rs.getString("stato"));
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				Imballo imballo = new Imballo(codiceImballo, descrizione, stato, dataInserimento, dataUltimaModifica);

				listimballo.add(imballo);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listimballo;
	}

}
