package invoicemanager.persistence;

import invoicemanager.model.Ordine;
import invoicemanager.utils.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdineDao {
	private Connection c;

	public OrdineDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Ordine a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Ordine VALUES (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroOrdine());
		ps.setInt(2, a.getNumeroRigaOrdine());
		ps.setDate(3, Utils.convertToDatabaseColumn(a.getDataOrdine()));
		ps.setString(4, a.getOrdCodiceCommessaConvenzione());
		ps.setString(5, a.getOrdCodiceCUP());
		ps.setString(6, a.getOrdCodiceCIG());

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
    	String sql = "Create table public.Ordine (\r\n" + 
    			"	\"NumeroOrdine\" INTEGER NOT NULL,\r\n" + 
    			"	\"NumeroRigaOrdine\" INTEGER NOT NULL ,\r\n" + 
    			"	\"DataOrdine\" Date NOT NULL ,\r\n" + 
    			"	\"OrdCodiceCommessaConvenzione\" varchar(25) NULL,\r\n" + 
    			"	\"OrdCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"OrdCodiceCIG\" varchar(25) NULL, \r\n" + 
    			"   Primary Key (\"NumeroOrdine\", \"NumeroRigaOrdine\", \"DataOrdine\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Ordine> read() {
		List<Ordine> listordine = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Ordine");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroOrdine = rs.getInt("numeroOrdine");
				int numeroRigaOrdine = rs.getInt("numeroRigaOrdine");
				LocalDate dataOrdine = Utils.convertToEntityAttribute(rs.getDate("dataOrdine"));
				String ordCodiceCommessaConvenzione = rs.getString("ordCodiceCommessaConvenzione");
				String ordCodiceCUP = rs.getString("ordCodiceCUP");
				String ordCodiceCIG = rs.getString("ordCodiceCIG");
				
				Ordine ordine = new Ordine(numeroOrdine, numeroRigaOrdine, dataOrdine, ordCodiceCommessaConvenzione, ordCodiceCUP, ordCodiceCIG);

				listordine.add(ordine);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listordine;
	}

}
