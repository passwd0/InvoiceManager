package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.FatturaCollegata;


public class ReadFatturaCollegata {
	private Connection c;

	public ReadFatturaCollegata() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<FatturaCollegata> read() {
		List<FatturaCollegata> listfatturaCollegata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaCollegata");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroFtCollegate = rs.getInt("numeroFtCollegate");
String codice = rs.getString("numeroRigaFtCollegate");
Short numeroRigaFtCollegate = list.stream().filter(x->x.getShort().equals(codice)).findFirst().get();
String codice = rs.getString("dataFtCollegate");
LocalDate dataFtCollegate = list.stream().filter(x->x.getLocalDate().equals(codice)).findFirst().get();
String ftcCodiceCommessaFtCollegate = rs.getString("ftcCodiceCommessaFtCollegate");
String ftcCodiceCUP = rs.getString("ftcCodiceCUP");
String ftcCodiceCIG = rs.getString("ftcCodiceCIG");
FatturaCollegata fatturaCollegata = new FatturaCollegata(numeroFtCollegate, numeroRigaFtCollegate, dataFtCollegate, ftcCodiceCommessaFtCollegate, ftcCodiceCUP, ftcCodiceCIG);

		listfatturaCollegata.add(fatturaCollegata);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaCollegata;
	}

}
