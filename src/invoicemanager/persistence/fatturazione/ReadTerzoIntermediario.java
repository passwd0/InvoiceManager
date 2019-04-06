package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.TerzoIntermediario;


public class ReadTerzoIntermediario {
	private Connection c;

	public ReadTerzoIntermediario() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<TerzoIntermediario> read() {
		List<TerzoIntermediario> listterzoIntermediario = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TerzoIntermediario");
			Timestamp ts;
	         while ( rs.next() ) {
	        	int codice = rs.getInt("codice");
				String identificaticoFiscale = rs.getString("identificaticoFiscale");
				String denominazione = rs.getString("denominazione");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String codEORI = rs.getString("codEORI");
				
				TerzoIntermediario terzoIntermediario = new TerzoIntermediario(codice, identificaticoFiscale, denominazione, nome, cognome, codEORI);

				listterzoIntermediario.add(terzoIntermediario);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listterzoIntermediario;
	}

}
