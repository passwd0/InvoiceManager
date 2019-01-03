package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.StabileOrganizzazione;


public class ReadStabileOrganizzazione {
	private Connection c;

	public ReadStabileOrganizzazione() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<StabileOrganizzazione> read() {
		List<StabileOrganizzazione> liststabileOrganizzazione = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM StabileOrganizzazione");
			Timestamp ts;
	         while ( rs.next() ) {

String soIndirizzo = rs.getString("soIndirizzo");
String soNumeroCivico = rs.getString("soNumeroCivico");
String soCap = rs.getString("soCap");
String soComune = rs.getString("soComune");
String soProvincia = rs.getString("soProvincia");
String soNazione = rs.getString("soNazione");
()
StabileOrganizzazione stabileOrganizzazione = new StabileOrganizzazione(soIndirizzo, soNumeroCivico, soCap, soComune, soProvincia, soNazione);

		liststabileOrganizzazione.add(stabileOrganizzazione);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return liststabileOrganizzazione;
	}

}
