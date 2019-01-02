package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.FatturaCollegata;

public class WriteFatturaCollegata {
	private Connection c;

	public WriteFatturaCollegata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(FatturaCollegata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaCollegata VALUES (?, ?, ?, ?, ?, ?,)");
		ps.setInt(1, a.getNumeroFtCollegate());
		ps.setString(2, a.getCodiceNumeroRigaFtCollegate());
		ps.setDate(3, Date.valueOf(a.getDataFtCollegate()));
		ps.setString(4, a.getFtcCodiceCommessaFtCollegate());
		ps.setString(5, a.getFtcCodiceCUP());
		ps.setString(6, a.getFtcCodiceCIG());

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
