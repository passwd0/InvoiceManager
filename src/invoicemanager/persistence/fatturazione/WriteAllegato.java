package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Allegato;

public class WriteAllegato {
	private Connection c;

	public WriteAllegato() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Allegato a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

			PreparedStatement ps = c.prepareStatement("INSERT INTO Allegato VALUES (?, ?,)");
			ps.setString(1, a.getNomeAllegato());
			ps.setString(2, a.getPathAllegato());
	
			ps.executeUpdate();
			ps.close();
			c.commit();

			} catch (Exception e) {
			  //Utils.createAlertFailWriteDB();
			}
		}
}
