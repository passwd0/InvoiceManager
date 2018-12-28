package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Agente;
import invoicemanager.utils.Utils;

public class WriteAgente {
	private Connection c;

	public WriteAgente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Agente a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Agenti VALUES (?,?,?,?,?,?,?)");
	    	ps.setString(1, a.getCodiceAgente());
			ps.setString(2, a.getNome());
			ps.setFloat(3, a.getPercentualeProvvigione());
			ps.setBoolean(4, a.isTipoProvvigione());
			ps.setBoolean(5, a.isTipoMandato());
			ps.setTimestamp(6, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(7, Utils.toTimestamp(a.getDataUltimaModifica()));
	
			ps.executeUpdate();
			ps.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
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
			ps.setTimestamp(5, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(6, Utils.toTimestamp(a.getDataUltimaModifica()));
			
			ps.executeUpdate();
			ps.close();
			c.commit();
			c.close();
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
//	        c.close();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	
	public void createDB() {
//		create table Agenti (
//				codiceAgente varchar(4) not null primary key,
//				nome varchar(20),
//				percentualeProvvigione float,
//				tipoProvvigione boolean,
//				tipoMandato boolean,
//				dataInserimento timestamp,
//				dataUltimaModifica timestamp,
//		);

	}
	
	
	
	
	
} 
