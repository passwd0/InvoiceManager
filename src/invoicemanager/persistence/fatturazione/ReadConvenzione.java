package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Convenzione;


public class ReadConvenzione {
	private Connection c;

	public ReadConvenzione() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Convenzione> read() {
		List<Convenzione> listconvenzione = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Convenzione");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroConvenzione = rs.getInt("numeroConvenzione");
String codice = rs.getString("numeroRigaConvenzione");
Short numeroRigaConvenzione = list.stream().filter(x->x.getShort().equals(codice)).findFirst().get();
String codice = rs.getString("dataConvenzione");
LocalDate dataConvenzione = list.stream().filter(x->x.getLocalDate().equals(codice)).findFirst().get();
String cnvCodiceCommessaConvenzione = rs.getString("cnvCodiceCommessaConvenzione");
String cnvCodiceCUP = rs.getString("cnvCodiceCUP");
String cnvCodiceCIG = rs.getString("cnvCodiceCIG");
Convenzione convenzione = new Convenzione(numeroConvenzione, numeroRigaConvenzione, dataConvenzione, cnvCodiceCommessaConvenzione, cnvCodiceCUP, cnvCodiceCIG);

		listconvenzione.add(convenzione);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listconvenzione;
	}

}
