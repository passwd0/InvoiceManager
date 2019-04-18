package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.TipoCliente;

public class TipoClienteDao {
	private Connection c;

	public TipoClienteDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(TipoCliente a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO TipiCliente VALUES (?, ?, ?, ?)");
	    	ps.setString(1, a.getCodiceTipoCliente());
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

	public void set(TipoCliente a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE TipoCliente SET "
//					+ "campo=value "
//					+ "WHERE codiceTipoCliente="+a.getCodiceTipoCliente();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(TipoCliente a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceTipoCliente() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.TipoCliente (\r\n" + 
    			"	\"CodiceTipoCliente\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<TipoCliente> read() {
		List<TipoCliente> listtipoCliente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoCliente");
	         while ( rs.next() ) {

				String codiceTipoCliente = rs.getString("codiceTipoCliente");
				String descrizione = rs.getString("descrizione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				TipoCliente tipoCliente = new TipoCliente(codiceTipoCliente, descrizione, dataInserimento, dataUltimaModifica);

				listtipoCliente.add(tipoCliente);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoCliente;
	}

}
