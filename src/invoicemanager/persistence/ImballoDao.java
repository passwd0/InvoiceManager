package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Imballo;
import invoicemanager.model.Stato;

public class ImballoDao {
	private Connection c;

	public ImballoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Imballo a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Imballo VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceImballo());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getStato().name());
			ps.setTimestamp(4, a.getDataInserimento());
			ps.setTimestamp(5, a.getDataUltimaModifica());
	    	
	    	ps.executeUpdate();
			ps.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
	}

	public void set(Imballo a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE Imballo SET "
					+ "campo=value "
					+ "WHERE codiceImballo="+a.getCodiceImballo();
			stmt.executeUpdate(sql);

			stmt.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Imballo a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceImballo() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Imballo (\r\n" + 
    			"	\"CodiceImballo\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			"); ";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Imballo> read() {
		List<Imballo> listimballo = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Imballo");
	         while ( rs.next() ) {

				String codiceImballo = rs.getString("codiceImballo");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				Imballo imballo = new Imballo(codiceImballo, descrizione, stato, dataInserimento, dataUltimaModifica);

				listimballo.add(imballo);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listimballo;
	}

}
