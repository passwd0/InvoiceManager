package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.UnitaMisura;


public class ReadUnitaMisura {
	private Connection c;

	public ReadUnitaMisura() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
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
				boolean codiceStato = rs.getBoolean("codiceStato");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();
				
				UnitaMisura unitaMisura = new UnitaMisura(codiceUnitaMisura, descrizione, codiceStato, dataInserimento, dataUltimaModifica);

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
