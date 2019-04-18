package invoicemanager.model;
import java.sql.Date;
import java.sql.Timestamp;

public class OrdineDettaglio{
	private int numeroOrdine; //  NOT NULL		sottoclasse di ordineTestata
	private Date dataOrdine; //  NOT NULL
	private int numeroRigaOrdine; //  NOT NULL
	private String codiceTipoRigaDocumento; //(4) NULL
	private String codiceMagazzino; //(4) NULL
	private String codiceArticolo; //(30) NULL
	private float quantitaConsegnata; //  NULL
	private boolean indicatoreEvasione; // NULL
	private String descrizione; //(2000) NULL
	private Date dataConsegna; //  NULL
	private float quantita; //  NULL
	private String codiceUnitaMisura; //(4) NULL
	private float prezzo; // (19, 5) NULL
	private String codiceIva; //(4) NULL
	private String codiceContropartitaContabile; //(4) NULL
	private float percentualeProvvigione; //  NULL
	private float percentualeScontoCliente; //  NULL
	private float percentualeScontoArticolo; //  NULL
	private float percentualeScontoPagamento; //  NULL
	private String descrizioneAggiuntiva; //(2000) NULL
	private boolean indicatoreCoordinamento; // NULL
	private boolean indicatoreOrdineDaFatturare; // NULL
	private float quantitaVariata; //  NULL
	private int numeroPreventivo; //  NULL
	private int numeroRigaPreventivo; //  NULL
	private Date dataPreventivo; //  NULL
	private float quantitaEvasa; //  NULL
	private boolean indicatoreEvasionePreventivi; // NULL
	private boolean indicatoreEvasioneRigheNote; // NULL
	private boolean indicatoreNoConferma; // NULL
	private Date dataConsegnaSchedulatore; //  NULL
	private Date dataConsegnaProposta; //  NULL
	private boolean indicatoreBloccato; // NULL
	private boolean indicatoreOrdineTrading; // NULL
	private Date dataInizioSchedulatore; //  NULL
	private String codiceArticoloBis; //(30) NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL
	
	public OrdineDettaglio(int numeroOrdine, Date dataOrdine, int numeroRigaOrdine) {
		this.numeroOrdine = numeroOrdine;
		this.dataOrdine = dataOrdine;
		this.numeroRigaOrdine = numeroRigaOrdine;
	}

	public OrdineDettaglio(int numeroOrdine, Date dataOrdine, int numeroRigaOrdine,
			String codiceTipoRigaDocumento, String codiceMagazzino, String codiceArticolo, float quantitaConsegnata,
			boolean indicatoreEvasione, String descrizione, Date dataConsegna, float quantita,
			String codiceUnitaMisura, float prezzo, String codiceIva, String codiceContropartitaContabile,
			float percentualeProvvigione, float percentualeScontoCliente, float percentualeScontoArticolo,
			float percentualeScontoPagamento, String descrizioneAggiuntiva, boolean indicatoreCoordinamento,
			boolean indicatoreOrdineDaFatturare, float quantitaVariata, int numeroPreventivo,
			int numeroRigaPreventivo, Date dataPreventivo, float quantitaEvasa,
			boolean indicatoreEvasionePreventivi, boolean indicatoreEvasioneRigheNote, boolean indicatoreNoConferma,
			Date dataConsegnaSchedulatore, Date dataConsegnaProposta, boolean indicatoreBloccato,
			boolean indicatoreOrdineTrading, Date dataInizioSchedulatore, String codiceArticoloBis,
			Timestamp dataInserimento, Timestamp dataUltimaModifica) {
		this.numeroOrdine = numeroOrdine;
		this.dataOrdine = dataOrdine;
		this.numeroRigaOrdine = numeroRigaOrdine;
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
		this.codiceMagazzino = codiceMagazzino;
		this.codiceArticolo = codiceArticolo;
		this.quantitaConsegnata = quantitaConsegnata;
		this.indicatoreEvasione = indicatoreEvasione;
		this.descrizione = descrizione;
		this.dataConsegna = dataConsegna;
		this.quantita = quantita;
		this.codiceUnitaMisura = codiceUnitaMisura;
		this.prezzo = prezzo;
		this.codiceIva = codiceIva;
		this.codiceContropartitaContabile = codiceContropartitaContabile;
		this.percentualeProvvigione = percentualeProvvigione;
		this.percentualeScontoCliente = percentualeScontoCliente;
		this.percentualeScontoArticolo = percentualeScontoArticolo;
		this.percentualeScontoPagamento = percentualeScontoPagamento;
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
		this.indicatoreCoordinamento = indicatoreCoordinamento;
		this.indicatoreOrdineDaFatturare = indicatoreOrdineDaFatturare;
		this.quantitaVariata = quantitaVariata;
		this.numeroPreventivo = numeroPreventivo;
		this.numeroRigaPreventivo = numeroRigaPreventivo;
		this.dataPreventivo = dataPreventivo;
		this.quantitaEvasa = quantitaEvasa;
		this.indicatoreEvasionePreventivi = indicatoreEvasionePreventivi;
		this.indicatoreEvasioneRigheNote = indicatoreEvasioneRigheNote;
		this.indicatoreNoConferma = indicatoreNoConferma;
		this.dataConsegnaSchedulatore = dataConsegnaSchedulatore;
		this.dataConsegnaProposta = dataConsegnaProposta;
		this.indicatoreBloccato = indicatoreBloccato;
		this.indicatoreOrdineTrading = indicatoreOrdineTrading;
		this.dataInizioSchedulatore = dataInizioSchedulatore;
		this.codiceArticoloBis = codiceArticoloBis;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public int getNumeroRigaOrdine() {
		return numeroRigaOrdine;
	}

	public void setNumeroRigaOrdine(int numeroRigaOrdine) {
		this.numeroRigaOrdine = numeroRigaOrdine;
	}

	public String getCodiceTipoRigaDocumento() {
		return codiceTipoRigaDocumento;
	}

	public void setCodiceTipoRigaDocumento(String codiceTipoRigaDocumento) {
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
	}

	public String getCodiceMagazzino() {
		return codiceMagazzino;
	}

	public void setCodiceMagazzino(String codiceMagazzino) {
		this.codiceMagazzino = codiceMagazzino;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public float getQuantitaConsegnata() {
		return quantitaConsegnata;
	}

	public void setQuantitaConsegnata(float quantitaConsegnata) {
		this.quantitaConsegnata = quantitaConsegnata;
	}

	public boolean isIndicatoreEvasione() {
		return indicatoreEvasione;
	}

	public void setIndicatoreEvasione(boolean indicatoreEvasione) {
		this.indicatoreEvasione = indicatoreEvasione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public float getQuantita() {
		return quantita;
	}

	public void setQuantita(float quantita) {
		this.quantita = quantita;
	}

	public String getCodiceUnitaMisura() {
		return codiceUnitaMisura;
	}

	public void setCodiceUnitaMisura(String codiceUnitaMisura) {
		this.codiceUnitaMisura = codiceUnitaMisura;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public String getCodiceIva() {
		return codiceIva;
	}

	public void setCodiceIva(String codiceIva) {
		this.codiceIva = codiceIva;
	}

	public String getCodiceContropartitaContabile() {
		return codiceContropartitaContabile;
	}

	public void setCodiceContropartitaContabile(String codiceContropartitaContabile) {
		this.codiceContropartitaContabile = codiceContropartitaContabile;
	}

	public float getPercentualeProvvigione() {
		return percentualeProvvigione;
	}

	public void setPercentualeProvvigione(float percentualeProvvigione) {
		this.percentualeProvvigione = percentualeProvvigione;
	}

	public float getPercentualeScontoCliente() {
		return percentualeScontoCliente;
	}

	public void setPercentualeScontoCliente(float percentualeScontoCliente) {
		this.percentualeScontoCliente = percentualeScontoCliente;
	}

	public float getPercentualeScontoArticolo() {
		return percentualeScontoArticolo;
	}

	public void setPercentualeScontoArticolo(float percentualeScontoArticolo) {
		this.percentualeScontoArticolo = percentualeScontoArticolo;
	}

	public float getPercentualeScontoPagamento() {
		return percentualeScontoPagamento;
	}

	public void setPercentualeScontoPagamento(float percentualeScontoPagamento) {
		this.percentualeScontoPagamento = percentualeScontoPagamento;
	}

	public String getDescrizioneAggiuntiva() {
		return descrizioneAggiuntiva;
	}

	public void setDescrizioneAggiuntiva(String descrizioneAggiuntiva) {
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
	}

	public boolean isIndicatoreCoordinamento() {
		return indicatoreCoordinamento;
	}

	public void setIndicatoreCoordinamento(boolean indicatoreCoordinamento) {
		this.indicatoreCoordinamento = indicatoreCoordinamento;
	}

	public boolean isIndicatoreOrdineDaFatturare() {
		return indicatoreOrdineDaFatturare;
	}

	public void setIndicatoreOrdineDaFatturare(boolean indicatoreOrdineDaFatturare) {
		this.indicatoreOrdineDaFatturare = indicatoreOrdineDaFatturare;
	}

	public float getQuantitaVariata() {
		return quantitaVariata;
	}

	public void setQuantitaVariata(float quantitaVariata) {
		this.quantitaVariata = quantitaVariata;
	}

	public int getNumeroPreventivo() {
		return numeroPreventivo;
	}

	public void setNumeroPreventivo(int numeroPreventivo) {
		this.numeroPreventivo = numeroPreventivo;
	}

	public int getNumeroRigaPreventivo() {
		return numeroRigaPreventivo;
	}

	public void setNumeroRigaPreventivo(int numeroRigaPreventivo) {
		this.numeroRigaPreventivo = numeroRigaPreventivo;
	}

	public float getQuantitaEvasa() {
		return quantitaEvasa;
	}

	public void setQuantitaEvasa(float quantitaEvasa) {
		this.quantitaEvasa = quantitaEvasa;
	}

	public boolean isIndicatoreEvasionePreventivi() {
		return indicatoreEvasionePreventivi;
	}

	public void setIndicatoreEvasionePreventivi(boolean indicatoreEvasionePreventivi) {
		this.indicatoreEvasionePreventivi = indicatoreEvasionePreventivi;
	}

	public boolean isIndicatoreEvasioneRigheNote() {
		return indicatoreEvasioneRigheNote;
	}

	public void setIndicatoreEvasioneRigheNote(boolean indicatoreEvasioneRigheNote) {
		this.indicatoreEvasioneRigheNote = indicatoreEvasioneRigheNote;
	}

	public boolean isIndicatoreNoConferma() {
		return indicatoreNoConferma;
	}

	public void setIndicatoreNoConferma(boolean indicatoreNoConferma) {
		this.indicatoreNoConferma = indicatoreNoConferma;
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

	public boolean isIndicatoreBloccato() {
		return indicatoreBloccato;
	}

	public void setIndicatoreBloccato(boolean indicatoreBloccato) {
		this.indicatoreBloccato = indicatoreBloccato;
	}

	public boolean isIndicatoreOrdineTrading() {
		return indicatoreOrdineTrading;
	}

	public void setIndicatoreOrdineTrading(boolean indicatoreOrdineTrading) {
		this.indicatoreOrdineTrading = indicatoreOrdineTrading;
	}

	public String getCodiceArticoloBis() {
		return codiceArticoloBis;
	}

	public void setCodiceArticoloBis(String codiceArticoloBis) {
		this.codiceArticoloBis = codiceArticoloBis;
	}

	public Date getDataOrdine() {
		return dataOrdine;
	}

	public void setDataOrdine(Date dataOrdine) {
		this.dataOrdine = dataOrdine;
	}

	public Date getDataConsegna() {
		return dataConsegna;
	}

	public void setDataConsegna(Date dataConsegna) {
		this.dataConsegna = dataConsegna;
	}

	public Date getDataPreventivo() {
		return dataPreventivo;
	}

	public void setDataPreventivo(Date dataPreventivo) {
		this.dataPreventivo = dataPreventivo;
	}

	public Date getDataConsegnaSchedulatore() {
		return dataConsegnaSchedulatore;
	}

	public void setDataConsegnaSchedulatore(Date dataConsegnaSchedulatore) {
		this.dataConsegnaSchedulatore = dataConsegnaSchedulatore;
	}

	public Date getDataConsegnaProposta() {
		return dataConsegnaProposta;
	}

	public void setDataConsegnaProposta(Date dataConsegnaProposta) {
		this.dataConsegnaProposta = dataConsegnaProposta;
	}

	public Date getDataInizioSchedulatore() {
		return dataInizioSchedulatore;
	}

	public void setDataInizioSchedulatore(Date dataInizioSchedulatore) {
		this.dataInizioSchedulatore = dataInizioSchedulatore;
	}
}
