package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Convenzione;

public class WriteConvenzione {
	private Connection c;

	public WriteConvenzione() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Convenzione a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Convenzione VALUES (?, ?, ?, ?, ?, ?,)");
		ps.setInt(1, a.getNumeroConvenzione());
		ps.setInt(2, a.getNumeroRigaConvenzione());
		ps.setDate(3, Date.valueOf(a.getDataConvenzione()));
		ps.setString(4, a.getCnvCodiceCommessaConvenzione());
		ps.setString(5, a.getCnvCodiceCUP());
		ps.setString(6, a.getCnvCodiceCIG());

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
