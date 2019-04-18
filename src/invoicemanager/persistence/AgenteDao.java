package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Agente;
import invoicemanager.model.Controparte;

public class AgenteDao {
	private Connection c;

	public AgenteDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(Agente a) {
	    int res = 0;
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO Agente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceAgente());
			ps.setString(2, a.getNome());
			ps.setFloat(3, a.getPercentualeProvvigione());
			ps.setBoolean(4, a.isTipoProvvigione());
			ps.setBoolean(5, a.isTipoMandato());
			ps.setString(6, a.getCodiceContabile());
			ps.setString(7, a.getCodiceControparte());
			ps.setTimestamp(8, a.getDataInserimento());
			ps.setTimestamp(9, a.getDataUltimaModifica());
	
			res = ps.executeUpdate();
			ps.close();
			c.commit();

		} catch (Exception e) {
		  //Utils.createAlertFailWriteDB();
		}
	    return res;
	}

	public void set(Agente a) throws ClassNotFoundException, SQLException {
		try {
			PreparedStatement ps = c.prepareStatement("UPDATE Agenti SET nome=?, percentualeProvvigione=?, "
					+ "tipoProvvigione=?, tipoMandato=?, dataInserimento=?, dataUltimaModifica=? "
					+ "WHERE codiceAgente=?");
			ps.setString(1, a.getNome());
			ps.setFloat(2, a.getPercentualeProvvigione());
			ps.setBoolean(3, a.isTipoProvvigione());
			ps.setBoolean(4, a.isTipoMandato());
			ps.setTimestamp(5, a.getDataInserimento());
			ps.setTimestamp(6, a.getDataUltimaModifica());
			
			ps.executeUpdate();
			ps.close();
			c.commit();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Agente a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato=\'Eliminato\' WHERE id = " + a.getCodiceAgente() + ";";		//AGGIUNGERE STATO
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();

//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.Agente (\r\n" + 
    			"	\"CodiceAgente\" varchar(25) NOT NULL,\r\n" + 
    			"	\"Nome\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"TipoProvvigione\" Boolean NULL,\r\n" + 
    			"	\"TipoMandato\" Boolean NULL,\r\n" + 
    			"	\"CodiceContabile\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceControparte\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL\r\n" + 
    			"); ";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();
        c.commit();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	
	
	
	public List<Agente> read(List<Controparte> list) {
		List<Agente> listAgente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Agente");
	         while ( rs.next() ) {

				String codiceAgente = rs.getString("codiceAgente");
				String nome = rs.getString("nome");
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				boolean tipoProvvigione = rs.getBoolean("tipoProvvigione");
				boolean tipoMandato = rs.getBoolean("tipoMandato");
				String codiceContabile = rs.getString("codiceContabile");
				String codice = rs.getString("codiceControparte");

				Controparte controparte = null;
				for (int i=0; i<list.size(); i++) {
					String tmp = list.get(i).getCodiceControparte();
					if (tmp != null && tmp == codice) {
						controparte = list.get(i);
					}
				}

				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				Agente agente = new Agente(codiceAgente, nome, percentualeProvvigione, tipoProvvigione, tipoMandato, codiceContabile, controparte, dataInserimento, dataUltimaModifica);
				listAgente.add(agente);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listAgente;
	}
}
