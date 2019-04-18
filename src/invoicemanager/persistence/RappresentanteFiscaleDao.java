package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.RappresentanteFiscale;

public class RappresentanteFiscaleDao {
	private Connection c;

	public RappresentanteFiscaleDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(RappresentanteFiscale a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO RappresentanteFiscale VALUES (DEFAULT, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getPaese());
		ps.setString(2, a.getIdentificativoFiscale());
		ps.setString(3, a.getDenominazione());
		ps.setString(4, a.getNome());
		ps.setString(5, a.getCognome());

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
    	String sql = "Create table public.RappresentanteFiscale (\r\n" +
    			"	\"id\" serial NOT NULL primary key,\r\n" +
    			"	\"Paese\" varchar(25) NOT NULL,\r\n" +
    			"	\"IdentificativoFiscale\" varchar(25) NOT NULL,\r\n" +
    			"	\"Denominazione\" varchar(25) NULL,\r\n" +
    			"	\"Nome\" varchar(25) NULL,\r\n" +
    			"	\"Cognome\" varchar(25) NULL\r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();
	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

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
