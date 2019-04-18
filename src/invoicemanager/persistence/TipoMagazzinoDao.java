package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.TipoMagazzino;

public class TipoMagazzinoDao {
	private Connection c;

	public TipoMagazzinoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(TipoMagazzino a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO TipoMagazzino VALUES (?, ?, ?, ?)");
		ps.setBoolean(1, a.isCodiceTipoMagazzino());
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
    	String sql = "Create table public.TipoMagazzino (\r\n" + 
    			"	\"CodiceTipoMagazzino\" Boolean NOT NULL,\r\n" + 
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
	
	
	public List<TipoMagazzino> read() {
		List<TipoMagazzino> listtipoMagazzino = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TipoMagazzino");
			Timestamp ts;
	         while ( rs.next() ) {

				boolean codiceTipoMagazzino = rs.getBoolean("codiceTipoMagazzino");
				String descrizione = rs.getString("descrizione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				TipoMagazzino tipoMagazzino = new TipoMagazzino(codiceTipoMagazzino, descrizione, dataInserimento, dataUltimaModifica);
				listtipoMagazzino.add(tipoMagazzino);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listtipoMagazzino;
	}

}
