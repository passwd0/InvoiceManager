package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Contratto;

public class WriteContratto {
	private Connection c;

	public WriteContratto() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Contratto a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Contratto VALUES (?, ?, ?, ?, ?, ?,)");
		ps.setInt(1, a.getNumeroContratto());
		ps.setInt(2, a.getNumeroRigaContratto());
		ps.setDate(3, Date.valueOf(a.getDataContratto()));
		ps.setString(4, a.getCntCodiceCommessaConvenzione());
		ps.setString(5, a.getCntCodiceCUP());
		ps.setString(6, a.getCntCodiceCIG());

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
