package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.PreventivoDettaglio;
import invoicemanager.utils.Utils;

public class WritePreventivoDettaglio {
	private Connection c;

	public WritePreventivoDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(PreventivoDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO PreventivoDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setInt(1, a.getNumeroPreventivo());
		ps.setString(2, a.getCodiceNumeroRigaPreventivo());
		ps.setDate(3, Date.valueOf(a.getDataPreventivo()));
		ps.setString(4, a.getCodiceTipoRigaDocumento());
		ps.setString(5, a.getCodiceArticolo());
		ps.setFloat(6, a.getQuantitaArticolo());
		ps.setFloat(7, a.getQuantitaConsegnata());
		ps.setFloat(8, a.getQuantitaDaConsegnare());
		ps.setString(9, a.getDescrizione());
		ps.setString(10, a.getDescrizioneAggiuntiva());
		ps.setDate(11, Date.valueOf(a.getDataConsegna()));
		ps.setString(12, a.getCodiceUnitaMisura());
		ps.setFloat(13, a.getPrezzo());
		ps.setString(14, a.getCodiceIVA());
		ps.setString(15, a.getCodiceControparte());
		ps.setFloat(16, a.getPercentualeProvvigione());
		ps.setFloat(17, a.getPercentualeScontoCliente());
		ps.setFloat(18, a.getPercentualeScontoArticolo());
		ps.setFloat(19, a.getPercentualeScontoPagamento());
		ps.setString(20, a.getCodiceMagazzino());
		ps.setTimestamp(21, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(22, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
