package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.TipoPagamento;

public class TipoPagamentoDao {
	private Connection c;

	public TipoPagamentoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(TipoPagamento a, boolean exist) {
	    int res = 0;
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO TipiPagamento VALUES (?, ?, ?, ?)");
	    	ps.setString(1, a.getCodiceTipoPagamento());
	    	ps.setString(2, a.getDescrizione());
	    	ps.setTimestamp(3, a.getDataInserimento());
			ps.setTimestamp(4, a.getDataUltimaModifica());

			res = ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
	}

	public void set(TipoPagamento a) throws ClassNotFoundException, SQLException {
//		try {
//			Statement stmt = c.createStatement();
//			String sql;
//
//			sql = "UPDATE TipoPagamento SET "
//					+ "campo=value "
//					+ "WHERE codiceTipoPagamento="+a.getCodiceTipoPagamento();
//			stmt.executeUpdate(sql);
//
//			stmt.close();
//			c.commit();
//	      } catch (Exception e) {
//	    	  //Utils.createAlertFailWriteDB();
//	      }
	}

	public void delete(TipoPagamento a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceTipoPagamento() + ";";
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
    	String sql = "Create table public.TipoPagamento (\r\n" + 
    			"	\"CodiceTipoPagamento\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
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
	
	
	public List<TipoPagamento> read() {
		List<TipoPagamento> listtipoPagamento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoPagamento");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceTipoPagamento = rs.getString("codiceTipoPagamento");
				String descrizione = rs.getString("descrizione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				TipoPagamento tipoPagamento = new TipoPagamento(codiceTipoPagamento, descrizione, dataInserimento, dataUltimaModifica);

		listtipoPagamento.add(tipoPagamento);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoPagamento;
	}

}
