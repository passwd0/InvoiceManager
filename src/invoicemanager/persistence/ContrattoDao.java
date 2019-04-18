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

import invoicemanager.model.Contratto;
import invoicemanager.utils.Utils;

public class ContrattoDao {
	private Connection c;

	public ContrattoDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Contratto a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Contratto VALUES (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroContratto());
		ps.setInt(2, a.getNumeroRigaContratto());
		ps.setDate(3, a.getDataContratto());
		ps.setString(4, a.getCntCodiceCommessaConvenzione());
		ps.setString(5, a.getCntCodiceCUP());
		ps.setString(6, a.getCntCodiceCIG());

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
    	String sql = "Create table public.Contratto (\r\n" + 
    			"	\"NumeroContratto\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"NumeroRigaContratto\" INTEGER NOT NULL,\r\n" + 
    			"	\"DataContratto\" Date NULL,\r\n" + 
    			"	\"CntCodiceCommessaConvenzione\" varchar(25) NULL,\r\n" + 
    			"	\"CntCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"CntCodiceCIG\" varchar(25) NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Contratto> read() {
		List<Contratto> listcontratto = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Contratto");
	         while ( rs.next() ) {

				int numeroContratto = rs.getInt("numeroContratto");
				int numeroRigaContratto = rs.getInt("numeroRigaContratto");
				String codice = rs.getString("dataContratto");
				Date riferimentoData = rs.getDate("dataContratto");
				String cntCodiceCommessaConvenzione = rs.getString("cntCodiceCommessaConvenzione");
				String cntCodiceCUP = rs.getString("cntCodiceCUP");
				String cntCodiceCIG = rs.getString("cntCodiceCIG");
				
				Contratto contratto = new Contratto(numeroContratto, numeroRigaContratto, riferimentoData, cntCodiceCommessaConvenzione, cntCodiceCUP, cntCodiceCIG);

				listcontratto.add(contratto);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcontratto;
	}

}
