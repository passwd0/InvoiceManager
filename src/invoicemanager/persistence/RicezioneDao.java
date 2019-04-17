package invoicemanager.persistence;

import invoicemanager.model.Ricezione;
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

public class RicezioneDao {
	private Connection c;

	public RicezioneDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Ricezione a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Ricezione VALUES (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroRicezione());
		ps.setInt(2, a.getNumeroRigaRicezione());
		ps.setDate(3, Utils.convertToDatabaseColumn(a.getDataRicezione()));
		ps.setString(4, a.getRczCodiceCommessaRicezione());
		ps.setString(5, a.getRczCodiceCUP());
		ps.setString(6, a.getRczCodiceCIG());

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
    	String sql = "Create table public.Ricezione (\r\n" + 
    			"	\"NumeroRicezione\" INTEGER NOT NULL ,\r\n" + 
    			"	\"NumeroRigaRicezione\" INTEGER NOT NULL ,\r\n" + 
    			"	\"DataRicezione\" Date NULL,\r\n" + 
    			"	\"RczCodiceCommessaRicezione\" varchar(25) NULL,\r\n" + 
    			"	\"RczCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"RczCodiceCIG\" varchar(25) NULL, \r\n" + 
    			"   Primary Key (\"NumeroRicezione\", \"NumeroRigaRicezione\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Ricezione> read() {
		List<Ricezione> listricezione = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Ricezione");
			Timestamp ts;
	         while ( rs.next() ) {

				int numeroRicezione = rs.getInt("numeroRicezione");
				int numeroRigaRicezione = rs.getInt("numeroRigaRicezione");
				LocalDate dataRicezione = Utils.convertToEntityAttribute(rs.getDate("dataRicezione"));
				String rczCodiceCommessaRicezione = rs.getString("rczCodiceCommessaRicezione");
				String rczCodiceCUP = rs.getString("rczCodiceCUP");
				String rczCodiceCIG = rs.getString("rczCodiceCIG");
				
				Ricezione ricezione = new Ricezione(numeroRicezione, numeroRigaRicezione, dataRicezione, rczCodiceCommessaRicezione, rczCodiceCUP, rczCodiceCIG);

				listricezione.add(ricezione);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listricezione;
	}

}
