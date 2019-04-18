package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.AltroDatoGestionale;
import invoicemanager.utils.Utils;

public class AltroDatoGestionaleDao {
	private Connection c;

	public AltroDatoGestionaleDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(AltroDatoGestionale a, boolean exist) {
	    int res = 0;
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO AltroDatoGestionale VALUES (?, ?, ?, ?)");
			ps.setString(1, a.getTipoDato());
			ps.setString(2, a.getRiferimentoTesto());
			ps.setFloat(3, a.getRiferimentoNumero());
			ps.setDate(4, Utils.convertToDatabaseColumn(a.getRiferimentoData()));
	
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
    	String sql = "Create table public.AltroDatoGestionale (\r\n" + 
    			"  \"CodiceAltroDatoGestionale\" INTEGER NOT NULL Primary Key,\r\n" + 
    			"	\"TipoDato\" varchar(25) NULL,\r\n" + 
    			"	\"RiferimentoTesto\" varchar(25) NULL,\r\n" + 
    			"	\"RiferimentoNumero\" Float NULL,\r\n" + 
    			"	\"RiferimentoData\" Date NULL \r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	
	
	public List<AltroDatoGestionale> read() {
		List<AltroDatoGestionale> listAltroDatoGestionale = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM AltroDatoGestionale");
	         while ( rs.next() ) {

				int codiceAltroDatoGestionale = rs.getInt("codiceAltroDatoGestionale");
				String tipoDato = rs.getString("tipoDato");
				String riferimentoTesto = rs.getString("riferimentoTesto");
				float riferimentoNumero = rs.getFloat("riferimentoNumero");
				LocalDate riferimentoData = Utils.convertToEntityAttribute(rs.getDate("riferimentoData"));
				AltroDatoGestionale altroDatoGestionale = new AltroDatoGestionale(codiceAltroDatoGestionale, tipoDato, riferimentoTesto, riferimentoNumero, riferimentoData);

				listAltroDatoGestionale.add(altroDatoGestionale);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listAltroDatoGestionale;
	}

}
