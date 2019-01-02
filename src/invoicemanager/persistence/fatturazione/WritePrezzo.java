package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Prezzo;

public class WritePrezzo {
	private Connection c;

	public WritePrezzo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Prezzo a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Prezzo VALUES (?, ?, ?,)");
		ps.setInt(1, a.getId());
		ps.setInt(2, a.getCodiceListinoPersonalizzato());
		ps.setFloat(3, a.getPrezzo());

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
