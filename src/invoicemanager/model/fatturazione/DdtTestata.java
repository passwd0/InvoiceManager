package invoicemanager.model.fatturazione;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class DdtTestata {
	private int numeroDDT; //NOT NULL
	private LocalDateTime dataDDT; //NOT NULL
	private StatoAvanzamento statoAvanzamento = StatoAvanzamento.DAINVIARE; //] [varchar](1) ,
	private String codiceCausale; //] [varchar](4) ,
	private String codiceCausalePrelievi; //] [varchar](4) ,
	private String codiceClienteFatturazione; //] [varchar](30) ,				//codiceCliente
	private String codiceEsenzioneIva; //] [varchar](4) ,
	private String codiceAgente; //] [varchar](10) ,
	private float percentualeProvvigione; //NULL
	private float percentualeSconto; //NULL
	private int numeroCopieFattura; //NULL
	private boolean indicatoreAddebitoBolli; //] [varchar](1) ,
	private boolean indicatoreAddebitoSpeseIncasso; //] [varchar](1) ,
	private int codiceListino; //NULL
	private String codiceResa; //] [varchar](4) ,
	private String codiceVettore; //] [varchar](4) ,
	private String codiceImballo; //] [varchar](4) ,
	private String codicePagamento; //] [varchar](4) ,
	private String codiceBanca; //] [varchar](4) ,
	private int numeroFattura; //NULL
	private LocalDate dataFattura; //NULL
	private String codiceDivisa; // [varchar](4) ,
	private String causaleTrasporto; //] [varchar](50) ,
	private float pesoColli; //NULL
	private String descrizione; //] [varchar](200) ,
	private int numeroColli; //NULL
	private boolean indicatorePreventivoDaConferma; //] [varchar](1) ,
	private boolean indicatoreBollaVisione; //] [varchar](1) ,
	private String codiceClienteSpedizione; //] [varchar](30) ,
	private String nomeSpedizione; //] [varchar](100) ,
	private String indirizzoSpedizione; //] [varchar](100) ,
	private String capSpedizione; //] [varchar](20) ,
	private String cittaSpedizione; //] [varchar](50) ,
	private String provinciaSpedizione; //] [varchar](30) ,
	private String codiceNazioneSpedizione; //] [varchar](10) ,
	private LocalDateTime dataInserimento = LocalDateTime.now(); //NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //NULL
	private String note; //[Note] [varchar](500) ,
	private String codiceLingua; //] [varchar](4) ,
	private int numeroDdtDeposito; //NULL
	private String codiceDeposito; //] [varchar](4) ,
	private String noteCaricamento; //] [varchar](2000) ,
	private String codiceFilialeEdi;//] [varchar](50) ,
	private LocalDateTime dataCaricamento; //NULL
	private String unitaMisuraPesoColli; //[UnitaMisuraPesoColli] [varchar](3) 
	private List<DdtDettaglio> ddtDettagli;
	
	

	public DdtTestata(int numeroDDT, LocalDateTime dataDDT, StatoAvanzamento statoAvanzamento, String codiceCausale,
			String codiceCausalePrelievi, String codiceClienteFatturazione, String codiceEsenzioneIva,
			String codiceAgente, float percentualeProvvigione, float percentualeSconto, int numeroCopieFattura,
			boolean indicatoreAddebitoBolli, boolean indicatoreAddebitoSpeseIncasso, int codiceListino,
			String codiceResa, String codiceVettore, String codiceImballo, String codicePagamento, String codiceBanca,
			int numeroFattura, LocalDate dataFattura, String codiceDivisa, String causaleTrasporto, float pesoColli,
			String descrizione, int numeroColli, boolean indicatorePreventivoDaConferma, boolean indicatoreBollaVisione,
			String codiceClienteSpedizione, String nomeSpedizione, String indirizzoSpedizione, String capSpedizione,
			String cittaSpedizione, String provinciaSpedizione, String codiceNazioneSpedizione,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica, String note, String codiceLingua,
			int numeroDdtDeposito, String codiceDeposito, String noteCaricamento, String codiceFilialeEdi,
			LocalDateTime dataCaricamento, String unitaMisuraPesoColli, List<DdtDettaglio> ddtDettagli) {
		this.numeroDDT = numeroDDT;
		this.dataDDT = dataDDT;
		this.statoAvanzamento = statoAvanzamento;
		this.codiceCausale = codiceCausale;
		this.codiceCausalePrelievi = codiceCausalePrelievi;
		this.codiceClienteFatturazione = codiceClienteFatturazione;
		this.codiceEsenzioneIva = codiceEsenzioneIva;
		this.codiceAgente = codiceAgente;
		this.percentualeProvvigione = percentualeProvvigione;
		this.percentualeSconto = percentualeSconto;
		this.numeroCopieFattura = numeroCopieFattura;
		this.indicatoreAddebitoBolli = indicatoreAddebitoBolli;
		this.indicatoreAddebitoSpeseIncasso = indicatoreAddebitoSpeseIncasso;
		this.codiceListino = codiceListino;
		this.codiceResa = codiceResa;
		this.codiceVettore = codiceVettore;
		this.codiceImballo = codiceImballo;
		this.codicePagamento = codicePagamento;
		this.codiceBanca = codiceBanca;
		this.numeroFattura = numeroFattura;
		this.dataFattura = dataFattura;
		this.codiceDivisa = codiceDivisa;
		this.causaleTrasporto = causaleTrasporto;
		this.pesoColli = pesoColli;
		this.descrizione = descrizione;
		this.numeroColli = numeroColli;
		this.indicatorePreventivoDaConferma = indicatorePreventivoDaConferma;
		this.indicatoreBollaVisione = indicatoreBollaVisione;
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
		this.numeroDdtDeposito = numeroDdtDeposito;
		this.codiceDeposito = codiceDeposito;
		this.noteCaricamento = noteCaricamento;
		this.codiceFilialeEdi = codiceFilialeEdi;
		this.dataCaricamento = dataCaricamento;
		this.unitaMisuraPesoColli = unitaMisuraPesoColli;
		this.ddtDettagli = ddtDettagli;
	}

	public DdtTestata(int numeroDDT, LocalDateTime dataDDT) {
		this.numeroDDT = numeroDDT;
		this.dataDDT = dataDDT;
	}
	
	public List<DdtDettaglio> getDdtDettagli() {
		return ddtDettagli;
	}

	public void setDdtDettagli(List<DdtDettaglio> ddtDettagli) {
		this.ddtDettagli = ddtDettagli;
	}

	public int getNumeroDDT() {
		return numeroDDT;
	}
	public void setNumeroDDT(int numeroDDT) {
		this.numeroDDT = numeroDDT;
	}
	public LocalDateTime getDataDDT() {
		return dataDDT;
	}
	public void setDataDDT(LocalDateTime dataDDT) {
		this.dataDDT = dataDDT;
	}
	public StatoAvanzamento getStatoAvanzamento() {
		return statoAvanzamento;
	}
	public void setIndicatoreStatoAvanzamento(StatoAvanzamento statoAvanzamento) {
		this.statoAvanzamento = statoAvanzamento;
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
	public float getPercentualeProvvigione() {
		return percentualeProvvigione;
	}
	public void setPercentualeProvvigione(float percentualeProvvigione) {
		this.percentualeProvvigione = percentualeProvvigione;
	}
	public float getPercentualeSconto() {
		return percentualeSconto;
	}
	public void setPercentualeSconto(float percentualeSconto) {
		this.percentualeSconto = percentualeSconto;
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
	public String getCodiceImballo() {
		return codiceImballo;
	}
	public void setCodiceImballo(String codiceImballo) {
		this.codiceImballo = codiceImballo;
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
	public String getCodiceDivisa() {
		return codiceDivisa;
	}
	public void setCodiceDivisa(String codiceDivisa) {
		this.codiceDivisa = codiceDivisa;
	}
	public String getCausaleTrasporto() {
		return causaleTrasporto;
	}
	public void setCausaleTrasporto(String causaleTrasporto) {
		this.causaleTrasporto = causaleTrasporto;
	}
	public float getPesoColli() {
		return pesoColli;
	}
	public void setPesoColli(float pesoColli) {
		this.pesoColli = pesoColli;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getNumeroColli() {
		return numeroColli;
	}
	public void setNumeroColli(int numeroColli) {
		this.numeroColli = numeroColli;
	}
	public boolean isIndicatorePreventivoDaConferma() {
		return indicatorePreventivoDaConferma;
	}
	public void setIndicatorePreventivoDaConferma(boolean indicatorePreventivoDaConferma) {
		this.indicatorePreventivoDaConferma = indicatorePreventivoDaConferma;
	}
	public boolean isIndicatoreBollaVisione() {
		return indicatoreBollaVisione;
	}
	public void setIndicatoreBollaVisione(boolean indicatoreBollaVisione) {
		this.indicatoreBollaVisione = indicatoreBollaVisione;
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
	
	public String getCodiceLingua() {
		return codiceLingua;
	}
	public void setCodiceLingua(String codiceLingua) {
		this.codiceLingua = codiceLingua;
	}
	public int getNumeroDdtDeposito() {
		return numeroDdtDeposito;
	}
	public void setNumeroDdtDeposito(int numeroDdtDeposito) {
		this.numeroDdtDeposito = numeroDdtDeposito;
	}
	public String getCodiceDeposito() {
		return codiceDeposito;
	}
	public void setCodiceDeposito(String codiceDeposito) {
		this.codiceDeposito = codiceDeposito;
	}
	public String getNoteCaricamento() {
		return noteCaricamento;
	}
	public void setNoteCaricamento(String noteCaricamento) {
		this.noteCaricamento = noteCaricamento;
	}
	public String getCodiceFilialeEdi() {
		return codiceFilialeEdi;
	}
	public void setCodiceFilialeEdi(String codiceFilialeEdi) {
		this.codiceFilialeEdi = codiceFilialeEdi;
	}
	public LocalDateTime getDataCaricamento() {
		return dataCaricamento;
	}
	public void setDataCaricamento(LocalDateTime dataCaricamento) {
		this.dataCaricamento = dataCaricamento;
	}
	public String getUnitaMisuraPesoColli() {
		return unitaMisuraPesoColli;
	}
	public void setUnitaMisuraPesoColli(String unitaMisuraPesoColli) {
		this.unitaMisuraPesoColli = unitaMisuraPesoColli;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroDDT;
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
		DdtTestata other = (DdtTestata) obj;
		if (numeroDDT != other.numeroDDT)
			return false;
		return true;
	}

	
}
