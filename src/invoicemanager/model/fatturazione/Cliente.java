package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Cliente implements Comparable<Cliente>{
	private String codiceCliente; //(30) NOT NULL
	private String descrizione; //(100) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimoAggiornamento; //  NULL
	private TipoCliente codiceTipoCliente; // (4) COLLATE Latin1_General_CI_AS NULL
	//private String codiceUfficioCommerciale; //(20) NULL
	private ResaMerce codiceResaMerce; // (4) COLLATE Latin1_General_CI_AS NULL
	private Imballo codiceImballo; // (4) COLLATE Latin1_General_CI_AS NULL
	private RaggruppamentoClienteFornitore codiceRaggruppamento; // (4) COLLATE Latin1_General_CI_AS NULL
	private float fatturato; //  NULL
	private float fido; //  NULL
	private String partitaIVA; //(15) NULL
	private String codiceFiscale; //(16) NULL
	private Pagamento codicePagamento; // (4) COLLATE Latin1_General_CI_AS NULL
	//private String sinonimo; //(50) NULL
	private Banca codiceBanca; // (4) COLLATE Latin1_General_CI_AS NULL
	private int numeroFattureEmesse; //  NULL
	private Iva codiceEsenzioneIVA; // (4) COLLATE Latin1_General_CI_AS NULL
	private float imponibileNonEsente; //  NULL
	private float imponibileEsente; //  NULL
	private float importoIVA; //  NULL
	private String codiceClassificazione; //(10) NULL
	//private float costoVenduto; //  NULL
	private Agente codiceAgente; // (10) COLLATE Latin1_General_CI_AS NULL
	private float percentualeProvvigioneAgente; //  NULL
	private float scontoLegatoProvvigioniAgente; //  NULL
	private int numeroCopieFattura; //  NULL
	private boolean indicatoreAddebitoSpeseIncasso; // NULL
	private boolean indicatoreAddebitoSpeseBolli; // NULL
	private int codiceListino; //  NULL
	private String codiceVettore; //(3) NULL
	private String codiceAffidabilita; //(4) NULL
	private Iso codiceISO; // (4) COLLATE Latin1_General_CI_AS NULL
	private String partitaIVAEstero; //(12) NULL
	private String codiceDivisa; //(4) NULL
	private int dataScadenzaSpostataAgosto; //  NULL
	private int dataScadenzaSpostataDicembre; //  NULL
	//private String codiceRetrocessione; //(5) NULL
	//private String codiceCommissione; //(5) NULL
	private String codiceLingua; //(5) NULL
	private String note; //(6000) NULL
	private Stato codiceStato; // (2) COLLATE Latin1_General_CI_AS NULL
	private boolean indicatoreInviataInformativaPrivacy; // NULL
	private boolean indicatoreRicevutaInformativaPrivacy; // NULL
	//private String codiceClienteRiferimento; //(15) NULL
	//private LocalDateTime dataUltimaModifica; //  NULL
	//private boolean indicatoreInibizione; // NULL
	//private String loginInserimento; //(30) NULL
	//private String loginModifica; //(30) NULL
	private boolean indicatoreScorporoIVA; // NULL
	private boolean indicatoreIVADifferita; // NULL
	private boolean indicatoreEmail; // NULL
	private boolean inputInibito; // NULL
	//private boolean indicatoreEdi; // NULL
	//private String partitaIvaEdi; //(35) NULL
	//private String qualificatoreEdi; //(4) NULL
	//private String identificativoFornitoreEdi; //(17) NULL
	//private String tipoFornitoreEdi; //(3) NULL
	//private String identificativoIntestatarioFatturaEdi; //(17) NULL
	//private String tipoIntestatarioFatturaEdi; //(3) NULL
	//private String identificativoPuntoConsegnaEdi; //(17) NULL
	//private String tipoPuntoConsegnaEdi; //(3) NULL


		
	
	public Cliente(String codiceCliente){
		this.codiceCliente = codiceCliente;
	}

	public Cliente(String codiceCliente, String descrizione, LocalDateTime dataInserimento,
			LocalDateTime dataUltimoAggiornamento, TipoCliente codiceTipoCliente, ResaMerce codiceResaMerce,
			Imballo codiceImballo, RaggruppamentoClienteFornitore codiceRaggruppamento, float fatturato, float fido,
			String partitaIVA, String codiceFiscale, Pagamento codicePagamento, Banca codiceBanca,
			int numeroFattureEmesse, Iva codiceEsenzioneIVA, float imponibileNonEsente, float imponibileEsente,
			float importoIVA, String codiceClassificazione, Agente codiceAgente, float percentualeProvvigioneAgente,
			float scontoLegatoProvvigioniAgente, int numeroCopieFattura, boolean indicatoreAddebitoSpeseIncasso,
			boolean indicatoreAddebitoSpeseBolli, int codiceListino, String codiceVettore, String codiceAffidabilita,
			Iso codiceISO, String partitaIVAEstero, String codiceDivisa, int dataScadenzaSpostataAgosto,
			int dataScadenzaSpostataDicembre, String codiceLingua, String note, Stato codiceStato,
			boolean indicatoreInviataInformativaPrivacy, boolean indicatoreRicevutaInformativaPrivacy,
			boolean indicatoreScorporoIVA, boolean indicatoreIVADifferita, boolean indicatoreEmail,
			boolean inputInibito) {
		this.codiceCliente = codiceCliente;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimoAggiornamento = dataUltimoAggiornamento;
		this.codiceTipoCliente = codiceTipoCliente;
		this.codiceResaMerce = codiceResaMerce;
		this.codiceImballo = codiceImballo;
		this.codiceRaggruppamento = codiceRaggruppamento;
		this.fatturato = fatturato;
		this.fido = fido;
		this.partitaIVA = partitaIVA;
		this.codiceFiscale = codiceFiscale;
		this.codicePagamento = codicePagamento;
		this.codiceBanca = codiceBanca;
		this.numeroFattureEmesse = numeroFattureEmesse;
		this.codiceEsenzioneIVA = codiceEsenzioneIVA;
		this.imponibileNonEsente = imponibileNonEsente;
		this.imponibileEsente = imponibileEsente;
		this.importoIVA = importoIVA;
		this.codiceClassificazione = codiceClassificazione;
		this.codiceAgente = codiceAgente;
		this.percentualeProvvigioneAgente = percentualeProvvigioneAgente;
		this.scontoLegatoProvvigioniAgente = scontoLegatoProvvigioniAgente;
		this.numeroCopieFattura = numeroCopieFattura;
		this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
		this.indicatoreAddebitoSpeseBolli = indicatoreAddebitoSpeseBolli;
		this.codiceListino = codiceListino;
		this.codiceVettore = codiceVettore;
		this.codiceAffidabilita = codiceAffidabilita;
		this.codiceISO = codiceISO;
		this.partitaIVAEstero = partitaIVAEstero;
		this.codiceDivisa = codiceDivisa;
		this.dataScadenzaSpostataAgosto = dataScadenzaSpostataAgosto;
		this.dataScadenzaSpostataDicembre = dataScadenzaSpostataDicembre;
		this.codiceLingua = codiceLingua;
		this.note = note;
		this.codiceStato = codiceStato;
		this.indicatoreInviataInformativaPrivacy = indicatoreInviataInformativaPrivacy;
		this.indicatoreRicevutaInformativaPrivacy = indicatoreRicevutaInformativaPrivacy;
		this.indicatoreScorporoIVA = indicatoreScorporoIVA;
		this.indicatoreIVADifferita = indicatoreIVADifferita;
		this.indicatoreEmail = indicatoreEmail;
		this.inputInibito = inputInibito;
	}

	public String getCodiceCliente() {
		return codiceCliente;
	}

	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public LocalDateTime getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(LocalDateTime dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public LocalDateTime getDataUltimoAggiornamento() {
		return dataUltimoAggiornamento;
	}

	public void setDataUltimoAggiornamento(LocalDateTime dataUltimoAggiornamento) {
		this.dataUltimoAggiornamento = dataUltimoAggiornamento;
	}

	public TipoCliente getCodiceTipoCliente() {
		return codiceTipoCliente;
	}

	public void setCodiceTipoCliente(TipoCliente codiceTipoCliente) {
		this.codiceTipoCliente = codiceTipoCliente;
	}

	public ResaMerce getCodiceResaMerce() {
		return codiceResaMerce;
	}

	public void setCodiceResaMerce(ResaMerce codiceResaMerce) {
		this.codiceResaMerce = codiceResaMerce;
	}

	public Imballo getCodiceImballo() {
		return codiceImballo;
	}

	public void setCodiceImballo(Imballo codiceImballo) {
		this.codiceImballo = codiceImballo;
	}

	public RaggruppamentoClienteFornitore getCodiceRaggruppamento() {
		return codiceRaggruppamento;
	}

	public void setCodiceRaggruppamento(RaggruppamentoClienteFornitore codiceRaggruppamento) {
		this.codiceRaggruppamento = codiceRaggruppamento;
	}

	public float getFatturato() {
		return fatturato;
	}

	public void setFatturato(float fatturato) {
		this.fatturato = fatturato;
	}

	public float getFido() {
		return fido;
	}

	public void setFido(float fido) {
		this.fido = fido;
	}

	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public Pagamento getCodicePagamento() {
		return codicePagamento;
	}

	public void setCodicePagamento(Pagamento codicePagamento) {
		this.codicePagamento = codicePagamento;
	}

	public Banca getCodiceBanca() {
		return codiceBanca;
	}

	public void setCodiceBanca(Banca codiceBanca) {
		this.codiceBanca = codiceBanca;
	}

	public int getNumeroFattureEmesse() {
		return numeroFattureEmesse;
	}

	public void setNumeroFattureEmesse(int numeroFattureEmesse) {
		this.numeroFattureEmesse = numeroFattureEmesse;
	}

	public Iva getCodiceEsenzioneIVA() {
		return codiceEsenzioneIVA;
	}

	public void setCodiceEsenzioneIVA(Iva codiceEsenzioneIVA) {
		this.codiceEsenzioneIVA = codiceEsenzioneIVA;
	}

	public float getImponibileNonEsente() {
		return imponibileNonEsente;
	}

	public void setImponibileNonEsente(float imponibileNonEsente) {
		this.imponibileNonEsente = imponibileNonEsente;
	}

	public float getImponibileEsente() {
		return imponibileEsente;
	}

	public void setImponibileEsente(float imponibileEsente) {
		this.imponibileEsente = imponibileEsente;
	}

	public float getImportoIVA() {
		return importoIVA;
	}

	public void setImportoIVA(float importoIVA) {
		this.importoIVA = importoIVA;
	}

	public String getCodiceClassificazione() {
		return codiceClassificazione;
	}

	public void setCodiceClassificazione(String codiceClassificazione) {
		this.codiceClassificazione = codiceClassificazione;
	}

	public Agente getCodiceAgente() {
		return codiceAgente;
	}

	public void setCodiceAgente(Agente codiceAgente) {
		this.codiceAgente = codiceAgente;
	}

	public float getPercentualeProvvigioneAgente() {
		return percentualeProvvigioneAgente;
	}

	public void setPercentualeProvvigioneAgente(float percentualeProvvigioneAgente) {
		this.percentualeProvvigioneAgente = percentualeProvvigioneAgente;
	}

	public float getScontoLegatoProvvigioniAgente() {
		return scontoLegatoProvvigioniAgente;
	}

	public void setScontoLegatoProvvigioniAgente(float scontoLegatoProvvigioniAgente) {
		this.scontoLegatoProvvigioniAgente = scontoLegatoProvvigioniAgente;
	}

	public int getNumeroCopieFattura() {
		return numeroCopieFattura;
	}

	public void setNumeroCopieFattura(int numeroCopieFattura) {
		this.numeroCopieFattura = numeroCopieFattura;
	}

	public boolean isIndicatoreAddebitoSpeseIncasso() {
		return indicatoreAddebitoSpeseIncasso;
	}

	public void setIndicatoreAddebitoSpeseIncasso(boolean indicatoreAddebitoSpeseIncasso) {
		this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
	}

	public boolean isIndicatoreAddebitoSpeseBolli() {
		return indicatoreAddebitoSpeseBolli;
	}

	public void setIndicatoreAddebitoSpeseBolli(boolean indicatoreAddebitoSpeseBolli) {
		this.indicatoreAddebitoSpeseBolli = indicatoreAddebitoSpeseBolli;
	}

	public int getCodiceListino() {
		return codiceListino;
	}

	public void setCodiceListino(int codiceListino) {
		this.codiceListino = codiceListino;
	}

	public String getCodiceVettore() {
		return codiceVettore;
	}

	public void setCodiceVettore(String codiceVettore) {
		this.codiceVettore = codiceVettore;
	}

	public String getCodiceAffidabilita() {
		return codiceAffidabilita;
	}

	public void setCodiceAffidabilita(String codiceAffidabilita) {
		this.codiceAffidabilita = codiceAffidabilita;
	}

	public Iso getCodiceISO() {
		return codiceISO;
	}

	public void setCodiceISO(Iso codiceISO) {
		this.codiceISO = codiceISO;
	}

	public String getPartitaIVAEstero() {
		return partitaIVAEstero;
	}

	public void setPartitaIVAEstero(String partitaIVAEstero) {
		this.partitaIVAEstero = partitaIVAEstero;
	}

	public String getCodiceDivisa() {
		return codiceDivisa;
	}

	public void setCodiceDivisa(String codiceDivisa) {
		this.codiceDivisa = codiceDivisa;
	}

	public int getDataScadenzaSpostataAgosto() {
		return dataScadenzaSpostataAgosto;
	}

	public void setDataScadenzaSpostataAgosto(int dataScadenzaSpostataAgosto) {
		this.dataScadenzaSpostataAgosto = dataScadenzaSpostataAgosto;
	}

	public int getDataScadenzaSpostataDicembre() {
		return dataScadenzaSpostataDicembre;
	}

	public void setDataScadenzaSpostataDicembre(int dataScadenzaSpostataDicembre) {
		this.dataScadenzaSpostataDicembre = dataScadenzaSpostataDicembre;
	}

	public String getCodiceLingua() {
		return codiceLingua;
	}

	public void setCodiceLingua(String codiceLingua) {
		this.codiceLingua = codiceLingua;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Stato getCodiceStato() {
		return codiceStato;
	}

	public void setCodiceStato(Stato codiceStato) {
		this.codiceStato = codiceStato;
	}

	public boolean isIndicatoreInviataInformativaPrivacy() {
		return indicatoreInviataInformativaPrivacy;
	}

	public void setIndicatoreInviataInformativaPrivacy(boolean indicatoreInviataInformativaPrivacy) {
		this.indicatoreInviataInformativaPrivacy = indicatoreInviataInformativaPrivacy;
	}

	public boolean isIndicatoreRicevutaInformativaPrivacy() {
		return indicatoreRicevutaInformativaPrivacy;
	}

	public void setIndicatoreRicevutaInformativaPrivacy(boolean indicatoreRicevutaInformativaPrivacy) {
		this.indicatoreRicevutaInformativaPrivacy = indicatoreRicevutaInformativaPrivacy;
	}

	public boolean isIndicatoreScorporoIVA() {
		return indicatoreScorporoIVA;
	}

	public void setIndicatoreScorporoIVA(boolean indicatoreScorporoIVA) {
		this.indicatoreScorporoIVA = indicatoreScorporoIVA;
	}

	public boolean isIndicatoreIVADifferita() {
		return indicatoreIVADifferita;
	}

	public void setIndicatoreIVADifferita(boolean indicatoreIVADifferita) {
		this.indicatoreIVADifferita = indicatoreIVADifferita;
	}

	public boolean isIndicatoreEmail() {
		return indicatoreEmail;
	}

	public void setIndicatoreEmail(boolean indicatoreEmail) {
		this.indicatoreEmail = indicatoreEmail;
	}

	public boolean isInputInibito() {
		return inputInibito;
	}

	public void setInputInibito(boolean inputInibito) {
		this.inputInibito = inputInibito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceCliente == null) ? 0 : codiceCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codiceCliente == null) {
			if (other.codiceCliente != null)
				return false;
		} else if (!codiceCliente.equals(other.codiceCliente))
			return false;
		return true;
	}

	@Override
	public int compareTo(Cliente cliente) {
		return this.codiceCliente.compareTo(cliente.codiceCliente);
	}
}
