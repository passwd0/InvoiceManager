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

import invoicemanager.model.Convenzione;
import invoicemanager.utils.Utils;

public class ConvenzioneDao {
	private Connection c;

	public ConvenzioneDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Convenzione a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Convenzione VALUES (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, a.getNumeroConvenzione());
		ps.setInt(2, a.getNumeroRigaConvenzione());
		ps.setDate(3, a.getDataConvenzione());
		ps.setString(4, a.getCnvCodiceCommessaConvenzione());
		ps.setString(5, a.getCnvCodiceCUP());
		ps.setString(6, a.getCnvCodiceCIG());

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
    	String sql = "Create table public.Convenzione (\r\n" + 
    			"	\"NumeroConvenzione\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"NumeroRigaConvenzione\" INTEGER NULL,\r\n" + 
    			"	\"DataConvenzione\" Date NULL,\r\n" + 
    			"	\"CnvCodiceCommessaConvenzione\" varchar(25) NULL,\r\n" + 
    			"	\"CnvCodiceCUP\" varchar(25) NULL,\r\n" + 
    			"	\"CnvCodiceCIG\" varchar(25) NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<Convenzione> read() {
		List<Convenzione> listconvenzione = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Convenzione");
	         while ( rs.next() ) {

				int numeroConvenzione = rs.getInt("numeroConvenzione");
				int numeroRigaConvenzione = rs.getInt("numeroRigaConvenzione");
				Date dataConvenzione = rs.getDate("dataConvenzione");
				String cnvCodiceCommessaConvenzione = rs.getString("cnvCodiceCommessaConvenzione");
				String cnvCodiceCUP = rs.getString("cnvCodiceCUP");
				String cnvCodiceCIG = rs.getString("cnvCodiceCIG");
				
				Convenzione convenzione = new Convenzione(numeroConvenzione, numeroRigaConvenzione, dataConvenzione, cnvCodiceCommessaConvenzione, cnvCodiceCUP, cnvCodiceCIG);
				listconvenzione.add(convenzione);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listconvenzione;
	}

}
