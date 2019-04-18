package invoicemanager.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.BentoDettaglio;
import invoicemanager.model.CausaleMagazzino;
import invoicemanager.model.Controparte;
import invoicemanager.model.Iva;
import invoicemanager.model.Magazzino;
import invoicemanager.model.TipoBento;
import invoicemanager.model.UnitaMisura;

public class BentoDettaglioDao {
	private Connection c;

	public BentoDettaglioDao() {
		try { c = ConnectionFactory.getConnection(); }
		catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}

	public int add(BentoDettaglio a, boolean exist) {
	    int res = 0;
	    try {

				PreparedStatement ps = c.prepareStatement("INSERT INTO BentoDettaglio VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				ps.setString(1, a.getCodiceBento());
				ps.setInt(2, a.getNumeroRigaBento());
				ps.setString(3, a.getCodiceTipoBento());
				ps.setString(4, a.getCodiceRigaBento());
				ps.setString(5, a.getCodiceArticolo());
				ps.setString(6, a.getDescrizione());
				ps.setFloat(7, a.getQuantita());
				ps.setString(8, a.getCodiceUnitaMisura());
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
				ps.setTimestamp(19, a.getDataInserimento());
				ps.setTimestamp(20, a.getDataUltimaModifica());
		
			res = ps.executeUpdate();
				ps.close();

				} catch (Exception e) {
	   			  //Utils.createAlertFailWriteDB();
				}
	    return res;
		}
	
	public void createTable() {
		try {
        Statement stmt = c.createStatement();
    	String sql = "Create table public.BentoDettaglio (\r\n" + 
    			"	\"CodiceBento\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"NumeroRigaBento\" INTEGER NOT NULL ,\r\n" + 
    			"	\"CodiceTipoBento\" varchar(25) NOT NULL ,\r\n" + 
    			"	\"CodiceRigaBento\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceArticolo\" varchar(25) NULL,\r\n" + 
    			"	\"Descrizione\" varchar(25) NULL,\r\n" + 
    			"	\"Quantita\" Float NULL,\r\n" + 
    			"	\"CodiceUnitaMisura\" varchar(25) NULL,\r\n" + 
    			"	\"Prezzo\" Float NULL,\r\n" + 
    			"	\"CodiceIva\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceControparte\" varchar(25) NULL,\r\n" + 
    			"	\"PercentualeProvvigione\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoCliente\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoArticolo\" Float NULL,\r\n" + 
    			"	\"PercentualeScontoPagamento\" Float NULL,\r\n" + 
    			"	\"CodiceMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"CodiceCausaleMagazzino\" varchar(25) NULL,\r\n" + 
    			"	\"DescrizioneAggiuntiva\" varchar(25) NULL,\r\n" + 
    			"	\"DataInserimento\" Timestamp NULL,\r\n" + 
    			"	\"DataUltimaModifica\" Timestamp NULL, \r\n" + 
    			"   Primary Key (\"CodiceBento\", \"NumeroRigaBento\", \"CodiceTipoBento\")" +
    			");";		//AGGIUNGERE STATO
    	stmt.executeUpdate(sql);
    	stmt.close();

	} catch (Exception e) {
		//Utils.createAlertFailWriteDB();
	}

	}
	
	
	public List<BentoDettaglio> read(List<TipoBento> listaTipoBento, List<UnitaMisura> listaUnitaMisura, List<Iva> listaIva, List<Controparte> listaControparte, List<Magazzino> listaMagazzino, List<CausaleMagazzino> listaCausaleMagazzino)
 {
		List<BentoDettaglio> listbentoDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM BentoDettaglio");
	         while ( rs.next() ) {

				String codiceBento = rs.getString("codiceBento");
				int numeroRigaBento = rs.getInt("numeroRigaBento");
				String codiceTipoBento = rs.getString("tipoBento");
				TipoBento tipoBento = listaTipoBento.stream().filter(x->x.getCodiceTipoBento().equals(codiceTipoBento)).findFirst().orElse(null);
				String codiceRigaBento = rs.getString("codiceRigaBento");
				String codiceArticolo = rs.getString("codiceArticolo");
				String descrizione = rs.getString("descrizione");
				float quantita = rs.getFloat("quantita");
				String codiceUnitaMisura = rs.getString("unitaMisura");
				UnitaMisura unitaMisura = listaUnitaMisura.stream().filter(x->x.getCodiceUnitaMisura().equals(codiceUnitaMisura)).findFirst().orElse(null);
				float prezzo = rs.getFloat("prezzo");
				String codiceIva = rs.getString("iva");
				Iva iva = listaIva.stream().filter(x->x.getCodiceIva().equals(codiceIva)).findFirst().orElse(null);
				String codiceControparte = rs.getString("controparte");
				Controparte controparte = listaControparte.stream().filter(x->x.getCodiceControparte().equals(codiceControparte)).findFirst().orElse(null);
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				float percentualeScontoCliente = rs.getFloat("percentualeScontoCliente");
				float percentualeScontoArticolo = rs.getFloat("percentualeScontoArticolo");
				float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
				String codiceMagazzino = rs.getString("magazzino");
				Magazzino magazzino = listaMagazzino.stream().filter(x->x.getCodiceMagazzino().equals(codiceMagazzino)).findFirst().orElse(null);
				String codiceCausaleMagazzino = rs.getString("causale");
				CausaleMagazzino causale = listaCausaleMagazzino.stream().filter(x->x.getCodiceCausaleMagazzino().equals(codiceCausaleMagazzino)).findFirst().orElse(null);
				String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
				Timestamp dataInserimento = rs.getTimestamp("dataInserimento");
				Timestamp dataUltimaModifica = rs.getTimestamp("dataUltimaModifica");
				BentoDettaglio bentoDettaglio = new BentoDettaglio(codiceBento, numeroRigaBento, tipoBento, codiceRigaBento, codiceArticolo, descrizione, quantita, unitaMisura, prezzo, iva, controparte, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, magazzino, causale, descrizioneAggiuntiva, dataInserimento, dataUltimaModifica);

				listbentoDettaglio.add(bentoDettaglio);
	         }
		     rs.close();
		     stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listbentoDettaglio;
	}

}
