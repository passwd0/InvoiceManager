package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.ResaMerce;
import invoicemanager.model.Stato;

public class ResaMerceDao {
	private Connection c;

	public ResaMerceDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(ResaMerce a, boolean exist) {
	    int res = 0;
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO ResaMerce VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceResa());
			ps.setString(2, a.getDescrizione());
			ps.setString(3, a.getStato().name());
			ps.setFloat(4, a.getPercentualeAddebito());
			ps.setFloat(5, a.getImportoMinimo());
			ps.setBoolean(6, a.isIndicatoreProvvigione());
			ps.setTimestamp(7, a.getDataInserimento());
			ps.setTimestamp(8, a.getDataUltimaModifica());

	
			res = ps.executeUpdate();
			ps.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	    return res;
	}

	public void set(ResaMerce a) throws ClassNotFoundException, SQLException {
		try {
			Statement stmt = c.createStatement();
			String sql;

			sql = "UPDATE ResaMerce SET "
					+ "campo=value "
					+ "WHERE codiceResaMerce="+a.getCodiceResa();
			stmt.executeUpdate(sql);

			stmt.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(ResaMerce a) throws ClassNotFoundException, SQLException {
		try {
	        Statement stmt = c.createStatement();
	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceResa() + ";";
	    	stmt.executeUpdate(sql);
	    	stmt.close();
		} catch (Exception e) {
			//Utils.createAlertFailWriteDB();
		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.ResaMerce (\r\n" + 
    			"	\"CodiceResa\" varchar(25) NOT NULL Primary Key,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Stato\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeAddebito\" Float NULL,\r\n" + 
    			"	\"ImportoMinimo\" Float NULL,\r\n" + 
    			"	\"IndicatoreProvvigione\" Boolean NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<ResaMerce> read() {
		List<ResaMerce> listresaMerce = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ResaMerce");
	         while ( rs.next() ) {

				String codiceResa = rs.getString("codiceResa");
				String descrizione = rs.getString("descrizione");
				Stato stato = Stato.valueOf(rs.getString("stato"));
				float percentualeAddebito = rs.getFloat("percentualeAddebito");
				float importoMinimo = rs.getFloat("importoMinimo");
				boolean indicatoreProvvigione = rs.getBoolean("indicatoreProvvigione");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				
				ResaMerce resaMerce = new ResaMerce(codiceResa, descrizione, stato, percentualeAddebito, importoMinimo, indicatoreProvvigione, dataInserimento, dataUltimaModifica);

		listresaMerce.add(resaMerce);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listresaMerce;
	}

}
