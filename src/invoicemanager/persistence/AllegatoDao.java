package invoicemanager.persistence;

import invoicemanager.model.Allegato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AllegatoDao {
	private Connection c;

	public AllegatoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Allegato a) {
	    int res = 0;
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO Allegato VALUES (DEFAULT, ?, ?)");
			ps.setString(1, a.getNomeAllegato());
			ps.setString(2, a.getPathAllegato());

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
    	String sql = "Create table public.Allegato (\r\n" +
    			"	\"id\" serial NOT NULL primary key,\r\n" +
    			"	\"NomeAllegato\" varchar(25) NOT NULL,\r\n" +
    			"	\"PathAllegato\" varchar(25) NULL\r\n" +
    			"); ";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	public List<Allegato> read() {
		List<Allegato> listallegato = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Allegato");
			Timestamp ts;
	         while ( rs.next() ) {

				String nomeAllegato = rs.getString("nomeAllegato");
				String pathAllegato = rs.getString("pathAllegato");
				int idFatturaTestata = rs.getInt("IdFatturaTestata");
				
				Allegato allegato = new Allegato(nomeAllegato, pathAllegato, idFatturaTestata);

				listallegato.add(allegato);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listallegato;
	}

}
