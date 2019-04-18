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

import invoicemanager.model.FatturaCollegata;
import invoicemanager.utils.Utils;

public class FatturaCollegataDao {
	private Connection c;

	public FatturaCollegataDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(FatturaCollegata a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaCollegata VALUES (?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroFtCollegate());
		ps.setInt(2, a.getNumeroRigaFtCollegate());
		ps.setInt(3, a.getSezionale());
		ps.setDate(4, a.getDataFtCollegate());
		ps.setString(5, a.getFtcCodiceCommessaFtCollegate());
		ps.setString(6, a.getFtcCodiceCUP());
		ps.setString(7, a.getFtcCodiceCIG());

			res = ps.executeUpdate();
				ps.close();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.FatturaCollegata (\r\n" + 
    			"	\"NumeroFtCollegate\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"NumeroRigaFtCollegate\" INTEGER NOT NULL,\r\n" + 
    			"	\"Sezionale\" INTEGER NOT NULL,\r\n" + 
    			"	\"DataFtCollegate\" Date NULL,\r\n" + 
    			"	\"FtcCodiceCommessaFtCollegate\" varchar(25) NULL,\r\n" + 
    			"	\"FtcCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"FtcCodiceCIG\" varchar(25) NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<FatturaCollegata> read() {
		List<FatturaCollegata> listfatturaCollegata = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FatturaCollegata");
	         while ( rs.next() ) {

				int numeroFtCollegate = rs.getInt("numeroFtCollegate");
				int numeroRigaFtCollegate = rs.getInt("numeroRigaFtCollegate");
				int sezionale = rs.getInt("sezionale");
				Date dataFtCollegate = rs.getDate("dataFtCollegate");
				String ftcCodiceCommessaFtCollegate = rs.getString("ftcCodiceCommessaFtCollegate");
				String ftcCodiceCUP = rs.getString("ftcCodiceCUP");
				String ftcCodiceCIG = rs.getString("ftcCodiceCIG");
				
				FatturaCollegata fatturaCollegata = new FatturaCollegata(numeroFtCollegate, numeroRigaFtCollegate, sezionale, dataFtCollegate, ftcCodiceCommessaFtCollegate, ftcCodiceCUP, ftcCodiceCIG);

				listfatturaCollegata.add(fatturaCollegata);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listfatturaCollegata;
	}

}
