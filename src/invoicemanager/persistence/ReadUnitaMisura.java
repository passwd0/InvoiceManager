package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Stato;
import invoicemanager.model.UnitaMisura;


public class ReadUnitaMisura {
	private Connection c;

	public ReadUnitaMisura() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<UnitaMisura> read() {
		List<UnitaMisura> listunitaMisura = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM UnitaMisura");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceUnitaMisura = rs.getString("codiceUnitaMisura");
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
				
				UnitaMisura unitaMisura = new UnitaMisura(codiceUnitaMisura, descrizione, stato, dataInserimento, dataUltimaModifica);

		listunitaMisura.add(unitaMisura);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listunitaMisura;
	}

}
