package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.CapItaliano;

public class CapItalianoDao {
	private Connection c;

	public CapItalianoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(CapItaliano a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO CapItaliano VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getId());
		ps.setString(2, a.getCap());
		ps.setString(3, a.getComune());
		ps.setString(4, a.getProvincia());
		ps.setString(5, a.getNazione());
		ps.setString(6, a.getCodiceISTAT());
		ps.setString(7, a.getCodiceCAB());
		ps.setTimestamp(8, a.getDataInserimento());
		ps.setTimestamp(9, a.getDataUltimaModifica());

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
    	String sql = "Create table public.CapItaliano (\r\n" + 
    			"	\"Id\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"Cap\" varchar(25) NULL,\r\n" + 
    			"	\"Comune\" varchar(25) NULL,\r\n" + 
    			"	\"Provincia\" varchar(25) NULL,\r\n" + 
    			"	\"Nazione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceISTAT\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCAB\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<CapItaliano> read() {
		List<CapItaliano> listcapItaliano = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CapItaliano");
			Timestamp ts;
	         while ( rs.next() ) {

				int id = rs.getInt("id");
				String cap = rs.getString("cap");
				String comune = rs.getString("comune");
				String provincia = rs.getString("provincia");
				String nazione = rs.getString("nazione");
				String codiceISTAT = rs.getString("codiceISTAT");
				String codiceCAB = rs.getString("codiceCAB");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				CapItaliano capItaliano = new CapItaliano(id, cap, comune, provincia, nazione, codiceISTAT, codiceCAB, dataInserimento, dataUltimaModifica);

				listcapItaliano.add(capItaliano);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcapItaliano;
	}

}
