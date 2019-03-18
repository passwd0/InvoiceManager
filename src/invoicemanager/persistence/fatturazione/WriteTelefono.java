package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Telefono;
import invoicemanager.utils.Utils;

public class WriteTelefono {
	private Connection c;

	public WriteTelefono() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Telefono a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Telefono VALUES (?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceConto());
		ps.setInt(2, a.getProgressivo());
		ps.setString(3, a.getTipoTelefono());
		ps.setString(4, a.getNumero());
		ps.setTimestamp(5, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(6, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
