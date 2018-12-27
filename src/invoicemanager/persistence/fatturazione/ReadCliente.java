package invoicemanager.persistence.fatturazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.model.fatturazione.Cliente;


public class ReadCliente {
	private Connection c;

	public ReadCliente() throws ClassNotFoundException, SQLException {
		c = DBConnect.connect();
	}

	public List<Cliente> read() {
		List<Cliente> listcliente = new ArrayList<>();
		Statement stmt;

		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Cliente");
			Timestamp ts;
	         while ( rs.next() ) {

				String codiceClient = rs.getString("codiceClient");
				String descrizion = rs.getString("descrizion");
				ts = rs.getTimestamp("dataInseriment");
				LocalDateTime dataInseriment = null;
				if (ts != null)
				dataInseriment = ts.toLocalDateTime();
				ts = rs.getTimestamp("dataUltimoAggiornament");
				LocalDateTime dataUltimoAggiornament = null;
				if (ts != null)
				dataUltimoAggiornament = ts.toLocalDateTime();
				String codice = rs.getString("codiceTipoClient");
				TipoCliente codiceTipoClient = list.stream().filter(x->x.getTipoCliente().equals(codice)).findFirst().get();
				String codiceUfficioCommercial = rs.getString("codiceUfficioCommercial");
				String codice = rs.getString("codiceResaMerc");
				ResaMerce codiceResaMerc = list.stream().filter(x->x.getResaMerce().equals(codice)).findFirst().get();
				String codice = rs.getString("codiceImball");
				Imballo codiceImball = list.stream().filter(x->x.getImballo().equals(codice)).findFirst().get();
				String codice = rs.getString("codiceRaggruppament");
				RaggruppamentoClienteFornitore codiceRaggruppament = list.stream().filter(x->x.getRaggruppamentoClienteFornitore().equals(codice)).findFirst().get();
				float fatturat = rs.getFloat("fatturat");
				float fid = rs.getFloat("fid");
				String partitaIV = rs.getString("partitaIV");
				String codiceFiscal = rs.getString("codiceFiscal");
				String codice = rs.getString("codicePagament");
				Pagamento codicePagament = list.stream().filter(x->x.getPagamento().equals(codice)).findFirst().get();
				String sinonim = rs.getString("sinonim");
				String codice = rs.getString("codiceBanc");
				Banca codiceBanc = list.stream().filter(x->x.getBanca().equals(codice)).findFirst().get();
				int numeroFattureEmess = rs.getInt("numeroFattureEmess");
				String codice = rs.getString("codiceEsenzioneIV");
				Iva codiceEsenzioneIV = list.stream().filter(x->x.getIva().equals(codice)).findFirst().get();
				float imponibileNonEsent = rs.getFloat("imponibileNonEsent");
				float imponibileEsent = rs.getFloat("imponibileEsent");
				float importoIV = rs.getFloat("importoIV");
				String codiceClassificazion = rs.getString("codiceClassificazion");
				float costoVendut = rs.getFloat("costoVendut");
				String codice = rs.getString("codiceAgent");
				Agente codiceAgent = list.stream().filter(x->x.getAgente().equals(codice)).findFirst().get();
				float percentualeProvvigioneAgent = rs.getFloat("percentualeProvvigioneAgent");
				float scontoLegatoProvvigioniAgent = rs.getFloat("scontoLegatoProvvigioniAgent");
				int numeroCopieFattur = rs.getInt("numeroCopieFattur");
				boolean indicatoreAddebitoSpeseIncass = rs.getBoolean("indicatoreAddebitoSpeseIncass");
				boolean indicatoreAddebitoSpeseBoll = rs.getBoolean("indicatoreAddebitoSpeseBoll");
				int codiceListin = rs.getInt("codiceListin");
				String codiceVettor = rs.getString("codiceVettor");
				String codiceAffidabilit = rs.getString("codiceAffidabilit");
				String codice = rs.getString("codiceIS");
				Iso codiceIS = list.stream().filter(x->x.getIso().equals(codice)).findFirst().get();
				String partitaIVAEster = rs.getString("partitaIVAEster");
				String codiceDivis = rs.getString("codiceDivis");
				int dataScadenzaSpostataAgost = rs.getInt("dataScadenzaSpostataAgost");
				int dataScadenzaSpostataDicembr = rs.getInt("dataScadenzaSpostataDicembr");
				String codiceRetrocession = rs.getString("codiceRetrocession");
				String codiceCommission = rs.getString("codiceCommission");
				String codiceLingu = rs.getString("codiceLingu");
				String not = rs.getString("not");
				String codice = rs.getString("codiceStat");
				Stato codiceStat = list.stream().filter(x->x.getStato().equals(codice)).findFirst().get();
				boolean indicatoreInviataInformativaPrivac = rs.getBoolean("indicatoreInviataInformativaPrivac");
				boolean indicatoreRicevutaInformativaPrivac = rs.getBoolean("indicatoreRicevutaInformativaPrivac");
				String codiceClienteRiferiment = rs.getString("codiceClienteRiferiment");
				ts = rs.getTimestamp("dataUltimaModific");
				LocalDateTime dataUltimaModific = null;
				if (ts != null)
				dataUltimaModific = ts.toLocalDateTime();
				boolean indicatoreInibizion = rs.getBoolean("indicatoreInibizion");
				String loginInseriment = rs.getString("loginInseriment");
				String loginModific = rs.getString("loginModific");
				boolean indicatoreScorporoIV = rs.getBoolean("indicatoreScorporoIV");
				boolean indicatoreIVADifferit = rs.getBoolean("indicatoreIVADifferit");
				boolean indicatoreEmai = rs.getBoolean("indicatoreEmai");
				boolean inputInibit = rs.getBoolean("inputInibit");
				boolean indicatoreEd = rs.getBoolean("indicatoreEd");
				String partitaIvaEd = rs.getString("partitaIvaEd");
				String qualificatoreEd = rs.getString("qualificatoreEd");
				String identificativoFornitoreEd = rs.getString("identificativoFornitoreEd");
				String tipoFornitoreEd = rs.getString("tipoFornitoreEd");
				String identificativoIntestatarioFatturaEd = rs.getString("identificativoIntestatarioFatturaEd");
				String tipoIntestatarioFatturaEd = rs.getString("tipoIntestatarioFatturaEd");
				String identificativoPuntoConsegnaEd = rs.getString("identificativoPuntoConsegnaEd");
				String tipoPuntoConsegnaEd = rs.getString("tipoPuntoConsegnaEd");
				Cliente cliente = new Cliente(codiceClient, descrizion, dataInseriment, dataUltimoAggiornament, codiceTipoClient, codiceUfficioCommercial, codiceResaMerc, codiceImball, codiceRaggruppament, fatturat, fid, partitaIV, codiceFiscal, codicePagament, sinonim, codiceBanc, numeroFattureEmess, codiceEsenzioneIV, imponibileNonEsent, imponibileEsent, importoIV, codiceClassificazion, costoVendut, codiceAgent, percentualeProvvigioneAgent, scontoLegatoProvvigioniAgent, numeroCopieFattur, indicatoreAddebitoSpeseIncass, indicatoreAddebitoSpeseBoll, codiceListin, codiceVettor, codiceAffidabilit, codiceIS, partitaIVAEster, codiceDivis, dataScadenzaSpostataAgost, dataScadenzaSpostataDicembr, codiceRetrocession, codiceCommission, codiceLingu, not, codiceStat, indicatoreInviataInformativaPrivac, indicatoreRicevutaInformativaPrivac, codiceClienteRiferiment, dataUltimaModific, indicatoreInibizion, loginInseriment, loginModific, indicatoreScorporoIV, indicatoreIVADifferit, indicatoreEmai, inputInibit, indicatoreEd, partitaIvaEd, qualificatoreEd, identificativoFornitoreEd, tipoFornitoreEd, identificativoIntestatarioFatturaEd, tipoIntestatarioFatturaEd, identificativoPuntoConsegnaEd, tipoPuntoConsegnaEd);
		
				listcliente.add(cliente);
	         }
		     rs.close();
		     stmt.close();
		     c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return listcliente;
	}

}
