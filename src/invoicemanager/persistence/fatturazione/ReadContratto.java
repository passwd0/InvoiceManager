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
		c = DBConnect.getConnection();
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
int numeroRigaContratto = rs.getInt("numeroRigaContratto");
LocalDate dataContratto = rs.getDate("dataContratto")).toLocalDate();
String cntCodiceCommessaConvenzione = rs.getString("cntCodiceCommessaConvenzione");
String cntCodiceCUP = rs.getString("cntCodiceCUP");
String cntCodiceCIG = rs.getString("cntCodiceCIG");
()
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