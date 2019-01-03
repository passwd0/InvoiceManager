package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Ordine;


public class ReadOrdine {
	private Connection c;

	public ReadOrdine() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Ordine> read() {
		List<Ordine> listordine = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Ordine");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroOrdine = rs.getInt("numeroOrdine");
int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
String codice = rs.getString("dataOrdine");
LocalDate dataOrdine = list.stream().filter(x->x.getLocalDate().equals(codice)).findFirst().get();
String ordCodiceCommessaConvenzione = rs.getString("ordCodiceCommessaConvenzione");
String ordCodiceCUP = rs.getString("ordCodiceCUP");
String ordCodiceCIG = rs.getString("ordCodiceCIG");
Ordine ordine = new Ordine(numeroOrdine, numeroRigaOrdine, dataOrdine, ordCodiceCommessaConvenzione, ordCodiceCUP, ordCodiceCIG);

		listordine.add(ordine);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listordine;
	}

}
