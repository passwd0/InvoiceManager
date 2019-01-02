package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.GruppoMerceologico;
import invoicemanager.utils.Utils;

public class WriteGruppoMerceologico {
	private Connection c;

	public WriteGruppoMerceologico() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(GruppoMerceologico a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO GruppoMerceologico VALUES (?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceGruppoMerceologico());
		ps.setString(2, a.getDescrizione());
		ps.setString(3, a.getCodiceStato());
		ps.setFloat(4, a.getSconto());
		ps.setFloat(5, a.getPercentualeProvvigione());
		ps.setInt(6, a.getNumeroPezziConfezione());
		ps.setTimestamp(7, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(8, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
