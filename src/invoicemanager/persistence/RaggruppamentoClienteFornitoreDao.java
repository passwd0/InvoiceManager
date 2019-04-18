package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.RaggruppamentoClienteFornitore;
import invoicemanager.model.Stato;

public class RaggruppamentoClienteFornitoreDao {
	private Connection c;

	public RaggruppamentoClienteFornitoreDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(RaggruppamentoClienteFornitore a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO RaggruppamentoClienteFornitore VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceRaggruppamento());
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

	public void set(RaggruppamentoClienteFornitore a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE RaggruppamentoClienteFornitore SET "
//					+ "campo=value "
//					+ "WHERE codiceRaggruppamentoClienteFornitore="+a.getCodiceRaggruppamento();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(RaggruppamentoClienteFornitore a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceRaggruppamento() + ";";
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
    	String sql = "Create table public.RaggruppamentoClienteFornitore (\r\n" + 
    			"	\"CodiceRaggruppamento\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
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
	
	
	public List<RaggruppamentoClienteFornitore> read() {
		List<RaggruppamentoClienteFornitore> listraggruppamentoClienteFornitore = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM RaggruppamentoClienteFornitore");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceRaggruppamento = rs.getString("codiceRaggruppamento");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				RaggruppamentoClienteFornitore raggruppamentoClienteFornitore = new RaggruppamentoClienteFornitore(codiceRaggruppamento, descrizione, stato, dataInserimento, dataUltimaModifica);

				listraggruppamentoClienteFornitore.add(raggruppamentoClienteFornitore);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listraggruppamentoClienteFornitore;
	}

}
