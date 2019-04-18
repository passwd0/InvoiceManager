package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.AreaGeografica;

public class AreaGeograficaDao {
	private Connection c;

	public AreaGeograficaDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(AreaGeografica a, boolean exist) {
	    int res = 0;
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO AreaGeografica VALUES (?, ?, ?, ?, ?, ?, ?)");
			ps.setInt(1, a.getCodiceArea());
			ps.setString(2, a.getNazione());
			ps.setString(3, a.getArea());
			ps.setString(4, a.getRegione());
			ps.setString(5, a.getProvincia());
			ps.setTimestamp(6, a.getDataInserimento());
			ps.setTimestamp(7, a.getDataUltimaModifica());
	
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
    	String sql = "Create table public.AreaGeografica (\r\n" + 
    			"	\"CodiceArea\" INTEGER NOT NULL,\r\n" + 
    			"	\"Nazione\" varchar(25) NULL,\r\n" + 
    			"	\"Area\" varchar(25) NULL,\r\n" + 
    			"	\"Regione\" varchar(25) NULL,\r\n" + 
    			"	\"Provincia\" varchar(25) NOT NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceArea\", \"Provincia\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<AreaGeografica> read() {
		List<AreaGeografica> listareaGeografica = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM AreaGeografica");
	         while ( rs.next() ) {

				int codiceArea = rs.getInt("codiceArea");
				String nazione = rs.getString("nazione");
				String area = rs.getString("area");
				String regione = rs.getString("regione");
				String provincia = rs.getString("provincia");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				AreaGeografica areaGeografica = new AreaGeografica(codiceArea, nazione, area, regione, provincia, dataInserimento, dataUltimaModifica);

				listareaGeografica.add(areaGeografica);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listareaGeografica;
	}

}
