package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.FatturaProformaDettaglio;

public class WriteFatturaProformaDettaglio {
	private Connection c;

	public WriteFatturaProformaDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(FatturaProformaDettaglio a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO FatturaProformaDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setInt(1, a.getNumeroFattura());
		ps.setInt(2, a.getNumeroRigaFattura());
		ps.setDate(3, Date.valueOf(a.getDataFattura()));
		ps.setString(4, a.getCodiceTipoRigaDocumento());
		ps.setString(5, a.getCodiceArticolo());
		ps.setFloat(6, a.getCosto());
		ps.setFloat(7, a.getQuantitaDaConsegnare());
		ps.setBoolean(8, a.isIndicatoreEvasione());
		ps.setString(9, a.getDescrizione());
		ps.setFloat(10, a.getQuantita());
		ps.setFloat(11, a.getPrezzo());
		ps.setString(12, a.getCodiceIva());
		ps.setString(13, a.getCodiceContropartitaContabile());
		ps.setFloat(14, a.getPercentualeProvvigione());
		ps.setFloat(15, a.getPercentualeScontoCliente());
		ps.setFloat(16, a.getPercentualeScontoArticolo());
		ps.setFloat(17, a.getPercentualeScontoPagamento());
		ps.setString(18, a.getDescrizioneAggiuntiva());
		ps.setString(19, a.getCodiceUnitaMisura());
		ps.setString(20, a.getSerialNumber());
		ps.setBoolean(21, a.isIndicatoreNoConferma());
		ps.setString(22, a.getCodiceMagazzino());
		ps.setInt(23, a.getCodiceOrdine());
		ps.setInt(24, a.getCodiceContratto());
		ps.setInt(25, a.getCodiceConvezione());
		ps.setInt(26, a.getCodiceRicezione());
		ps.setInt(27, a.getCodiceFatturaCollegata());
		ps.setInt(28, a.getCodiceAltriDatiGestionali());

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
