package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.ListinoArticolo;
import invoicemanager.utils.Utils;


public class ReadListinoArticolo {
	private Connection c;

	public ReadListinoArticolo() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<ListinoArticolo> read() {
		List<ListinoArticolo> listlistinoArticolo = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ListinoArticolo");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceArticolo = rs.getString("codiceArticolo");
				int progressivo = rs.getInt("progressivo");
				String codiceDivisa = rs.getString("codiceDivisa");
				float prezzo = rs.getFloat("prezzo");
				int numeroDecimali = rs.getInt("numeroDecimali");
				LocalDate dataDecorrenza = Utils.convertToEntityAttribute(rs.getDate("dataDecorrenza"));
				LocalDate dataValidita = Utils.convertToEntityAttribute(rs.getDate("dataValidita"));
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				ListinoArticolo listinoArticolo = new ListinoArticolo(codiceArticolo, progressivo, codiceDivisa, prezzo, numeroDecimali, dataDecorrenza, dataValidita, dataInserimento, dataUltimaModifica);

				listlistinoArticolo.add(listinoArticolo);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listlistinoArticolo;
	}

}
