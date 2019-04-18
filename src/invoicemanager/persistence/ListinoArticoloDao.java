package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.ListinoArticolo;
import invoicemanager.utils.Utils;

public class ListinoArticoloDao {
	private Connection c;

	public ListinoArticoloDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ListinoArticolo a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO ListinoArticolo VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceArticolo());
		ps.setInt(2, a.getProgressivo());
		ps.setString(3, a.getCodiceDivisa());
		ps.setFloat(4, a.getPrezzo());
		ps.setInt(5, a.getNumeroDecimali());
		ps.setDate(6, a.getDataDecorrenza());
		ps.setDate(7, a.getDataValidita());
		ps.setTimestamp(8, a.getDataInserimento());
		ps.setTimestamp(9, a.getDataUltimaModifica());

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
    	String sql = "Create table public.ListinoArticolo (\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Progressivo\" INTEGER NULL,\r\n" + 
    			"	\"CodiceDivisa\" varchar(25) NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL,\r\n" + 
    			"	\"NumeroDecimali\" INTEGER NULL,\r\n" + 
    			"	\"DataDecorrenza\" Date NULL,\r\n" + 
    			"	\"DataValidita\" Date NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"    Primary Key (\"CodiceArticolo\", \"Progressivo\") " +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<ListinoArticolo> read() {
		List<ListinoArticolo> listlistinoArticolo = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ListinoArticolo");
	         while ( rs.next() ) {

				String codiceArticolo = rs.getString("codiceArticolo");
				int progressivo = rs.getInt("progressivo");
				String codiceDivisa = rs.getString("codiceDivisa");
				float prezzo = rs.getFloat("prezzo");
				int numeroDecimali = rs.getInt("numeroDecimali");
				Date dataDecorrenza = rs.getDate("dataDecorrenza");
				Date dataValidita = rs.getDate("dataValidita");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				ListinoArticolo listinoArticolo = new ListinoArticolo(codiceArticolo, progressivo, codiceDivisa, prezzo, numeroDecimali, dataDecorrenza, dataValidita, dataInserimento, dataUltimaModifica);

				listlistinoArticolo.add(listinoArticolo);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listlistinoArticolo;
	}

}
