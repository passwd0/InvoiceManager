package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.BancaGlobale;

public class WriteBancaGlobale {
	private Connection c;

	public WriteBancaGlobale() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(BancaGlobale a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO BancaGlobale VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceBanca());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getCodiceABI());
		ps.setString(4, a.getCodiceCAB());
		ps.setString(5, a.getLocalita());
		ps.setString(6, a.getProvincia());
		ps.setString(7, a.getNumeroContoCorrente());
		ps.setString(8, a.getCodiceCIN());
		ps.setString(9, a.getCodiceCINEur());
		ps.setString(10, a.getPaese());
		ps.setDate(11, Date.valueOf(a.getDataInserimento()));
		ps.setDate(12, Date.valueOf(a.getDataUltimaModifica()));
		ps.setString(13, a.getIban());
		ps.setString(14, a.getSwift());
		ps.setString(15, a.getCodiceConto());
		ps.setString(16, a.getIndirizzo());
		ps.setString(17, a.getCap());

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
