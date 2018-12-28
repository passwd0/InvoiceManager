package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Cliente implements Comparable<Cliente>{
	private String codiceCliente; //(30) NOT NULL
	private String descrizione; //(100) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimoAggiornamento; //  NULL
	private TipoCliente tipoCliente; // (4) COLLATE Latin1_General_CI_AS NULL
	private ResaMerce resaMerce; // (4) COLLATE Latin1_General_CI_AS NULL
	private Imballo imballo; // (4) COLLATE Latin1_General_CI_AS NULL
	private RaggruppamentoClienteFornitore raggruppamento; // (4) COLLATE Latin1_General_CI_AS NULL
	private float fatturato; //  NULL
	private float fido; //  NULL
	private String partitaIVA; //(15) NULL
	private String codiceFiscale; //(16) NULL
	private Pagamento pagamento; // (4) COLLATE Latin1_General_CI_AS NULL
	private Banca banca; // (4) COLLATE Latin1_General_CI_AS NULL
	private int numeroFattureEmesse; //  NULL
	private Iva iva; // (4) COLLATE Latin1_General_CI_AS NULL
	private float imponibileNonEsente; //  NULL
	private float imponibileEsente; //  NULL
	private float importoIVA; //  NULL
	private String codiceClassificazione; //(10) NULL
	private Agente agente; // (10) COLLATE Latin1_General_CI_AS NULL
	private float percentualeProvvigioneAgente; //  NULL
	private float scontoLegatoProvvigioniAgente; //  NULL
	private int numeroCopieFattura; //  NULL
	private boolean indicatoreAddebitoSpeseIncasso; // NULL
	private boolean indicatoreAddebitoSpeseBolli; // NULL
	private int codiceListino; //  NULL
	private String codiceVettore; //(3) NULL
	private String codiceAffidabilita; //(4) NULL
	private Iso iso; // (4) COLLATE Latin1_General_CI_AS NULL
	private String partitaIVAEstero; //(12) NULL
	private String codiceDivisa; //(4) NULL
	private int dataScadenzaSpostataAgosto; //  NULL
	private int dataScadenzaSpostataDicembre; //  NULL
	private String codiceLingua; //(5) NULL
	private String note; //(6000) NULL
	private Stato stato; // (2) COLLATE Latin1_General_CI_AS NULL
	private boolean indicatoreInviataInformativaPrivacy; // NULL
	private boolean indicatoreRicevutaInformativaPrivacy; // NULL
	private boolean indicatoreScorporoIVA; // NULL
	private boolean indicatoreIVADifferita; // NULL
	private boolean indicatoreEmail; // NULL
	private boolean inputInibito; // NULL

	public Cliente(String codiceCliente){
		this.codiceCliente = codiceCliente;
	}

	public Cliente(String codiceCliente, String descrizione, LocalDateTime dataInserimento,
			LocalDateTime dataUltimoAggiornamento, TipoCliente codiceTipoCliente, ResaMerce codiceResaMerce,
			Imballo codiceImballo, RaggruppamentoClienteFornitore codiceRaggruppamento, float fatturato, float fido,
			String partitaIVA, String codiceFiscale, Pagamento codicePagamento, Banca codiceBanca,
			int numeroFattureEmesse, Iva codiceEsenzioneIVA, float imponibileNonEsente, float imponibileEsente,
			float importoIVA, String codiceClassificazione, Agente agente, float percentualeProvvigioneAgente,
			float scontoLegatoProvvigioniAgente, int numeroCopieFattura, boolean indicatoreAddebitoSpeseIncasso,
			boolean indicatoreAddebitoSpeseBolli, int codiceListino, String codiceVettore, String codiceAffidabilita,
			Iso codiceISO, String partitaIVAEstero, String codiceDivisa, int dataScadenzaSpostataAgosto,
			int dataScadenzaSpostataDicembre, String codiceLingua, String note, Stato stato,
			boolean indicatoreInviataInformativaPrivacy, boolean indicatoreRicevutaInformativaPrivacy,
			boolean indicatoreScorporoIVA, boolean indicatoreIVADifferita, boolean indicatoreEmail,
			boolean inputInibito) {
		this.codiceCliente = codiceCliente;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimoAggiornamento = dataUltimoAggiornamento;
		this.tipoCliente = codiceTipoCliente;
		this.resaMerce = codiceResaMerce;
		this.imballo = codiceImballo;
		this.raggruppamento = codiceRaggruppamento;
		this.fatturato = fatturato;
		this.fido = fido;
		this.partitaIVA = partitaIVA;
		this.codiceFiscale = codiceFiscale;
		this.pagamento = codicePagamento;
		this.banca = codiceBanca;
		this.numeroFattureEmesse = numeroFattureEmesse;
		this.iva = codiceEsenzioneIVA;
		this.imponibileNonEsente = imponibileNonEsente;
		this.imponibileEsente = imponibileEsente;
		this.importoIVA = importoIVA;
		this.codiceClassificazione = codiceClassificazione;
		this.agente = agente;
		this.percentualeProvvigioneAgente = percentualeProvvigioneAgente;
		this.scontoLegatoProvvigioniAgente = scontoLegatoProvvigioniAgente;
		this.numeroCopieFattura = numeroCopieFattura;
		this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
		this.indicatoreAddebitoSpeseBolli = indicatoreAddebitoSpeseBolli;
		this.codiceListino = codiceListino;
		this.codiceVettore = codiceVettore;
		this.codiceAffidabilita = codiceAffidabilita;
		this.iso = codiceISO;
		this.partitaIVAEstero = partitaIVAEstero;
		this.codiceDivisa = codiceDivisa;
		this.dataScadenzaSpostataAgosto = dataScadenzaSpostataAgosto;
		this.dataScadenzaSpostataDicembre = dataScadenzaSpostataDicembre;
		this.codiceLingua = codiceLingua;
		this.note = note;
		this.stato = stato;
		this.indicatoreInviataInformativaPrivacy = indicatoreInviataInformativaPrivacy;
		this.indicatoreRicevutaInformativaPrivacy = indicatoreRicevutaInformativaPrivacy;
		this.indicatoreScorporoIVA = indicatoreScorporoIVA;
		this.indicatoreIVADifferita = indicatoreIVADifferita;
		this.indicatoreEmail = indicatoreEmail;
		this.inputInibito = inputInibito;
	}

	public String getCodiceTipoCliente() {
		if (tipoCliente == null) return null;
		return tipoCliente.getCodiceTipoCliente();
	}
	
	public String getCodiceResaMerce() {
		if (resaMerce == null) return null;
		return resaMerce.getCodiceResa();
	}
	
	public String getCodiceImballo() {
		if (imballo == null) return null;
		return imballo.getCodiceImballo();
	}
	
	public String getCodiceRaggruppamento() {
		if (raggruppamento == null) return null;
		return raggruppamento.getCodiceRaggruppamento();
	}
	
	public String getCodiceAgente() {
		if (agente == null) return null;
		return agente.getCodiceAgente();
	}
	
	public String getCodiceIva() {
		if (iva == null) return null;
		return iva.getCodiceIva();
	}
	
	public String getCodiceIso() {
		if (iso == null) return null;
		return iso.getCodiceIso();
	}
	
	public String getCodiceBanca() {
		if (banca == null) return null;
		return banca.getCodiceBanca();
	}
	
	public String getCodicePagamento() {
		if (pagamento == null) return null;
		return pagamento.getCodicePagamento();
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

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public ResaMerce getResaMerce() {
		return resaMerce;
	}

	public void setResaMerce(ResaMerce resaMerce) {
		this.resaMerce = resaMerce;
	}

	public Imballo getImballo() {
		return imballo;
	}

	public void setImballo(Imballo imballo) {
		this.imballo = imballo;
	}

	public RaggruppamentoClienteFornitore getRaggruppamento() {
		return raggruppamento;
	}

	public void setRaggruppamento(RaggruppamentoClienteFornitore raggruppamento) {
		this.raggruppamento = raggruppamento;
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

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Banca getBanca() {
		return banca;
	}

	public void setBanca(Banca banca) {
		this.banca = banca;
	}

	public int getNumeroFattureEmesse() {
		return numeroFattureEmesse;
	}

	public void setNumeroFattureEmesse(int numeroFattureEmesse) {
		this.numeroFattureEmesse = numeroFattureEmesse;
	}

	public Iva getCodiceEsenzioneIVA() {
		return iva;
	}

	public void setCodiceEsenzioneIVA(Iva codiceEsenzioneIVA) {
		this.iva = codiceEsenzioneIVA;
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

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
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

	public Iso getIso() {
		return iso;
	}

	public void setCodiceIso(Iso codiceISO) {
		this.iso = codiceISO;
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

	public Stato getStato() {
		return stato;
	}

	public void setCodiceStato(Stato stato) {
		this.stato = stato;
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