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
import invoicemanager.persistence.fatturazione.*;

public final class DataManager {
	
	public static List<Listino> loadListino() throws ClassNotFoundException, SQLException {
		List<Listino> listini = new ArrayList<>();
		listini.addAll(loadListinoArticolo());
		listini.addAll(loadListinoPersonalizzato());
		return listini;
	}
	
	public static List<Agente> loadAgente() throws ClassNotFoundException, SQLException{
		return new ReadAgente().read(loadControparte());
	}
	public static List<Allegato> loadAllegato() throws ClassNotFoundException, SQLException{
		return new ReadAllegato().read();
	}
	public static List<AltroDatoGestionale> loadAltroDatoGestionale() throws ClassNotFoundException, SQLException{
		return new ReadAltroDatoGestionale().read();
	}
	public static List<AreaGeografica> loadAreaGeografica() throws ClassNotFoundException, SQLException{
		return new ReadAreaGeografica().read();
	}
	public static List<ArticoloMagazzinoDescrizioneMultilingua> loadArticoloMagazzinoDescrizioneMultilingua() throws ClassNotFoundException, SQLException{
		return new ReadArticoloMagazzinoDescrizioneMultilingua().read();
	}
	public static List<ArticoloMagazzino> loadArticoloMagazzino() throws ClassNotFoundException, SQLException{
		return new ReadArticoloMagazzino().read();
	}
	public static List<BancaGlobale> loadBancaGlobale() throws ClassNotFoundException, SQLException{
		return new ReadBancaGlobale().read();
	}
	public static List<Banca> loadBanca() throws ClassNotFoundException, SQLException{
		return new ReadBanca().read(Stato.values());
	}
	public static List<BentoDettaglio> loadBentoDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadBentoDettaglio().read(loadTipoBento(), loadUnitaMisura(), loadIva(), loadControparte(), loadMagazzino(), loadCausaleMagazzino());
	}
	public static List<BentoTestata> loadBentoTestata() throws ClassNotFoundException, SQLException{
		return new ReadBentoTestata().read();
	}
	public static List<CapItaliano> loadCapItaliano() throws ClassNotFoundException, SQLException{
		return new ReadCapItaliano().read();
	}
	public static List<CausaleMagazzino> loadCausaleMagazzino() throws ClassNotFoundException, SQLException{
		return new ReadCausaleMagazzino().read();
	}
	public static List<Cliente> loadCliente() throws ClassNotFoundException, SQLException{
		return new ReadCliente().read(loadTipoCliente(), loadResaMerce(), loadImballo(), loadRaggruppamentoClienteFornitore(), loadPagamento(), loadBanca(), 
				loadIva(), loadAgente(), loadVettore(), loadIso(), loadStabileOrganizzazione(), loadRappresentanteFiscale(), loadTerzoIntermediario());
	}
	public static List<CodiceABarre> loadCodiceABarre() throws ClassNotFoundException, SQLException{
		return new ReadCodiceABarre().read();
	}
	public static List<Confezione> loadConfezione() throws ClassNotFoundException, SQLException{
		return new ReadConfezione().read();
	}
	public static List<Contratto> loadContratto() throws ClassNotFoundException, SQLException{
		return new ReadContratto().read();
	}
	public static List<Controparte> loadControparte() throws ClassNotFoundException, SQLException{
		return new ReadControparte().read();
	}
	public static List<Convenzione> loadConvenzione() throws ClassNotFoundException, SQLException{
		return new ReadConvenzione().read();
	}
	public static List<DdtDettaglio> loadDdtDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadDdtDettaglio().read();
	}
	public static List<DdtTestata> loadDdtTestata() throws ClassNotFoundException, SQLException{
		return new ReadDdtTestata().read(loadDdtDettaglio());
	}
	public static List<FatturaCollegata> loadFatturaCollegata() throws ClassNotFoundException, SQLException{
		return new ReadFatturaCollegata().read();
	}
	public static List<FatturaDettaglio> loadFatturaDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadFatturaDettaglio().read(loadOrdine(), loadContratto(), loadConvenzione(), loadRicezione(), loadFatturaCollegata(), loadAltroDatoGestionale());
	}
	public static List<FatturaProformaDettaglio> loadFatturaProformaDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadFatturaProformaDettaglio().read(loadOrdine(), loadContratto(), loadConvenzione(), loadRicezione(), loadFatturaCollegata(), loadAltroDatoGestionale());
	}
	public static List<FatturaProformaTestata> loadFatturaProformaTestata() throws ClassNotFoundException, SQLException{
		return new ReadFatturaProformaTestata().read();
	}
	public static List<FatturaTestata> loadFatturaTestata() throws ClassNotFoundException, SQLException{
		return new ReadFatturaTestata().read(StatoAvanzamento.values(), loadFatturaDettaglio(), loadAllegato());
	}
	public static List<Gruppo> loadGruppo() throws ClassNotFoundException, SQLException{
		return new ReadGruppo().read();
	}
	public static List<GruppoMerceologico> loadGruppoMerceologico() throws ClassNotFoundException, SQLException{
		return new ReadGruppoMerceologico().read();
	}
	public static List<Imballo> loadImballo() throws ClassNotFoundException, SQLException{
		return new ReadImballo().read();
	}
	public static List<IndirizzoGeografico> loadIndirizzoGeografico() throws ClassNotFoundException, SQLException{
		return new ReadIndirizzoGeografico().read();
	}
	public static List<Iso> loadIso() throws ClassNotFoundException, SQLException{
		return new ReadIso().read();
	}
	public static List<Iva> loadIva() throws ClassNotFoundException, SQLException{
		return new ReadIva().read();
	}
	public static List<ListinoArticolo> loadListinoArticolo() throws ClassNotFoundException, SQLException{
		return new ReadListinoArticolo().read();
	}
	public static List<ListinoPersonalizzato> loadListinoPersonalizzato() throws ClassNotFoundException, SQLException{
		return new ReadListinoPersonalizzato().read(loadGruppoMerceologico());
	}
	public static List<Magazzino> loadMagazzino() throws ClassNotFoundException, SQLException{
		return new ReadMagazzino().read();
	}
	public static List<OrdineDettaglio> loadOrdineDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadOrdineDettaglio().read();
	}
	public static List<Ordine> loadOrdine() throws ClassNotFoundException, SQLException{
		return new ReadOrdine().read();
	}
	public static List<OrdineTestata> loadOrdineTestata() throws ClassNotFoundException, SQLException{
		return new ReadOrdineTestata().read(StatoAvanzamento.values(), loadOrdineDettaglio());
	}
	public static List<Pagamento> loadPagamento() throws ClassNotFoundException, SQLException{
		return new ReadPagamento().read(loadTipoPagamento());
	}
	public static List<Percipiente> loadPercipiente() throws ClassNotFoundException, SQLException{
		return new ReadPercipiente().read();
	}
	public static List<PianoConto> loadPianoConto() throws ClassNotFoundException, SQLException{
		return new ReadPianoConto().read();
	}
	public static List<PreventivoDettaglio> loadPreventivoDettaglio() throws ClassNotFoundException, SQLException{
		return new ReadPreventivoDettaglio().read();
	}
	public static List<PreventivoTestata> loadPreventivoTestata() throws ClassNotFoundException, SQLException{
		return new ReadPreventivoTestata().read();
	}
	public static List<Prezzo> loadPrezzo() throws ClassNotFoundException, SQLException{
		return new ReadPrezzo().read();
	}
	public static List<ProvvigioneAgente> loadProvvigioneAgente() throws ClassNotFoundException, SQLException{
		return new ReadProvvigioneAgente().read();
	}
	public static List<RaggruppamentoClienteFornitore> loadRaggruppamentoClienteFornitore() throws ClassNotFoundException, SQLException{
		return new ReadRaggruppamentoClienteFornitore().read();
	}
	public static List<RappresentanteFiscale> loadRappresentanteFiscale() throws ClassNotFoundException, SQLException{
		return new ReadRappresentanteFiscale().read();
	}
	public static List<ResaMerce> loadResaMerce() throws ClassNotFoundException, SQLException{
		return new ReadResaMerce().read();
	}
	public static List<Ricezione> loadRicezione() throws ClassNotFoundException, SQLException{
		return new ReadRicezione().read();
	}
	public static List<ScadenzaPagamenti> loadScadenzaPagamenti() throws ClassNotFoundException, SQLException{
		return new ReadScadenzaPagamenti().read();
	}
	public static List<Scadenze> loadScadenze() throws ClassNotFoundException, SQLException{
		return new ReadScadenze().read();
	}
	public static List<SottogruppiMerceologici> loadSottogruppiMerceologici() throws ClassNotFoundException, SQLException{
		return new ReadSottogruppiMerceologici().read();
	}
	public static List<SottogruppoMerceologico> loadSottogruppoMerceologico() throws ClassNotFoundException, SQLException{
		return new ReadSottogruppoMerceologico().read();
	}
	public static List<StabileOrganizzazione> loadStabileOrganizzazione() throws ClassNotFoundException, SQLException{
		return new ReadStabileOrganizzazione().read();
	}
	public static List<StatoFattura> loadStatoFattura() throws ClassNotFoundException, SQLException{
		return new ReadStatoFattura().read();
	}
	public static List<Telefono> loadTelefono() throws ClassNotFoundException, SQLException{
		return new ReadTelefono().read();
	}
	public static List<TerzoIntermediario> loadTerzoIntermediario() throws ClassNotFoundException, SQLException{
		return new ReadTerzoIntermediario().read();
	}
	public static List<TipoBento> loadTipoBento() throws ClassNotFoundException, SQLException{
		return new ReadTipoBento().read();
	}
	public static List<TipoCliente> loadTipoCliente() throws ClassNotFoundException, SQLException{
		return new ReadTipoCliente().read();
	}
	public static List<TipoIndirizzo> loadTipoIndirizzo() throws ClassNotFoundException, SQLException{
		return new ReadTipoIndirizzo().read();
	}
	public static List<TipoMagazzino> loadTipoMagazzino() throws ClassNotFoundException, SQLException{
		return new ReadTipoMagazzino().read();
	}
	public static List<TipoPagamento> loadTipoPagamento() throws ClassNotFoundException, SQLException{
		return new ReadTipoPagamento().read();
	}
	public static List<TipoRigaDocumento> loadTipoRigaDocumento() throws ClassNotFoundException, SQLException{
		return new ReadTipoRigaDocumento().read();
	}
	public static List<UnitaMisura> loadUnitaMisura() throws ClassNotFoundException, SQLException{
		return new ReadUnitaMisura().read();
	}
	public static List<Utente> loadUtente() throws ClassNotFoundException, SQLException{
		return new ReadUtente().read();
	}
	public static List<Vettore> loadVettore() throws ClassNotFoundException, SQLException{
		return new ReadVettore().read();
	}
	
	
	
	public static void add(Agente agente) throws ClassNotFoundException, SQLException{
		List<Agente> listAgente = loadAgente();
		if(!listAgente.contains(agente)) {
			new WriteAgente().add(agente, false);
		}
	}
	public static void add(Allegato allegato) throws ClassNotFoundException, SQLException{
		List<Allegato> listAllegato = loadAllegato();
		if(!listAllegato.contains(allegato)) {
			new WriteAllegato().add(allegato, false);
		}
	}
	public static void add(AltroDatoGestionale altroDatoGestionale) throws ClassNotFoundException, SQLException{
		List<AltroDatoGestionale> listAltroDatoGestionale = loadAltroDatoGestionale();
		if(!listAltroDatoGestionale.contains(altroDatoGestionale)) {
			new WriteAltroDatoGestionale().add(altroDatoGestionale, false);
		}
	}
	public static void add(AreaGeografica areaGeografica) throws ClassNotFoundException, SQLException{
		List<AreaGeografica> listAreaGeografica = loadAreaGeografica();
		if(!listAreaGeografica.contains(areaGeografica)) {
			new WriteAreaGeografica().add(areaGeografica, false);
		}
	}
	public static void add(ArticoloMagazzinoDescrizioneMultilingua articoloMagazzinoDescrizioneMultilingua) throws ClassNotFoundException, SQLException{
		List<ArticoloMagazzinoDescrizioneMultilingua> listArticoloMagazzinoDescrizioneMultilingua = loadArticoloMagazzinoDescrizioneMultilingua();
		if(!listArticoloMagazzinoDescrizioneMultilingua.contains(articoloMagazzinoDescrizioneMultilingua)) {
			new WriteArticoloMagazzinoDescrizioneMultilingua().add(articoloMagazzinoDescrizioneMultilingua, false);
		}
	}
	public static void add(ArticoloMagazzino articoloMagazzino) throws ClassNotFoundException, SQLException{
		List<ArticoloMagazzino> listArticoloMagazzino = loadArticoloMagazzino();
		if(!listArticoloMagazzino.contains(articoloMagazzino)) {
			new WriteArticoloMagazzino().add(articoloMagazzino, false);
		}
	}
	public static void add(BancaGlobale bancaGlobale) throws ClassNotFoundException, SQLException{
		List<BancaGlobale> listBancaGlobale = loadBancaGlobale();
		if(!listBancaGlobale.contains(bancaGlobale)) {
			new WriteBancaGlobale().add(bancaGlobale, false);
		}
	}
	public static void add(Banca banca) throws ClassNotFoundException, SQLException{
		List<Banca> listBanca = loadBanca();
		if(!listBanca.contains(banca)) {
			new WriteBanca().add(banca, false);
		}
	}
	public static void add(BentoDettaglio bentoDettaglio) throws ClassNotFoundException, SQLException{
		List<BentoDettaglio> listBentoDettaglio = loadBentoDettaglio();
		if(!listBentoDettaglio.contains(bentoDettaglio)) {
			new WriteBentoDettaglio().add(bentoDettaglio, false);
		}
	}
	public static void add(BentoTestata bentoTestata) throws ClassNotFoundException, SQLException{
		List<BentoTestata> listBentoTestata = loadBentoTestata();
		if(!listBentoTestata.contains(bentoTestata)) {
			new WriteBentoTestata().add(bentoTestata, false);
		}
	}
	public static void add(CapItaliano capItaliano) throws ClassNotFoundException, SQLException{
		List<CapItaliano> listCapItaliano = loadCapItaliano();
		if(!listCapItaliano.contains(capItaliano)) {
			new WriteCapItaliano().add(capItaliano, false);
		}
	}
	public static void add(CausaleMagazzino causaleMagazzino) throws ClassNotFoundException, SQLException{
		List<CausaleMagazzino> listCausaleMagazzino = loadCausaleMagazzino();
		if(!listCausaleMagazzino.contains(causaleMagazzino)) {
			new WriteCausaleMagazzino().add(causaleMagazzino, false);
		}
	}
	public static void add(Cliente cliente) throws ClassNotFoundException, SQLException{
		List<Cliente> listCliente = loadCliente();
		if(!listCliente.contains(cliente)) {
			new WriteCliente().add(cliente, false, loadTipoCliente());
		}
	}
	public static void add(CodiceABarre codiceABarre) throws ClassNotFoundException, SQLException{
		List<CodiceABarre> listCodiceABarre = loadCodiceABarre();
		if(!listCodiceABarre.contains(codiceABarre)) {
			new WriteCodiceABarre().add(codiceABarre, false);
		}
	}
	public static void add(Confezione confezione) throws ClassNotFoundException, SQLException{
		List<Confezione> listConfezione = loadConfezione();
		if(!listConfezione.contains(confezione)) {
			new WriteConfezione().add(confezione, false);
		}
	}
	public static void add(Contratto contratto) throws ClassNotFoundException, SQLException{
		List<Contratto> listContratto = loadContratto();
		if(!listContratto.contains(contratto)) {
			new WriteContratto().add(contratto, false);
		}
	}
	public static void add(Controparte controparte) throws ClassNotFoundException, SQLException{
		List<Controparte> listControparte = loadControparte();
		if(!listControparte.contains(controparte)) {
			new WriteControparte().add(controparte, false);
		}
	}
	public static void add(Convenzione convenzione) throws ClassNotFoundException, SQLException{
		List<Convenzione> listConvenzione = loadConvenzione();
		if(!listConvenzione.contains(convenzione)) {
			new WriteConvenzione().add(convenzione, false);
		}
	}
	public static void add(DdtDettaglio ddtDettaglio) throws ClassNotFoundException, SQLException{
		List<DdtDettaglio> listDdtDettaglio = loadDdtDettaglio();
		if(!listDdtDettaglio.contains(ddtDettaglio)) {
			new WriteDdtDettaglio().add(ddtDettaglio, false);
		}
	}
	public static void add(DdtTestata ddtTestata) throws ClassNotFoundException, SQLException{
		List<DdtTestata> listDdtTestata = loadDdtTestata();
		if(!listDdtTestata.contains(ddtTestata)) {
			new WriteDdtTestata().add(ddtTestata, false);
		}
	}
	public static void add(FatturaCollegata fatturaCollegata) throws ClassNotFoundException, SQLException{
		List<FatturaCollegata> listFatturaCollegata = loadFatturaCollegata();
		if(!listFatturaCollegata.contains(fatturaCollegata)) {
			new WriteFatturaCollegata().add(fatturaCollegata, false);
		}
	}
	public static void add(FatturaDettaglio fatturaDettaglio) throws ClassNotFoundException, SQLException{
		List<FatturaDettaglio> listFatturaDettaglio = loadFatturaDettaglio();
		if(!listFatturaDettaglio.contains(fatturaDettaglio)) {
			new WriteFatturaDettaglio().add(fatturaDettaglio, false);
		}
	}
	public static void add(FatturaProformaDettaglio fatturaProformaDettaglio) throws ClassNotFoundException, SQLException{
		List<FatturaProformaDettaglio> listFatturaProformaDettaglio = loadFatturaProformaDettaglio();
		if(!listFatturaProformaDettaglio.contains(fatturaProformaDettaglio)) {
			new WriteFatturaProformaDettaglio().add(fatturaProformaDettaglio, false);
		}
	}
	public static void add(FatturaProformaTestata fatturaProformaTestata) throws ClassNotFoundException, SQLException{
		List<FatturaProformaTestata> listFatturaProformaTestata = loadFatturaProformaTestata();
		if(!listFatturaProformaTestata.contains(fatturaProformaTestata)) {
			new WriteFatturaProformaTestata().add(fatturaProformaTestata, false);
		}
	}
	public static void add(FatturaTestata fatturaTestata) throws ClassNotFoundException, SQLException{
		List<FatturaTestata> listFatturaTestata = loadFatturaTestata();
		if(!listFatturaTestata.contains(fatturaTestata)) {
			new WriteFatturaTestata().add(fatturaTestata, false);
		}
	}
	public static void add(Gruppo gruppo) throws ClassNotFoundException, SQLException{
		List<Gruppo> listGruppo = loadGruppo();
		if(!listGruppo.contains(gruppo)) {
			new WriteGruppo().add(gruppo, false);
		}
	}
	public static void add(GruppoMerceologico gruppoMerceologico) throws ClassNotFoundException, SQLException{
		List<GruppoMerceologico> listGruppoMerceologico = loadGruppoMerceologico();
		if(!listGruppoMerceologico.contains(gruppoMerceologico)) {
			new WriteGruppoMerceologico().add(gruppoMerceologico, false);
		}
	}
	public static void add(Imballo imballo) throws ClassNotFoundException, SQLException{
		List<Imballo> listImballo = loadImballo();
		if(!listImballo.contains(imballo)) {
			new WriteImballo().add(imballo, false);
		}
	}
	public static void add(IndirizzoGeografico indirizzoGeografico) throws ClassNotFoundException, SQLException{
		List<IndirizzoGeografico> listIndirizzoGeografico = loadIndirizzoGeografico();
		if(!listIndirizzoGeografico.contains(indirizzoGeografico)) {
			new WriteIndirizzoGeografico().add(indirizzoGeografico, false);
		}
	}
	public static void add(Iso iso) throws ClassNotFoundException, SQLException{
		List<Iso> listIso = loadIso();
		if(!listIso.contains(iso)) {
			new WriteIso().add(iso, false);
		}
	}
	public static void add(Iva iva) throws ClassNotFoundException, SQLException{
		List<Iva> listIva = loadIva();
		if(!listIva.contains(iva)) {
			new WriteIva().add(iva, false);
		}
	}
	public static void add(ListinoArticolo listinoArticolo) throws ClassNotFoundException, SQLException{
		List<ListinoArticolo> listListinoArticolo = loadListinoArticolo();
		if(!listListinoArticolo.contains(listinoArticolo)) {
			new WriteListinoArticolo().add(listinoArticolo, false);
		}
	}
	public static void add(Listino listino) throws ClassNotFoundException, SQLException{
		List<Listino> listListino = loadListino();
		if(!listListino.contains(listino)) {
			new WriteListino().add(listino, false);
		}
	}
	public static void add(ListinoPersonalizzato listinoPersonalizzato) throws ClassNotFoundException, SQLException{
		List<ListinoPersonalizzato> listListinoPersonalizzato = loadListinoPersonalizzato();
		if(!listListinoPersonalizzato.contains(listinoPersonalizzato)) {
			new WriteListinoPersonalizzato().add(listinoPersonalizzato, false);
		}
	}
	public static void add(Magazzino magazzino) throws ClassNotFoundException, SQLException{
		List<Magazzino> listMagazzino = loadMagazzino();
		if(!listMagazzino.contains(magazzino)) {
			new WriteMagazzino().add(magazzino, false);
		}
	}
	public static void add(OrdineDettaglio ordineDettaglio) throws ClassNotFoundException, SQLException{
		List<OrdineDettaglio> listOrdineDettaglio = loadOrdineDettaglio();
		if(!listOrdineDettaglio.contains(ordineDettaglio)) {
			new WriteOrdineDettaglio().add(ordineDettaglio, false);
		}
	}
	public static void add(Ordine ordine) throws ClassNotFoundException, SQLException{
		List<Ordine> listOrdine = loadOrdine();
		if(!listOrdine.contains(ordine)) {
			new WriteOrdine().add(ordine, false);
		}
	}
	public static void add(OrdineTestata ordineTestata) throws ClassNotFoundException, SQLException{
		List<OrdineTestata> listOrdineTestata = loadOrdineTestata();
		if(!listOrdineTestata.contains(ordineTestata)) {
			new WriteOrdineTestata().add(ordineTestata, false);
		}
	}
	public static void add(Pagamento pagamento) throws ClassNotFoundException, SQLException{
		List<Pagamento> listPagamento = loadPagamento();
		if(!listPagamento.contains(pagamento)) {
			new WritePagamento().add(pagamento, false);
		}
	}
	public static void add(Percipiente percipiente) throws ClassNotFoundException, SQLException{
		List<Percipiente> listPercipiente = loadPercipiente();
		if(!listPercipiente.contains(percipiente)) {
			new WritePercipiente().add(percipiente, false);
		}
	}
	public static void add(PianoConto pianoConto) throws ClassNotFoundException, SQLException{
		List<PianoConto> listPianoConto = loadPianoConto();
		if(!listPianoConto.contains(pianoConto)) {
			new WritePianoConto().add(pianoConto, false);
		}
	}
	public static void add(PreventivoDettaglio preventivoDettaglio) throws ClassNotFoundException, SQLException{
		List<PreventivoDettaglio> listPreventivoDettaglio = loadPreventivoDettaglio();
		if(!listPreventivoDettaglio.contains(preventivoDettaglio)) {
			new WritePreventivoDettaglio().add(preventivoDettaglio, false);
		}
	}
	public static void add(PreventivoTestata preventivoTestata) throws ClassNotFoundException, SQLException{
		List<PreventivoTestata> listPreventivoTestata = loadPreventivoTestata();
		if(!listPreventivoTestata.contains(preventivoTestata)) {
			new WritePreventivoTestata().add(preventivoTestata, false);
		}
	}
	public static void add(Prezzo prezzo) throws ClassNotFoundException, SQLException{
		List<Prezzo> listPrezzo = loadPrezzo();
		if(!listPrezzo.contains(prezzo)) {
			new WritePrezzo().add(prezzo, false);
		}
	}
	public static void add(ProvvigioneAgente provvigioneAgente) throws ClassNotFoundException, SQLException{
		List<ProvvigioneAgente> listProvvigioneAgente = loadProvvigioneAgente();
		if(!listProvvigioneAgente.contains(provvigioneAgente)) {
			new WriteProvvigioneAgente().add(provvigioneAgente, false);
		}
	}
	public static void add(RaggruppamentoClienteFornitore raggruppamentoClienteFornitore) throws ClassNotFoundException, SQLException{
		List<RaggruppamentoClienteFornitore> listRaggruppamentoClienteFornitore = loadRaggruppamentoClienteFornitore();
		if(!listRaggruppamentoClienteFornitore.contains(raggruppamentoClienteFornitore)) {
			new WriteRaggruppamentoClienteFornitore().add(raggruppamentoClienteFornitore, false);
		}
	}
	public static void add(RappresentanteFiscale rappresentanteFiscale) throws ClassNotFoundException, SQLException{
		List<RappresentanteFiscale> listRappresentanteFiscale = loadRappresentanteFiscale();
		if(!listRappresentanteFiscale.contains(rappresentanteFiscale)) {
			new WriteRappresentanteFiscale().add(rappresentanteFiscale, false);
		}
	}
	public static void add(ResaMerce resaMerce) throws ClassNotFoundException, SQLException{
		List<ResaMerce> listResaMerce = loadResaMerce();
		if(!listResaMerce.contains(resaMerce)) {
			new WriteResaMerce().add(resaMerce, false);
		}
	}
	public static void add(Ricezione ricezione) throws ClassNotFoundException, SQLException{
		List<Ricezione> listRicezione = loadRicezione();
		if(!listRicezione.contains(ricezione)) {
			new WriteRicezione().add(ricezione, false);
		}
	}
	public static void add(Scadenze scadenze) throws ClassNotFoundException, SQLException{
		List<Scadenze> listScadenze = loadScadenze();
		if(!listScadenze.contains(scadenze)) {
			new WriteScadenze().add(scadenze, false);
		}
	}
	public static void add(SottogruppiMerceologici sottogruppiMerceologici) throws ClassNotFoundException, SQLException{
		List<SottogruppiMerceologici> listSottogruppiMerceologici = loadSottogruppiMerceologici();
		if(!listSottogruppiMerceologici.contains(sottogruppiMerceologici)) {
			new WriteSottogruppiMerceologici().add(sottogruppiMerceologici, false);
		}
	}
	public static void add(SottogruppoMerceologico sottogruppoMerceologico) throws ClassNotFoundException, SQLException{
		List<SottogruppoMerceologico> listSottogruppoMerceologico = loadSottogruppoMerceologico();
		if(!listSottogruppoMerceologico.contains(sottogruppoMerceologico)) {
			new WriteSottogruppoMerceologico().add(sottogruppoMerceologico, false);
		}
	}
	public static void add(StabileOrganizzazione stabileOrganizzazione) throws ClassNotFoundException, SQLException{
		List<StabileOrganizzazione> listStabileOrganizzazione = loadStabileOrganizzazione();
		if(!listStabileOrganizzazione.contains(stabileOrganizzazione)) {
			new WriteStabileOrganizzazione().add(stabileOrganizzazione, false);
		}
	}

	public static void add(StatoFattura statoFattura) throws ClassNotFoundException, SQLException{
		List<StatoFattura> listStatoFattura = loadStatoFattura();
		if(!listStatoFattura.contains(statoFattura)) {
			new WriteStatoFattura().add(statoFattura, false);
		}
	}
	public static void add(Telefono telefono) throws ClassNotFoundException, SQLException{
		List<Telefono> listTelefono = loadTelefono();
		if(!listTelefono.contains(telefono)) {
			new WriteTelefono().add(telefono, false);
		}
	}
	public static void add(TerzoIntermediario terzoIntermediario) throws ClassNotFoundException, SQLException{
		List<TerzoIntermediario> listTerzoIntermediario = loadTerzoIntermediario();
		if(!listTerzoIntermediario.contains(terzoIntermediario)) {
			new WriteTerzoIntermediario().add(terzoIntermediario, false);
		}
	}
	public static void add(TipoBento tipoBento) throws ClassNotFoundException, SQLException{
		List<TipoBento> listTipoBento = loadTipoBento();
		if(!listTipoBento.contains(tipoBento)) {
			new WriteTipoBento().add(tipoBento, false);
		}
	}
	public static void add(TipoCliente tipoCliente) throws ClassNotFoundException, SQLException{
		List<TipoCliente> listTipoCliente = loadTipoCliente();
		if(!listTipoCliente.contains(tipoCliente)) {
			new WriteTipoCliente().add(tipoCliente, false);
		}
	}
	public static void add(TipoIndirizzo tipoIndirizzo) throws ClassNotFoundException, SQLException{
		List<TipoIndirizzo> listTipoIndirizzo = loadTipoIndirizzo();
		if(!listTipoIndirizzo.contains(tipoIndirizzo)) {
			new WriteTipoIndirizzo().add(tipoIndirizzo, false);
		}
	}
	public static void add(TipoMagazzino tipoMagazzino) throws ClassNotFoundException, SQLException{
		List<TipoMagazzino> listTipoMagazzino = loadTipoMagazzino();
		if(!listTipoMagazzino.contains(tipoMagazzino)) {
			new WriteTipoMagazzino().add(tipoMagazzino, false);
		}
	}
	public static void add(TipoPagamento tipoPagamento) throws ClassNotFoundException, SQLException{
		List<TipoPagamento> listTipoPagamento = loadTipoPagamento();
		if(!listTipoPagamento.contains(tipoPagamento)) {
			new WriteTipoPagamento().add(tipoPagamento, false);
		}
	}
	public static void add(TipoRigaDocumento tipoRigaDocumento) throws ClassNotFoundException, SQLException{
		List<TipoRigaDocumento> listTipoRigaDocumento = loadTipoRigaDocumento();
		if(!listTipoRigaDocumento.contains(tipoRigaDocumento)) {
			new WriteTipoRigaDocumento().add(tipoRigaDocumento, false);
		}
	}
	public static void add(UnitaMisura unitaMisura) throws ClassNotFoundException, SQLException{
		List<UnitaMisura> listUnitaMisura = loadUnitaMisura();
		if(!listUnitaMisura.contains(unitaMisura)) {
			new WriteUnitaMisura().add(unitaMisura, false);
		}
	}
	public static void add(Utente utente) throws ClassNotFoundException, SQLException{
		List<Utente> listUtente = loadUtente();
		if(!listUtente.contains(utente)) {
			new WriteUtente().add(utente, false);
		}
	}
	public static void add(Vettore vettore) throws ClassNotFoundException, SQLException{
		List<Vettore> listVettore = loadVettore();
		if(!listVettore.contains(vettore)) {
			new WriteVettore().add(vettore, false);
		}
	}
}
