package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.AltroDatoGestionale;


public class ReadAltroDatoGestionale {
	private Connection c;

	public ReadAltroDatoGestionale() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<AltroDatoGestionale> read() {
		List<AltroDatoGestionale> listaltroDatoGestionale = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM AltroDatoGestionale");
			Timestamp ts;
	         while ( rs.next() ) {

int codiceAltroDatoGestionale = rs.getInt("codiceAltroDatoGestionale");
String tipoDato = rs.getString("tipoDato");
String riferimentoTesto = rs.getString("riferimentoTesto");
float riferimentoNumero = rs.getFloat("riferimentoNumero");
String codice = rs.getString("riferimentoData");
LocalDate riferimentoData = list.stream().filter(x->x.getLocalDate().equals(codice)).findFirst().get();
AltroDatoGestionale altroDatoGestionale = new AltroDatoGestionale(codiceAltroDatoGestionale, tipoDato, riferimentoTesto, riferimentoNumero, riferimentoData);

		listaltroDatoGestionale.add(altroDatoGestionale);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listaltroDatoGestionale;
	}

}
