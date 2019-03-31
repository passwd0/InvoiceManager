package invoicemanager.model.fatturazione;
import java.time.LocalDate;

public class FatturaProformaTestata{
	private int numeroFattura; //  NOT NULL,
	private LocalDate dataFattura; //  NOT NULL,
	private boolean indicatoreStatoAvanzamento; // COLLATE Latin1_General_CI_AS NULL,
	private int sezionale = 1;
	private String codiceClienteFatturazione; //(30) COLLATE Latin1_General_CI_AS NULL,
	private String codiceEsenzioneIva; //(4) COLLATE Latin1_General_CI_AS NULL,
	private String codiceAgente; //(10) COLLATE Latin1_General_CI_AS NULL,
	private String codiceCausale; //(4) COLLATE Latin1_General_CI_AS NULL,
	private String codiceCausalePrelievi; //(4) COLLATE Latin1_General_CI_AS NULL,
	private float percentualeSconto; //  NULL,
	private float percentualeScontoPagamento; //  NULL,
	private float percentualeProvvigione; //  NULL,
	private String descrizione; //(200) COLLATE Latin1_General_CI_AS NULL,
	private int numeroCopieFattura; //  NULL,
	private boolean indicatoreAddebitoBolli; // COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatoreAddebitoSpeseIncasso; // COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatoreScaricoMagazzino; // COLLATE Latin1_General_CI_AS NULL,
	private int codiceListino; //  NULL,
	private String codiceResa; //(4) COLLATE Latin1_General_CI_AS NULL,
	private String codiceVettore; //(4) COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatoreFatturaAccompagnatoria; // COLLATE Latin1_General_CI_AS NULL,
	private String codicePagamento; //(4) COLLATE Latin1_General_CI_AS NULL,
	private String codiceBanca; //(4) COLLATE Latin1_General_CI_AS NULL,
	private int numeroDDT; //  NULL,
	private LocalDate dataDDT; //  NULL,
	private String codiceImballo; //(4) COLLATE Latin1_General_CI_AS NULL,
	private float pesoColli; //  NULL,
	private float numeroColli; //  NULL,
	private float acconto; //  NULL,
	private String codiceDivisa; //(4) COLLATE Latin1_General_CI_AS NULL,
	private float cambio; //  NULL,
	private String codiceClienteSpedizione; //(30) COLLATE Latin1_General_CI_AS NULL,
	private String nomeSpedizione; //(100) COLLATE Latin1_General_CI_AS NULL,
	private String indirizzoSpedizione; //(100) COLLATE Latin1_General_CI_AS NULL,
	private String capSpedizione; //(20) COLLATE Latin1_General_CI_AS NULL,
	private String cittaSpedizione; //(50) COLLATE Latin1_General_CI_AS NULL,
	private String provinciaSpedizione; //(30) COLLATE Latin1_General_CI_AS NULL,
	private String codiceNazioneSpedizione; //(10) COLLATE Latin1_General_CI_AS NULL,
	private LocalDate dataInserimento; //  NULL,
	private LocalDate dataUltimaModifica; //  NULL,
	private String note; //(500) COLLATE Latin1_General_CI_AS NULL,
	private String codiceLingua; //(4) COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatoreFatturazioneDifferita; // COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatoreEdi; // COLLATE Latin1_General_CI_AS NULL,
	private String codiceFilialeEdi; //(50) COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatoreEmail; // COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatorePA; // COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatoreXML; // COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatorePlafond; // COLLATE Latin1_General_CI_AS

	public FatturaProformaTestata(int numeroFattura, LocalDate dataFattura){
		this.numeroFattura = numeroFattura;
		this.dataFattura = dataFattura;
	}

	public FatturaProformaTestata(int numeroFattura, LocalDate dataFattura, boolean indicatoreStatoAvanzamento, int sezionale,
			String codiceClienteFatturazione, String codiceEsenzioneIva, String codiceAgente, String codiceCausale,
			String codiceCausalePrelievi, float percentualeSconto, float percentualeScontoPagamento,
			float percentualeProvvigione, String descrizione, int numeroCopieFattura, boolean indicatoreAddebitoBolli,
			boolean indicatoreAddebitoSpeseIncasso, boolean indicatoreScaricoMagazzino, int codiceListino,
			String codiceResa, String codiceVettore, boolean indicatoreFatturaAccompagnatoria, String codicePagamento,
			String codiceBanca, int numeroDDT, LocalDate dataDDT, String codiceImballo, float pesoColli,
			float numeroColli, float acconto, String codiceDivisa, float cambio, String codiceClienteSpedizione,
			String nomeSpedizione, String indirizzoSpedizione, String capSpedizione, String cittaSpedizione,
			String provinciaSpedizione, String codiceNazioneSpedizione, LocalDate dataInserimento,
			LocalDate dataUltimaModifica, String note, String codiceLingua, boolean indicatoreFatturazioneDifferita,
			boolean indicatoreEdi, String codiceFilialeEdi, boolean indicatoreEmail, boolean indicatorePA,
			boolean indicatoreXML, boolean indicatorePlafond) {
		this.numeroFattura = numeroFattura;
		this.dataFattura = dataFattura;
		this.indicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
		this.sezionale = sezionale;
		this.codiceClienteFatturazione = codiceClienteFatturazione;
		this.codiceEsenzioneIva = codiceEsenzioneIva;
		this.codiceAgente = codiceAgente;
		this.codiceCausale = codiceCausale;
		this.codiceCausalePrelievi = codiceCausalePrelievi;
		this.percentualeSconto = percentualeSconto;
		this.percentualeScontoPagamento = percentualeScontoPagamento;
		this.percentualeProvvigione = percentualeProvvigione;
		this.descrizione = descrizione;
		this.numeroCopieFattura = numeroCopieFattura;
		this.indicatoreAddebitoBolli = indicatoreAddebitoBolli;
		this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
		this.indicatoreScaricoMagazzino = indicatoreScaricoMagazzino;
		this.codiceListino = codiceListino;
		this.codiceResa = codiceResa;
		this.codiceVettore = codiceVettore;
		this.indicatoreFatturaAccompagnatoria = indicatoreFatturaAccompagnatoria;
		this.codicePagamento = codicePagamento;
		this.codiceBanca = codiceBanca;
		this.numeroDDT = numeroDDT;
		this.dataDDT = dataDDT;
		this.codiceImballo = codiceImballo;
		this.pesoColli = pesoColli;
		this.numeroColli = numeroColli;
		this.acconto = acconto;
		this.codiceDivisa = codiceDivisa;
		this.cambio = cambio;
		this.codiceClienteSpedizione = codiceClienteSpedizione;
		this.nomeSpedizione = nomeSpedizione;
		this.indirizzoSpedizione = indirizzoSpedizione;
		this.capSpedizione = capSpedizione;
		this.cittaSpedizione = cittaSpedizione;
		this.provinciaSpedizione = provinciaSpedizione;
		this.codiceNazioneSpedizione = codiceNazioneSpedizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.note = note;
		this.codiceLingua = codiceLingua;
		this.indicatoreFatturazioneDifferita = indicatoreFatturazioneDifferita;
		this.indicatoreEdi = indicatoreEdi;
		this.codiceFilialeEdi = codiceFilialeEdi;
		this.indicatoreEmail = indicatoreEmail;
		this.indicatorePA = indicatorePA;
		this.indicatoreXML = indicatoreXML;
		this.indicatorePlafond = indicatorePlafond;
	}

	public int getSezionale() {
		return sezionale;
	}

	public void setSezionale(int sezionale) {
		this.sezionale = sezionale;
	}

	public int getNumeroFattura() {
		return numeroFattura;
	}

	public void setNumeroFattura(int numeroFattura) {
		this.numeroFattura = numeroFattura;
	}

	public LocalDate getDataFattura() {
		return dataFattura;
	}

	public void setDataFattura(LocalDate dataFattura) {
		this.dataFattura = dataFattura;
	}

	public boolean isIndicatoreStatoAvanzamento() {
		return indicatoreStatoAvanzamento;
	}

	public void setIndicatoreStatoAvanzamento(boolean indicatoreStatoAvanzamento) {
		this.indicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
	}

	public String getCodiceClienteFatturazione() {
		return codiceClienteFatturazione;
	}

	public void setCodiceClienteFatturazione(String codiceClienteFatturazione) {
		this.codiceClienteFatturazione = codiceClienteFatturazione;
	}

	public String getCodiceEsenzioneIva() {
		return codiceEsenzioneIva;
	}

	public void setCodiceEsenzioneIva(String codiceEsenzioneIva) {
		this.codiceEsenzioneIva = codiceEsenzioneIva;
	}

	public String getCodiceAgente() {
		return codiceAgente;
	}

	public void setCodiceAgente(String codiceAgente) {
		this.codiceAgente = codiceAgente;
	}

	public String getCodiceCausale() {
		return codiceCausale;
	}

	public void setCodiceCausale(String codiceCausale) {
		this.codiceCausale = codiceCausale;
	}

	public String getCodiceCausalePrelievi() {
		return codiceCausalePrelievi;
	}

	public void setCodiceCausalePrelievi(String codiceCausalePrelievi) {
		this.codiceCausalePrelievi = codiceCausalePrelievi;
	}

	public float getPercentualeSconto() {
		return percentualeSconto;
	}

	public void setPercentualeSconto(float percentualeSconto) {
		this.percentualeSconto = percentualeSconto;
	}

	public float getPercentualeScontoPagamento() {
		return percentualeScontoPagamento;
	}

	public void setPercentualeScontoPagamento(float percentualeScontoPagamento) {
		this.percentualeScontoPagamento = percentualeScontoPagamento;
	}

	public float getPercentualeProvvigione() {
		return percentualeProvvigione;
	}

	public void setPercentualeProvvigione(float percentualeProvvigione) {
		this.percentualeProvvigione = percentualeProvvigione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getNumeroCopieFattura() {
		return numeroCopieFattura;
	}

	public void setNumeroCopieFattura(int numeroCopieFattura) {
		this.numeroCopieFattura = numeroCopieFattura;
	}

	public boolean isIndicatoreAddebitoBolli() {
		return indicatoreAddebitoBolli;
	}

	public void setIndicatoreAddebitoBolli(boolean indicatoreAddebitoBolli) {
		this.indicatoreAddebitoBolli = indicatoreAddebitoBolli;
	}

	public boolean isIndicatoreAddebitoSpeseIncasso() {
		return indicatoreAddebitoSpeseIncasso;
	}

	public void setIndicatoreAddebitoSpeseIncasso(boolean indicatoreAddebitoSpeseIncasso) {
		this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
	}

	public boolean isIndicatoreScaricoMagazzino() {
		return indicatoreScaricoMagazzino;
	}

	public void setIndicatoreScaricoMagazzino(boolean indicatoreScaricoMagazzino) {
		this.indicatoreScaricoMagazzino = indicatoreScaricoMagazzino;
	}

	public int getCodiceListino() {
		return codiceListino;
	}

	public void setCodiceListino(int codiceListino) {
		this.codiceListino = codiceListino;
	}

	public String getCodiceResa() {
		return codiceResa;
	}

	public void setCodiceResa(String codiceResa) {
		this.codiceResa = codiceResa;
	}

	public String getCodiceVettore() {
		return codiceVettore;
	}

	public void setCodiceVettore(String codiceVettore) {
		this.codiceVettore = codiceVettore;
	}

	public boolean isIndicatoreFatturaAccompagnatoria() {
		return indicatoreFatturaAccompagnatoria;
	}

	public void setIndicatoreFatturaAccompagnatoria(boolean indicatoreFatturaAccompagnatoria) {
		this.indicatoreFatturaAccompagnatoria = indicatoreFatturaAccompagnatoria;
	}

	public String getCodicePagamento() {
		return codicePagamento;
	}

	public void setCodicePagamento(String codicePagamento) {
		this.codicePagamento = codicePagamento;
	}

	public String getCodiceBanca() {
		return codiceBanca;
	}

	public void setCodiceBanca(String codiceBanca) {
		this.codiceBanca = codiceBanca;
	}

	public int getNumeroDDT() {
		return numeroDDT;
	}

	public void setNumeroDDT(int numeroDDT) {
		this.numeroDDT = numeroDDT;
	}

	public LocalDate getDataDDT() {
		return dataDDT;
	}

	public void setDataDDT(LocalDate dataDDT) {
		this.dataDDT = dataDDT;
	}

	public String getCodiceImballo() {
		return codiceImballo;
	}

	public void setCodiceImballo(String codiceImballo) {
		this.codiceImballo = codiceImballo;
	}

	public float getPesoColli() {
		return pesoColli;
	}

	public void setPesoColli(float pesoColli) {
		this.pesoColli = pesoColli;
	}

	public float getNumeroColli() {
		return numeroColli;
	}

	public void setNumeroColli(float numeroColli) {
		this.numeroColli = numeroColli;
	}

	public float getAcconto() {
		return acconto;
	}

	public void setAcconto(float acconto) {
		this.acconto = acconto;
	}

	public String getCodiceDivisa() {
		return codiceDivisa;
	}

	public void setCodiceDivisa(String codiceDivisa) {
		this.codiceDivisa = codiceDivisa;
	}

	public float getCambio() {
		return cambio;
	}

	public void setCambio(float cambio) {
		this.cambio = cambio;
	}

	public String getCodiceClienteSpedizione() {
		return codiceClienteSpedizione;
	}

	public void setCodiceClienteSpedizione(String codiceClienteSpedizione) {
		this.codiceClienteSpedizione = codiceClienteSpedizione;
	}

	public String getNomeSpedizione() {
		return nomeSpedizione;
	}

	public void setNomeSpedizione(String nomeSpedizione) {
		this.nomeSpedizione = nomeSpedizione;
	}

	public String getIndirizzoSpedizione() {
		return indirizzoSpedizione;
	}

	public void setIndirizzoSpedizione(String indirizzoSpedizione) {
		this.indirizzoSpedizione = indirizzoSpedizione;
	}

	public String getCapSpedizione() {
		return capSpedizione;
	}

	public void setCapSpedizione(String capSpedizione) {
		this.capSpedizione = capSpedizione;
	}

	public String getCittaSpedizione() {
		return cittaSpedizione;
	}

	public void setCittaSpedizione(String cittaSpedizione) {
		this.cittaSpedizione = cittaSpedizione;
	}

	public String getProvinciaSpedizione() {
		return provinciaSpedizione;
	}

	public void setProvinciaSpedizione(String provinciaSpedizione) {
		this.provinciaSpedizione = provinciaSpedizione;
	}

	public String getCodiceNazioneSpedizione() {
		return codiceNazioneSpedizione;
	}

	public void setCodiceNazioneSpedizione(String codiceNazioneSpedizione) {
		this.codiceNazioneSpedizione = codiceNazioneSpedizione;
	}

	public LocalDate getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(LocalDate dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public LocalDate getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(LocalDate dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCodiceLingua() {
		return codiceLingua;
	}

	public void setCodiceLingua(String codiceLingua) {
		this.codiceLingua = codiceLingua;
	}

	public boolean isIndicatoreFatturazioneDifferita() {
		return indicatoreFatturazioneDifferita;
	}

	public void setIndicatoreFatturazioneDifferita(boolean indicatoreFatturazioneDifferita) {
		this.indicatoreFatturazioneDifferita = indicatoreFatturazioneDifferita;
	}

	public boolean isIndicatoreEdi() {
		return indicatoreEdi;
	}

	public void setIndicatoreEdi(boolean indicatoreEdi) {
		this.indicatoreEdi = indicatoreEdi;
	}

	public String getCodiceFilialeEdi() {
		return codiceFilialeEdi;
	}

	public void setCodiceFilialeEdi(String codiceFilialeEdi) {
		this.codiceFilialeEdi = codiceFilialeEdi;
	}

	public boolean isIndicatoreEmail() {
		return indicatoreEmail;
	}

	public void setIndicatoreEmail(boolean indicatoreEmail) {
		this.indicatoreEmail = indicatoreEmail;
	}

	public boolean isIndicatorePA() {
		return indicatorePA;
	}

	public void setIndicatorePA(boolean indicatorePA) {
		this.indicatorePA = indicatorePA;
	}

	public boolean isIndicatoreXML() {
		return indicatoreXML;
	}

	public void setIndicatoreXML(boolean indicatoreXML) {
		this.indicatoreXML = indicatoreXML;
	}

	public boolean isIndicatorePlafond() {
		return indicatorePlafond;
	}

	public void setIndicatorePlafond(boolean indicatorePlafond) {
		this.indicatorePlafond = indicatorePlafond;
	}
}
