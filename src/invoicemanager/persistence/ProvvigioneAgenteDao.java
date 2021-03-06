package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.ProvvigioneAgente;

public class ProvvigioneAgenteDao {
	private Connection c;

	public ProvvigioneAgenteDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ProvvigioneAgente a, boolean exist) {
	    int res = 0;
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO ProvvigioneAgente VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, a.getCodiceProvvigione());
		ps.setString(2, a.getCodiceAgente());
		ps.setFloat(3, a.getScontoLegatoProvvigione());
		ps.setFloat(4, a.getProvvigioneLegataSconto());
		ps.setInt(5, a.getProgressivo());
		ps.setString(6, a.getCodiceGruppoMerceologico());
		ps.setTimestamp(7, a.getDataInserimento());
		ps.setTimestamp(8, a.getDataUltimaModifica());

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
    	String sql = "Create table public.ProvvigioneAgente (\r\n" + 
    			"	\"CodiceProvvigione\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"CodiceAgente\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"ScontoLegatoProvvigione\" Float NULL,\r\n" + 
    			"	\"ProvvigioneLegataSconto\" Float NULL,\r\n" + 
    			"	\"Progressivo\" INTEGER NULL,\r\n" + 
    			"	\"CodiceGruppoMerceologico\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceProvvigione\", \"CodiceAgente\") \r\n" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	public List<ProvvigioneAgente> read() {
		List<ProvvigioneAgente> listprovvigioneAgente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ProvvigioneAgente");
	         while ( rs.next() ) {

				String codiceProvvigione = rs.getString("codiceProvvigione");
				String codiceAgente = rs.getString("codiceAgente");
				float scontoLegatoProvvigione = rs.getFloat("scontoLegatoProvvigione");
				float provvigioneLegataSconto = rs.getFloat("provvigioneLegataSconto");
				int progressivo = rs.getInt("progressivo");
				String codiceGruppoMerceologico = rs.getString("codiceGruppoMerceologico");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				ProvvigioneAgente provvigioneAgente = new ProvvigioneAgente(codiceProvvigione, codiceAgente, scontoLegatoProvvigione, provvigioneLegataSconto, progressivo, codiceGruppoMerceologico, dataInserimento, dataUltimaModifica);

				listprovvigioneAgente.add(provvigioneAgente);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listprovvigioneAgente;
	}

}
