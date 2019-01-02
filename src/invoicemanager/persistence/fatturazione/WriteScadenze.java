package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import invoicemanager.model.fatturazione.Scadenze;
import invoicemanager.utils.Utils;

public class WriteScadenze {
	private Connection c;

	public WriteScadenze() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public void add(Scadenze a, boolean exist) throws ClassNotFoundException, SQLException {
	    try {

		PreparedStatement ps = c.prepareStatement("INSERT INTO Scadenze VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)");
		ps.setString(1, a.getCodiceConto());
		ps.setString(2, a.getCodiceTipoPagamento());
		ps.setString(3, a.getRiferimentoPartita());
		ps.setDate(4, Date.valueOf(a.getDataDocumento()));
		ps.setDate(5, Date.valueOf(a.getDataScadenza()));
		ps.setInt(6, a.getNumeroRegistrazione());
		ps.setString(7, a.getCodiceBanca());
		ps.setDate(8, Date.valueOf(a.getDataValuta()));
		ps.setString(9, a.getCodicePagamento());
		ps.setString(10, a.getNumeroAssegno());
		ps.setFloat(11, a.getImportoImponibileRitenutaAcconto());
		ps.setFloat(12, a.getImportoRitenutaAcconto());
		ps.setFloat(13, a.getImportoRimborsiRitenutaAcconto());
		ps.setFloat(14, a.getImportoIVARitenutaAcconto());
		ps.setFloat(15, a.getContriburoINPSDatoreLavoro());
		ps.setFloat(16, a.getContriburoINPSDatorePercipiente());
		ps.setDate(17, Date.valueOf(a.getDataValutaAssegno()));
		ps.setString(18, a.getNote());
		ps.setFloat(19, a.getImportoPagato());
		ps.setDate(20, Date.valueOf(a.getDataPagamento()));
		ps.setString(21, a.getNumeroDocumento());
		ps.setString(22, a.getCodiceIVAInSospensione());
		ps.setFloat(23, a.getImportoPartita());
		ps.setFloat(24, a.getImpostaIVAInSospensione());
		ps.setFloat(25, a.getImponibileIVAInSospensione());
		ps.setString(26, a.getCodiceNumeroGiornaleIVA());
		ps.setString(27, a.getTipoRitenutaAcconto());
		ps.setDate(28, Date.valueOf(a.getDataAutorizzazionePagamento()));
		ps.setString(29, a.getCodiceDivisa());
		ps.setDate(30, Date.valueOf(a.getDataRegistrazione()));
		ps.setFloat(31, a.getImportoAbbuono());
		ps.setTimestamp(32, Utils.toTimestamp(a.getDataInserimento()));
		ps.setTimestamp(33, Utils.toTimestamp(a.getDataUltimaModifica()));
		ps.setString(34, a.getDescrizioneAggiuntiva());
		ps.setBoolean(35, a.isIndicatoreFattureProforma());
		ps.setFloat(36, a.getImportoRimborsiCpap());

		ps.executeUpdate();
				ps.close();
				c.commit();
				c.close();
				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
		}
}
