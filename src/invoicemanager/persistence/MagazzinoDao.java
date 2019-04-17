package invoicemanager.persistence;

import invoicemanager.model.Magazzino;
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

public class MagazzinoDao {
	private Connection c;

	public MagazzinoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Magazzino a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Magazzino VALUES (?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceMagazzino());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getStato().name());
		ps.setString(4, a.getCodiceTipoMagazzino());
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
    	String sql = "Create table public.Magazzino (\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceTipoMagazzino\" varchar(25) NULL,\r\n" + 
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
	
	
	public List<Magazzino> read() {
		List<Magazzino> listmagazzino = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Magazzino");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceMagazzino = rs.getString("codiceMagazzino");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				String codiceTipoMagazzino = rs.getString("codiceTipoMagazzino");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				
				Magazzino magazzino = new Magazzino(codiceMagazzino, descrizione, stato, codiceTipoMagazzino, dataInserimento, dataUltimaModifica);

				listmagazzino.add(magazzino);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listmagazzino;
	}

}
