package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.CodiceABarre;
import invoicemanager.utils.Utils;

public class WriteCodiceABarre {
	private Connection c;

	public WriteCodiceABarre() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(CodiceABarre a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

			PreparedStatement ps = c.prepareStatement("INSERT INTO CodiceABarre VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, a.getCodiceArticolo());
			ps.setString(2, a.getCodiceABarre());
			ps.setString(3, a.getTipo());
			ps.setTimestamp(4, Utils.toTimestamp(a.getDataInserimento()));
			ps.setTimestamp(5, Utils.toTimestamp(a.getDataUltimaModifica()));
	
			ps.executeUpdate();
			ps.close();
			c.commit();

		} catch (Exception e) {
		  //Utils.createAlertFailWriteDB();
		}
	}
}
