package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Prezzo;

public class PrezzoDao {
	private Connection c;

	public PrezzoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Prezzo a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Prezzo VALUES (?, ?, ?)");
		ps.setInt(1, a.getId());
		ps.setInt(2, a.getCodiceListinoPersonalizzato());
		ps.setFloat(3, a.getPrezzo());

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
    	String sql = "Create table public.Prezzo (\r\n" + 
    			"	\"Id\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"CodiceListinoPersonalizzato\" INTEGER NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Prezzo> read() {
		List<Prezzo> listprezzo = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Prezzo");
	         while ( rs.next() ) {

				int id = rs.getInt("id");
				int codiceListinoPersonalizzato = rs.getInt("codiceListinoPersonalizzato");
				float prezzof = rs.getFloat("prezzo");
				
				Prezzo prezzo = new Prezzo(id, codiceListinoPersonalizzato, prezzof);

				listprezzo.add(prezzo);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listprezzo;
	}

}
