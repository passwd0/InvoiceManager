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

		PreparedStatement ps = c.prepareStatement("INSERT INTO ListinoPersonalizzato VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceCliente());
		ps.setString(2, a.getCodiceArticolo());
		ps.setString(3, a.getVariante());
		ps.setFloat(4, a.getPrezzo());
		ps.setFloat(5, a.getProvvigione());
		ps.setString(6, a.getNoteEsterne());
		ps.setString(7, a.getNoteInterne());
		ps.setInt(8, a.getNumeroDecimali());
		ps.setFloat(9, a.getScontoCliente());
		ps.setTimestamp(10, Utils.toTimestamp(a.getDataAggiornamento()));
		ps.setFloat(11, a.getScontoArticolo());
		ps.setFloat(12, a.getScontoPagamento());
		ps.setString(13, a.getCodiceDivisa());
		ps.setString(14, a.getCodiceGruppoMerceologico());
		ps.setDate(15, Date.valueOf(a.getDataInizioValidita()));
		ps.setDate(16, Date.valueOf(a.getDataFineValidita()));
		ps.setBoolean(17, a.isOpzioneGruppi());
		ps.setBoolean(18, a.isOpzioneScontoClienti());
		ps.setBoolean(19, a.isOpzioneScontoArticolo());
		ps.setBoolean(20, a.isOpzioneScontoPagamento());
		ps.setBoolean(21, a.isOpzionePercentualeProvvigione());
		ps.setBoolean(22, a.isOpzioneNoteEsterne());
		ps.setBoolean(23, a.isOpzioneNoteInterne());
		ps.setTimestamp(24, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(25, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
