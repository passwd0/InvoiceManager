package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.TipoBento;

public class TipoBentoDao {
	private Connection c;

	public TipoBentoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(TipoBento a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO TipoBento VALUES (?, ?, ?, ?)");
		ps.setString(1, a.getCodiceTipoBento());
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
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.TipoBento (\r\n" + 
    			"	\"CodiceTipoBento\" varchar(25) NOT NULL Primary Key,\r\n" + 
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
	
	
	public List<TipoBento> read() {
		List<TipoBento> listtipoBento = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoBento");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceTipoBento = rs.getString("codiceTipoBento");
				String descrizione = rs.getString("descrizione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				TipoBento tipoBento = new TipoBento(codiceTipoBento, descrizione, dataInserimento, dataUltimaModifica);

				listtipoBento.add(tipoBento);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoBento;
	}

}
