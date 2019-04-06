package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	         while ( rs.next() ) {
	        	 int codice = rs.getInt("codice");
				String paese = rs.getString("paese");
				String identificativoFiscale = rs.getString("identificativoFiscale");
				String denominazione = rs.getString("denominazione");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				
				RappresentanteFiscale rappresentanteFiscale = new RappresentanteFiscale(codice, paese, identificativoFiscale, denominazione, nome, cognome);

				listrappresentanteFiscale.add(rappresentanteFiscale);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listrappresentanteFiscale;
	}

}
