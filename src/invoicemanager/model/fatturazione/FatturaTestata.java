package invoicemanager.model.fatturazione;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class FatturaTestata {
	private int numeroFatturazione;
	private LocalDate dataFattura;
	private StatoAvanzamento statoAvanzamento;
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
	private int codiceListino;
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
	private String note;
	private boolean indicatoreFatturazioneDifferita;
	private boolean indicatoreEmail;
	private boolean indicatorePa;
	private List<FatturaDettaglio> fatturadettaglio;
	private float speseTrasporto;
	private float speseImballo;
	private float speseIncasso;
	private float speseBolli;
	private float omaggi;
	private float totalePagato;
	private LocalDate dataScadenza;
	private float importoScadenza;
	private List<Allegato> allegati;
	private LocalDateTime dataInserimento;
	private LocalDateTime dataUltimaModifica;

	public FatturaTestata(int numeroFatturazione, LocalDate dataFattura, StatoAvanzamento statoAvanzamento,
			String codiceClienteFatturazione, String codiceEsenzioneIva, String codiceAgente, String codiceCausale,
			String codiceCausalePrelievi, float percentualeSconto, float percentualeScontoPagamento,
			float percentualeProvvigione, String descrizione, boolean indicatoreAddebitoBolli,
			boolean indicatoreAddebitoSpeseIncasso, boolean indicatoreScaricoMagazzino, int codiceListino,
			String codiceResa, String codiceVettore, boolean indicatoreFatturaAccompagnatoria, String codicePagamento,
			String codiceBanca, String codiceImballo, float pesoColli, float numeroColli, float acconto,
			String codiceDivisa, float cambio, String codiceClienteSpedizione, String nomeSpedizione,
			String indirizzoSpedizione, String capSpedizione, String cittaSpedizione, String provinciaSpedizione,
			String codiceNazioneSpedizione, String note, boolean indicatoreFatturazioneDifferita,
			boolean indicatoreEmail, boolean indicatorePa, List<FatturaDettaglio> fatturadettaglio,
			float speseTrasporto, float speseImballo, float speseIncasso, float speseBolli, float omaggi,
			float totalePagato, LocalDate dataScadenza, float importoScadenza, List<Allegato> allegati,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.numeroFatturazione = numeroFatturazione;
		this.dataFattura = dataFattura;
		this.statoAvanzamento = statoAvanzamento;
		this.codiceClienteFatturazione = codiceClienteFatturazione;
		this.codiceEsenzioneIva = codiceEsenzioneIva;
		this.codiceAgente = codiceAgente;
		this.codiceCausale = codiceCausale;
		this.codiceCausalePrelievi = codiceCausalePrelievi;
		this.percentualeSconto = percentualeSconto;
		this.percentualeScontoPagamento = percentualeScontoPagamento;
		this.percentualeProvvigione = percentualeProvvigione;
		this.descrizione = descrizione;
		this.indicatoreAddebitoBolli = indicatoreAddebitoBolli;
		this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
		this.indicatoreScaricoMagazzino = indicatoreScaricoMagazzino;
		this.codiceListino = codiceListino;
		this.codiceResa = codiceResa;
		this.codiceVettore = codiceVettore;
		this.indicatoreFatturaAccompagnatoria = indicatoreFatturaAccompagnatoria;
		this.codicePagamento = codicePagamento;
		this.codiceBanca = codiceBanca;
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
		this.note = note;
		this.indicatoreFatturazioneDifferita = indicatoreFatturazioneDifferita;
		this.indicatoreEmail = indicatoreEmail;
		this.indicatorePa = indicatorePa;
		this.fatturadettaglio = fatturadettaglio;
		this.speseTrasporto = speseTrasporto;
		this.speseImballo = speseImballo;
		this.speseIncasso = speseIncasso;
		this.speseBolli = speseBolli;
		this.omaggi = omaggi;
		this.totalePagato = totalePagato;
		this.dataScadenza = dataScadenza;
		this.importoScadenza = importoScadenza;
		this.allegati = allegati;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public FatturaTestata(int numeroFatturazione, LocalDate dataFattura) {
		this.numeroFatturazione = numeroFatturazione;
		this.dataFattura = dataFattura;
	}
	
	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public float getImportoScadenza() {
		return importoScadenza;
	}

	public void setImportoScadenza(float importoScadenza) {
		this.importoScadenza = importoScadenza;
	}

	public float getSpeseTrasporto() {
		return speseTrasporto;
	}

	public void setSpeseTrasporto(float speseTrasporto) {
		this.speseTrasporto = speseTrasporto;
	}

	public float getSpeseImballo() {
		return speseImballo;
	}

	public void setSpeseImballo(float speseImballo) {
		this.speseImballo = speseImballo;
	}

	public float getSpeseIncasso() {
		return speseIncasso;
	}

	public void setSpeseIncasso(float speseIncasso) {
		this.speseIncasso = speseIncasso;
	}

	public float getSpeseBolli() {
		return speseBolli;
	}

	public void setSpeseBolli(float speseBolli) {
		this.speseBolli = speseBolli;
	}

	public float getOmaggi() {
		return omaggi;
	}

	public void setOmaggi(float omaggi) {
		this.omaggi = omaggi;
	}

	public float getTotalePagato() {
		return totalePagato;
	}

	public void setTotalePagato(float totalePagato) {
		this.totalePagato = totalePagato;
	}

	public List<FatturaDettaglio> getFatturadettaglio() {
		return fatturadettaglio;
	}

	public void setFatturadettaglio(List<FatturaDettaglio> fatturadettaglio) {
		this.fatturadettaglio = fatturadettaglio;
	}

	public int getNumeroFatturazione() {
		return numeroFatturazione;
	}

	public void setNumeroFatturazione(int numeroFatturazione) {
		this.numeroFatturazione = numeroFatturazione;
	}

	public LocalDate getDataFattura() {
		return dataFattura;
	}

	public void setDataFattura(LocalDate dataFattura) {
		this.dataFattura = dataFattura;
	}
	
	public String getCodiceStatoAvanzamento() {
		if (statoAvanzamento == null) return null;
		return statoAvanzamento.name();
	}

	public StatoAvanzamento getStatoAvanzamento() {
		return statoAvanzamento;
	}

	public void setIndicatoreStatoAvanzamento(StatoAvanzamento statoAvanzamento) {
		this.statoAvanzamento = statoAvanzamento;
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

	public List<Allegato> getAllegati() {
		return allegati;
	}

	public void setAllegati(List<Allegato> allegati) {
		this.allegati = allegati;
	}

	public void setStatoAvanzamento(StatoAvanzamento statoAvanzamento) {
		this.statoAvanzamento = statoAvanzamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFattura == null) ? 0 : dataFattura.hashCode());
		result = prime * result + numeroFatturazione;
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
		FatturaTestata other = (FatturaTestata) obj;
		if (dataFattura == null) {
			if (other.dataFattura != null)
				return false;
		} else {
		    int y1 = dataFattura.getYear();
		    int y2 = other.dataFattura.getYear();
			if (y1 != y2)
				return false;
		}
		if (numeroFatturazione != other.numeroFatturazione)
			return false;
		return true;
	}
	
	
	
	
}
