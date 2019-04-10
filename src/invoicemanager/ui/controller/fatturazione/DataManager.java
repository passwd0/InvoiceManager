package invoicemanager.ui.controller.fatturazione;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
import invoicemanager.model.fatturazione.Contatto;
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
import invoicemanager.model.fatturazione.SottogruppoMerceologico;
import invoicemanager.model.fatturazione.StabileOrganizzazione;
import invoicemanager.model.fatturazione.Stato;
import invoicemanager.model.fatturazione.StatoAvanzamento;
import invoicemanager.model.fatturazione.StatoFattura;
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
	
	public static void createDB() throws ClassNotFoundException, SQLException {
    	String sql = "Create DATABASE invoicemanager;";
		Connection c = DBConnect.checkDB();
        Statement stmt = c.createStatement();
    	stmt.execute(sql);
    	stmt.close();
        c.close();
	
		new WriteAgente().createTable();
		new WriteAllegato().createTable();
		new WriteAltroDatoGestionale().createTable();
		new WriteAreaGeografica().createTable();
		new WriteArticoloMagazzinoDescrizioneMultilingua().createTable();
		new WriteArticoloMagazzino().createTable();
		new WriteBancaGlobale().createTable();
		new WriteBanca().createTable();
		new WriteBentoDettaglio().createTable();
		new WriteBentoTestata().createTable();
		new WriteCapItaliano().createTable();
		new WriteCausaleMagazzino().createTable();
		new WriteCliente().createTable();
		new WriteCodiceABarre().createTable();
		new WriteConfezione().createTable();
		new WriteContratto().createTable();
		new WriteControparte().createTable();
		new WriteConvenzione().createTable();
		new WriteDdtDettaglio().createTable();
		new WriteDdtTestata().createTable();
		new WriteFatturaCollegata().createTable();
		new WriteFatturaDettaglio().createTable();
		new WriteFatturaProformaDettaglio().createTable();
		new WriteFatturaProformaTestata().createTable();
		new WriteFatturaTestata().createTable();
		new WriteGruppo().createTable();
		new WriteGruppoMerceologico().createTable();
		new WriteImballo().createTable();
		new WriteIndirizzoGeografico().createTable();
		new WriteIso().createTable();
		new WriteIva().createTable();
		new WriteListinoArticolo().createTable();
		new WriteListinoPersonalizzato().createTable();
		new WriteMagazzino().createTable();
		new WriteOrdineDettaglio().createTable();
		new WriteOrdine().createTable();
		new WriteOrdineTestata().createTable();
		new WritePagamento().createTable();
		new WritePercipiente().createTable();
		new WritePianoConto().createTable();
		new WritePreventivoDettaglio().createTable();
		new WritePreventivoTestata().createTable();
		new WritePrezzo().createTable();
		new WriteProvvigioneAgente().createTable();
		new WriteRaggruppamentoClienteFornitore().createTable();
		new WriteRappresentanteFiscale().createTable();
		new WriteResaMerce().createTable();
		new WriteRicezione().createTable();
		new WriteScadenzaPagamenti().createTable();
		new WriteScadenze().createTable();
		new WriteSottogruppoMerceologico().createTable();
		new WriteStabileOrganizzazione().createTable();
		new WriteStatoFattura().createTable();
		new WriteContatto().createTable();
		new WriteTerzoIntermediario().createTable();
		new WriteTipoBento().createTable();
		new WriteTipoCliente().createTable();
		new WriteTipoIndirizzo().createTable();
		new WriteTipoMagazzino().createTable();
		new WriteTipoPagamento().createTable();
		new WriteTipoRigaDocumento().createTable();
		new WriteUnitaMisura().createTable();
		new WriteUtente().createTable();
		new WriteVettore().createTable();
	}
	
	public static List<Listino> loadListino()  {
		List<Listino> listini = new ArrayList<>();
		listini.addAll(loadListinoArticolo());
		listini.addAll(loadListinoPersonalizzato());
		return listini;
	}
	
	public static List<Agente> loadAgente() {
		try {
			return new ReadAgente().read(loadControparte());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Allegato> loadAllegato() {
		try {
			return new ReadAllegato().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<AltroDatoGestionale> loadAltroDatoGestionale() {
		try {
			return new ReadAltroDatoGestionale().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<AreaGeografica> loadAreaGeografica() {
		try {
			return new ReadAreaGeografica().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<ArticoloMagazzinoDescrizioneMultilingua> loadArticoloMagazzinoDescrizioneMultilingua() {
		try {
			return new ReadArticoloMagazzinoDescrizioneMultilingua().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<ArticoloMagazzino> loadArticoloMagazzino() {
		try {
			return new ReadArticoloMagazzino().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<BancaGlobale> loadBancaGlobale() {
		try {
			return new ReadBancaGlobale().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Banca> loadBanca() {
		try {
			return new ReadBanca().read(Stato.values());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<BentoDettaglio> loadBentoDettaglio() {
		try {
			return new ReadBentoDettaglio().read(loadTipoBento(), loadUnitaMisura(), loadIva(), loadControparte(), loadMagazzino(), loadCausaleMagazzino());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<BentoTestata> loadBentoTestata() {
		try {
			return new ReadBentoTestata().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<CapItaliano> loadCapItaliano() {
		try {
			return new ReadCapItaliano().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<CausaleMagazzino> loadCausaleMagazzino() {
		try {
			return new ReadCausaleMagazzino().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Cliente> loadCliente() {
		try {
			return new ReadCliente().read(loadTipoCliente(), loadResaMerce(), loadImballo(), loadRaggruppamentoClienteFornitore(), loadPagamento(), loadBanca(), loadIva(), loadAgente(), loadVettore(), loadIso(), loadStabileOrganizzazione(), loadRappresentanteFiscale(), loadTerzoIntermediario());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<CodiceABarre> loadCodiceABarre() {
		try {
			return new ReadCodiceABarre().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Confezione> loadConfezione() {
		try {
			return new ReadConfezione().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Contratto> loadContratto() {
		try {
			return new ReadContratto().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Controparte> loadControparte() {
		try {
			return new ReadControparte().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Convenzione> loadConvenzione() {
		try {
			return new ReadConvenzione().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<DdtDettaglio> loadDdtDettaglio() {
		try {
			return new ReadDdtDettaglio().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<DdtTestata> loadDdtTestata() {
		try {
			return new ReadDdtTestata().read(loadDdtDettaglio());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<FatturaCollegata> loadFatturaCollegata() {
		try {
			return new ReadFatturaCollegata().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<FatturaDettaglio> loadFatturaDettaglio() {
		try {
			return new ReadFatturaDettaglio().read(loadOrdine(), loadContratto(), loadConvenzione(), loadRicezione(), loadFatturaCollegata(), loadAltroDatoGestionale());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<FatturaProformaDettaglio> loadFatturaProformaDettaglio() {
		try {
			return new ReadFatturaProformaDettaglio().read(loadOrdine(), loadContratto(), loadConvenzione(), loadRicezione(), loadFatturaCollegata(), loadAltroDatoGestionale());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<FatturaProformaTestata> loadFatturaProformaTestata() {
		try {
			return new ReadFatturaProformaTestata().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<FatturaTestata> loadFatturaTestata() {
		try {
			return new ReadFatturaTestata().read(StatoAvanzamento.values(), loadFatturaDettaglio(), loadAllegato());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Gruppo> loadGruppo() {
		try {
			return new ReadGruppo().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<GruppoMerceologico> loadGruppoMerceologico() {
		try {
			return new ReadGruppoMerceologico().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Imballo> loadImballo() {
		try {
			return new ReadImballo().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<IndirizzoGeografico> loadIndirizzoGeografico() {
		try {
			return new ReadIndirizzoGeografico().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Iso> loadIso() {
		try {
			return new ReadIso().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Iva> loadIva() {
		try {
			return new ReadIva().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<ListinoArticolo> loadListinoArticolo() {
		try {
			return new ReadListinoArticolo().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<ListinoPersonalizzato> loadListinoPersonalizzato() {
		try {
			return new ReadListinoPersonalizzato().read(loadGruppoMerceologico());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Magazzino> loadMagazzino() {
		try {
			return new ReadMagazzino().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<OrdineDettaglio> loadOrdineDettaglio() {
		try {
			return new ReadOrdineDettaglio().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Ordine> loadOrdine() {
		try {
			return new ReadOrdine().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<OrdineTestata> loadOrdineTestata() {
		try {
			return new ReadOrdineTestata().read(StatoAvanzamento.values(), loadOrdineDettaglio());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Pagamento> loadPagamento() {
		try {
			return new ReadPagamento().read(loadTipoPagamento());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Percipiente> loadPercipiente() {
		try {
			return new ReadPercipiente().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<PianoConto> loadPianoConto() {
		try {
			return new ReadPianoConto().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<PreventivoDettaglio> loadPreventivoDettaglio() {
		try {
			return new ReadPreventivoDettaglio().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<PreventivoTestata> loadPreventivoTestata() {
		try {
			return new ReadPreventivoTestata().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Prezzo> loadPrezzo() {
		try {
			return new ReadPrezzo().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<ProvvigioneAgente> loadProvvigioneAgente() {
		try {
			return new ReadProvvigioneAgente().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<RaggruppamentoClienteFornitore> loadRaggruppamentoClienteFornitore() {
		try {
			return new ReadRaggruppamentoClienteFornitore().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<RappresentanteFiscale> loadRappresentanteFiscale() {
		try {
			return new ReadRappresentanteFiscale().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<ResaMerce> loadResaMerce() {
		try {
			return new ReadResaMerce().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Ricezione> loadRicezione() {
		try {
			return new ReadRicezione().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<ScadenzaPagamenti> loadScadenzaPagamenti() {
		try {
			return new ReadScadenzaPagamenti().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Scadenze> loadScadenze() {
		try {
			return new ReadScadenze().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	public static List<SottogruppoMerceologico> loadSottogruppoMerceologico() {
		try {
			return new ReadSottogruppoMerceologico().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<StabileOrganizzazione> loadStabileOrganizzazione() {
		try {
			return new ReadStabileOrganizzazione().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<StatoFattura> loadStatoFattura() {
		try {
			return new ReadStatoFattura().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Contatto> loadContatto() {
		try {
			return new ReadContatto().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<TerzoIntermediario> loadTerzoIntermediario() {
		try {
			return new ReadTerzoIntermediario().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<TipoBento> loadTipoBento() {
		try {
			return new ReadTipoBento().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<TipoCliente> loadTipoCliente() {
		try {
			return new ReadTipoCliente().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<TipoIndirizzo> loadTipoIndirizzo() {
		try {
			return new ReadTipoIndirizzo().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<TipoMagazzino> loadTipoMagazzino() {
		try {
			return new ReadTipoMagazzino().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<TipoPagamento> loadTipoPagamento() {
		try {
			return new ReadTipoPagamento().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<TipoRigaDocumento> loadTipoRigaDocumento() {
		try {
			return new ReadTipoRigaDocumento().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<UnitaMisura> loadUnitaMisura() {
		try {
			return new ReadUnitaMisura().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Utente> loadUtente() {
		try {
			return new ReadUtente().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static List<Vettore> loadVettore() {
		try {
			return new ReadVettore().read();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	public static void add(Agente agente) {
		List<Agente> listAgente = loadAgente();
		if(!listAgente.contains(agente)) {
			try {
					new WriteAgente().add(agente, false);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();

			}
		}
	}
	public static void add(Allegato allegato) {
		List<Allegato> listAllegato = loadAllegato();
		if(!listAllegato.contains(allegato)) {
		try {
				new WriteAllegato().add(allegato, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(AltroDatoGestionale altroDatoGestionale) {
		List<AltroDatoGestionale> listAltroDatoGestionale = loadAltroDatoGestionale();
		if(!listAltroDatoGestionale.contains(altroDatoGestionale)) {
		try {
				new WriteAltroDatoGestionale().add(altroDatoGestionale, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(AreaGeografica areaGeografica) {
		List<AreaGeografica> listAreaGeografica = loadAreaGeografica();
		if(!listAreaGeografica.contains(areaGeografica)) {
		try {
				new WriteAreaGeografica().add(areaGeografica, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(ArticoloMagazzinoDescrizioneMultilingua articoloMagazzinoDescrizioneMultilingua) {
		List<ArticoloMagazzinoDescrizioneMultilingua> listArticoloMagazzinoDescrizioneMultilingua = loadArticoloMagazzinoDescrizioneMultilingua();
		if(!listArticoloMagazzinoDescrizioneMultilingua.contains(articoloMagazzinoDescrizioneMultilingua)) {
		try {
				new WriteArticoloMagazzinoDescrizioneMultilingua().add(articoloMagazzinoDescrizioneMultilingua, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(ArticoloMagazzino articoloMagazzino) {
		List<ArticoloMagazzino> listArticoloMagazzino = loadArticoloMagazzino();
		if(!listArticoloMagazzino.contains(articoloMagazzino)) {
		try {
				new WriteArticoloMagazzino().add(articoloMagazzino, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(BancaGlobale bancaGlobale) {
		List<BancaGlobale> listBancaGlobale = loadBancaGlobale();
		if(!listBancaGlobale.contains(bancaGlobale)) {
		try {
				new WriteBancaGlobale().add(bancaGlobale, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Banca banca) {
		List<Banca> listBanca = loadBanca();
		if(!listBanca.contains(banca)) {
		try {
			new WriteBanca().add(banca, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(BentoDettaglio bentoDettaglio) {
		List<BentoDettaglio> listBentoDettaglio = loadBentoDettaglio();
		if(!listBentoDettaglio.contains(bentoDettaglio)) {
		try {
				new WriteBentoDettaglio().add(bentoDettaglio, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(BentoTestata bentoTestata) {
		List<BentoTestata> listBentoTestata = loadBentoTestata();
		if(!listBentoTestata.contains(bentoTestata)) {
		try {
				new WriteBentoTestata().add(bentoTestata, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(CapItaliano capItaliano) {
		List<CapItaliano> listCapItaliano = loadCapItaliano();
		if(!listCapItaliano.contains(capItaliano)) {
		try {
				new WriteCapItaliano().add(capItaliano, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(CausaleMagazzino causaleMagazzino) {
		List<CausaleMagazzino> listCausaleMagazzino = loadCausaleMagazzino();
		if(!listCausaleMagazzino.contains(causaleMagazzino)) {
		try {
				new WriteCausaleMagazzino().add(causaleMagazzino, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Cliente cliente) {
		List<Cliente> listCliente = loadCliente();
		if(!listCliente.contains(cliente)) {
		try {
				new WriteCliente().add(cliente, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(CodiceABarre codiceABarre) {
		List<CodiceABarre> listCodiceABarre = loadCodiceABarre();
		if(!listCodiceABarre.contains(codiceABarre)) {
		try {
				new WriteCodiceABarre().add(codiceABarre, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Confezione confezione) {
		List<Confezione> listConfezione = loadConfezione();
		if(!listConfezione.contains(confezione)) {
		try {
				new WriteConfezione().add(confezione, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Contratto contratto) {
		List<Contratto> listContratto = loadContratto();
		if(!listContratto.contains(contratto)) {
		try {
				new WriteContratto().add(contratto, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Controparte controparte) {
		List<Controparte> listControparte = loadControparte();
		if(!listControparte.contains(controparte)) {
		try {
				new WriteControparte().add(controparte, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Convenzione convenzione) {
		List<Convenzione> listConvenzione = loadConvenzione();
		if(!listConvenzione.contains(convenzione)) {
		try {
				new WriteConvenzione().add(convenzione, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(DdtDettaglio ddtDettaglio) {
		List<DdtDettaglio> listDdtDettaglio = loadDdtDettaglio();
		if(!listDdtDettaglio.contains(ddtDettaglio)) {
		try {
				new WriteDdtDettaglio().add(ddtDettaglio, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(DdtTestata ddtTestata) {
		List<DdtTestata> listDdtTestata = loadDdtTestata();
		if(!listDdtTestata.contains(ddtTestata)) {
		try {
				new WriteDdtTestata().add(ddtTestata, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(FatturaCollegata fatturaCollegata) {
		List<FatturaCollegata> listFatturaCollegata = loadFatturaCollegata();
		if(!listFatturaCollegata.contains(fatturaCollegata)) {
		try {
				new WriteFatturaCollegata().add(fatturaCollegata, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(FatturaDettaglio fatturaDettaglio) {
		List<FatturaDettaglio> listFatturaDettaglio = loadFatturaDettaglio();
		if(!listFatturaDettaglio.contains(fatturaDettaglio)) {
		try {
				new WriteFatturaDettaglio().add(fatturaDettaglio, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(FatturaProformaDettaglio fatturaProformaDettaglio) {
		List<FatturaProformaDettaglio> listFatturaProformaDettaglio = loadFatturaProformaDettaglio();
		if(!listFatturaProformaDettaglio.contains(fatturaProformaDettaglio)) {
		try {
				new WriteFatturaProformaDettaglio().add(fatturaProformaDettaglio, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(FatturaProformaTestata fatturaProformaTestata) {
		List<FatturaProformaTestata> listFatturaProformaTestata = loadFatturaProformaTestata();
		if(!listFatturaProformaTestata.contains(fatturaProformaTestata)) {
		try {
				new WriteFatturaProformaTestata().add(fatturaProformaTestata, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(FatturaTestata fatturaTestata) {
		List<FatturaTestata> listFatturaTestata = loadFatturaTestata();
		if(!listFatturaTestata.contains(fatturaTestata)) {
		try {
				new WriteFatturaTestata().add(fatturaTestata, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Gruppo gruppo) {
		List<Gruppo> listGruppo = loadGruppo();
		if(!listGruppo.contains(gruppo)) {
		try {
				new WriteGruppo().add(gruppo, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(GruppoMerceologico gruppoMerceologico) {
		List<GruppoMerceologico> listGruppoMerceologico = loadGruppoMerceologico();
		if(!listGruppoMerceologico.contains(gruppoMerceologico)) {
		try {
				new WriteGruppoMerceologico().add(gruppoMerceologico, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Imballo imballo) {
		List<Imballo> listImballo = loadImballo();
		if(!listImballo.contains(imballo)) {
		try {
				new WriteImballo().add(imballo, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(IndirizzoGeografico indirizzoGeografico) {
		List<IndirizzoGeografico> listIndirizzoGeografico = loadIndirizzoGeografico();
		if(!listIndirizzoGeografico.contains(indirizzoGeografico)) {
		try {
				new WriteIndirizzoGeografico().add(indirizzoGeografico, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Iso iso) {
		List<Iso> listIso = loadIso();
		if(!listIso.contains(iso)) {
		try {
				new WriteIso().add(iso, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Iva iva) {
		List<Iva> listIva = loadIva();
		if(!listIva.contains(iva)) {
		try {
				new WriteIva().add(iva, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(ListinoArticolo listinoArticolo) {
		List<ListinoArticolo> listListinoArticolo = loadListinoArticolo();
		if(!listListinoArticolo.contains(listinoArticolo)) {
		try {
				new WriteListinoArticolo().add(listinoArticolo, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	
	public static void add(ListinoPersonalizzato listinoPersonalizzato) {
		List<ListinoPersonalizzato> listListinoPersonalizzato = loadListinoPersonalizzato();
		if(!listListinoPersonalizzato.contains(listinoPersonalizzato)) {
		try {
				new WriteListinoPersonalizzato().add(listinoPersonalizzato, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Magazzino magazzino) {
		List<Magazzino> listMagazzino = loadMagazzino();
		if(!listMagazzino.contains(magazzino)) {
		try {
				new WriteMagazzino().add(magazzino, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(OrdineDettaglio ordineDettaglio) {
		List<OrdineDettaglio> listOrdineDettaglio = loadOrdineDettaglio();
		if(!listOrdineDettaglio.contains(ordineDettaglio)) {
		try {
				new WriteOrdineDettaglio().add(ordineDettaglio, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Ordine ordine) {
		List<Ordine> listOrdine = loadOrdine();
		if(!listOrdine.contains(ordine)) {
		try {
				new WriteOrdine().add(ordine, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(OrdineTestata ordineTestata) {
		List<OrdineTestata> listOrdineTestata = loadOrdineTestata();
		if(!listOrdineTestata.contains(ordineTestata)) {
		try {
				new WriteOrdineTestata().add(ordineTestata, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Pagamento pagamento) {
		List<Pagamento> listPagamento = loadPagamento();
		if(!listPagamento.contains(pagamento)) {
		try {
				new WritePagamento().add(pagamento, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Percipiente percipiente) {
		List<Percipiente> listPercipiente = loadPercipiente();
		if(!listPercipiente.contains(percipiente)) {
		try {
				new WritePercipiente().add(percipiente, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(PianoConto pianoConto) {
		List<PianoConto> listPianoConto = loadPianoConto();
		if(!listPianoConto.contains(pianoConto)) {
		try {
				new WritePianoConto().add(pianoConto, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(PreventivoDettaglio preventivoDettaglio) {
		List<PreventivoDettaglio> listPreventivoDettaglio = loadPreventivoDettaglio();
		if(!listPreventivoDettaglio.contains(preventivoDettaglio)) {
		try {
				new WritePreventivoDettaglio().add(preventivoDettaglio, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(PreventivoTestata preventivoTestata) {
		List<PreventivoTestata> listPreventivoTestata = loadPreventivoTestata();
		if(!listPreventivoTestata.contains(preventivoTestata)) {
		try {
				new WritePreventivoTestata().add(preventivoTestata, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Prezzo prezzo) {
		List<Prezzo> listPrezzo = loadPrezzo();
		if(!listPrezzo.contains(prezzo)) {
		try {
				new WritePrezzo().add(prezzo, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(ProvvigioneAgente provvigioneAgente) {
		List<ProvvigioneAgente> listProvvigioneAgente = loadProvvigioneAgente();
		if(!listProvvigioneAgente.contains(provvigioneAgente)) {
		try {
				new WriteProvvigioneAgente().add(provvigioneAgente, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(RaggruppamentoClienteFornitore raggruppamentoClienteFornitore) {
		List<RaggruppamentoClienteFornitore> listRaggruppamentoClienteFornitore = loadRaggruppamentoClienteFornitore();
		if(!listRaggruppamentoClienteFornitore.contains(raggruppamentoClienteFornitore)) {
		try {
				new WriteRaggruppamentoClienteFornitore().add(raggruppamentoClienteFornitore, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(RappresentanteFiscale rappresentanteFiscale) {
		List<RappresentanteFiscale> listRappresentanteFiscale = loadRappresentanteFiscale();
		if(!listRappresentanteFiscale.contains(rappresentanteFiscale)) {
		try {
				new WriteRappresentanteFiscale().add(rappresentanteFiscale, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(ResaMerce resaMerce) {
		List<ResaMerce> listResaMerce = loadResaMerce();
		if(!listResaMerce.contains(resaMerce)) {
		try {
				new WriteResaMerce().add(resaMerce, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Ricezione ricezione) {
		List<Ricezione> listRicezione = loadRicezione();
		if(!listRicezione.contains(ricezione)) {
		try {
				new WriteRicezione().add(ricezione, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Scadenze scadenze) {
		List<Scadenze> listScadenze = loadScadenze();
		if(!listScadenze.contains(scadenze)) {
		try {
				new WriteScadenze().add(scadenze, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}

	public static void add(SottogruppoMerceologico sottogruppoMerceologico) {
		List<SottogruppoMerceologico> listSottogruppoMerceologico = loadSottogruppoMerceologico();
		if(!listSottogruppoMerceologico.contains(sottogruppoMerceologico)) {
		try {
				new WriteSottogruppoMerceologico().add(sottogruppoMerceologico, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(StabileOrganizzazione stabileOrganizzazione) {
		List<StabileOrganizzazione> listStabileOrganizzazione = loadStabileOrganizzazione();
		if(!listStabileOrganizzazione.contains(stabileOrganizzazione)) {
		try {
				new WriteStabileOrganizzazione().add(stabileOrganizzazione, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}

	public static void add(StatoFattura statoFattura) {
		List<StatoFattura> listStatoFattura = loadStatoFattura();
		if(!listStatoFattura.contains(statoFattura)) {
		try {
				new WriteStatoFattura().add(statoFattura, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Contatto telefono) {
		List<Contatto> listTelefono = loadContatto();
		if(!listTelefono.contains(telefono)) {
		try {
				new WriteContatto().add(telefono, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(TerzoIntermediario terzoIntermediario) {
		List<TerzoIntermediario> listTerzoIntermediario = loadTerzoIntermediario();
		if(!listTerzoIntermediario.contains(terzoIntermediario)) {
		try {
				new WriteTerzoIntermediario().add(terzoIntermediario, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(TipoBento tipoBento) {
		List<TipoBento> listTipoBento = loadTipoBento();
		if(!listTipoBento.contains(tipoBento)) {
		try {
				new WriteTipoBento().add(tipoBento, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(TipoCliente tipoCliente) {
		List<TipoCliente> listTipoCliente = loadTipoCliente();
		if(!listTipoCliente.contains(tipoCliente)) {
		try {
				new WriteTipoCliente().add(tipoCliente, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(TipoIndirizzo tipoIndirizzo) {
		List<TipoIndirizzo> listTipoIndirizzo = loadTipoIndirizzo();
		if(!listTipoIndirizzo.contains(tipoIndirizzo)) {
		try {
				new WriteTipoIndirizzo().add(tipoIndirizzo, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(TipoMagazzino tipoMagazzino) {
		List<TipoMagazzino> listTipoMagazzino = loadTipoMagazzino();
		if(!listTipoMagazzino.contains(tipoMagazzino)) {
		try {
				new WriteTipoMagazzino().add(tipoMagazzino, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(TipoPagamento tipoPagamento) {
		List<TipoPagamento> listTipoPagamento = loadTipoPagamento();
		if(!listTipoPagamento.contains(tipoPagamento)) {
		try {
				new WriteTipoPagamento().add(tipoPagamento, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(TipoRigaDocumento tipoRigaDocumento) {
		List<TipoRigaDocumento> listTipoRigaDocumento = loadTipoRigaDocumento();
		if(!listTipoRigaDocumento.contains(tipoRigaDocumento)) {
		try {
				new WriteTipoRigaDocumento().add(tipoRigaDocumento, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(UnitaMisura unitaMisura) {
		List<UnitaMisura> listUnitaMisura = loadUnitaMisura();
		if(!listUnitaMisura.contains(unitaMisura)) {
		try {
				new WriteUnitaMisura().add(unitaMisura, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Utente utente) {
		List<Utente> listUtente = loadUtente();
		if(!listUtente.contains(utente)) {
		try {
				new WriteUtente().add(utente, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
	public static void add(Vettore vettore) {
		List<Vettore> listVettore = loadVettore();
		if(!listVettore.contains(vettore)) {
		try {
				new WriteVettore().add(vettore, false);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		}
	}
}
