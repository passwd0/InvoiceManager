package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.BentoTestata;

public class BentoTestataDao {
	private Connection c;

	public BentoTestataDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(BentoTestata a, boolean exist) {
	    int res = 0;
	    try {

			PreparedStatement ps = c.prepareStatement("INSERT INTO BentoTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceBento());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getCodiceTipoBento());
			ps.setString(4, a.getCodiceMagazzino());
			ps.setString(5, a.getCodiceClienteFornitore());
			ps.setString(6, a.getNote());
			ps.setTimestamp(7, a.getDataInserimento());
			ps.setTimestamp(8, a.getDataUltimaModifica());
	
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
    	String sql = "Create table public.BentoTestata (\r\n" + 
    			"	\"CodiceBento\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceTipoBento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceClienteFornitore\" varchar(25) NULL,\r\n" + 
    			"	\"Note\" varchar(25) NULL,\r\n" + 
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
	
	
	public List<BentoTestata> read() {
		List<BentoTestata> listbentoTestata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM BentoTestata");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceBento = rs.getString("codiceBento");
				String descrizione = rs.getString("descrizione");
				String codiceTipoBento = rs.getString("codiceTipoBento");
				String codiceMagazzino = rs.getString("codiceMagazzino");
				String codiceClienteFornitore = rs.getString("codiceClienteFornitore");
				String note = rs.getString("note");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				BentoTestata bentoTestata = new BentoTestata(codiceBento, descrizione, codiceTipoBento, codiceMagazzino, codiceClienteFornitore, note, dataInserimento, dataUltimaModifica);
				listbentoTestata.add(bentoTestata);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listbentoTestata;
	}

}
