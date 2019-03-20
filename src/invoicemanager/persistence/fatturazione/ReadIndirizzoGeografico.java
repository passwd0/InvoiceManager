package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.IndirizzoGeografico;


public class ReadIndirizzoGeografico {
	private Connection c;

	public ReadIndirizzoGeografico() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<IndirizzoGeografico> read() {
		List<IndirizzoGeografico> listindirizzoGeografico = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM IndirizzoGeografico");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceIndirizzo = rs.getString("codiceIndirizzo");
				String codiceConto = rs.getString("codiceConto");
				String via = rs.getString("via");
				String provincia = rs.getString("provincia");
				String cap = rs.getString("cap");
				String citta = rs.getString("citta");
				String codiceNazione = rs.getString("codiceNazione");
				String codiceTipoIndirizzo = rs.getString("codiceTipoIndirizzo");
				String descrizione = rs.getString("descrizione");
				boolean indicatoreIndirizzoDefault = rs.getBoolean("indicatoreIndirizzoDefault");
				String codiceMinistero = rs.getString("codiceMinistero");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
					dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
					dataUltimaModifica = ts.toLocalDateTime();
				IndirizzoGeografico indirizzoGeografico = new IndirizzoGeografico(codiceIndirizzo, codiceConto, via, provincia, cap, citta, codiceNazione, codiceTipoIndirizzo, descrizione, indicatoreIndirizzoDefault, codiceMinistero, dataInserimento, dataUltimaModifica);

				listindirizzoGeografico.add(indirizzoGeografico);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listindirizzoGeografico;
	}

}
