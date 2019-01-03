package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.RappresentanteFiscale;


public class ReadRappresentanteFiscale {
	private Connection c;

	public ReadRappresentanteFiscale() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<RappresentanteFiscale> read() {
		List<RappresentanteFiscale> listrappresentanteFiscale = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM RappresentanteFiscale");
			Timestamp ts;
	         while ( rs.next() ) {

String paese = rs.getString("paese");
String identificativoFiscale = rs.getString("identificativoFiscale");
String denominazione = rs.getString("denominazione");
String nome = rs.getString("nome");
String cognome = rs.getString("cognome");
()
RappresentanteFiscale rappresentanteFiscale = new RappresentanteFiscale(paese, identificativoFiscale, denominazione, nome, cognome);

		listrappresentanteFiscale.add(rappresentanteFiscale);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listrappresentanteFiscale;
	}

}
