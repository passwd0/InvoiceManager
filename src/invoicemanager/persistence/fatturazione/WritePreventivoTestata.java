package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.PreventivoTestata;
import invoicemanager.utils.Utils;

public class WritePreventivoTestata {
	private Connection c;

	public WritePreventivoTestata() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(PreventivoTestata a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO PreventivoTestata VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setInt(1, a.getNumeroPreventivo());
		ps.setDate(2, Date.valueOf(a.getDataPreventivo()));
		ps.setBoolean(3, a.isIndicatoreStatoAvanzamento());
		ps.setDate(4, Date.valueOf(a.getDataConsegna()));
		ps.setDate(5, Date.valueOf(a.getDataValidita()));
		ps.setString(6, a.getPeriodoValidita());
		ps.setBoolean(7, a.isIndicatoreUtilizzoDataValidita());
		ps.setString(8, a.getCodiceCliente());
		ps.setString(9, a.getAttenzione());
		ps.setString(10, a.getOggetto());
		ps.setString(11, a.getRiferimentoInterno());
		ps.setString(12, a.getNumeroInterno());
		ps.setString(13, a.getCodiceIVA());
		ps.setString(14, a.getCodiceAgente());
		ps.setString(15, a.getCodiceResa());
		ps.setString(16, a.getCodiceVettore());
		ps.setString(17, a.getCodicePagamento());
		ps.setString(18, a.getCodiceBanca());
		ps.setString(19, a.getCodiceCausale());
		ps.setString(20, a.getCodiceCausalePrelievo());
		ps.setBoolean(21, a.isCodiceListino());
		ps.setString(22, a.getDescrizioneOrdine());
		ps.setString(23, a.getCodiceDivisa());
		ps.setFloat(24, a.getCambio());
		ps.setString(25, a.getNumeroFax());
		ps.setString(26, a.getVenditore());
		ps.setBoolean(27, a.isIndicatoreAddebitoBolli());
		ps.setBoolean(28, a.isIndicatoreAddebitoSpeseIncasso());
		ps.setString(29, a.getNote());
		ps.setString(30, a.getCodiceClienteSpedizione());
		ps.setString(31, a.getNomeSpedizione());
		ps.setString(32, a.getIndirizzoSpedizione());
		ps.setString(33, a.getCapSpedizione());
		ps.setString(34, a.getCittaSpedizione());
		ps.setString(35, a.getProvinciaSpedizione());
		ps.setString(36, a.getCodiceNazioneSpedizione());
		ps.setString(37, a.getLoginInserimento());
		ps.setTimestamp(38, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(39, Utils.toTimestamp(a.getDataUltimaModifica()));

		ps.executeUpdate();
				ps.close();
				c.commit();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
