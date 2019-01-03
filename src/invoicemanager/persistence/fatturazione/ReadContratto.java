package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Contratto;


public class ReadContratto {
	private Connection c;

	public ReadContratto() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Contratto> read() {
		List<Contratto> listcontratto = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Contratto");
			Timestamp ts;
	         while ( rs.next() ) {

int numeroContratto = rs.getInt("numeroContratto");
String codice = rs.getString("numeroRigaContratto");
Short numeroRigaContratto = list.stream().filter(x->x.getShort().equals(codice)).findFirst().get();
String codice = rs.getString("dataContratto");
LocalDate dataContratto = list.stream().filter(x->x.getLocalDate().equals(codice)).findFirst().get();
String cntCodiceCommessaConvenzione = rs.getString("cntCodiceCommessaConvenzione");
String cntCodiceCUP = rs.getString("cntCodiceCUP");
String cntCodiceCIG = rs.getString("cntCodiceCIG");
Contratto contratto = new Contratto(numeroContratto, numeroRigaContratto, dataContratto, cntCodiceCommessaConvenzione, cntCodiceCUP, cntCodiceCIG);

		listcontratto.add(contratto);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcontratto;
	}

}
