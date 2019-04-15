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
			return new ReadCliente().read(loadTipoCliente(), loadResaMerce(), loadImballo(), loadRaggruppamentoClienteFornitore(), loadPagamento(), loadBanca(), loadIva(), loadAgente(), loadVettore(), loadIso(), loadStabileOrganizzazione(), loadRappresentanteFiscale(), loadTerzoIntermediario(), loadContatto());
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
	
	public static int add(Agente agente) {
		return new WriteAgente().add(agente);
	}
	public static int add(Allegato allegato) {
		return new WriteAllegato().add(allegato);
	}
	public static int add(AltroDatoGestionale altroDatoGestionale) {
		return new WriteAltroDatoGestionale().add(altroDatoGestionale, false);
	}
	public static int add(AreaGeografica areaGeografica) {
		return new WriteAreaGeografica().add(areaGeografica, false);
	}
	public static int add(ArticoloMagazzinoDescrizioneMultilingua articoloMagazzinoDescrizioneMultilingua) {
		return new WriteArticoloMagazzinoDescrizioneMultilingua().add(articoloMagazzinoDescrizioneMultilingua, false);
	}
	public static int add(ArticoloMagazzino articoloMagazzino) {
		return new WriteArticoloMagazzino().add(articoloMagazzino, false);
	}
	public static int add(BancaGlobale bancaGlobale) {
		return new WriteBancaGlobale().add(bancaGlobale, false);
	}
	public static int add(Banca banca) {
		return new WriteBanca().add(banca, false);
	}
	public static int add(BentoDettaglio bentoDettaglio) {
		return new WriteBentoDettaglio().add(bentoDettaglio, false);
	}
	public static int add(BentoTestata bentoTestata) {
		return new WriteBentoTestata().add(bentoTestata, false);
	}
	public static int add(CapItaliano capItaliano) {
		return new WriteCapItaliano().add(capItaliano, false);
	}
	public static int add(CausaleMagazzino causaleMagazzino) {
		return new WriteCausaleMagazzino().add(causaleMagazzino, false);
	}
	public static int add(Cliente cliente) {
		return new WriteCliente().add(cliente);
	}
	public static int add(CodiceABarre codiceABarre) {
		return new WriteCodiceABarre().add(codiceABarre, false);
	}
	public static int add(Confezione confezione) {
		return new WriteConfezione().add(confezione, false);
	}
	public static int add(Contratto contratto) {
		return new WriteContratto().add(contratto, false);
	}
	public static int add(Controparte controparte) {
		return new WriteControparte().add(controparte, false);
	}
	public static int add(Convenzione convenzione) {
		return new WriteConvenzione().add(convenzione, false);
	}
	public static int add(DdtDettaglio ddtDettaglio) {
		return new WriteDdtDettaglio().add(ddtDettaglio, false);
	}
	public static int add(DdtTestata ddtTestata) {
		return new WriteDdtTestata().add(ddtTestata, false);
	}
	public static int add(FatturaCollegata fatturaCollegata) {
		return new WriteFatturaCollegata().add(fatturaCollegata, false);
	}
	public static int add(FatturaDettaglio fatturaDettaglio) {
		return new WriteFatturaDettaglio().add(fatturaDettaglio, false);
	}
	public static int add(FatturaProformaDettaglio fatturaProformaDettaglio) {
		return new WriteFatturaProformaDettaglio().add(fatturaProformaDettaglio, false);
	}
	public static int add(FatturaProformaTestata fatturaProformaTestata) {
		return new WriteFatturaProformaTestata().add(fatturaProformaTestata, false);
	}
	public static int add(FatturaTestata fatturaTestata) {
		return new WriteFatturaTestata().add(fatturaTestata, false);
	}
	public static int add(Gruppo gruppo) {
		return new WriteGruppo().add(gruppo, false);
	}
	public static int add(GruppoMerceologico gruppoMerceologico) {
		return new WriteGruppoMerceologico().add(gruppoMerceologico, false);
	}
	public static int add(Imballo imballo) {
		return new WriteImballo().add(imballo, false);
	}
	public static int add(IndirizzoGeografico indirizzoGeografico) {
		return new WriteIndirizzoGeografico().add(indirizzoGeografico, false);
	}
	public static int add(Iso iso) {
		return new WriteIso().add(iso, false);
	}
	public static int add(Iva iva) {
		return new WriteIva().add(iva, false);
	}
	public static int add(ListinoArticolo listinoArticolo) {
		return new WriteListinoArticolo().add(listinoArticolo, false);
	}
	
	public static int add(ListinoPersonalizzato listinoPersonalizzato) {
		return new WriteListinoPersonalizzato().add(listinoPersonalizzato, false);
	}
	public static int add(Magazzino magazzino) {
		return new WriteMagazzino().add(magazzino, false);
	}
	public static int add(OrdineDettaglio ordineDettaglio) {
		return new WriteOrdineDettaglio().add(ordineDettaglio, false);
	}
	public static int add(Ordine ordine) {
		return new WriteOrdine().add(ordine, false);
	}
	public static int add(OrdineTestata ordineTestata) {
		return new WriteOrdineTestata().add(ordineTestata, false);
	}
	public static int add(Pagamento pagamento) {
		return new WritePagamento().add(pagamento, false);
	}
	public static int add(Percipiente percipiente) {
		return new WritePercipiente().add(percipiente, false);
	}
	public static int add(PianoConto pianoConto) {
		return new WritePianoConto().add(pianoConto, false);
	}
	public static int add(PreventivoDettaglio preventivoDettaglio) {
		return new WritePreventivoDettaglio().add(preventivoDettaglio, false);
	}
	public static int add(PreventivoTestata preventivoTestata) {
		return new WritePreventivoTestata().add(preventivoTestata, false);
	}
	public static int add(Prezzo prezzo) {
		return new WritePrezzo().add(prezzo, false);
	}
	public static int add(ProvvigioneAgente provvigioneAgente) {
		return new WriteProvvigioneAgente().add(provvigioneAgente, false);
	}
	public static int add(RaggruppamentoClienteFornitore raggruppamentoClienteFornitore) {
		return new WriteRaggruppamentoClienteFornitore().add(raggruppamentoClienteFornitore, false);
	}
	public static int add(RappresentanteFiscale rappresentanteFiscale) {
		return new WriteRappresentanteFiscale().add(rappresentanteFiscale, false);
	}
	public static int add(ResaMerce resaMerce) {
		return new WriteResaMerce().add(resaMerce, false);
	}
	public static int add(Ricezione ricezione) {
		return new WriteRicezione().add(ricezione, false);
	}
	public static int add(Scadenze scadenze) {
		return new WriteScadenze().add(scadenze, false);
	}
	public static int add(SottogruppoMerceologico sottogruppoMerceologico) {
		return new WriteSottogruppoMerceologico().add(sottogruppoMerceologico, false);
	}
	public static int add(StabileOrganizzazione stabileOrganizzazione) {
		return new WriteStabileOrganizzazione().add(stabileOrganizzazione, false);
	}

	public static int add(StatoFattura statoFattura) {
		return new WriteStatoFattura().add(statoFattura, false);
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
	public static int add(Telefono telefono) {
		return new WriteTelefono().add(telefono, false);
>>>>>>> samuFaCose
	}
	public static int add(TerzoIntermediario terzoIntermediario) {
		return new WriteTerzoIntermediario().add(terzoIntermediario, false);
	}
	public static int add(TipoBento tipoBento) {
		return new WriteTipoBento().add(tipoBento, false);
	}
	public static int add(TipoCliente tipoCliente) {
		return new WriteTipoCliente().add(tipoCliente, false);
	}
	public static int add(TipoIndirizzo tipoIndirizzo) {
		return new WriteTipoIndirizzo().add(tipoIndirizzo, false);
	}
	public static int add(TipoMagazzino tipoMagazzino) {
		return new WriteTipoMagazzino().add(tipoMagazzino, false);
	}
	public static int add(TipoPagamento tipoPagamento) {
		return new WriteTipoPagamento().add(tipoPagamento, false);
	}
	public static int add(TipoRigaDocumento tipoRigaDocumento) {
		return new WriteTipoRigaDocumento().add(tipoRigaDocumento, false);
	}
	public static int add(UnitaMisura unitaMisura) {
		return new WriteUnitaMisura().add(unitaMisura, false);
	}
	public static int add(Utente utente) {
		return new WriteUtente().add(utente, false);
	}
	public static int add(Vettore vettore) {
		return new WriteVettore().add(vettore, false);
	}
}
