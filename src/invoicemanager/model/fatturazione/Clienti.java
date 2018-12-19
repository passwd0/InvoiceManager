package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Clienti{
		private String CodiceCliente; //(30) NOT NULL
		private String Descrizione; //(100) NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimoAggiornamento; //  NULL
		private List<TipoCliente> CodiceTipoCliente; // (4) COLLATE Latin1_General_CI_AS NULL
		private String CodiceUfficioCommerciale; //(20) NULL
		private List<TabellaResaMerce> CodiceResaMerce; // (4) COLLATE Latin1_General_CI_AS NULL
		private List<TabellaImballi> CodiceImballo; // (4) COLLATE Latin1_General_CI_AS NULL
		private List<TabellaRaggruppamentiClientiFornitori> CodiceRaggruppamento; // (4) COLLATE Latin1_General_CI_AS NULL
		private float Fatturato; //  NULL
		private float Fido; //  NULL
		private String PartitaIVA; //(15) NULL
		private String CodiceFiscale; //(16) NULL
		private List<TabellaPagamenti> CodicePagamento; // (4) COLLATE Latin1_General_CI_AS NULL
		private String Sinonimo; //(50) NULL
		private List<TabellaBanche> CodiceBanca; // (4) COLLATE Latin1_General_CI_AS NULL
		private short NumeroFattureEmesse; //  NULL
		private List<TabellaIva> CodiceEsenzioneIVA; // (4) COLLATE Latin1_General_CI_AS NULL
		private float ImponibileNonEsente; //  NULL
		private float ImponibileEsente; //  NULL
		private float ImportoIVA; //  NULL
		private String CodiceClassificazione; //(10) NULL
		private float CostoVenduto; //  NULL
		private List<TabellaAgenti> CodiceAgente; // (10) COLLATE Latin1_General_CI_AS NULL
		private float PercentualeProvvigioneAgente; //  NULL
		private float ScontoLegatoProvvigioniAgente; //  NULL
		private short NumeroCopieFattura; //  NULL
		private boolean IndicatoreAddebitoSpeseIncasso; // NULL
		private boolean IndicatoreAddebitoSpeseBolli; // NULL
		private int CodiceListino; //  NULL
		private String CodiceVettore; //(3) NULL
		private String CodiceAffidabilita; //(4) NULL
		private List<TabellaIso> CodiceISO; // (4) COLLATE Latin1_General_CI_AS NULL
		private String PartitaIVAEstero; //(12) NULL
		private String CodiceDivisa; //(4) NULL
		private int DataScadenzaSpostataAgosto; //  NULL
		private int DataScadenzaSpostataDicembre; //  NULL
		private String CodiceRetrocessione; //(5) NULL
		private String CodiceCommissione; //(5) NULL
		private String CodiceLingua; //(5) NULL
		private String Note; //(6000) NULL
		private List<StatiTabelle> CodiceStato; // (2) COLLATE Latin1_General_CI_AS NULL
		private boolean IndicatoreInviataInformativaPrivacy; // NULL
		private boolean IndicatoreRicevutaInformativaPrivacy; // NULL
		private String CodiceClienteRiferimento; //(15) NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private boolean IndicatoreInibizione; // NULL
		private String LoginInserimento; //(30) NULL
		private String LoginModifica; //(30) NULL
		private boolean IndicatoreScorporoIVA; // NULL
		private boolean IndicatoreIVADifferita; // NULL
		private boolean IndicatoreEmail; // NULL
		private boolean InputInibito; // NULL
		private boolean IndicatoreEdi; // NULL
		private String PartitaIvaEdi; //(35) NULL
		private String QualificatoreEdi; //(4) NULL
		private String IdentificativoFornitoreEdi; //(17) NULL
		private String TipoFornitoreEdi; //(3) NULL
		private String IdentificativoIntestatarioFatturaEdi; //(17) NULL
		private String TipoIntestatarioFatturaEdi; //(3) NULL
		private String IdentificativoPuntoConsegnaEdi; //(17) NULL
		private String TipoPuntoConsegnaEdi; //(3) NULL

	public Clienti(String CodiceCliente){
		this.CodiceCliente = CodiceCliente;
	}

	public String getCodiceCliente() {
		return CodiceCliente;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public LocalDateTime getDataInserimento() {
		return DataInserimento;
	}

	public LocalDateTime getDataUltimoAggiornamento() {
		return DataUltimoAggiornamento;
	}

	public List<TipoCliente> getCodiceTipoCliente() {
		return CodiceTipoCliente;
	}

	public String getCodiceUfficioCommerciale() {
		return CodiceUfficioCommerciale;
	}

	public List<TabellaResaMerce> getCodiceResaMerce() {
		return CodiceResaMerce;
	}

	public List<TabellaImballi> getCodiceImballo() {
		return CodiceImballo;
	}

	public List<TabellaRaggruppamentiClientiFornitori> getCodiceRaggruppamento() {
		return CodiceRaggruppamento;
	}

	public float getFatturato() {
		return Fatturato;
	}

	public float getFido() {
		return Fido;
	}

	public String getPartitaIVA() {
		return PartitaIVA;
	}

	public String getCodiceFiscale() {
		return CodiceFiscale;
	}

	public List<TabellaPagamenti> getCodicePagamento() {
		return CodicePagamento;
	}

	public String getSinonimo() {
		return Sinonimo;
	}

	public List<TabellaBanche> getCodiceBanca() {
		return CodiceBanca;
	}

	public short getNumeroFattureEmesse() {
		return NumeroFattureEmesse;
	}

	public List<TabellaIva> getCodiceEsenzioneIVA() {
		return CodiceEsenzioneIVA;
	}

	public float getImponibileNonEsente() {
		return ImponibileNonEsente;
	}

	public float getImponibileEsente() {
		return ImponibileEsente;
	}

	public float getImportoIVA() {
		return ImportoIVA;
	}

	public String getCodiceClassificazione() {
		return CodiceClassificazione;
	}

	public float getCostoVenduto() {
		return CostoVenduto;
	}

	public List<TabellaAgenti> getCodiceAgente() {
		return CodiceAgente;
	}

	public float getPercentualeProvvigioneAgente() {
		return PercentualeProvvigioneAgente;
	}

	public float getScontoLegatoProvvigioniAgente() {
		return ScontoLegatoProvvigioniAgente;
	}

	public short getNumeroCopieFattura() {
		return NumeroCopieFattura;
	}

	public boolean isIndicatoreAddebitoSpeseIncasso() {
		return IndicatoreAddebitoSpeseIncasso;
	}

	public boolean isIndicatoreAddebitoSpeseBolli() {
		return IndicatoreAddebitoSpeseBolli;
	}

	public int getCodiceListino() {
		return CodiceListino;
	}

	public String getCodiceVettore() {
		return CodiceVettore;
	}

	public String getCodiceAffidabilita() {
		return CodiceAffidabilita;
	}

	public List<TabellaIso> getCodiceISO() {
		return CodiceISO;
	}

	public String getPartitaIVAEstero() {
		return PartitaIVAEstero;
	}

	public String getCodiceDivisa() {
		return CodiceDivisa;
	}

	public int getDataScadenzaSpostataAgosto() {
		return DataScadenzaSpostataAgosto;
	}

	public int getDataScadenzaSpostataDicembre() {
		return DataScadenzaSpostataDicembre;
	}

	public String getCodiceRetrocessione() {
		return CodiceRetrocessione;
	}

	public String getCodiceCommissione() {
		return CodiceCommissione;
	}

	public String getCodiceLingua() {
		return CodiceLingua;
	}

	public String getNote() {
		return Note;
	}

	public List<StatiTabelle> getCodiceStato() {
		return CodiceStato;
	}

	public boolean isIndicatoreInviataInformativaPrivacy() {
		return IndicatoreInviataInformativaPrivacy;
	}

	public boolean isIndicatoreRicevutaInformativaPrivacy() {
		return IndicatoreRicevutaInformativaPrivacy;
	}

	public String getCodiceClienteRiferimento() {
		return CodiceClienteRiferimento;
	}

	public LocalDateTime getDataUltimaModifica() {
		return DataUltimaModifica;
	}

	public boolean isIndicatoreInibizione() {
		return IndicatoreInibizione;
	}

	public String getLoginInserimento() {
		return LoginInserimento;
	}

	public String getLoginModifica() {
		return LoginModifica;
	}

	public boolean isIndicatoreScorporoIVA() {
		return IndicatoreScorporoIVA;
	}

	public boolean isIndicatoreIVADifferita() {
		return IndicatoreIVADifferita;
	}

	public boolean isIndicatoreEmail() {
		return IndicatoreEmail;
	}

	public boolean isInputInibito() {
		return InputInibito;
	}

	public boolean isIndicatoreEdi() {
		return IndicatoreEdi;
	}

	public String getPartitaIvaEdi() {
		return PartitaIvaEdi;
	}

	public String getQualificatoreEdi() {
		return QualificatoreEdi;
	}

	public String getIdentificativoFornitoreEdi() {
		return IdentificativoFornitoreEdi;
	}

	public String getTipoFornitoreEdi() {
		return TipoFornitoreEdi;
	}

	public String getIdentificativoIntestatarioFatturaEdi() {
		return IdentificativoIntestatarioFatturaEdi;
	}

	public String getTipoIntestatarioFatturaEdi() {
		return TipoIntestatarioFatturaEdi;
	}

	public String getIdentificativoPuntoConsegnaEdi() {
		return IdentificativoPuntoConsegnaEdi;
	}

	public String getTipoPuntoConsegnaEdi() {
		return TipoPuntoConsegnaEdi;
	}

	public void setCodiceCliente(String codiceCliente) {
		CodiceCliente = codiceCliente;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public void setDataInserimento(LocalDateTime dataInserimento) {
		DataInserimento = dataInserimento;
	}

	public void setDataUltimoAggiornamento(LocalDateTime dataUltimoAggiornamento) {
		DataUltimoAggiornamento = dataUltimoAggiornamento;
	}

	public void setCodiceTipoCliente(List<TipoCliente> codiceTipoCliente) {
		CodiceTipoCliente = codiceTipoCliente;
	}

	public void setCodiceUfficioCommerciale(String codiceUfficioCommerciale) {
		CodiceUfficioCommerciale = codiceUfficioCommerciale;
	}

	public void setCodiceResaMerce(List<TabellaResaMerce> codiceResaMerce) {
		CodiceResaMerce = codiceResaMerce;
	}

	public void setCodiceImballo(List<TabellaImballi> codiceImballo) {
		CodiceImballo = codiceImballo;
	}

	public void setCodiceRaggruppamento(List<TabellaRaggruppamentiClientiFornitori> codiceRaggruppamento) {
		CodiceRaggruppamento = codiceRaggruppamento;
	}

	public void setFatturato(float fatturato) {
		Fatturato = fatturato;
	}

	public void setFido(float fido) {
		Fido = fido;
	}

	public void setPartitaIVA(String partitaIVA) {
		PartitaIVA = partitaIVA;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		CodiceFiscale = codiceFiscale;
	}

	public void setCodicePagamento(List<TabellaPagamenti> codicePagamento) {
		CodicePagamento = codicePagamento;
	}

	public void setSinonimo(String sinonimo) {
		Sinonimo = sinonimo;
	}

	public void setCodiceBanca(List<TabellaBanche> codiceBanca) {
		CodiceBanca = codiceBanca;
	}

	public void setNumeroFattureEmesse(short numeroFattureEmesse) {
		NumeroFattureEmesse = numeroFattureEmesse;
	}

	public void setCodiceEsenzioneIVA(List<TabellaIva> codiceEsenzioneIVA) {
		CodiceEsenzioneIVA = codiceEsenzioneIVA;
	}

	public void setImponibileNonEsente(float imponibileNonEsente) {
		ImponibileNonEsente = imponibileNonEsente;
	}

	public void setImponibileEsente(float imponibileEsente) {
		ImponibileEsente = imponibileEsente;
	}

	public void setImportoIVA(float importoIVA) {
		ImportoIVA = importoIVA;
	}

	public void setCodiceClassificazione(String codiceClassificazione) {
		CodiceClassificazione = codiceClassificazione;
	}

	public void setCostoVenduto(float costoVenduto) {
		CostoVenduto = costoVenduto;
	}

	public void setCodiceAgente(List<TabellaAgenti> codiceAgente) {
		CodiceAgente = codiceAgente;
	}

	public void setPercentualeProvvigioneAgente(float percentualeProvvigioneAgente) {
		PercentualeProvvigioneAgente = percentualeProvvigioneAgente;
	}

	public void setScontoLegatoProvvigioniAgente(float scontoLegatoProvvigioniAgente) {
		ScontoLegatoProvvigioniAgente = scontoLegatoProvvigioniAgente;
	}

	public void setNumeroCopieFattura(short numeroCopieFattura) {
		NumeroCopieFattura = numeroCopieFattura;
	}

	public void setIndicatoreAddebitoSpeseIncasso(boolean indicatoreAddebitoSpeseIncasso) {
		IndicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
	}

	public void setIndicatoreAddebitoSpeseBolli(boolean indicatoreAddebitoSpeseBolli) {
		IndicatoreAddebitoSpeseBolli = indicatoreAddebitoSpeseBolli;
	}

	public void setCodiceListino(int codiceListino) {
		CodiceListino = codiceListino;
	}

	public void setCodiceVettore(String codiceVettore) {
		CodiceVettore = codiceVettore;
	}

	public void setCodiceAffidabilita(String codiceAffidabilita) {
		CodiceAffidabilita = codiceAffidabilita;
	}

	public void setCodiceISO(List<TabellaIso> codiceISO) {
		CodiceISO = codiceISO;
	}

	public void setPartitaIVAEstero(String partitaIVAEstero) {
		PartitaIVAEstero = partitaIVAEstero;
	}

	public void setCodiceDivisa(String codiceDivisa) {
		CodiceDivisa = codiceDivisa;
	}

	public void setDataScadenzaSpostataAgosto(int dataScadenzaSpostataAgosto) {
		DataScadenzaSpostataAgosto = dataScadenzaSpostataAgosto;
	}

	public void setDataScadenzaSpostataDicembre(int dataScadenzaSpostataDicembre) {
		DataScadenzaSpostataDicembre = dataScadenzaSpostataDicembre;
	}

	public void setCodiceRetrocessione(String codiceRetrocessione) {
		CodiceRetrocessione = codiceRetrocessione;
	}

	public void setCodiceCommissione(String codiceCommissione) {
		CodiceCommissione = codiceCommissione;
	}

	public void setCodiceLingua(String codiceLingua) {
		CodiceLingua = codiceLingua;
	}

	public void setNote(String note) {
		Note = note;
	}

	public void setCodiceStato(List<StatiTabelle> codiceStato) {
		CodiceStato = codiceStato;
	}

	public void setIndicatoreInviataInformativaPrivacy(boolean indicatoreInviataInformativaPrivacy) {
		IndicatoreInviataInformativaPrivacy = indicatoreInviataInformativaPrivacy;
	}

	public void setIndicatoreRicevutaInformativaPrivacy(boolean indicatoreRicevutaInformativaPrivacy) {
		IndicatoreRicevutaInformativaPrivacy = indicatoreRicevutaInformativaPrivacy;
	}

	public void setCodiceClienteRiferimento(String codiceClienteRiferimento) {
		CodiceClienteRiferimento = codiceClienteRiferimento;
	}

	public void setDataUltimaModifica(LocalDateTime dataUltimaModifica) {
		DataUltimaModifica = dataUltimaModifica;
	}

	public void setIndicatoreInibizione(boolean indicatoreInibizione) {
		IndicatoreInibizione = indicatoreInibizione;
	}

	public void setLoginInserimento(String loginInserimento) {
		LoginInserimento = loginInserimento;
	}

	public void setLoginModifica(String loginModifica) {
		LoginModifica = loginModifica;
	}

	public void setIndicatoreScorporoIVA(boolean indicatoreScorporoIVA) {
		IndicatoreScorporoIVA = indicatoreScorporoIVA;
	}

	public void setIndicatoreIVADifferita(boolean indicatoreIVADifferita) {
		IndicatoreIVADifferita = indicatoreIVADifferita;
	}

	public void setIndicatoreEmail(boolean indicatoreEmail) {
		IndicatoreEmail = indicatoreEmail;
	}

	public void setInputInibito(boolean inputInibito) {
		InputInibito = inputInibito;
	}

	public void setIndicatoreEdi(boolean indicatoreEdi) {
		IndicatoreEdi = indicatoreEdi;
	}

	public void setPartitaIvaEdi(String partitaIvaEdi) {
		PartitaIvaEdi = partitaIvaEdi;
	}

	public void setQualificatoreEdi(String qualificatoreEdi) {
		QualificatoreEdi = qualificatoreEdi;
	}

	public void setIdentificativoFornitoreEdi(String identificativoFornitoreEdi) {
		IdentificativoFornitoreEdi = identificativoFornitoreEdi;
	}

	public void setTipoFornitoreEdi(String tipoFornitoreEdi) {
		TipoFornitoreEdi = tipoFornitoreEdi;
	}

	public void setIdentificativoIntestatarioFatturaEdi(String identificativoIntestatarioFatturaEdi) {
		IdentificativoIntestatarioFatturaEdi = identificativoIntestatarioFatturaEdi;
	}

	public void setTipoIntestatarioFatturaEdi(String tipoIntestatarioFatturaEdi) {
		TipoIntestatarioFatturaEdi = tipoIntestatarioFatturaEdi;
	}

	public void setIdentificativoPuntoConsegnaEdi(String identificativoPuntoConsegnaEdi) {
		IdentificativoPuntoConsegnaEdi = identificativoPuntoConsegnaEdi;
	}

	public void setTipoPuntoConsegnaEdi(String tipoPuntoConsegnaEdi) {
		TipoPuntoConsegnaEdi = tipoPuntoConsegnaEdi;
	}
	
	
}
