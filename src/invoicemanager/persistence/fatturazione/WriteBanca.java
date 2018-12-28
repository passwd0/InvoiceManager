package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Banca;

public class WriteBanca {
	private Connection c;

	public WriteBanca() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Banca a, boolean exist) throws ClassNotFoundException, SQLException {
		Connection c = DBConnect.connect();
	    try {
			//Statement stmt = c.createStatement();
			//String sql;
			//if (!exist)
	    	PreparedStatement ps = c.prepareStatement("INSERT INTO Banche VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	    	ps.setString(1, a.getCodiceBanca());
	    	ps.setString(2, a.getDescrizione());
	    	ps.setString(3, a.getStato().name());
	    	ps.setString(4, a.getCodiceABI());
	    	ps.setString(5, a.getCodiceCAB());
	    	ps.setString(6, a.getProvincia());
	    	ps.setString(7, a.getNumeroContoCorrente());
	    	ps.setString(8, a.getCodiceCIN());
	    	ps.setString(9, a.getCodiceCINEur());
	    	ps.setString(10, a.getPaese());
	    	ps.setTimestamp(11, a.getDataInserimentoToTimestamp());
	    	ps.setTimestamp(12, a.getDataUltimaModificaToTimestamp());
	    	ps.setString(13, a.getLoginInserimento());
	    	ps.setString(14, a.getLoginModifica());
	    	ps.setString(15, a.getIban());
	    	ps.setString(16, a.getSwift());
	    	ps.setString(17, a.getCodiceConto());
	    	ps.setString(18, a.getIndirizzo());

			//	sql = "UPDATE auto SET stato=\'Disponibile\' WHERE codiceBanca=\'" + a.getCodiceBanca() + "\';";
	    	ps.executeUpdate();
			ps.close();
			
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void set(Banca a) throws ClassNotFoundException, SQLException {
		try {
			PreparedStatement ps = c.prepareStatement("UPDATE Banche SET nome=?, percentualeProvvigione=?, tipoProvvigione=?, tipoMandato=?, "
					+ "codiceContabile=?, codiceControparte=?, dataInserimento=?, dataUltimaModifica=?, loginInserimento=?, loginModifica=? "
					+ "WHERE codiceAgente=?");
	    	ps.setString(1, a.getDescrizione());
	    	ps.setString(2, a.getStato().name());
	    	ps.setString(3, a.getCodiceABI());
	    	ps.setString(4, a.getCodiceCAB());
	    	ps.setString(5, a.getProvincia());
	    	ps.setString(6, a.getNumeroContoCorrente());
	    	ps.setString(7, a.getCodiceCIN());
	    	ps.setString(8, a.getCodiceCINEur());
	    	ps.setString(9, a.getPaese());
	    	ps.setTimestamp(10, a.getDataInserimentoToTimestamp());
	    	ps.setTimestamp(11, a.getDataUltimaModificaToTimestamp());
	    	ps.setString(12, a.getLoginInserimento());
	    	ps.setString(13, a.getLoginModifica());
	    	ps.setString(14, a.getIban());
	    	ps.setString(15, a.getSwift());
	    	ps.setString(16, a.getCodiceConto());
	    	ps.setString(17, a.getIndirizzo());
			
			ps.executeUpdate();
			ps.close();
			c.commit();
			c.close();
	      } catch (Exception e) {
	    	  //Utils.createAlertFailWriteDB();
	      }
	}

	public void delete(Banca a) throws ClassNotFoundException, SQLException {
//		try {
//	        Statement stmt = c.createStatement();
//	    	String sql = "UPDATE auto SET stato = \'Eliminato\' WHERE id = " + a.getCodiceBanca() + ";";
//	    	stmt.executeUpdate(sql);
//	    	stmt.close();
//	        c.commit();
//	        c.close();
//		} catch (Exception e) {
//			//Utils.createAlertFailWriteDB();
//		}
	}
	
	public void createDB() {
//		create table Banche (
//				codiceBanca varchar(4) not null primary key,
//				descrizione varchar(20),
//				stato varchar(20),
//				codiceABI varchar(4),
//				codiceCAB varchar(4),
//				provincia varchar(20),
//				numeroContoCorrente varchar(20),
//				codiceCIN varchar(4),
//				codiceCINEur varchar(4),
//				paese varchar(20),
//				dataInserimento timestamp,
//				dataUltimaModifica timestamp,
//				loginInserimento varchar(20),
//				loginModifica varchar(20),
//				iban varchar(20),
//				swift varchar(20),
//				codiceConto varchar(4),
//				indirizzo varchar(20)
//		);
	}
} 