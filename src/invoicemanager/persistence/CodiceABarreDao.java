package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.CodiceABarre;

public class CodiceABarreDao {
	private Connection c;

	public CodiceABarreDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(CodiceABarre a, boolean exist) {
	    int res = 0;
	    try {

			PreparedStatement ps = c.prepareStatement("INSERT INTO CodiceABarre VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceArticolo());
			ps.setString(2, a.getCodiceABarre());
			ps.setString(3, a.getTipo());
			ps.setTimestamp(4, a.getDataInserimento());
			ps.setTimestamp(5, a.getDataUltimaModifica());
	
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
    	String sql = "Create table public.CodiceABarre (\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NOT NULL,\r\n" + 
    			"	\"CodiceABarre\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Tipo\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceArticolo\", \"CodiceABarre\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<CodiceABarre> read() {
		List<CodiceABarre> listcodiceABarre = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CodiceABarre");
	         while ( rs.next() ) {

				String codiceArticolo = rs.getString("codiceArticolo");
				String codABarre = rs.getString("codiceABarre");
				String tipo = rs.getString("tipo");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				CodiceABarre codiceABarre = new CodiceABarre(codiceArticolo, codABarre, tipo, dataInserimento, dataUltimaModifica);

				listcodiceABarre.add(codiceABarre);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcodiceABarre;
	}

}
