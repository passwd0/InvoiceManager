package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.ScadenzaPagamenti;
import invoicemanager.utils.Utils;

public class ScadenzaPagamentiDao {
	private Connection c;

	public ScadenzaPagamentiDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ScadenzaPagamenti a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Scadenze VALUES (?, ?, ?, ?)");
		
		ps.setInt(1, a.getNumeroFattura());
		ps.setFloat(2, a.getImportoScadenza());
		ps.setDate(3, a.getDataFattura());
		ps.setDate(4, a.getDataScadenza());
		

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
    	String sql = "Create table public.ScadenzaPagamenti (\r\n" + 
    			"	\"NumeroFattura\" integer NOT NULL Primary Key,\r\n" + 
    			"	\"ImportoScadenza\" float NULL,\r\n" + 
    			"	\"DataFattura\" date NULL,\r\n" + 
    			"	\"DataScadenza\" date NULL\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	public List<ScadenzaPagamenti> read() {
		List<ScadenzaPagamenti> listscadenzaPagamenti = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ScadenzaPagamenti");
	         while ( rs.next() ) {

				int numeroFattura = rs.getInt("numeroFattura");
				float importoScadenza = rs.getFloat("importoScadenza");
				Date dataFattura = rs.getDate("dataFattura");
				Date dataScadenza = rs.getDate("dataScadenza");
				
				ScadenzaPagamenti scadenzaPagamenti = new ScadenzaPagamenti(numeroFattura, dataFattura, dataScadenza, importoScadenza);

				listscadenzaPagamenti.add(scadenzaPagamenti);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listscadenzaPagamenti;
	}

}
