package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.BentoDettaglio;
import invoicemanager.utils.Utils;

public class WriteBentoDettaglio {
	private Connection c;

	public WriteBentoDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(BentoDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO BentoDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
				ps.setString(1, a.getCodiceBento());
				ps.setInt(2, a.getNumeroRigaBento());
				ps.setString(3, a.getCodiceTipoBento().getCodiceTipoBento());
				ps.setString(4, a.getCodiceRigaBento());
				ps.setString(5, a.getCodiceArticolo());
				ps.setString(6, a.getDescrizione());
				ps.setFloat(7, a.getQuantita());
				ps.setString(8, a.getCodiceUnitaMisura().getCodiceUnitaMisura());
				ps.setFloat(9, a.getPrezzo());
				ps.setString(10, a.getCodiceIva());
				ps.setString(11, a.getCodiceControparte());
				ps.setFloat(12, a.getPercentualeProvvigione());
				ps.setFloat(13, a.getPercentualeScontoCliente());
				ps.setFloat(14, a.getPercentualeScontoArticolo());
				ps.setFloat(15, a.getPercentualeScontoPagamento());
				ps.setString(16, a.getCodiceMagazzino());
				ps.setString(17, a.getCodiceCausaleMagazzino());
				ps.setString(18, a.getDescrizioneAggiuntiva());
				ps.setTimestamp(19, Utils.toTimestamp(a.getDataInserimento()));
				ps.setTimestamp(20, Utils.toTimestamp(a.getDataUltimaModifica()));
		
				ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
