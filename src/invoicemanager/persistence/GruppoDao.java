package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Gruppo;

public class GruppoDao {
	private Connection c;

	public GruppoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Gruppo a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Gruppo VALUES (?, ?, ?, ?)");
		ps.setString(1, a.getCodiceGruppo());
		ps.setString(2, a.getDescrizione());
		ps.setTimestamp(3, a.getDataInserimento());
		ps.setTimestamp(4, a.getDataUltimaModifica());

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
    	String sql = "Create table public.Gruppo (\r\n" + 
    			"	\"CodiceGruppo\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Gruppo> read() {
		List<Gruppo> listgruppo = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Gruppo");
	         while ( rs.next() ) {

				String codiceGruppo = rs.getString("codiceGruppo");
				String descrizione = rs.getString("descrizione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				Gruppo gruppo = new Gruppo(codiceGruppo, descrizione, dataInserimento, dataUltimaModifica);

				listgruppo.add(gruppo);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listgruppo;
	}

}
