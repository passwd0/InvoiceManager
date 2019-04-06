package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.AltroDatoGestionale;


public class ReadAltroDatoGestionale {
	private Connection c;

	public ReadAltroDatoGestionale() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<AltroDatoGestionale> read() {
		List<AltroDatoGestionale> listAltroDatoGestionale = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM AltroDatoGestionale");
	         while ( rs.next() ) {

				int codiceAltroDatoGestionale = rs.getInt("codiceAltroDatoGestionale");
				String tipoDato = rs.getString("tipoDato");
				String riferimentoTesto = rs.getString("riferimentoTesto");
				float riferimentoNumero = rs.getFloat("riferimentoNumero");
				LocalDate riferimentoData = rs.getDate("riferimentoData").toLocalDate();
				AltroDatoGestionale altroDatoGestionale = new AltroDatoGestionale(codiceAltroDatoGestionale, tipoDato, riferimentoTesto, riferimentoNumero, riferimentoData);

				listAltroDatoGestionale.add(altroDatoGestionale);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listAltroDatoGestionale;
	}

}
