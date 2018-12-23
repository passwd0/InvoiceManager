package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Clienti{
		private String codiceCliente; //(30) NOT NULL
		private String descrizione; //(100) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimoAggiornamento; //  NULL
		private TipoCliente codiceTipoCliente; // (4) COLLATE Latin1_General_CI_AS NULL
		private String codiceUfficioCommerciale; //(20) NULL
		private TabellaResaMerce codiceResaMerce; // (4) COLLATE Latin1_General_CI_AS NULL
		private TabellaImballi codiceImballo; // (4) COLLATE Latin1_General_CI_AS NULL
		private TabellaRaggruppamentiClientiFornitori codiceRaggruppamento; // (4) COLLATE Latin1_General_CI_AS NULL
		private float fatturato; //  NULL
		private float fido; //  NULL
		private String partitaIVA; //(15) NULL
		private String codiceFiscale; //(16) NULL
		private TabellaPagamenti codicePagamento; // (4) COLLATE Latin1_General_CI_AS NULL
		private String sinonimo; //(50) NULL
		private TabellaBanche codiceBanca; // (4) COLLATE Latin1_General_CI_AS NULL
		private short numeroFattureEmesse; //  NULL
		private TabellaIva codiceEsenzioneIVA; // (4) COLLATE Latin1_General_CI_AS NULL
		private float imponibileNonEsente; //  NULL
		private float imponibileEsente; //  NULL
		private float importoIVA; //  NULL
		private String codiceClassificazione; //(10) NULL
		private float costoVenduto; //  NULL
		private TabellaAgenti codiceAgente; // (10) COLLATE Latin1_General_CI_AS NULL
		private float percentualeProvvigioneAgente; //  NULL
		private float scontoLegatoProvvigioniAgente; //  NULL
		private short numeroCopieFattura; //  NULL
		private boolean indicatoreAddebitoSpeseIncasso; // NULL
		private boolean indicatoreAddebitoSpeseBolli; // NULL
		private int codiceListino; //  NULL
		private String codiceVettore; //(3) NULL
		private String codiceAffidabilita; //(4) NULL
		private TabellaIso codiceISO; // (4) COLLATE Latin1_General_CI_AS NULL
		private String partitaIVAEstero; //(12) NULL
		private String codiceDivisa; //(4) NULL
		private int dataScadenzaSpostataAgosto; //  NULL
		private int dataScadenzaSpostataDicembre; //  NULL
		private String codiceRetrocessione; //(5) NULL
		private String codiceCommissione; //(5) NULL
		private String codiceLingua; //(5) NULL
		private String note; //(6000) NULL
		private StatiTabelle codiceStato; // (2) COLLATE Latin1_General_CI_AS NULL
		private boolean indicatoreInviataInformativaPrivacy; // NULL
		private boolean indicatoreRicevutaInformativaPrivacy; // NULL
		private String codiceClienteRiferimento; //(15) NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private boolean indicatoreInibizione; // NULL
		private String loginInserimento; //(30) NULL
		private String loginModifica; //(30) NULL
		private boolean indicatoreScorporoIVA; // NULL
		private boolean indicatoreIVADifferita; // NULL
		private boolean indicatoreEmail; // NULL
		private boolean inputInibito; // NULL
		private boolean indicatoreEdi; // NULL
		private String partitaIvaEdi; //(35) NULL
		private String qualificatoreEdi; //(4) NULL
		private String identificativoFornitoreEdi; //(17) NULL
		private String tipoFornitoreEdi; //(3) NULL
		private String identificativoIntestatarioFatturaEdi; //(17) NULL
		private String tipoIntestatarioFatturaEdi; //(3) NULL
		private String identificativoPuntoConsegnaEdi; //(17) NULL
		private String tipoPuntoConsegnaEdi; //(3) NULL

	public Clienti(String codiceCliente){
		this.codiceCliente = codiceCliente;
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

	public String getCodiceUfficioCommerciale() {
		return codiceUfficioCommerciale;
	}

	public void setCodiceUfficioCommerciale(String codiceUfficioCommerciale) {
		this.codiceUfficioCommerciale = codiceUfficioCommerciale;
	}

	public TabellaResaMerce getCodiceResaMerce() {
		return codiceResaMerce;
	}

	public void setCodiceResaMerce(TabellaResaMerce codiceResaMerce) {
		this.codiceResaMerce = codiceResaMerce;
	}

	public TabellaImballi getCodiceImballo() {
		return codiceImballo;
	}

	public void setCodiceImballo(TabellaImballi codiceImballo) {
		this.codiceImballo = codiceImballo;
	}

	public TabellaRaggruppamentiClientiFornitori getCodiceRaggruppamento() {
		return codiceRaggruppamento;
	}

	public void setCodiceRaggruppamento(TabellaRaggruppamentiClientiFornitori codiceRaggruppamento) {
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

	public TabellaPagamenti getCodicePagamento() {
		return codicePagamento;
	}

	public void setCodicePagamento(TabellaPagamenti codicePagamento) {
		this.codicePagamento = codicePagamento;
	}

	public String getSinonimo() {
		return sinonimo;
	}

	public void setSinonimo(String sinonimo) {
		this.sinonimo = sinonimo;
	}

	public TabellaBanche getCodiceBanca() {
		return codiceBanca;
	}

	public void setCodiceBanca(TabellaBanche codiceBanca) {
		this.codiceBanca = codiceBanca;
	}

	public short getNumeroFattureEmesse() {
		return numeroFattureEmesse;
	}

	public void setNumeroFattureEmesse(short numeroFattureEmesse) {
		this.numeroFattureEmesse = numeroFattureEmesse;
	}

	public TabellaIva getCodiceEsenzioneIVA() {
		return codiceEsenzioneIVA;
	}

	public void setCodiceEsenzioneIVA(TabellaIva codiceEsenzioneIVA) {
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

	public float getCostoVenduto() {
		return costoVenduto;
	}

	public void setCostoVenduto(float costoVenduto) {
		this.costoVenduto = costoVenduto;
	}

	public TabellaAgenti getCodiceAgente() {
		return codiceAgente;
	}

	public void setCodiceAgente(TabellaAgenti codiceAgente) {
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

	public short getNumeroCopieFattura() {
		return numeroCopieFattura;
	}

	public void setNumeroCopieFattura(short numeroCopieFattura) {
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

	public TabellaIso getCodiceISO() {
		return codiceISO;
	}

	public void setCodiceISO(TabellaIso codiceISO) {
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

	public String getCodiceRetrocessione() {
		return codiceRetrocessione;
	}

	public void setCodiceRetrocessione(String codiceRetrocessione) {
		this.codiceRetrocessione = codiceRetrocessione;
	}

	public String getCodiceCommissione() {
		return codiceCommissione;
	}

	public void setCodiceCommissione(String codiceCommissione) {
		this.codiceCommissione = codiceCommissione;
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

	public StatiTabelle getCodiceStato() {
		return codiceStato;
	}

	public void setCodiceStato(StatiTabelle codiceStato) {
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

	public String getCodiceClienteRiferimento() {
		return codiceClienteRiferimento;
	}

	public void setCodiceClienteRiferimento(String codiceClienteRiferimento) {
		this.codiceClienteRiferimento = codiceClienteRiferimento;
	}

	public LocalDateTime getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(LocalDateTime dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public boolean isIndicatoreInibizione() {
		return indicatoreInibizione;
	}

	public void setIndicatoreInibizione(boolean indicatoreInibizione) {
		this.indicatoreInibizione = indicatoreInibizione;
	}

	public String getLoginInserimento() {
		return loginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		this.loginInserimento = loginInserimento;
	}

	public String getLoginModifica() {
		return loginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		this.loginModifica = loginModifica;
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

	public boolean isIndicatoreEdi() {
		return indicatoreEdi;
	}

	public void setIndicatoreEdi(boolean indicatoreEdi) {
		this.indicatoreEdi = indicatoreEdi;
	}

	public String getPartitaIvaEdi() {
		return partitaIvaEdi;
	}

	public void setPartitaIvaEdi(String partitaIvaEdi) {
		this.partitaIvaEdi = partitaIvaEdi;
	}

	public String getQualificatoreEdi() {
		return qualificatoreEdi;
	}

	public void setQualificatoreEdi(String qualificatoreEdi) {
		this.qualificatoreEdi = qualificatoreEdi;
	}

	public String getIdentificativoFornitoreEdi() {
		return identificativoFornitoreEdi;
	}

	public void setIdentificativoFornitoreEdi(String identificativoFornitoreEdi) {
		this.identificativoFornitoreEdi = identificativoFornitoreEdi;
	}

	public String getTipoFornitoreEdi() {
		return tipoFornitoreEdi;
	}

	public void setTipoFornitoreEdi(String tipoFornitoreEdi) {
		this.tipoFornitoreEdi = tipoFornitoreEdi;
	}

	public String getIdentificativoIntestatarioFatturaEdi() {
		return identificativoIntestatarioFatturaEdi;
	}

	public void setIdentificativoIntestatarioFatturaEdi(String identificativoIntestatarioFatturaEdi) {
		this.identificativoIntestatarioFatturaEdi = identificativoIntestatarioFatturaEdi;
	}

	public String getTipoIntestatarioFatturaEdi() {
		return tipoIntestatarioFatturaEdi;
	}

	public void setTipoIntestatarioFatturaEdi(String tipoIntestatarioFatturaEdi) {
		this.tipoIntestatarioFatturaEdi = tipoIntestatarioFatturaEdi;
	}

	public String getIdentificativoPuntoConsegnaEdi() {
		return identificativoPuntoConsegnaEdi;
	}

	public void setIdentificativoPuntoConsegnaEdi(String identificativoPuntoConsegnaEdi) {
		this.identificativoPuntoConsegnaEdi = identificativoPuntoConsegnaEdi;
	}

	public String getTipoPuntoConsegnaEdi() {
		return tipoPuntoConsegnaEdi;
	}

	public void setTipoPuntoConsegnaEdi(String tipoPuntoConsegnaEdi) {
		this.tipoPuntoConsegnaEdi = tipoPuntoConsegnaEdi;
	}

	
}
