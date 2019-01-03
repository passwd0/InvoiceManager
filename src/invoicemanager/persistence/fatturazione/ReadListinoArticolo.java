package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.ListinoArticolo;


public class ReadListinoArticolo {
	private Connection c;

	public ReadListinoArticolo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
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
String codice = rs.getString("dataDecorrenza");
LocalDate dataDecorrenza = listaLocalDate.stream().filter(x->x.getCodiceLocalDate().equals(codice)).findFirst().get();
String codice = rs.getString("dataValidita");
LocalDate dataValidita = listaLocalDate.stream().filter(x->x.getCodiceLocalDate().equals(codice)).findFirst().get();
ts = rs.getTimestamp("dataInserimento");
LocalDateTime dataInserimento = null;
if (ts != null)
dataInserimento = ts.toLocalDateTime();
ts = rs.getTimestamp("dataUltimaModifica");
LocalDateTime dataUltimaModifica = null;
if (ts != null)
dataUltimaModifica = ts.toLocalDateTime();
(List<LocalDate> listaLocalDate, List<LocalDate> listaLocalDate,)
ListinoArticolo listinoArticolo = new ListinoArticolo(codiceArticolo, progressivo, codiceDivisa, prezzo, numeroDecimali, dataDecorrenza, dataValidita, dataInserimento, dataUltimaModifica);

		listlistinoArticolo.add(listinoArticolo);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listlistinoArticolo;
	}

}
