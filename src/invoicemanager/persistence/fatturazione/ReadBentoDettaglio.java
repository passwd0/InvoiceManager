package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.BentoDettaglio;
import invoicemanager.model.fatturazione.CausaleMagazzino;
import invoicemanager.model.fatturazione.Controparte;
import invoicemanager.model.fatturazione.Iva;
import invoicemanager.model.fatturazione.Magazzino;
import invoicemanager.model.fatturazione.TipoBento;
import invoicemanager.model.fatturazione.UnitaMisura;


public class ReadBentoDettaglio {
	private Connection c;

	public ReadBentoDettaglio() throws ClassNotFoundException, SQLException {
		c = DBConnect.getConnection();
	}

	public List<BentoDettaglio> read(List<TipoBento> listaTipoBento, List<UnitaMisura> listaUnitaMisura, List<Iva> listaIva, List<Controparte> listaControparte, List<Magazzino> listaMagazzino, List<CausaleMagazzino> listaCausaleMagazzino)
 {
		List<BentoDettaglio> listbentoDettaglio = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM BentoDettaglio");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceBento = rs.getString("codiceBento");
				int numeroRigaBento = rs.getInt("numeroRigaBento");
				String codiceTipoBento = rs.getString("tipoBento");
				TipoBento tipoBento = listaTipoBento.stream().filter(x->x.getCodiceTipoBento().equals(codiceTipoBento)).findFirst().get();
				String codiceRigaBento = rs.getString("codiceRigaBento");
				String codiceArticolo = rs.getString("codiceArticolo");
				String descrizione = rs.getString("descrizione");
				float quantita = rs.getFloat("quantita");
				String codiceUnitaMisura = rs.getString("unitaMisura");
				UnitaMisura unitaMisura = listaUnitaMisura.stream().filter(x->x.getCodiceUnitaMisura().equals(codiceUnitaMisura)).findFirst().get();
				float prezzo = rs.getFloat("prezzo");
				String codiceIva = rs.getString("iva");
				Iva iva = listaIva.stream().filter(x->x.getCodiceIva().equals(codiceIva)).findFirst().get();
				String codiceControparte = rs.getString("controparte");
				Controparte controparte = listaControparte.stream().filter(x->x.getCodiceControparte().equals(codiceControparte)).findFirst().get();
				float percentualeProvvigione = rs.getFloat("percentualeProvvigione");
				float percentualeScontoCliente = rs.getFloat("percentualeScontoCliente");
				float percentualeScontoArticolo = rs.getFloat("percentualeScontoArticolo");
				float percentualeScontoPagamento = rs.getFloat("percentualeScontoPagamento");
				String codiceMagazzino = rs.getString("magazzino");
				Magazzino magazzino = listaMagazzino.stream().filter(x->x.getCodiceMagazzino().equals(codiceMagazzino)).findFirst().get();
				String codiceCausaleMagazzino = rs.getString("causale");
				CausaleMagazzino causale = listaCausaleMagazzino.stream().filter(x->x.getCodiceCausaleMagazzino().equals(codiceCausaleMagazzino)).findFirst().get();
				String descrizioneAggiuntiva = rs.getString("descrizioneAggiuntiva");
				ts = rs.getTimestamp("dataInserimento");
				LocalDateTime dataInserimento = null;
				if (ts != null)
				dataInserimento = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimaModifica");
				LocalDateTime dataUltimaModifica = null;
				if (ts != null)
				dataUltimaModifica = ts.toLocalDateTime();
				BentoDettaglio bentoDettaglio = new BentoDettaglio(codiceBento, numeroRigaBento, tipoBento, codiceRigaBento, codiceArticolo, descrizione, quantita, unitaMisura, prezzo, iva, controparte, percentualeProvvigione, percentualeScontoCliente, percentualeScontoArticolo, percentualeScontoPagamento, magazzino, causale, descrizioneAggiuntiva, dataInserimento, dataUltimaModifica);

				listbentoDettaglio.add(bentoDettaglio);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listbentoDettaglio;
	}

}
