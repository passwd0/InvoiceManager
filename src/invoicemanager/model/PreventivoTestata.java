package invoicemanager.model;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PreventivoTestata {
	private int numeroPreventivo; //  NOT NULL
	private LocalDate dataPreventivo; //  NOT NULL
	private boolean indicatoreStatoAvanzamento; // NULL
	private LocalDate dataConsegna; //  NULL
	private LocalDate dataValidita; //  NULL
	private String periodoValidita; //(100) NULL
	private boolean indicatoreUtilizzoDataValidita; // NULL
	private String codiceCliente; //(30) NULL
	private String attenzione; //(50) NULL
	private String oggetto; //(2000) NULL
	private String riferimentoInterno; //(50) NULL
	private String numeroInterno; //(50) NULL
	private String codiceIVA; //(4) NULL
	private String codiceAgente; //(10) NULL
	private String codiceResa; //(4) NULL
	private String codiceVettore; //(4) NULL
	private String codicePagamento; //(4) NULL
	private String codiceBanca; //(4) NULL
	private String codiceCausale; //(4) NULL
	private String codiceCausalePrelievo; //(4) NULL
	private boolean codiceListino; // NULL
	private String descrizioneOrdine; //(200) NULL
	private String codiceDivisa; //(4) NULL
	private float cambio; //  NULL
	private String numeroFax; //(30) NULL
	private String venditore; //(50) NULL
	private boolean indicatoreAddebitoBolli; // NULL
	private boolean indicatoreAddebitoSpeseIncasso; // NULL
	private String note; //(200) NULL
	private String codiceClienteSpedizione; //(30) NULL
	private String nomeSpedizione; //(50) NULL
	private String indirizzoSpedizione; //(100) NULL
	private String capSpedizione; //(20) NULL
	private String cittaSpedizione; //(50) NULL
	private String provinciaSpedizione; //(30) NULL
	private String codiceNazioneSpedizione; //(10) NULL
	private String loginInserimento; //(30) NULL
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public PreventivoTestata(int numeroPreventivo, LocalDate dataPreventivo){
		this.numeroPreventivo = numeroPreventivo;
		this.dataPreventivo = dataPreventivo;
	}

	public PreventivoTestata(int numeroPreventivo, LocalDate dataPreventivo, boolean indicatoreStatoAvanzamento,
			LocalDate dataConsegna, LocalDate dataValidita, String periodoValidita,
			boolean indicatoreUtilizzoDataValidita, String codiceCliente, String attenzione, String oggetto,
			String riferimentoInterno, String numeroInterno, String codiceIVA, String codiceAgente, String codiceResa,
			String codiceVettore, String codicePagamento, String codiceBanca, String codiceCausale,
			String codiceCausalePrelievo, boolean codiceListino, String descrizioneOrdine, String codiceDivisa,
			float cambio, String numeroFax, String venditore, boolean indicatoreAddebitoBolli,
			boolean indicatoreAddebitoSpeseIncasso, String note, String codiceClienteSpedizione, String nomeSpedizione,
			String indirizzoSpedizione, String capSpedizione, String cittaSpedizione, String provinciaSpedizione,
			String codiceNazioneSpedizione, String loginInserimento, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.numeroPreventivo = numeroPreventivo;
		this.dataPreventivo = dataPreventivo;
		this.indicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
		this.dataConsegna = dataConsegna;
		this.dataValidita = dataValidita;
		this.periodoValidita = periodoValidita;
		this.indicatoreUtilizzoDataValidita = indicatoreUtilizzoDataValidita;
		this.codiceCliente = codiceCliente;
		this.attenzione = attenzione;
		this.oggetto = oggetto;
		this.riferimentoInterno = riferimentoInterno;
		this.numeroInterno = numeroInterno;
		this.codiceIVA = codiceIVA;
		this.codiceAgente = codiceAgente;
		this.codiceResa = codiceResa;
		this.codiceVettore = codiceVettore;
		this.codicePagamento = codicePagamento;
		this.codiceBanca = codiceBanca;
		this.codiceCausale = codiceCausale;
		this.codiceCausalePrelievo = codiceCausalePrelievo;
		this.codiceListino = codiceListino;
		this.descrizioneOrdine = descrizioneOrdine;
		this.codiceDivisa = codiceDivisa;
		this.cambio = cambio;
		this.numeroFax = numeroFax;
		this.venditore = venditore;
		this.indicatoreAddebitoBolli = indicatoreAddebitoBolli;
		this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
		this.note = note;
		this.codiceClienteSpedizione = codiceClienteSpedizione;
		this.nomeSpedizione = nomeSpedizione;
		this.indirizzoSpedizione = indirizzoSpedizione;
		this.capSpedizione = capSpedizione;
		this.cittaSpedizione = cittaSpedizione;
		this.provinciaSpedizione = provinciaSpedizione;
		this.codiceNazioneSpedizione = codiceNazioneSpedizione;
		this.loginInserimento = loginInserimento;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public int getNumeroPreventivo() {
		return numeroPreventivo;
	}

	public void setNumeroPreventivo(int numeroPreventivo) {
		this.numeroPreventivo = numeroPreventivo;
	}

	public LocalDate getDataPreventivo() {
		return dataPreventivo;
	}

	public void setDataPreventivo(LocalDate dataPreventivo) {
		this.dataPreventivo = dataPreventivo;
	}

	public boolean isIndicatoreStatoAvanzamento() {
		return indicatoreStatoAvanzamento;
	}

	public void setIndicatoreStatoAvanzamento(boolean indicatoreStatoAvanzamento) {
		this.indicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
	}

	public LocalDate getDataConsegna() {
		return dataConsegna;
	}

	public void setDataConsegna(LocalDate dataConsegna) {
		this.dataConsegna = dataConsegna;
	}

	public LocalDate getDataValidita() {
		return dataValidita;
	}

	public void setDataValidita(LocalDate dataValidita) {
		this.dataValidita = dataValidita;
	}

	public String getPeriodoValidita() {
		return periodoValidita;
	}

	public void setPeriodoValidita(String periodoValidita) {
		this.periodoValidita = periodoValidita;
	}

	public boolean isIndicatoreUtilizzoDataValidita() {
		return indicatoreUtilizzoDataValidita;
	}

	public void setIndicatoreUtilizzoDataValidita(boolean indicatoreUtilizzoDataValidita) {
		this.indicatoreUtilizzoDataValidita = indicatoreUtilizzoDataValidita;
	}

	public String getCodiceCliente() {
		return codiceCliente;
	}

	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}

	public String getAttenzione() {
		return attenzione;
	}

	public void setAttenzione(String attenzione) {
		this.attenzione = attenzione;
	}

	public String getOggetto() {
		return oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	public String getRiferimentoInterno() {
		return riferimentoInterno;
	}

	public void setRiferimentoInterno(String riferimentoInterno) {
		this.riferimentoInterno = riferimentoInterno;
	}

	public String getNumeroInterno() {
		return numeroInterno;
	}

	public void setNumeroInterno(String numeroInterno) {
		this.numeroInterno = numeroInterno;
	}

	public String getCodiceIVA() {
		return codiceIVA;
	}

	public void setCodiceIVA(String codiceIVA) {
		this.codiceIVA = codiceIVA;
	}

	public String getCodiceAgente() {
		return codiceAgente;
	}

	public void setCodiceAgente(String codiceAgente) {
		this.codiceAgente = codiceAgente;
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

	public String getCodiceCausale() {
		return codiceCausale;
	}

	public void setCodiceCausale(String codiceCausale) {
		this.codiceCausale = codiceCausale;
	}

	public String getCodiceCausalePrelievo() {
		return codiceCausalePrelievo;
	}

	public void setCodiceCausalePrelievo(String codiceCausalePrelievo) {
		this.codiceCausalePrelievo = codiceCausalePrelievo;
	}

	public boolean isCodiceListino() {
		return codiceListino;
	}

	public void setCodiceListino(boolean codiceListino) {
		this.codiceListino = codiceListino;
	}

	public String getDescrizioneOrdine() {
		return descrizioneOrdine;
	}

	public void setDescrizioneOrdine(String descrizioneOrdine) {
		this.descrizioneOrdine = descrizioneOrdine;
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

	public String getNumeroFax() {
		return numeroFax;
	}

	public void setNumeroFax(String numeroFax) {
		this.numeroFax = numeroFax;
	}

	public String getVenditore() {
		return venditore;
	}

	public void setVenditore(String venditore) {
		this.venditore = venditore;
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

	public LocalDateTime getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(LocalDateTime dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public LocalDateTime getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(LocalDateTime dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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

	public String getLoginInserimento() {
		return loginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		this.loginInserimento = loginInserimento;
	}
}
