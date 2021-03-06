package invoicemanager.model;
import java.sql.Date;
import java.sql.Timestamp;

public class Scadenze{
	private String codiceConto; //(30) COLLATE Latin1_General_CI_AS NOT NULL,
	private String codiceTipoPagamento; //(2) COLLATE Latin1_General_CI_AS NOT NULL,
	private String riferimentoPartita; //(10) COLLATE Latin1_General_CI_AS NOT NULL,
	private Date dataDocumento; //  NOT NULL,
	private Date dataScadenza; //  NOT NULL,
	private int numeroRegistrazione; //  NOT NULL,
	private String codiceBanca; //(10) COLLATE Latin1_General_CI_AS NULL,
	private Date dataValuta; //  NULL,
	private String codicePagamento; //(4) COLLATE Latin1_General_CI_AS NULL,
	private String numeroAssegno; //(15) COLLATE Latin1_General_CI_AS NULL,
	private float importoImponibileRitenutaAcconto; //  NULL,
	private float importoRitenutaAcconto; //  NULL,
	private float importoRimborsiRitenutaAcconto; //  NULL,
	private float importoIVARitenutaAcconto; //  NULL,
	private float contriburoINPSDatoreLavoro; //  NULL,
	private float contriburoINPSDatorePercipiente; //  NULL,
	private Date dataValutaAssegno; //  NULL,
	private String note; //(200) COLLATE Latin1_General_CI_AS NULL,
	private float importoPagato; //  NULL,
	private Date dataPagamento; //  NULL,
	private String numeroDocumento; //(10) COLLATE Latin1_General_CI_AS NULL,
	private String codiceIVAInSospensione; //(4) COLLATE Latin1_General_CI_AS NULL,
	private float importoPartita; //  NULL,
	private float impostaIVAInSospensione; //  NULL,
	private float imponibileIVAInSospensione; //  NULL,
	private int numeroGiornaleIVA; //  NULL,
	private String tipoRitenutaAcconto; //(3) COLLATE Latin1_General_CI_AS NULL,
	private Date dataAutorizzazionePagamento; //  NULL,
	private String codiceDivisa; //(4) COLLATE Latin1_General_CI_AS NULL,
	private Date dataRegistrazione; //  NULL,
	private float importoAbbuono; //  NULL,
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL,
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL,
	private String descrizioneAggiuntiva; //(100) COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatoreFattureProforma; // COLLATE Latin1_General_CI_AS NULL,
	private float importoRimborsiCpap; // 

	public Scadenze(String codiceConto, String codiceTipoPagamento, String riferimentoPartita, Date dataDocumento, Date dataScadenza, int numeroRegistrazione){
		this.codiceConto = codiceConto;
		this.codiceTipoPagamento = codiceTipoPagamento;
		this.riferimentoPartita = riferimentoPartita;
		this.dataDocumento = dataDocumento;
		this.dataScadenza = dataScadenza;
		this.numeroRegistrazione = numeroRegistrazione;
	}

	public Scadenze(String codiceConto, String codiceTipoPagamento, String riferimentoPartita, Date dataDocumento,
			Date dataScadenza, int numeroRegistrazione, String codiceBanca, Date dataValuta,
			String codicePagamento, String numeroAssegno, float importoImponibileRitenutaAcconto,
			float importoRitenutaAcconto, float importoRimborsiRitenutaAcconto, float importoIVARitenutaAcconto,
			float contriburoINPSDatoreLavoro, float contriburoINPSDatorePercipiente, Date dataValutaAssegno,
			String note, float importoPagato, Date dataPagamento, String numeroDocumento,
			String codiceIVAInSospensione, float importoPartita, float impostaIVAInSospensione,
			float imponibileIVAInSospensione, int numeroGiornaleIVA, String tipoRitenutaAcconto,
			Date dataAutorizzazionePagamento, String codiceDivisa, Date dataRegistrazione,
			float importoAbbuono, Timestamp dataInserimento, Timestamp dataUltimaModifica,
			String descrizioneAggiuntiva, boolean indicatoreFattureProforma, float importoRimborsiCpap) {
		this.codiceConto = codiceConto;
		this.codiceTipoPagamento = codiceTipoPagamento;
		this.riferimentoPartita = riferimentoPartita;
		this.dataDocumento = dataDocumento;
		this.dataScadenza = dataScadenza;
		this.numeroRegistrazione = numeroRegistrazione;
		this.codiceBanca = codiceBanca;
		this.dataValuta = dataValuta;
		this.codicePagamento = codicePagamento;
		this.numeroAssegno = numeroAssegno;
		this.importoImponibileRitenutaAcconto = importoImponibileRitenutaAcconto;
		this.importoRitenutaAcconto = importoRitenutaAcconto;
		this.importoRimborsiRitenutaAcconto = importoRimborsiRitenutaAcconto;
		this.importoIVARitenutaAcconto = importoIVARitenutaAcconto;
		this.contriburoINPSDatoreLavoro = contriburoINPSDatoreLavoro;
		this.contriburoINPSDatorePercipiente = contriburoINPSDatorePercipiente;
		this.dataValutaAssegno = dataValutaAssegno;
		this.note = note;
		this.importoPagato = importoPagato;
		this.dataPagamento = dataPagamento;
		this.numeroDocumento = numeroDocumento;
		this.codiceIVAInSospensione = codiceIVAInSospensione;
		this.importoPartita = importoPartita;
		this.impostaIVAInSospensione = impostaIVAInSospensione;
		this.imponibileIVAInSospensione = imponibileIVAInSospensione;
		this.numeroGiornaleIVA = numeroGiornaleIVA;
		this.tipoRitenutaAcconto = tipoRitenutaAcconto;
		this.dataAutorizzazionePagamento = dataAutorizzazionePagamento;
		this.codiceDivisa = codiceDivisa;
		this.dataRegistrazione = dataRegistrazione;
		this.importoAbbuono = importoAbbuono;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
		this.indicatoreFattureProforma = indicatoreFattureProforma;
		this.importoRimborsiCpap = importoRimborsiCpap;
	}

	public String getCodiceConto() {
		return codiceConto;
	}

	public void setCodiceConto(String codiceConto) {
		this.codiceConto = codiceConto;
	}

	public String getCodiceTipoPagamento() {
		return codiceTipoPagamento;
	}

	public void setCodiceTipoPagamento(String codiceTipoPagamento) {
		this.codiceTipoPagamento = codiceTipoPagamento;
	}

	public String getRiferimentoPartita() {
		return riferimentoPartita;
	}

	public void setRiferimentoPartita(String riferimentoPartita) {
		this.riferimentoPartita = riferimentoPartita;
	}

	public Date getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(Date dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public int getNumeroRegistrazione() {
		return numeroRegistrazione;
	}

	public void setNumeroRegistrazione(int numeroRegistrazione) {
		this.numeroRegistrazione = numeroRegistrazione;
	}

	public String getCodiceBanca() {
		return codiceBanca;
	}

	public void setCodiceBanca(String codiceBanca) {
		this.codiceBanca = codiceBanca;
	}

	public Date getDataValuta() {
		return dataValuta;
	}

	public void setDataValuta(Date dataValuta) {
		this.dataValuta = dataValuta;
	}

	public String getCodicePagamento() {
		return codicePagamento;
	}

	public void setCodicePagamento(String codicePagamento) {
		this.codicePagamento = codicePagamento;
	}

	public String getNumeroAssegno() {
		return numeroAssegno;
	}

	public void setNumeroAssegno(String numeroAssegno) {
		this.numeroAssegno = numeroAssegno;
	}

	public float getImportoImponibileRitenutaAcconto() {
		return importoImponibileRitenutaAcconto;
	}

	public void setImportoImponibileRitenutaAcconto(float importoImponibileRitenutaAcconto) {
		this.importoImponibileRitenutaAcconto = importoImponibileRitenutaAcconto;
	}

	public float getImportoRitenutaAcconto() {
		return importoRitenutaAcconto;
	}

	public void setImportoRitenutaAcconto(float importoRitenutaAcconto) {
		this.importoRitenutaAcconto = importoRitenutaAcconto;
	}

	public float getImportoRimborsiRitenutaAcconto() {
		return importoRimborsiRitenutaAcconto;
	}

	public void setImportoRimborsiRitenutaAcconto(float importoRimborsiRitenutaAcconto) {
		this.importoRimborsiRitenutaAcconto = importoRimborsiRitenutaAcconto;
	}

	public float getImportoIVARitenutaAcconto() {
		return importoIVARitenutaAcconto;
	}

	public void setImportoIVARitenutaAcconto(float importoIVARitenutaAcconto) {
		this.importoIVARitenutaAcconto = importoIVARitenutaAcconto;
	}

	public float getContriburoINPSDatoreLavoro() {
		return contriburoINPSDatoreLavoro;
	}

	public void setContriburoINPSDatoreLavoro(float contriburoINPSDatoreLavoro) {
		this.contriburoINPSDatoreLavoro = contriburoINPSDatoreLavoro;
	}

	public float getContriburoINPSDatorePercipiente() {
		return contriburoINPSDatorePercipiente;
	}

	public void setContriburoINPSDatorePercipiente(float contriburoINPSDatorePercipiente) {
		this.contriburoINPSDatorePercipiente = contriburoINPSDatorePercipiente;
	}

	public Date getDataValutaAssegno() {
		return dataValutaAssegno;
	}

	public void setDataValutaAssegno(Date dataValutaAssegno) {
		this.dataValutaAssegno = dataValutaAssegno;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public float getImportoPagato() {
		return importoPagato;
	}

	public void setImportoPagato(float importoPagato) {
		this.importoPagato = importoPagato;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getCodiceIVAInSospensione() {
		return codiceIVAInSospensione;
	}

	public void setCodiceIVAInSospensione(String codiceIVAInSospensione) {
		this.codiceIVAInSospensione = codiceIVAInSospensione;
	}

	public float getImportoPartita() {
		return importoPartita;
	}

	public void setImportoPartita(float importoPartita) {
		this.importoPartita = importoPartita;
	}

	public float getImpostaIVAInSospensione() {
		return impostaIVAInSospensione;
	}

	public void setImpostaIVAInSospensione(float impostaIVAInSospensione) {
		this.impostaIVAInSospensione = impostaIVAInSospensione;
	}

	public float getImponibileIVAInSospensione() {
		return imponibileIVAInSospensione;
	}

	public void setImponibileIVAInSospensione(float imponibileIVAInSospensione) {
		this.imponibileIVAInSospensione = imponibileIVAInSospensione;
	}

	public int getNumeroGiornaleIVA() {
		return numeroGiornaleIVA;
	}

	public void setNumeroGiornaleIVA(int numeroGiornaleIVA) {
		this.numeroGiornaleIVA = numeroGiornaleIVA;
	}

	public String getTipoRitenutaAcconto() {
		return tipoRitenutaAcconto;
	}

	public void setTipoRitenutaAcconto(String tipoRitenutaAcconto) {
		this.tipoRitenutaAcconto = tipoRitenutaAcconto;
	}

	public Date getDataAutorizzazionePagamento() {
		return dataAutorizzazionePagamento;
	}

	public void setDataAutorizzazionePagamento(Date dataAutorizzazionePagamento) {
		this.dataAutorizzazionePagamento = dataAutorizzazionePagamento;
	}

	public String getCodiceDivisa() {
		return codiceDivisa;
	}

	public void setCodiceDivisa(String codiceDivisa) {
		this.codiceDivisa = codiceDivisa;
	}

	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}

	public void setDataRegistrazione(Date dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}

	public float getImportoAbbuono() {
		return importoAbbuono;
	}

	public void setImportoAbbuono(float importoAbbuono) {
		this.importoAbbuono = importoAbbuono;
	}

	public Timestamp getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(Timestamp dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Timestamp getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(Timestamp dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getDescrizioneAggiuntiva() {
		return descrizioneAggiuntiva;
	}

	public void setDescrizioneAggiuntiva(String descrizioneAggiuntiva) {
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
	}

	public boolean isIndicatoreFattureProforma() {
		return indicatoreFattureProforma;
	}

	public void setIndicatoreFattureProforma(boolean indicatoreFattureProforma) {
		this.indicatoreFattureProforma = indicatoreFattureProforma;
	}

	public float getImportoRimborsiCpap() {
		return importoRimborsiCpap;
	}

	public void setImportoRimborsiCpap(float importoRimborsiCpap) {
		this.importoRimborsiCpap = importoRimborsiCpap;
	}
}
