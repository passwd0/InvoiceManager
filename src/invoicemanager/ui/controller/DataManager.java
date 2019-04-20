package invoicemanager.ui.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import invoicemanager.model.Agente;
import invoicemanager.model.Allegato;
import invoicemanager.model.AltroDatoGestionale;
import invoicemanager.model.AreaGeografica;
import invoicemanager.model.ArticoloMagazzino;
import invoicemanager.model.ArticoloMagazzinoDescrizioneMultilingua;
import invoicemanager.model.Banca;
import invoicemanager.model.BancaGlobale;
import invoicemanager.model.BentoDettaglio;
import invoicemanager.model.BentoTestata;
import invoicemanager.model.CapItaliano;
import invoicemanager.model.CausaleMagazzino;
import invoicemanager.model.Cliente;
import invoicemanager.model.CodiceABarre;
import invoicemanager.model.Confezione;
import invoicemanager.model.Contatto;
import invoicemanager.model.Contratto;
import invoicemanager.model.Controparte;
import invoicemanager.model.Convenzione;
import invoicemanager.model.DdtDettaglio;
import invoicemanager.model.DdtTestata;
import invoicemanager.model.FatturaCollegata;
import invoicemanager.model.FatturaDettaglio;
import invoicemanager.model.FatturaProformaDettaglio;
import invoicemanager.model.FatturaProformaTestata;
import invoicemanager.model.FatturaTestata;
import invoicemanager.model.Gruppo;
import invoicemanager.model.GruppoMerceologico;
import invoicemanager.model.Imballo;
import invoicemanager.model.IndirizzoGeografico;
import invoicemanager.model.Iso;
import invoicemanager.model.Iva;
import invoicemanager.model.Listino;
import invoicemanager.model.ListinoArticolo;
import invoicemanager.model.ListinoPersonalizzato;
import invoicemanager.model.Magazzino;
import invoicemanager.model.Ordine;
import invoicemanager.model.OrdineDettaglio;
import invoicemanager.model.OrdineTestata;
import invoicemanager.model.Pagamento;
import invoicemanager.model.Percipiente;
import invoicemanager.model.PianoConto;
import invoicemanager.model.PreventivoDettaglio;
import invoicemanager.model.PreventivoTestata;
import invoicemanager.model.Prezzo;
import invoicemanager.model.ProvvigioneAgente;
import invoicemanager.model.RaggruppamentoClienteFornitore;
import invoicemanager.model.RappresentanteFiscale;
import invoicemanager.model.ResaMerce;
import invoicemanager.model.Ricezione;
import invoicemanager.model.ScadenzaPagamenti;
import invoicemanager.model.Scadenze;
import invoicemanager.model.SottogruppoMerceologico;
import invoicemanager.model.StabileOrganizzazione;
import invoicemanager.model.Stato;
import invoicemanager.model.StatoAvanzamento;
import invoicemanager.model.StatoFattura;
import invoicemanager.model.TerzoIntermediario;
import invoicemanager.model.TipoBento;
import invoicemanager.model.TipoCliente;
import invoicemanager.model.TipoIndirizzo;
import invoicemanager.model.TipoMagazzino;
import invoicemanager.model.TipoPagamento;
import invoicemanager.model.TipoRigaDocumento;
import invoicemanager.model.UnitaMisura;
import invoicemanager.model.Utente;
import invoicemanager.model.Vettore;
import invoicemanager.persistence.AgenteDao;
import invoicemanager.persistence.AllegatoDao;
import invoicemanager.persistence.AltroDatoGestionaleDao;
import invoicemanager.persistence.AreaGeograficaDao;
import invoicemanager.persistence.ArticoloMagazzinoDao;
import invoicemanager.persistence.ArticoloMagazzinoDescrizioneMultilinguaDao;
import invoicemanager.persistence.BancaDao;
import invoicemanager.persistence.BancaGlobaleDao;
import invoicemanager.persistence.BentoDettaglioDao;
import invoicemanager.persistence.BentoTestataDao;
import invoicemanager.persistence.CapItalianoDao;
import invoicemanager.persistence.CausaleMagazzinoDao;
import invoicemanager.persistence.ClienteDao;
import invoicemanager.persistence.CodiceABarreDao;
import invoicemanager.persistence.ConfezioneDao;
import invoicemanager.persistence.ConnectionFactory;
import invoicemanager.persistence.ContattoDao;
import invoicemanager.persistence.ContrattoDao;
import invoicemanager.persistence.ControparteDao;
import invoicemanager.persistence.ConvenzioneDao;
import invoicemanager.persistence.DdtDettaglioDao;
import invoicemanager.persistence.DdtTestataDao;
import invoicemanager.persistence.FatturaCollegataDao;
import invoicemanager.persistence.FatturaDettaglioDao;
import invoicemanager.persistence.FatturaProformaDettaglioDao;
import invoicemanager.persistence.FatturaProformaTestataDao;
import invoicemanager.persistence.FatturaTestataDao;
import invoicemanager.persistence.GruppoDao;
import invoicemanager.persistence.GruppoMerceologicoDao;
import invoicemanager.persistence.ImballoDao;
import invoicemanager.persistence.IndirizzoGeograficoDao;
import invoicemanager.persistence.IsoDao;
import invoicemanager.persistence.IvaDao;
import invoicemanager.persistence.ListinoArticoloDao;
import invoicemanager.persistence.ListinoPersonalizzatoDao;
import invoicemanager.persistence.MagazzinoDao;
import invoicemanager.persistence.OrdineDao;
import invoicemanager.persistence.OrdineDettaglioDao;
import invoicemanager.persistence.OrdineTestataDao;
import invoicemanager.persistence.PagamentoDao;
import invoicemanager.persistence.PercipienteDao;
import invoicemanager.persistence.PianoContoDao;
import invoicemanager.persistence.PreventivoDettaglioDao;
import invoicemanager.persistence.PreventivoTestataDao;
import invoicemanager.persistence.PrezzoDao;
import invoicemanager.persistence.ProvvigioneAgenteDao;
import invoicemanager.persistence.RaggruppamentoClienteFornitoreDao;
import invoicemanager.persistence.RappresentanteFiscaleDao;
import invoicemanager.persistence.ResaMerceDao;
import invoicemanager.persistence.RicezioneDao;
import invoicemanager.persistence.ScadenzaPagamentiDao;
import invoicemanager.persistence.ScadenzeDao;
import invoicemanager.persistence.SottogruppoMerceologicoDao;
import invoicemanager.persistence.StabileOrganizzazioneDao;
import invoicemanager.persistence.StatoFatturaDao;
import invoicemanager.persistence.TerzoIntermediarioDao;
import invoicemanager.persistence.TipoBentoDao;
import invoicemanager.persistence.TipoClienteDao;
import invoicemanager.persistence.TipoIndirizzoDao;
import invoicemanager.persistence.TipoMagazzinoDao;
import invoicemanager.persistence.TipoPagamentoDao;
import invoicemanager.persistence.TipoRigaDocumentoDao;
import invoicemanager.persistence.UnitaMisuraDao;
import invoicemanager.persistence.UtenteDao;
import invoicemanager.persistence.VettoreDao;

public final class DataManager {
	
	public static void createDB() throws ClassNotFoundException, SQLException {
    	String sql = "Create DATABASE invoicemanager;";
		Connection c = ConnectionFactory.checkDB();
        Statement stmt = c.createStatement();
    	stmt.execute(sql);
    	stmt.close();
        c.close();
	
		new AgenteDao().createTable();
		new AllegatoDao().createTable();
		new AltroDatoGestionaleDao().createTable();
		new AreaGeograficaDao().createTable();
		new ArticoloMagazzinoDescrizioneMultilinguaDao().createTable();
		new ArticoloMagazzinoDao().createTable();
		new BancaGlobaleDao().createTable();
		new BancaDao().createTable();
		new BentoDettaglioDao().createTable();
		new BentoTestataDao().createTable();
		new CapItalianoDao().createTable();
		new CausaleMagazzinoDao().createTable();
		new ClienteDao().createTable();
		new CodiceABarreDao().createTable();
		new ConfezioneDao().createTable();
		new ContrattoDao().createTable();
		new ControparteDao().createTable();
		new ConvenzioneDao().createTable();
		new DdtDettaglioDao().createTable();
		new DdtTestataDao().createTable();
		new FatturaCollegataDao().createTable();
		new FatturaDettaglioDao().createTable();
		new FatturaProformaDettaglioDao().createTable();
		new FatturaProformaTestataDao().createTable();
		new FatturaTestataDao().createTable();
		new GruppoDao().createTable();
		new GruppoMerceologicoDao().createTable();
		new ImballoDao().createTable();
		new IndirizzoGeograficoDao().createTable();
		new IsoDao().createTable();
		new IvaDao().createTable();
		new ListinoArticoloDao().createTable();
		new ListinoPersonalizzatoDao().createTable();
		new MagazzinoDao().createTable();
		new OrdineDettaglioDao().createTable();
		new OrdineDao().createTable();
		new OrdineTestataDao().createTable();
		new PagamentoDao().createTable();
		new PercipienteDao().createTable();
		new PianoContoDao().createTable();
		new PreventivoDettaglioDao().createTable();
		new PreventivoTestataDao().createTable();
		new PrezzoDao().createTable();
		new ProvvigioneAgenteDao().createTable();
		new RaggruppamentoClienteFornitoreDao().createTable();
		new RappresentanteFiscaleDao().createTable();
		new ResaMerceDao().createTable();
		new RicezioneDao().createTable();
		new ScadenzaPagamentiDao().createTable();
		new ScadenzeDao().createTable();
		new SottogruppoMerceologicoDao().createTable();
		new StabileOrganizzazioneDao().createTable();
		new StatoFatturaDao().createTable();
		new ContattoDao().createTable();
		new TerzoIntermediarioDao().createTable();
		new TipoBentoDao().createTable();
		new TipoClienteDao().createTable();
		new TipoIndirizzoDao().createTable();
		new TipoMagazzinoDao().createTable();
		new TipoPagamentoDao().createTable();
		new TipoRigaDocumentoDao().createTable();
		new UnitaMisuraDao().createTable();
		new UtenteDao().createTable();
		new VettoreDao().createTable();
	}
	
	public static List<Listino> loadListino()  {
		List<Listino> listini = new ArrayList<>();
		listini.addAll(loadListinoArticolo());
		listini.addAll(loadListinoPersonalizzato());
		return listini;
	}
	
	public static List<Agente> loadAgente() {
		return new AgenteDao().read(loadControparte());
	}
	public static List<Allegato> loadAllegato() {
		return new AllegatoDao().read();
	}
	public static List<AltroDatoGestionale> loadAltroDatoGestionale() {
		return new AltroDatoGestionaleDao().read();
	}
	public static List<AreaGeografica> loadAreaGeografica() {
		return new AreaGeograficaDao().read();
	}
	public static List<ArticoloMagazzinoDescrizioneMultilingua> loadArticoloMagazzinoDescrizioneMultilingua() {
		return new ArticoloMagazzinoDescrizioneMultilinguaDao().read();
	}
	public static List<ArticoloMagazzino> loadArticoloMagazzino() {
		return new ArticoloMagazzinoDao().read(loadUnitaMisura(), loadGruppoMerceologico(), loadSottogruppoMerceologico(), loadPercipiente(), loadListinoArticolo());
	}
	public static List<BancaGlobale> loadBancaGlobale() {
		return new BancaGlobaleDao().read();
	}
	public static List<Banca> loadBanca() {
		return new BancaDao().read(Stato.values());
	}
	public static List<BentoDettaglio> loadBentoDettaglio() {
		return new BentoDettaglioDao().read(loadTipoBento(), loadUnitaMisura(), loadIva(), loadControparte(), loadMagazzino(), loadCausaleMagazzino());
	}
	public static List<BentoTestata> loadBentoTestata() {
		return new BentoTestataDao().read();
	}
	public static List<CapItaliano> loadCapItaliano() {
		return new CapItalianoDao().read();
	}
	public static List<CausaleMagazzino> loadCausaleMagazzino() {
		return new CausaleMagazzinoDao().read();
	}
	public static List<Cliente> loadCliente() {
		return new ClienteDao().read(loadTipoCliente(), loadResaMerce(), loadImballo(), loadRaggruppamentoClienteFornitore(), loadPagamento(), loadBanca(), loadIva(), loadAgente(), loadVettore(), loadIso(), loadStabileOrganizzazione(), loadRappresentanteFiscale(), loadTerzoIntermediario(), loadContatto());
	}
	public static List<CodiceABarre> loadCodiceABarre() {
		return new CodiceABarreDao().read();
	}
	public static List<Confezione> loadConfezione() {
		return new ConfezioneDao().read();
	}
	public static List<Contratto> loadContratto() {
		return new ContrattoDao().read();
	}
	public static List<Controparte> loadControparte() {
		return new ControparteDao().read();
	}
	public static List<Convenzione> loadConvenzione() {
		return new ConvenzioneDao().read();
	}
	public static List<DdtDettaglio> loadDdtDettaglio() {
		return new DdtDettaglioDao().read();
	}
	public static List<DdtTestata> loadDdtTestata() {
		return new DdtTestataDao().read(loadDdtDettaglio());
	}
	public static List<FatturaCollegata> loadFatturaCollegata() {
		return new FatturaCollegataDao().read();
	}
	public static List<FatturaDettaglio> loadFatturaDettaglio() {
		return new FatturaDettaglioDao().getAllFattureDettaglio(loadOrdine(), loadContratto(), loadConvenzione(), loadRicezione(), loadFatturaCollegata(), loadAltroDatoGestionale());
	}
	public static List<FatturaDettaglio> loadFatturaDettaglioByFatturaTestata(FatturaTestata fatturaTestata) {
		return new FatturaDettaglioDao().getFattureDettaglioByFatturaTestata(fatturaTestata.getNumeroFatturazione(), fatturaTestata.getDataFattura(), loadOrdine(), loadContratto(), loadConvenzione(), loadRicezione(), loadFatturaCollegata(), loadAltroDatoGestionale());
	}
	public static List<FatturaProformaDettaglio> loadFatturaProformaDettaglio() {
		return new FatturaProformaDettaglioDao().read(loadOrdine(), loadContratto(), loadConvenzione(), loadRicezione(), loadFatturaCollegata(), loadAltroDatoGestionale());
	}
	public static List<FatturaProformaTestata> loadFatturaProformaTestata() {
		return new FatturaProformaTestataDao().read();
	}
	public static List<FatturaTestata> loadFatturaTestataByNumeroFatturazione(int numeroFatturazione){
		return new FatturaTestataDao().readByNumeroFatturazione(numeroFatturazione, StatoAvanzamento.values(), loadFatturaDettaglio(), loadAllegato());
	}
	public static List<FatturaTestata> loadFatturaTestata() {
		return new FatturaTestataDao().read(StatoAvanzamento.values(), loadFatturaDettaglio(), loadAllegato());
	}
	public static List<Gruppo> loadGruppo() {
		return new GruppoDao().read();
	}
	public static List<GruppoMerceologico> loadGruppoMerceologico() {
		return new GruppoMerceologicoDao().read();
	}
	public static List<Imballo> loadImballo() {
		return new ImballoDao().read();
	}
	public static List<IndirizzoGeografico> loadIndirizzoGeografico() {
		return new IndirizzoGeograficoDao().read();
	}
	public static List<Iso> loadIso() {
		return new IsoDao().read();
	}
	public static List<Iva> loadIva() {
		return new IvaDao().read();
	}
	public static List<ListinoArticolo> loadListinoArticolo() {
		return new ListinoArticoloDao().read();
	}
	public static List<ListinoPersonalizzato> loadListinoPersonalizzato() {
		return new ListinoPersonalizzatoDao().read(loadGruppoMerceologico());
	}
	public static List<Magazzino> loadMagazzino() {
		return new MagazzinoDao().read();
	}
	public static List<OrdineDettaglio> loadOrdineDettaglio() {
		return new OrdineDettaglioDao().read();
	}
	public static List<Ordine> loadOrdine() {
		return new OrdineDao().read();
	}
	public static List<OrdineTestata> loadOrdineTestata() {
		return new OrdineTestataDao().read(StatoAvanzamento.values(), loadOrdineDettaglio());
	}
	public static List<Pagamento> loadPagamento() {
		return new PagamentoDao().read(loadTipoPagamento());
	}
	public static List<Percipiente> loadPercipiente() {
		return new PercipienteDao().read();
	}
	public static List<PianoConto> loadPianoConto() {
		return new PianoContoDao().read();
	}
	public static List<PreventivoDettaglio> loadPreventivoDettaglio() {
		return new PreventivoDettaglioDao().read();
	}
	public static List<PreventivoTestata> loadPreventivoTestata() {
		return new PreventivoTestataDao().read();
	}
	public static List<Prezzo> loadPrezzo() {
		return new PrezzoDao().read();
	}
	public static List<ProvvigioneAgente> loadProvvigioneAgente() {
		return new ProvvigioneAgenteDao().read();
	}
	public static List<RaggruppamentoClienteFornitore> loadRaggruppamentoClienteFornitore() {
		return new RaggruppamentoClienteFornitoreDao().read();
	}
	public static List<RappresentanteFiscale> loadRappresentanteFiscale() {
		return new RappresentanteFiscaleDao().read();
	}
	public static List<ResaMerce> loadResaMerce() {
		return new ResaMerceDao().read();
	}
	public static List<Ricezione> loadRicezione() {
		return new RicezioneDao().read();
	}
	public static List<ScadenzaPagamenti> loadScadenzaPagamenti() {
		return new ScadenzaPagamentiDao().read();
	}
	public static List<Scadenze> loadScadenze() {
		return new ScadenzeDao().read();
	}
	public static List<SottogruppoMerceologico> loadSottogruppoMerceologico() {
		return new SottogruppoMerceologicoDao().read();
	}
	public static List<StabileOrganizzazione> loadStabileOrganizzazione() {
		return new StabileOrganizzazioneDao().read();
	}
	public static List<StatoFattura> loadStatoFattura() {
		return new StatoFatturaDao().read();
	}
	public static List<Contatto> loadContatto() {
		return new ContattoDao().read();
	}
	public static List<TerzoIntermediario> loadTerzoIntermediario() {
		return new TerzoIntermediarioDao().read();
	}
	public static List<TipoBento> loadTipoBento() {
		return new TipoBentoDao().read();
	}
	public static List<TipoCliente> loadTipoCliente() {
		return new TipoClienteDao().read();
	}
	public static List<TipoIndirizzo> loadTipoIndirizzo() {
		return new TipoIndirizzoDao().read();
	}
	public static List<TipoMagazzino> loadTipoMagazzino() {
		return new TipoMagazzinoDao().read();
	}
	public static List<TipoPagamento> loadTipoPagamento() {
		return new TipoPagamentoDao().read();
	}
	public static List<TipoRigaDocumento> loadTipoRigaDocumento() {
		return new TipoRigaDocumentoDao().read();
	}
	public static List<UnitaMisura> loadUnitaMisura() {
		return new UnitaMisuraDao().read();
	}
	public static List<Utente> loadUtente() {
		return new UtenteDao().read();
	}
	public static List<Vettore> loadVettore() {
		return new VettoreDao().read();
	}
	
	public static int add(Agente agente) {
		return new AgenteDao().add(agente);
	}
	public static int add(Allegato allegato) {
		return new AllegatoDao().add(allegato);
	}
	public static int add(AltroDatoGestionale altroDatoGestionale) {
		return new AltroDatoGestionaleDao().add(altroDatoGestionale, false);
	}
	public static int add(AreaGeografica areaGeografica) {
		return new AreaGeograficaDao().add(areaGeografica, false);
	}
	public static int add(ArticoloMagazzinoDescrizioneMultilingua articoloMagazzinoDescrizioneMultilingua) {
		return new ArticoloMagazzinoDescrizioneMultilinguaDao().add(articoloMagazzinoDescrizioneMultilingua, false);
	}
	public static int add(ArticoloMagazzino articoloMagazzino) {
		return new ArticoloMagazzinoDao().add(articoloMagazzino, false);
	}
	public static int add(BancaGlobale bancaGlobale) {
		return new BancaGlobaleDao().add(bancaGlobale, false);
	}
	public static int add(Banca banca) {
		return new BancaDao().add(banca, false);
	}
	public static int add(BentoDettaglio bentoDettaglio) {
		return new BentoDettaglioDao().add(bentoDettaglio, false);
	}
	public static int add(BentoTestata bentoTestata) {
		return new BentoTestataDao().add(bentoTestata, false);
	}
	public static int add(CapItaliano capItaliano) {
		return new CapItalianoDao().add(capItaliano, false);
	}
	public static int add(CausaleMagazzino causaleMagazzino) {
		return new CausaleMagazzinoDao().add(causaleMagazzino, false);
	}
	public static int add(Cliente cliente) {
		return new ClienteDao().add(cliente);
	}
	public static int add(CodiceABarre codiceABarre) {
		return new CodiceABarreDao().add(codiceABarre, false);
	}
	public static int add(Confezione confezione) {
		return new ConfezioneDao().add(confezione, false);
	}
	public static int add(Contratto contratto) {
		return new ContrattoDao().add(contratto, false);
	}
	public static int add(Controparte controparte) {
		return new ControparteDao().add(controparte, false);
	}
	public static int add(Convenzione convenzione) {
		return new ConvenzioneDao().add(convenzione, false);
	}
	public static int add(DdtDettaglio ddtDettaglio) {
		return new DdtDettaglioDao().add(ddtDettaglio, false);
	}
	public static int add(DdtTestata ddtTestata) {
		return new DdtTestataDao().add(ddtTestata, false);
	}
	public static int add(FatturaCollegata fatturaCollegata) {
		return new FatturaCollegataDao().add(fatturaCollegata, false);
	}
	public static int add(FatturaDettaglio fatturaDettaglio) {
		return new FatturaDettaglioDao().add(fatturaDettaglio, false);
	}
	public static int add(FatturaProformaDettaglio fatturaProformaDettaglio) {
		return new FatturaProformaDettaglioDao().add(fatturaProformaDettaglio, false);
	}
	public static int add(FatturaProformaTestata fatturaProformaTestata) {
		return new FatturaProformaTestataDao().add(fatturaProformaTestata, false);
	}
	public static int add(FatturaTestata fatturaTestata) {
		return new FatturaTestataDao().add(fatturaTestata, false);
	}
	public static int add(Gruppo gruppo) {
		return new GruppoDao().add(gruppo, false);
	}
	public static int add(GruppoMerceologico gruppoMerceologico) {
		return new GruppoMerceologicoDao().add(gruppoMerceologico, false);
	}
	public static int add(Imballo imballo) {
		return new ImballoDao().add(imballo, false);
	}
	public static int add(IndirizzoGeografico indirizzoGeografico) {
		return new IndirizzoGeograficoDao().add(indirizzoGeografico, false);
	}
	public static int add(Iso iso) {
		return new IsoDao().add(iso, false);
	}
	public static int add(Iva iva) {
		return new IvaDao().add(iva, false);
	}
	public static int add(ListinoArticolo listinoArticolo) {
		return new ListinoArticoloDao().add(listinoArticolo, false);
	}
	public static int add(ListinoPersonalizzato listinoPersonalizzato) {
		return new ListinoPersonalizzatoDao().add(listinoPersonalizzato, false);
	}
	public static int add(Magazzino magazzino) {
		return new MagazzinoDao().add(magazzino, false);
	}
	public static int add(OrdineDettaglio ordineDettaglio) {
		return new OrdineDettaglioDao().add(ordineDettaglio, false);
	}
	public static int add(Ordine ordine) {
		return new OrdineDao().add(ordine, false);
	}
	public static int add(OrdineTestata ordineTestata) {
		return new OrdineTestataDao().add(ordineTestata, false);
	}
	public static int add(Pagamento pagamento) {
		return new PagamentoDao().add(pagamento, false);
	}
	public static int add(Percipiente percipiente) {
		return new PercipienteDao().add(percipiente, false);
	}
	public static int add(PianoConto pianoConto) {
		return new PianoContoDao().add(pianoConto, false);
	}
	public static int add(PreventivoDettaglio preventivoDettaglio) {
		return new PreventivoDettaglioDao().add(preventivoDettaglio, false);
	}
	public static int add(PreventivoTestata preventivoTestata) {
		return new PreventivoTestataDao().add(preventivoTestata, false);
	}
	public static int add(Prezzo prezzo) {
		return new PrezzoDao().add(prezzo, false);
	}
	public static int add(ProvvigioneAgente provvigioneAgente) {
		return new ProvvigioneAgenteDao().add(provvigioneAgente, false);
	}
	public static int add(RaggruppamentoClienteFornitore raggruppamentoClienteFornitore) {
		return new RaggruppamentoClienteFornitoreDao().add(raggruppamentoClienteFornitore, false);
	}
	public static int add(RappresentanteFiscale rappresentanteFiscale) {
		return new RappresentanteFiscaleDao().add(rappresentanteFiscale, false);
	}
	public static int add(ResaMerce resaMerce) {
		return new ResaMerceDao().add(resaMerce, false);
	}
	public static int add(Ricezione ricezione) {
		return new RicezioneDao().add(ricezione, false);
	}
	public static int add(Scadenze scadenze) {
		return new ScadenzeDao().add(scadenze, false);
	}
	public static int add(SottogruppoMerceologico sottogruppoMerceologico) {
		return new SottogruppoMerceologicoDao().add(sottogruppoMerceologico, false);
	}
	public static int add(StabileOrganizzazione stabileOrganizzazione) {
		return new StabileOrganizzazioneDao().add(stabileOrganizzazione, false);
	}
	public static int add(StatoFattura statoFattura) {
		return new StatoFatturaDao().add(statoFattura, false);
	}
	public static int add(Contatto contatto) {
		return new ContattoDao().add(contatto, false);
	}
	public static int add(TerzoIntermediario terzoIntermediario) {
		return new TerzoIntermediarioDao().add(terzoIntermediario, false);
	}
	public static int add(TipoBento tipoBento) {
		return new TipoBentoDao().add(tipoBento, false);
	}
	public static int add(TipoCliente tipoCliente) {
		return new TipoClienteDao().add(tipoCliente, false);
	}
	public static int add(TipoIndirizzo tipoIndirizzo) {
		return new TipoIndirizzoDao().add(tipoIndirizzo, false);
	}
	public static int add(TipoMagazzino tipoMagazzino) {
		return new TipoMagazzinoDao().add(tipoMagazzino, false);
	}
	public static int add(TipoPagamento tipoPagamento) {
		return new TipoPagamentoDao().add(tipoPagamento, false);
	}
	public static int add(TipoRigaDocumento tipoRigaDocumento) {
		return new TipoRigaDocumentoDao().add(tipoRigaDocumento, false);
	}
	public static int add(UnitaMisura unitaMisura) {
		return new UnitaMisuraDao().add(unitaMisura, false);
	}
	public static int add(Utente utente) {
		return new UtenteDao().add(utente, false);
	}
	public static int add(Vettore vettore) {
		return new VettoreDao().add(vettore, false);
	}
}
