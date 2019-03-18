package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Gruppo;
import invoicemanager.utils.Utils;

public class WriteGruppo {
	private Connection c;

	public WriteGruppo() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Gruppo a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Gruppo VALUES (?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceGruppo());
		ps.setString(2, a.getDescrizione());
		ps.setTimestamp(3, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(4, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
