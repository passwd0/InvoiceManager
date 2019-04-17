package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.StabileOrganizzazione;


public class ReadStabileOrganizzazione {
	private Connection c;

	public ReadStabileOrganizzazione() throws ClassNotFoundException, SQLException {
		c = ConnectionFactory.getConnection();
	}

	public List<StabileOrganizzazione> read() {
		List<StabileOrganizzazione> liststabileOrganizzazione = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM StabileOrganizzazione");
			Timestamp ts;
	         while ( rs.next() ) {
	        	int soCodice = rs.getInt("Codice");
				String soIndirizzo = rs.getString("Indirizzo");
				String soNumeroCivico = rs.getString("NumeroCivico");
				String soCap = rs.getString("Cap");
				String soComune = rs.getString("Comune");
				String soProvincia = rs.getString("Provincia");
				String soNazione = rs.getString("Nazione");
				
				StabileOrganizzazione stabileOrganizzazione = new StabileOrganizzazione(soCodice, soIndirizzo, soNumeroCivico, soCap, soComune, soProvincia, soNazione);

				liststabileOrganizzazione.add(stabileOrganizzazione);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return liststabileOrganizzazione;
	}

}
