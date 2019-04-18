package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.TerzoIntermediario;

public class TerzoIntermediarioDao {
	private Connection c;

	public TerzoIntermediarioDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(TerzoIntermediario a, boolean exist) {
	    int res = 0;
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO TerzoIntermediario VALUES (DEFAULT, ?, ?, ?, ?, ?)");
				ps.setString(1, a.getIdentificaticoFiscale());
				ps.setString(2, a.getDenominazione());
				ps.setString(3, a.getNome());
				ps.setString(4, a.getCognome());
				ps.setString(5, a.getCodEORI());

			res = ps.executeUpdate();
				ps.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
		}

	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.TerzoIntermediario (\r\n" +
    			"	\"id\" serial NOT NULL primary key,\r\n" +
    			"	\"IdentificaticoFiscale\" varchar(25) NOT NULL,\r\n" +
    			"	\"Denominazione\" varchar(25) NULL,\r\n" +
    			"	\"Nome\" varchar(25) NULL,\r\n" +
    			"	\"Cognome\" varchar(25) NULL,\r\n" +
    			"	\"CodEORI\" varchar(25) NULL\r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}


	public List<TerzoIntermediario> read() {
		List<TerzoIntermediario> listterzoIntermediario = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TerzoIntermediario");
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
