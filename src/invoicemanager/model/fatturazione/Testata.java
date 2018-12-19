package invoicemanager.model.fatturazione;

import java.time.LocalDateTime;

public class Testata {
	private int numeroFatturazione;
	private LocalDateTime dataFattura;
	private char indicatoreStatoAvanzamento;
	private String codiceClienteFatturazione;
	private String codiceEsenzioneIva;
	private String codiceAgente;
	private String codiceCausale;
	private String codiceCausalePrelievi;
	private float percentualeSconto;
	private float percentualeScontoPagamento;
	private float percentualeProvvigione;
	private String descrizione;
	private boolean indicatoreAddebitoBolli;
	private boolean indicatoreAddebitoSpeseIncasso;
	private boolean indicatoreScaricoMagazzino;
	private short codiceListino;
	private String codiceResa;
	private String codiceVettore;
	private boolean indicatoreFatturaAccompagnatoria;
	private String codicePagamento;
	private String codiceBanca;
	private String codiceImballo;
	private float pesoColli;
	private float numeroColli;
	private float acconto;
	private String codiceDivisa;
	private float cambio;
	private String codiceClienteSpedizione;
	private String nomeSpedizione;
	private String indirizzoSpedizione;
	private String capSpedizione;
	private String cittaSpedizione;
	private String provinciaSpedizione;
	private String codiceNazioneSpedizione;
	private LocalDateTime dataInserimento;
	private LocalDateTime dataUltimaModifica;
	private String note;
	private boolean indicatoreFatturazioneDifferita;
	private boolean indicatoreEmail;
	private boolean indicatorePa;
	
	public Testata(int numeroFatturazione, LocalDateTime dataFattura) {
		this.numeroFatturazione = numeroFatturazione;
		this.dataFattura = dataFattura;
	}

	public int getNumeroFatturazione() {
		return numeroFatturazione;
	}

	public void setNumeroFatturazione(int numeroFatturazione) {
		this.numeroFatturazione = numeroFatturazione;
	}

	public LocalDateTime getDataFattura() {
		return dataFattura;
	}

	public void setDataFattura(LocalDateTime dataFattura) {
		this.dataFattura = dataFattura;
	}

	public char getIndicatoreStatoAvanzamento() {
		return indicatoreStatoAvanzamento;
	}

	public void setIndicatoreStatoAvanzamento(char indicatoreStatoAvanzamento) {
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

	public short getCodiceListino() {
		return codiceListino;
	}

	public void setCodiceListino(short codiceListino) {
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

	public boolean isIndicatoreFatturazioneDifferita() {
		return indicatoreFatturazioneDifferita;
	}

	public void setIndicatoreFatturazioneDifferita(boolean indicatoreFatturazioneDifferita) {
		this.indicatoreFatturazioneDifferita = indicatoreFatturazioneDifferita;
	}

	public boolean isIndicatoreEmail() {
		return indicatoreEmail;
	}

	public void setIndicatoreEmail(boolean indicatoreEmail) {
		this.indicatoreEmail = indicatoreEmail;
	}

	public boolean isIndicatorePa() {
		return indicatorePa;
	}

	public void setIndicatorePa(boolean indicatorePa) {
		this.indicatorePa = indicatorePa;
	}
	
	
	
	
}
