package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Ordine_Testata{
		private int NumeroOrdine; //  NOT NULL
		private LocalDateTime DataOrdine; //  NOT NULL
		private boolean IndicatoreStatoAvanzamento; // NULL
		private String CodiceClienteFatturazione; //(30) NULL
		private String Descrizione; //(200) NULL
		private String CodiceEsenzioneIva; //(4) NULL
		private String CodiceAgente; //(10) NULL
		private float PercentualeProvvigione; //  NULL
		private float PercentualeSconto; //  NULL
		private float PercentualeScontoPagamento; //  NULL
		private short NumeroCopieFattura; //  NULL
		private boolean IndicatoreAddebitoBolli; // NULL
		private boolean IndicatoreAddebitoSpeseIncasso; // NULL
		private short CodiceListino; //  NULL
		private String CodiceResa; //(4) NULL
		private String CodiceVettore; //(4) NULL
		private String CodiceCausale; //(4) NULL
		private String CodicePagamento; //(4) NULL
		private String CodiceBanca; //(4) NULL
		private LocalDateTime DataConsegna; //  NULL
		private String CausaleTrasporto; //(50) NULL
		private String CodiceDivisa; //(4) NULL
		private boolean IndicatoreConsegnaParziale; // NULL
		private boolean IndicatoreRaggruppamentoConsegne; // NULL
		private String CodiceAgenteVecchio; //(10) NULL
		private String CodiceClienteSpedizione; //(30) NULL
		private String NomeSpedizione; //(100) NULL
		private String IndirizzoSpedizione; //(100) NULL
		private String CapSpedizione; //(20) NULL
		private String CittaSpedizione; //(50) NULL
		private String ProvinciaSpedizione; //(30) NULL
		private String CodiceNazioneSpedizione; //(10) NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
		private String Note; //(500) NULL
		private String LoginInserimento; //(30) NULL
		private String LoginModifica; //(30) NULL
		private String CodiceLingua; //(4) NULL
		private String Revisione; //(10) NULL
		private String Attenzione; //(50) NULL
		private boolean IndicatoreOrdineTrading; // NULL

	public Ordine_Testata(int NumeroOrdine, LocalDateTime DataOrdine){
		this.NumeroOrdine = NumeroOrdine;
		this.DataOrdine = DataOrdine;
	}

	public int getNumeroOrdine() {
		return NumeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		NumeroOrdine = numeroOrdine;
	}

	public LocalDateTime getDataOrdine() {
		return DataOrdine;
	}

	public void setDataOrdine(LocalDateTime dataOrdine) {
		DataOrdine = dataOrdine;
	}

	public boolean isIndicatoreStatoAvanzamento() {
		return IndicatoreStatoAvanzamento;
	}

	public void setIndicatoreStatoAvanzamento(boolean indicatoreStatoAvanzamento) {
		IndicatoreStatoAvanzamento = indicatoreStatoAvanzamento;
	}

	public String getCodiceClienteFatturazione() {
		return CodiceClienteFatturazione;
	}

	public void setCodiceClienteFatturazione(String codiceClienteFatturazione) {
		CodiceClienteFatturazione = codiceClienteFatturazione;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public String getCodiceEsenzioneIva() {
		return CodiceEsenzioneIva;
	}

	public void setCodiceEsenzioneIva(String codiceEsenzioneIva) {
		CodiceEsenzioneIva = codiceEsenzioneIva;
	}

	public String getCodiceAgente() {
		return CodiceAgente;
	}

	public void setCodiceAgente(String codiceAgente) {
		CodiceAgente = codiceAgente;
	}

	public float getPercentualeProvvigione() {
		return PercentualeProvvigione;
	}

	public void setPercentualeProvvigione(float percentualeProvvigione) {
		PercentualeProvvigione = percentualeProvvigione;
	}

	public float getPercentualeSconto() {
		return PercentualeSconto;
	}

	public void setPercentualeSconto(float percentualeSconto) {
		PercentualeSconto = percentualeSconto;
	}

	public float getPercentualeScontoPagamento() {
		return PercentualeScontoPagamento;
	}

	public void setPercentualeScontoPagamento(float percentualeScontoPagamento) {
		PercentualeScontoPagamento = percentualeScontoPagamento;
	}

	public short getNumeroCopieFattura() {
		return NumeroCopieFattura;
	}

	public void setNumeroCopieFattura(short numeroCopieFattura) {
		NumeroCopieFattura = numeroCopieFattura;
	}

	public boolean isIndicatoreAddebitoBolli() {
		return IndicatoreAddebitoBolli;
	}

	public void setIndicatoreAddebitoBolli(boolean indicatoreAddebitoBolli) {
		IndicatoreAddebitoBolli = indicatoreAddebitoBolli;
	}

	public boolean isIndicatoreAddebitoSpeseIncasso() {
		return IndicatoreAddebitoSpeseIncasso;
	}

	public void setIndicatoreAddebitoSpeseIncasso(boolean indicatoreAddebitoSpeseIncasso) {
		IndicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
	}

	public short getCodiceListino() {
		return CodiceListino;
	}

	public void setCodiceListino(short codiceListino) {
		CodiceListino = codiceListino;
	}

	public String getCodiceResa() {
		return CodiceResa;
	}

	public void setCodiceResa(String codiceResa) {
		CodiceResa = codiceResa;
	}

	public String getCodiceVettore() {
		return CodiceVettore;
	}

	public void setCodiceVettore(String codiceVettore) {
		CodiceVettore = codiceVettore;
	}

	public String getCodiceCausale() {
		return CodiceCausale;
	}

	public void setCodiceCausale(String codiceCausale) {
		CodiceCausale = codiceCausale;
	}

	public String getCodicePagamento() {
		return CodicePagamento;
	}

	public void setCodicePagamento(String codicePagamento) {
		CodicePagamento = codicePagamento;
	}

	public String getCodiceBanca() {
		return CodiceBanca;
	}

	public void setCodiceBanca(String codiceBanca) {
		CodiceBanca = codiceBanca;
	}

	public LocalDateTime getDataConsegna() {
		return DataConsegna;
	}

	public void setDataConsegna(LocalDateTime dataConsegna) {
		DataConsegna = dataConsegna;
	}

	public String getCausaleTrasporto() {
		return CausaleTrasporto;
	}

	public void setCausaleTrasporto(String causaleTrasporto) {
		CausaleTrasporto = causaleTrasporto;
	}

	public String getCodiceDivisa() {
		return CodiceDivisa;
	}

	public void setCodiceDivisa(String codiceDivisa) {
		CodiceDivisa = codiceDivisa;
	}

	public boolean isIndicatoreConsegnaParziale() {
		return IndicatoreConsegnaParziale;
	}

	public void setIndicatoreConsegnaParziale(boolean indicatoreConsegnaParziale) {
		IndicatoreConsegnaParziale = indicatoreConsegnaParziale;
	}

	public boolean isIndicatoreRaggruppamentoConsegne() {
		return IndicatoreRaggruppamentoConsegne;
	}

	public void setIndicatoreRaggruppamentoConsegne(boolean indicatoreRaggruppamentoConsegne) {
		IndicatoreRaggruppamentoConsegne = indicatoreRaggruppamentoConsegne;
	}

	public String getCodiceAgenteVecchio() {
		return CodiceAgenteVecchio;
	}

	public void setCodiceAgenteVecchio(String codiceAgenteVecchio) {
		CodiceAgenteVecchio = codiceAgenteVecchio;
	}

	public String getCodiceClienteSpedizione() {
		return CodiceClienteSpedizione;
	}

	public void setCodiceClienteSpedizione(String codiceClienteSpedizione) {
		CodiceClienteSpedizione = codiceClienteSpedizione;
	}

	public String getNomeSpedizione() {
		return NomeSpedizione;
	}

	public void setNomeSpedizione(String nomeSpedizione) {
		NomeSpedizione = nomeSpedizione;
	}

	public String getIndirizzoSpedizione() {
		return IndirizzoSpedizione;
	}

	public void setIndirizzoSpedizione(String indirizzoSpedizione) {
		IndirizzoSpedizione = indirizzoSpedizione;
	}

	public String getCapSpedizione() {
		return CapSpedizione;
	}

	public void setCapSpedizione(String capSpedizione) {
		CapSpedizione = capSpedizione;
	}

	public String getCittaSpedizione() {
		return CittaSpedizione;
	}

	public void setCittaSpedizione(String cittaSpedizione) {
		CittaSpedizione = cittaSpedizione;
	}

	public String getProvinciaSpedizione() {
		return ProvinciaSpedizione;
	}

	public void setProvinciaSpedizione(String provinciaSpedizione) {
		ProvinciaSpedizione = provinciaSpedizione;
	}

	public String getCodiceNazioneSpedizione() {
		return CodiceNazioneSpedizione;
	}

	public void setCodiceNazioneSpedizione(String codiceNazioneSpedizione) {
		CodiceNazioneSpedizione = codiceNazioneSpedizione;
	}

	public LocalDateTime getDataInserimento() {
		return DataInserimento;
	}

	public void setDataInserimento(LocalDateTime dataInserimento) {
		DataInserimento = dataInserimento;
	}

	public LocalDateTime getDataUltimaModifica() {
		return DataUltimaModifica;
	}

	public void setDataUltimaModifica(LocalDateTime dataUltimaModifica) {
		DataUltimaModifica = dataUltimaModifica;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	public String getLoginInserimento() {
		return LoginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		LoginInserimento = loginInserimento;
	}

	public String getLoginModifica() {
		return LoginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		LoginModifica = loginModifica;
	}

	public String getCodiceLingua() {
		return CodiceLingua;
	}

	public void setCodiceLingua(String codiceLingua) {
		CodiceLingua = codiceLingua;
	}

	public String getRevisione() {
		return Revisione;
	}

	public void setRevisione(String revisione) {
		Revisione = revisione;
	}

	public String getAttenzione() {
		return Attenzione;
	}

	public void setAttenzione(String attenzione) {
		Attenzione = attenzione;
	}

	public boolean isIndicatoreOrdineTrading() {
		return IndicatoreOrdineTrading;
	}

	public void setIndicatoreOrdineTrading(boolean indicatoreOrdineTrading) {
		IndicatoreOrdineTrading = indicatoreOrdineTrading;
	}
	
	
}
