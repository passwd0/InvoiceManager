package invoicemanager.controller.fatturazione;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.fatturazione.Agente;
import invoicemanager.model.fatturazione.Allegato;
import invoicemanager.model.fatturazione.AltroDatoGestionale;
import invoicemanager.model.fatturazione.AreaGeografica;
import invoicemanager.model.fatturazione.ArticoloMagazzino;
import invoicemanager.model.fatturazione.ArticoloMagazzinoDescrizioneMultilingua;
import invoicemanager.model.fatturazione.Banca;
import invoicemanager.model.fatturazione.BancaGlobale;
import invoicemanager.model.fatturazione.BentoDettaglio;
import invoicemanager.model.fatturazione.BentoTestata;
import invoicemanager.model.fatturazione.CapItaliano;
import invoicemanager.model.fatturazione.CausaleMagazzino;
import invoicemanager.model.fatturazione.Cliente;
import invoicemanager.model.fatturazione.CodiceABarre;
import invoicemanager.model.fatturazione.Confezione;
import invoicemanager.model.fatturazione.Contratto;
import invoicemanager.model.fatturazione.Controparte;
import invoicemanager.model.fatturazione.Convenzione;
import invoicemanager.model.fatturazione.DdtDettaglio;
import invoicemanager.model.fatturazione.DdtTestata;
import invoicemanager.model.fatturazione.FatturaCollegata;
import invoicemanager.model.fatturazione.FatturaDettaglio;
import invoicemanager.model.fatturazione.FatturaProformaDettaglio;
import invoicemanager.model.fatturazione.FatturaProformaTestata;
import invoicemanager.model.fatturazione.FatturaTestata;
import invoicemanager.model.fatturazione.Gruppo;
import invoicemanager.model.fatturazione.GruppoMerceologico;
import invoicemanager.model.fatturazione.Imballo;
import invoicemanager.model.fatturazione.IndirizzoGeografico;
import invoicemanager.model.fatturazione.Iso;
import invoicemanager.model.fatturazione.Iva;
import invoicemanager.model.fatturazione.Listino;
import invoicemanager.model.fatturazione.ListinoArticolo;
import invoicemanager.model.fatturazione.ListinoPersonalizzato;
import invoicemanager.model.fatturazione.Magazzino;
import invoicemanager.model.fatturazione.Ordine;
import invoicemanager.model.fatturazione.OrdineDettaglio;
import invoicemanager.model.fatturazione.OrdineTestata;
import invoicemanager.model.fatturazione.Pagamento;
import invoicemanager.model.fatturazione.Percipiente;
import invoicemanager.model.fatturazione.PianoConto;
import invoicemanager.model.fatturazione.PreventivoDettaglio;
import invoicemanager.model.fatturazione.PreventivoTestata;
import invoicemanager.model.fatturazione.Prezzo;
import invoicemanager.model.fatturazione.ProvvigioneAgente;
import invoicemanager.model.fatturazione.RaggruppamentoClienteFornitore;
import invoicemanager.model.fatturazione.RappresentanteFiscale;
import invoicemanager.model.fatturazione.ResaMerce;
import invoicemanager.model.fatturazione.Ricezione;
import invoicemanager.model.fatturazione.ScadenzaPagamenti;
import invoicemanager.model.fatturazione.Scadenze;
import invoicemanager.model.fatturazione.SottogruppiMerceologici;
import invoicemanager.model.fatturazione.SottogruppoMerceologico;
import invoicemanager.model.fatturazione.StabileOrganizzazione;
import invoicemanager.model.fatturazione.Stato;
import invoicemanager.model.fatturazione.StatoAvanzamento;
import invoicemanager.model.fatturazione.StatoFattura;
import invoicemanager.model.fatturazione.Telefono;
import invoicemanager.model.fatturazione.TerzoIntermediario;
import invoicemanager.model.fatturazione.TipoBento;
import invoicemanager.model.fatturazione.TipoCliente;
import invoicemanager.model.fatturazione.TipoIndirizzo;
import invoicemanager.model.fatturazione.TipoMagazzino;
import invoicemanager.model.fatturazione.TipoPagamento;
import invoicemanager.model.fatturazione.TipoRigaDocumento;
import invoicemanager.model.fatturazione.UnitaMisura;
import invoicemanager.model.fatturazione.Utente;
import invoicemanager.model.fatturazione.Vettore;
import invoicemanager.persistence.fatturazione.ReadAgente;
import invoicemanager.persistence.fatturazione.ReadAllegato;
import invoicemanager.persistence.fatturazione.ReadAltroDatoGestionale;
import invoicemanager.persistence.fatturazione.ReadAreaGeografica;
import invoicemanager.persistence.fatturazione.ReadArticoloMagazzino;
import invoicemanager.persistence.fatturazione.ReadArticoloMagazzinoDescrizioneMultilingua;
import invoicemanager.persistence.fatturazione.ReadBanca;
import invoicemanager.persistence.fatturazione.ReadBancaGlobale;
import invoicemanager.persistence.fatturazione.ReadBentoDettaglio;
import invoicemanager.persistence.fatturazione.ReadBentoTestata;
import invoicemanager.persistence.fatturazione.ReadCapItaliano;
import invoicemanager.persistence.fatturazione.ReadCausaleMagazzino;
import invoicemanager.persistence.fatturazione.ReadCliente;
import invoicemanager.persistence.fatturazione.ReadCodiceABarre;
import invoicemanager.persistence.fatturazione.ReadConfezione;
import invoicemanager.persistence.fatturazione.ReadContratto;
import invoicemanager.persistence.fatturazione.ReadControparte;
import invoicemanager.persistence.fatturazione.ReadConvenzione;
import invoicemanager.persistence.fatturazione.ReadDdtDettaglio;
import invoicemanager.persistence.fatturazione.ReadDdtTestata;
import invoicemanager.persistence.fatturazione.ReadFatturaCollegata;
import invoicemanager.persistence.fatturazione.ReadFatturaDettaglio;
import invoicemanager.persistence.fatturazione.ReadFatturaProformaDettaglio;
import invoicemanager.persistence.fatturazione.ReadFatturaProformaTestata;
import invoicemanager.persistence.fatturazione.ReadFatturaTestata;
import invoicemanager.persistence.fatturazione.ReadGruppo;
import invoicemanager.persistence.fatturazione.ReadGruppoMerceologico;
import invoicemanager.persistence.fatturazione.ReadImballo;
import invoicemanager.persistence.fatturazione.ReadIndirizzoGeografico;
import invoicemanager.persistence.fatturazione.ReadIso;
import invoicemanager.persistence.fatturazione.ReadIva;
import invoicemanager.persistence.fatturazione.ReadListinoArticolo;
import invoicemanager.persistence.fatturazione.ReadListinoPersonalizzato;
import invoicemanager.persistence.fatturazione.ReadMagazzino;
import invoicemanager.persistence.fatturazione.ReadOrdine;
import invoicemanager.persistence.fatturazione.ReadOrdineDettaglio;
import invoicemanager.persistence.fatturazione.ReadOrdineTestata;
import invoicemanager.persistence.fatturazione.ReadPagamento;
import invoicemanager.persistence.fatturazione.ReadPercipiente;
import invoicemanager.persistence.fatturazione.ReadPianoConto;
import invoicemanager.persistence.fatturazione.ReadPreventivoDettaglio;
import invoicemanager.persistence.fatturazione.ReadPreventivoTestata;
import invoicemanager.persistence.fatturazione.ReadPrezzo;
import invoicemanager.persistence.fatturazione.ReadProvvigioneAgente;
import invoicemanager.persistence.fatturazione.ReadRaggruppamentoClienteFornitore;
import invoicemanager.persistence.fatturazione.ReadRappresentanteFiscale;
import invoicemanager.persistence.fatturazione.ReadResaMerce;
import invoicemanager.persistence.fatturazione.ReadRicezione;
import invoicemanager.persistence.fatturazione.ReadScadenzaPagamenti;
import invoicemanager.persistence.fatturazione.ReadScadenze;
import invoicemanager.persistence.fatturazione.ReadSottogruppiMerceologici;
import invoicemanager.persistence.fatturazione.ReadSottogruppoMerceologico;
import invoicemanager.persistence.fatturazione.ReadStabileOrganizzazione;
import invoicemanager.persistence.fatturazione.ReadStatoFattura;
import invoicemanager.persistence.fatturazione.ReadTelefono;
import invoicemanager.persistence.fatturazione.ReadTerzoIntermediario;
import invoicemanager.persistence.fatturazione.ReadTipoBento;
import invoicemanager.persistence.fatturazione.ReadTipoCliente;
import invoicemanager.persistence.fatturazione.ReadTipoIndirizzo;
import invoicemanager.persistence.fatturazione.ReadTipoMagazzino;
import invoicemanager.persistence.fatturazione.ReadTipoPagamento;
import invoicemanager.persistence.fatturazione.ReadTipoRigaDocumento;
import invoicemanager.persistence.fatturazione.ReadUnitaMisura;
import invoicemanager.persistence.fatturazione.ReadUtente;
import invoicemanager.persistence.fatturazione.ReadVettore;
import invoicemanager.persistence.fatturazione.WriteAgente;
import invoicemanager.persistence.fatturazione.WriteBanca;

public final class DataManager {
	
	private static List<Listino> loadListino() throws ClassNotFoundException, SQLException {
		List<Listino> listini = new ArrayList<>();
		listini.addAll(loadListinoArticolo());
		listini.addAll(loadListinoPersonalizzato());
		return listini;
	}
	
	private static List<Agente> loadAgente() throws ClassNotFoundException, SQLException{
		return new ReadAgente().read(loadControparte());
	}
	private static List<Allegato> loadAllegato() throws ClassNotFoundException, SQLException{
		return new ReadAllegato().read();
	}
	private static List<AltroDatoGestionale> loadAltroDatoGestionale() throws ClassNotFoundException, SQLException{
		return new ReadAltroDatoGestionale().read(loadLocalDate);
	}
	private static List<AreaGeografica> loadAreaGeografica() throws ClassNotFoundException, SQLException{
		return new ReadAreaGeografica().read();
	}
	private static List<ArticoloMagazzinoDescrizioneMultilingua> loadArticoloMagazzinoDescrizioneMultilingua() throws ClassNotFoundException, SQLException{
		return new ReadArticoloMagazzinoDescrizioneMultilingua().read();
	}
	private static List<ArticoloMagazzino> loadArticoloMagazzino() throws ClassNotFoundException, SQLException{
		return new ReadArticoloMagazzino().read();
	}
	private static List<BancaGlobale> loadBancaGlobale() throws ClassNotFoundException, SQLException{
		return new ReadBancaGlobale().read();
	}
	private static List<Banca> loadBanca() throws ClassNotFoundException, SQLException{
		return new ReadBanca().read(Stato.values());
	}
	private static List<BentoDettaglio> loadBentoDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadBentoDettaglio().read(loadTipoBento(), loadUnitaMisura(), loadIva(), loadControparte(), loadMagazzino(), loadCausaleMagazzino());
	}
	private static List<BentoTestata> loadBentoTestata() throws ClassNotFoundException, SQLException{
		return new ReadBentoTestata().read();
	}
	private static List<CapItaliano> loadCapItaliano() throws ClassNotFoundException, SQLException{
		return new ReadCapItaliano().read();
	}
	private static List<CausaleMagazzino> loadCausaleMagazzino() throws ClassNotFoundException, SQLException{
		return new ReadCausaleMagazzino().read();
	}
	private static List<Cliente> loadCliente() throws ClassNotFoundException, SQLException{
		return new ReadCliente().read(loadTipoCliente(), loadResaMerce(), loadImballo(), loadRaggruppamentoClienteFornitore(), loadPagamento(), loadBanca(), 
				loadIva(), loadAgente(), loadListino(), loadVettore(), loadIso(), loadStabileOrganizzazione(), loadRappresentanteFiscale(), loadTerzoIntermediario());
	}
	private static List<CodiceABarre> loadCodiceABarre() throws ClassNotFoundException, SQLException{
		return new ReadCodiceABarre().read();
	}
	private static List<Confezione> loadConfezione() throws ClassNotFoundException, SQLException{
		return new ReadConfezione().read();
	}
	private static List<Contratto> loadContratto() throws ClassNotFoundException, SQLException{
		return new ReadContratto().read();
	}
	private static List<Controparte> loadControparte() throws ClassNotFoundException, SQLException{
		return new ReadControparte().read();
	}
	private static List<Convenzione> loadConvenzione() throws ClassNotFoundException, SQLException{
		return new ReadConvenzione().read();
	}
	private static List<DdtDettaglio> loadDdtDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadDdtDettaglio().read();
	}
	private static List<DdtTestata> loadDdtTestata() throws ClassNotFoundException, SQLException{
		return new ReadDdtTestata().read(loadDdtDettaglio());
	}
	private static List<FatturaCollegata> loadFatturaCollegata() throws ClassNotFoundException, SQLException{
		return new ReadFatturaCollegata().read();
	}
	private static List<FatturaDettaglio> loadFatturaDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadFatturaDettaglio().read(loadOrdine(), loadContratto(), loadConvenzione(), loadRicezione(), loadFatturaCollegata(), loadAltroDatoGestionale());
	}
	private static List<FatturaProformaDettaglio> loadFatturaProformaDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadFatturaProformaDettaglio().read(loadOrdine(), loadContratto(), loadConvenzione(), loadRicezione(), loadFatturaCollegata(), loadAltroDatoGestionale());
	}
	private static List<FatturaProformaTestata> loadFatturaProformaTestata() throws ClassNotFoundException, SQLException{
		return new ReadFatturaProformaTestata().read();
	}
	private static List<FatturaTestata> loadFatturaTestata() throws ClassNotFoundException, SQLException{
		return new ReadFatturaTestata().read(StatoAvanzamento.values(), loadFatturaDettaglio(), loadAllegato());
	}
	private static List<Gruppo> loadGruppo() throws ClassNotFoundException, SQLException{
		return new ReadGruppo().read();
	}
	private static List<GruppoMerceologico> loadGruppoMerceologico() throws ClassNotFoundException, SQLException{
		return new ReadGruppoMerceologico().read();
	}
	private static List<Imballo> loadImballo() throws ClassNotFoundException, SQLException{
		return new ReadImballo().read();
	}
	private static List<IndirizzoGeografico> loadIndirizzoGeografico() throws ClassNotFoundException, SQLException{
		return new ReadIndirizzoGeografico().read();
	}
	private static List<Iso> loadIso() throws ClassNotFoundException, SQLException{
		return new ReadIso().read();
	}
	private static List<Iva> loadIva() throws ClassNotFoundException, SQLException{
		return new ReadIva().read();
	}
	private static List<ListinoArticolo> loadListinoArticolo() throws ClassNotFoundException, SQLException{
		return new ReadListinoArticolo().read();
	}
	private static List<ListinoPersonalizzato> loadListinoPersonalizzato() throws ClassNotFoundException, SQLException{
		return new ReadListinoPersonalizzato().read(loadGruppoMerceologico());
	}
	private static List<Magazzino> loadMagazzino() throws ClassNotFoundException, SQLException{
		return new ReadMagazzino().read();
	}
	private static List<OrdineDettaglio> loadOrdineDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadOrdineDettaglio().read();
	}
	private static List<Ordine> loadOrdine() throws ClassNotFoundException, SQLException{
		return new ReadOrdine().read();
	}
	private static List<OrdineTestata> loadOrdineTestata() throws ClassNotFoundException, SQLException{
		return new ReadOrdineTestata().read(StatoAvanzamento.values(), loadOrdineDettaglio());
	}
	private static List<Pagamento> loadPagamento() throws ClassNotFoundException, SQLException{
		return new ReadPagamento().read(loadTipoPagamento());
	}
	private static List<Percipiente> loadPercipiente() throws ClassNotFoundException, SQLException{
		return new ReadPercipiente().read();
	}
	private static List<PianoConto> loadPianoConto() throws ClassNotFoundException, SQLException{
		return new ReadPianoConto().read();
	}
	private static List<PreventivoDettaglio> loadPreventivoDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadPreventivoDettaglio().read();
	}
	private static List<PreventivoTestata> loadPreventivoTestata() throws ClassNotFoundException, SQLException{
		return new ReadPreventivoTestata().read();
	}
	private static List<Prezzo> loadPrezzo() throws ClassNotFoundException, SQLException{
		return new ReadPrezzo().read();
	}
	private static List<ProvvigioneAgente> loadProvvigioneAgente() throws ClassNotFoundException, SQLException{
		return new ReadProvvigioneAgente().read();
	}
	private static List<RaggruppamentoClienteFornitore> loadRaggruppamentoClienteFornitore() throws ClassNotFoundException, SQLException{
		return new ReadRaggruppamentoClienteFornitore().read();
	}
	private static List<RappresentanteFiscale> loadRappresentanteFiscale() throws ClassNotFoundException, SQLException{
		return new ReadRappresentanteFiscale().read();
	}
	private static List<ResaMerce> loadResaMerce() throws ClassNotFoundException, SQLException{
		return new ReadResaMerce().read();
	}
	private static List<Ricezione> loadRicezione() throws ClassNotFoundException, SQLException{
		return new ReadRicezione().read();
	}
	private static List<ScadenzaPagamenti> loadScadenzaPagamenti() throws ClassNotFoundException, SQLException{
		return new ReadScadenzaPagamenti().read();
	}
	private static List<Scadenze> loadScadenze() throws ClassNotFoundException, SQLException{
		return new ReadScadenze().read();
	}
	private static List<SottogruppiMerceologici> loadSottogruppiMerceologici() throws ClassNotFoundException, SQLException{
		return new ReadSottogruppiMerceologici().read();
	}
	private static List<SottogruppoMerceologico> loadSottogruppoMerceologico() throws ClassNotFoundException, SQLException{
		return new ReadSottogruppoMerceologico().read();
	}
	private static List<StabileOrganizzazione> loadStabileOrganizzazione() throws ClassNotFoundException, SQLException{
		return new ReadStabileOrganizzazione().read();
	}
	private static List<StatoFattura> loadStatoFattura() throws ClassNotFoundException, SQLException{
		return new ReadStatoFattura().read();
	}
	private static List<Telefono> loadTelefono() throws ClassNotFoundException, SQLException{
		return new ReadTelefono().read();
	}
	private static List<TerzoIntermediario> loadTerzoIntermediario() throws ClassNotFoundException, SQLException{
		return new ReadTerzoIntermediario().read();
	}
	private static List<TipoBento> loadTipoBento() throws ClassNotFoundException, SQLException{
		return new ReadTipoBento().read();
	}
	private static List<TipoCliente> loadTipoCliente() throws ClassNotFoundException, SQLException{
		return new ReadTipoCliente().read();
	}
	private static List<TipoIndirizzo> loadTipoIndirizzo() throws ClassNotFoundException, SQLException{
		return new ReadTipoIndirizzo().read();
	}
	private static List<TipoMagazzino> loadTipoMagazzino() throws ClassNotFoundException, SQLException{
		return new ReadTipoMagazzino().read();
	}
	private static List<TipoPagamento> loadTipoPagamento() throws ClassNotFoundException, SQLException{
		return new ReadTipoPagamento().read();
	}
	private static List<TipoRigaDocumento> loadTipoRigaDocumento() throws ClassNotFoundException, SQLException{
		return new ReadTipoRigaDocumento().read();
	}
	private static List<UnitaMisura> loadUnitaMisura() throws ClassNotFoundException, SQLException{
		return new ReadUnitaMisura().read();
	}
	private static List<Utente> loadUtente() throws ClassNotFoundException, SQLException{
		return new ReadUtente().read();
	}
	private static List<Vettore> loadVettore() throws ClassNotFoundException, SQLException{
		return new ReadVettore().read();
	}
	
	
	
	public void add(Agente agente) throws ClassNotFoundException, SQLException {
		List<Agente> agenti = loadAgente();
		if (!agenti.contains(agente)) {
			agenti.add(agente);
			try {
				new WriteAgente().add(agente, false);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		else {
			//Alert gia' presente
		}
	}
	
	public void add(Banca banca) throws ClassNotFoundException, SQLException {
		List<Banca> banche = loadBanca();
		if (!banche.contains(banca)) {
			banche.add(banca);
			try {
				new WriteBanca().add(banca, false);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			//Alert gia' presente
		}
	}
}
