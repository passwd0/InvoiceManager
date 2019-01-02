package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.ListinoPersonalizzato;
import invoicemanager.utils.Utils;

public class WriteListinoPersonalizzato {
	private Connection c;

	public WriteListinoPersonalizzato() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(ListinoPersonalizzato a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO ListinoPersonalizzato VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setInt(1, a.getCodiceListinoPersonalizzato());
		ps.setString(2, a.getCodiceCliente());
		ps.setString(3, a.getCodiceArticolo());
		ps.setString(4, a.getVariante());
		ps.setFloat(5, a.getPrezzo());
		ps.setFloat(6, a.getProvvigione());
		ps.setString(7, a.getNoteEsterne());
		ps.setString(8, a.getNoteInterne());
		ps.setInt(9, a.getNumeroDecimali());
		ps.setFloat(10, a.getScontoCliente());
		ps.setTimestamp(11, Utils.toTimestamp(a.getDataAggiornamento()));
		ps.setFloat(12, a.getScontoArticolo());
		ps.setFloat(13, a.getScontoPagamento());
		ps.setString(14, a.getCodiceDivisa());
		ps.setString(15, a.getCodiceGruppoMerceologico());
		ps.setDate(16, Date.valueOf(a.getDataInizioValidita()));
		ps.setDate(17, Date.valueOf(a.getDataFineValidita()));
		ps.setBoolean(18, a.isOpzioneGruppi());
		ps.setBoolean(19, a.isOpzioneScontoClienti());
		ps.setBoolean(20, a.isOpzioneScontoArticolo());
		ps.setBoolean(21, a.isOpzioneScontoPagamento());
		ps.setBoolean(22, a.isOpzionePercentualeProvvigione());
		ps.setBoolean(23, a.isOpzioneNoteEsterne());
		ps.setBoolean(24, a.isOpzioneNoteInterne());
		ps.setTimestamp(25, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(26, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
