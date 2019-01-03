package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Ricezione;


public class ReadRicezione {
	private Connection c;

	public ReadRicezione() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<Ricezione> read() {
		List<Ricezione> listricezione = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Ricezione");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroRicezione = rs.getInt("numeroRicezione");
int numeroRigaRicezione = rs.getInt("numeroRigaRicezione");
String codice = rs.getString("dataRicezione");
LocalDate dataRicezione = listaLocalDate.stream().filter(x->x.getCodiceLocalDate().equals(codice)).findFirst().get();
String rczCodiceCommessaRicezione = rs.getString("rczCodiceCommessaRicezione");
String rczCodiceCUP = rs.getString("rczCodiceCUP");
String rczCodiceCIG = rs.getString("rczCodiceCIG");
(List<LocalDate> listaLocalDate,)
Ricezione ricezione = new Ricezione(numeroRicezione, numeroRigaRicezione, dataRicezione, rczCodiceCommessaRicezione, rczCodiceCUP, rczCodiceCIG);

		listricezione.add(ricezione);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listricezione;
	}

}
