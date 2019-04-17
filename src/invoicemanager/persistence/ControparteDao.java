package invoicemanager.persistence;

import invoicemanager.model.Controparte;
import invoicemanager.model.Stato;
import invoicemanager.utils.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ControparteDao {
	private Connection c;

	public ControparteDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Controparte a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Controparte VALUES (?, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceControparte());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getStato().name());
			ps.setString(4, a.getCodiceContoCOGE());
			ps.setTimestamp(5, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(6, Utils.toTimestamp(a.getDataUltimaModifica()));

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
    	String sql = "Create table public.Controparte (\r\n" + 
    			"	\"CodiceControparte\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(250) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceContoCOGE\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL \r\n" + 
    			");";
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}

	public void set(Controparte a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE Controparte SET "
//					+ "campo=value "
//					+ "WHERE codiceControparte="+a.getCodiceControparte();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(Controparte a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceControparte() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	public List<Controparte> read() {
		List<Controparte> listcontroparte = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Controparte");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceControparte = rs.getString("codiceControparte");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				String codiceContoCOGE = rs.getString("codiceContoCOGE");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				Controparte controparte = new Controparte(codiceControparte, descrizione, stato, codiceContoCOGE, dataInserimento, dataUltimaModifica);

				listcontroparte.add(controparte);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcontroparte;
	}

}
