package invoicemanager.persistence;

import invoicemanager.model.Stato;
import invoicemanager.model.Vettore;
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

public class VettoreDao {
	private Connection c;

	public VettoreDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Vettore a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Vettore VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceVettore());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getStato().name());
			ps.setString(4, a.getVia());
			ps.setString(5, a.getCitta());
			ps.setString(6, a.getPartitaIva());
			ps.setString(7, a.getIscrizione());
			ps.setString(8, a.getTelefono());
			ps.setTimestamp(9, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(10, Utils.toTimestamp(a.getDataUltimaModifica()));

			res = ps.executeUpdate();
			ps.close();
			c.commit();

			} catch (Exception e) {
   			  //Utils.createAlertFailWriteDB();
			}
	    return res;
	}

	public void set(Vettore a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE Vettore SET "
//					+ "campo=value "
//					+ "WHERE codiceVettore="+a.getCodiceVettore();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(Vettore a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceVettore() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Vettore (\r\n" + 
    			"	\"CodiceVettore\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"Via\" varchar(25) NULL,\r\n" + 
    			"	\"Citta\" varchar(25) NULL,\r\n" + 
    			"	\"PartitaIva\" varchar(25) NULL,\r\n" + 
    			"	\"Iscrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Telefono\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Vettore> read() {
		List<Vettore> listvettore = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Vettore");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceVettore = rs.getString("codiceVettore");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				String via = rs.getString("via");
				String citta = rs.getString("citta");
				String partitaIva = rs.getString("partitaIva");
				String iscrizione = rs.getString("iscrizione");
				String telefono = rs.getString("telefono");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				Vettore vettore = new Vettore(codiceVettore, descrizione, stato, via, citta, partitaIva, iscrizione, telefono, dataInserimento, dataUltimaModifica);

		listvettore.add(vettore);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listvettore;
	}

}
