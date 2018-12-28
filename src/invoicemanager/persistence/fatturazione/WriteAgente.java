package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Agente;

public class WriteAgente {
	private Connection c;

	public WriteAgente() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Agente a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			//if (!exist) {
	    	 PreparedStatement ps = c.prepareStatement("INSERT INTO Agenti VALUES (?,?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1, a.getCodiceAgente());
				ps.setString(2, a.getNome());
				ps.setFloat(3, a.getPercentualeProvvigione());
				ps.setBoolean(4, a.isTipoProvvigione());
				ps.setBoolean(5, a.isTipoMandato());
				ps.setString(6, a.getCodiceContabile());
				ps.setString(7, a.getCodiceControparte());
				ps.setTimestamp(8, a.getDataInserimentoToTimestamp());
				ps.setTimestamp(9, a.getDataUltimaModificaToTimestamp());
				ps.setString(10, a.getLoginInserimento());
				ps.setString(11, a.getLoginModifica());
			//}
				
				
			//else
				//ps = "UPDATE auto SET stato=\'Disponibile\' WHERE codiceCliente=\'" + a.getCodiceAgente() + "\';";
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
			PreparedStatement ps = c.prepareStatement("UPDATE Agenti SET nome=?, percentualeProvvigione=?, tipoProvvigione=?, tipoMandato=?, "
					+ "codiceContabile=?, codiceControparte=?, dataInserimento=?, dataUltimaModifica=?, loginInserimento=?, loginModifica=? "
					+ "WHERE codiceAgente=?");
			ps.setString(1, a.getNome());
			ps.setFloat(2, a.getPercentualeProvvigione());
			ps.setBoolean(3, a.isTipoProvvigione());
			ps.setBoolean(4, a.isTipoMandato());
			ps.setString(5, a.getCodiceContabile());
			ps.setString(6, a.getCodiceControparte());
			ps.setTimestamp(7, a.getDataInserimentoToTimestamp());
			ps.setTimestamp(8, a.getDataUltimaModificaToTimestamp());
			ps.setString(9, a.getLoginInserimento());
			ps.setString(10, a.getLoginModifica());
			
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
//				codiceContabile varchar(20),
//				codiceControparte varchar(20),
//				dataInserimento timestamp,
//				dataUltimaModifica timestamp,
//				loginInserimento varchar(20),
//				loginModifica varchar(20)
//		);

	}
	
	
	
	
	
} 
