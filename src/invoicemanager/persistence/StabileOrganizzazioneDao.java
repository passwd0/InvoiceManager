package invoicemanager.persistence;

import invoicemanager.model.StabileOrganizzazione;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class StabileOrganizzazioneDao {
	private Connection c;

	public StabileOrganizzazioneDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(StabileOrganizzazione a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO StabileOrganizzazione VALUES (DEFAULT, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getSoIndirizzo());
		ps.setString(2, a.getSoNumeroCivico());
		ps.setString(3, a.getSoCap());
		ps.setString(4, a.getSoComune());
		ps.setString(5, a.getSoProvincia());
		ps.setString(6, a.getSoNazione());

			res = ps.executeUpdate();
				ps.close();
				c.commit();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
		}

	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.StabileOrganizzazione (\r\n" +
    			"	\"id\" serial NOT NULL primary key,\r\n" +
    			"	\"SoIndirizzo\" varchar(25) NOT NULL,\r\n" +
    			"	\"SoNumeroCivico\" varchar(25) NULL,\r\n" +
    			"	\"SoCap\" varchar(10) NULL,\r\n" +
    			"	\"SoComune\" varchar(25) NULL,\r\n" +
    			"	\"SoProvincia\" varchar(25) NULL,\r\n" +
    			"	\"SoNazione\" varchar(25) NULL\r\n" +
    			"); ";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

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
