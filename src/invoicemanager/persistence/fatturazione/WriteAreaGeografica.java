package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.AreaGeografica;
import invoicemanager.utils.Utils;

public class WriteAreaGeografica {
	private Connection c;

	public WriteAreaGeografica() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(AreaGeografica a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {
			PreparedStatement ps = c.prepareStatement("INSERT INTO AreaGeografica VALUES (?, ?, ?, ?, ?, ?, ?,)");
			ps.setInt(1, a.getCodiceArea());
			ps.setString(2, a.getNazione());
			ps.setString(3, a.getArea());
			ps.setString(4, a.getRegione());
			ps.setString(5, a.getProvincia());
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
}
