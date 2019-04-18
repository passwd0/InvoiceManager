package invoicemanager.model;
import java.sql.Date;
import java.sql.Timestamp;

public class ListinoPersonalizzato implements Listino {
	private String codiceListinoPersonalizzato;
	private String codiceCliente; //(30) NOT NULL
	private String codiceArticolo; //(30) NOT NULL
	private String variante; //(20) NULL
	private float prezzo; // (19, 5) NULL
	private float provvigione; //  NULL
	private String noteEsterne; //(200) NULL
	private String noteInterne; //(200) NULL
	private int numeroDecimali; //  NULL
	private float scontoCliente; //  NULL
	private Timestamp dataAggiornamento; //  NULL
	private float scontoArticolo; //  NULL
	private float scontoPagamento; //  NULL
	private String codiceDivisa; //(4) NOT NULL
	private GruppoMerceologico gruppoMerceologico; //(4) NULL
	private Date dataInizioValidita; //  NULL
	private Date dataFineValidita; //  NULL
	private boolean opzioneGruppi; //  NULL
	private boolean opzioneScontoClienti; //  NULL
	private boolean opzioneScontoArticolo; //  NULL
	private boolean opzioneScontoPagamento; //  NULL
	private boolean opzionePercentualeProvvigione; //  NULL
	private boolean opzioneNoteEsterne; //  NULL
	private boolean opzioneNoteInterne; //  NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public ListinoPersonalizzato(String codiceCliente, String codiceArticolo, String codiceDivisa){
		this.codiceCliente = codiceCliente;
		this.codiceArticolo = codiceArticolo;
		this.codiceDivisa = codiceDivisa;
	}
	
	public ListinoPersonalizzato(String codiceListinoPersonalizzato, String codiceCliente, String codiceArticolo,
			String variante, float prezzo, float provvigione, String noteEsterne, String noteInterne,
			int numeroDecimali, float scontoCliente, Timestamp dataAggiornamento, float scontoArticolo,
			float scontoPagamento, String codiceDivisa, GruppoMerceologico gruppoMerceologico,
			Date dataInizioValidita, Date dataFineValidita, boolean opzioneGruppi,
			boolean opzioneScontoClienti, boolean opzioneScontoArticolo, boolean opzioneScontoPagamento,
			boolean opzionePercentualeProvvigione, boolean opzioneNoteEsterne, boolean opzioneNoteInterne,
			Timestamp dataInserimento, Timestamp dataUltimaModifica) {
		this.codiceListinoPersonalizzato = codiceListinoPersonalizzato;
		this.codiceCliente = codiceCliente;
		this.codiceArticolo = codiceArticolo;
		this.variante = variante;
		this.prezzo = prezzo;
		this.provvigione = provvigione;
		this.noteEsterne = noteEsterne;
		this.noteInterne = noteInterne;
		this.numeroDecimali = numeroDecimali;
		this.scontoCliente = scontoCliente;
		this.dataAggiornamento = dataAggiornamento;
		this.scontoArticolo = scontoArticolo;
		this.scontoPagamento = scontoPagamento;
		this.codiceDivisa = codiceDivisa;
		this.gruppoMerceologico = gruppoMerceologico;
		this.dataInizioValidita = dataInizioValidita;
		this.dataFineValidita = dataFineValidita;
		this.opzioneGruppi = opzioneGruppi;
		this.opzioneScontoClienti = opzioneScontoClienti;
		this.opzioneScontoArticolo = opzioneScontoArticolo;
		this.opzioneScontoPagamento = opzioneScontoPagamento;
		this.opzionePercentualeProvvigione = opzionePercentualeProvvigione;
		this.opzioneNoteEsterne = opzioneNoteEsterne;
		this.opzioneNoteInterne = opzioneNoteInterne;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceGruppoMerceologico() {
		if (gruppoMerceologico == null)
			return null;
		return gruppoMerceologico.getCodiceGruppoMerceologico();
	}

	public String getCodiceListinoPersonalizzato() {
		return codiceListinoPersonalizzato;
	}

	public void setCodiceListinoPersonalizzato(String codiceListinoPersonalizzato) {
		this.codiceListinoPersonalizzato = codiceListinoPersonalizzato;
	}

	public String getCodiceCliente() {
		return codiceCliente;
	}

	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public String getVariante() {
		return variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getProvvigione() {
		return provvigione;
	}

	public void setProvvigione(float provvigione) {
		this.provvigione = provvigione;
	}

	public String getNoteEsterne() {
		return noteEsterne;
	}

	public void setNoteEsterne(String noteEsterne) {
		this.noteEsterne = noteEsterne;
	}

	public String getNoteInterne() {
		return noteInterne;
	}

	public void setNoteInterne(String noteInterne) {
		this.noteInterne = noteInterne;
	}

	public int getNumeroDecimali() {
		return numeroDecimali;
	}

	public void setNumeroDecimali(int numeroDecimali) {
		this.numeroDecimali = numeroDecimali;
	}

	public float getScontoCliente() {
		return scontoCliente;
	}

	public void setScontoCliente(float scontoCliente) {
		this.scontoCliente = scontoCliente;
	}

	public Timestamp getDataAggiornamento() {
		return dataAggiornamento;
	}

	public void setDataAggiornamento(Timestamp dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}

	public float getScontoArticolo() {
		return scontoArticolo;
	}

	public void setScontoArticolo(float scontoArticolo) {
		this.scontoArticolo = scontoArticolo;
	}

	public float getScontoPagamento() {
		return scontoPagamento;
	}

	public void setScontoPagamento(float scontoPagamento) {
		this.scontoPagamento = scontoPagamento;
	}

	public String getCodiceDivisa() {
		return codiceDivisa;
	}

	public void setCodiceDivisa(String codiceDivisa) {
		this.codiceDivisa = codiceDivisa;
	}

	public GruppoMerceologico getGruppoMerceologico() {
		return gruppoMerceologico;
	}

	public void setGruppoMerceologico(GruppoMerceologico gruppoMerceologico) {
		this.gruppoMerceologico = gruppoMerceologico;
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

	public Date getDataInizioValidita() {
		return dataInizioValidita;
	}

	public void setDataInizioValidita(Date dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}

	public Date getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	public boolean isOpzioneGruppi() {
		return opzioneGruppi;
	}

	public void setOpzioneGruppi(boolean opzioneGruppi) {
		this.opzioneGruppi = opzioneGruppi;
	}

	public boolean isOpzioneScontoClienti() {
		return opzioneScontoClienti;
	}

	public void setOpzioneScontoClienti(boolean opzioneScontoClienti) {
		this.opzioneScontoClienti = opzioneScontoClienti;
	}

	public boolean isOpzioneScontoArticolo() {
		return opzioneScontoArticolo;
	}

	public void setOpzioneScontoArticolo(boolean opzioneScontoArticolo) {
		this.opzioneScontoArticolo = opzioneScontoArticolo;
	}

	public boolean isOpzioneScontoPagamento() {
		return opzioneScontoPagamento;
	}

	public void setOpzioneScontoPagamento(boolean opzioneScontoPagamento) {
		this.opzioneScontoPagamento = opzioneScontoPagamento;
	}

	public boolean isOpzionePercentualeProvvigione() {
		return opzionePercentualeProvvigione;
	}

	public void setOpzionePercentualeProvvigione(boolean opzionePercentualeProvvigione) {
		this.opzionePercentualeProvvigione = opzionePercentualeProvvigione;
	}

	public boolean isOpzioneNoteEsterne() {
		return opzioneNoteEsterne;
	}

	public void setOpzioneNoteEsterne(boolean opzioneNoteEsterne) {
		this.opzioneNoteEsterne = opzioneNoteEsterne;
	}

	public boolean isOpzioneNoteInterne() {
		return opzioneNoteInterne;
	}

	public void setOpzioneNoteInterne(boolean opzioneNoteInterne) {
		this.opzioneNoteInterne = opzioneNoteInterne;
	}
	
	
}
