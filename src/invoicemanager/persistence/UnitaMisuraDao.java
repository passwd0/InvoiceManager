package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Stato;
import invoicemanager.model.UnitaMisura;

public class UnitaMisuraDao {
	private Connection c;

	public UnitaMisuraDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(UnitaMisura a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO UnitaMisura VALUES (?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceUnitaMisura());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getStato().name());
		ps.setTimestamp(4, a.getDataInserimento());
		ps.setTimestamp(5, a.getDataUltimaModifica());

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
    	String sql = "Create table public.UnitaMisura (\r\n" + 
    			"	\"CodiceUnitaMisura\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
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
	
	
	public List<UnitaMisura> read() {
		List<UnitaMisura> listunitaMisura = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM UnitaMisura");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceUnitaMisura = rs.getString("codiceUnitaMisura");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				UnitaMisura unitaMisura = new UnitaMisura(codiceUnitaMisura, descrizione, stato, dataInserimento, dataUltimaModifica);

		listunitaMisura.add(unitaMisura);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listunitaMisura;
	}

}
