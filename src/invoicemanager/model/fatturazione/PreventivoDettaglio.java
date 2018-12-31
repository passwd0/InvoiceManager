package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class PreventivoDettaglio{
	private int numeroPreventivo; //  NOT NULL
	private short numeroRigaPreventivo; //  NOT NULL
	private LocalDateTime dataPreventivo; //  NOT NULL
	private String codiceTipoRigaDocumento; //(4) NULL
	private String codiceArticolo; //(30) NULL
	private float quantitaArticolo; //  NULL
	private float quantitaConsegnata; //  NULL
	private float quantitaDaConsegnare; //  NULL
	private String descrizione; //(200) NULL
	private String descrizioneAggiuntiva; //(8000) NULL
	private LocalDateTime dataConsegna; //  NULL
	private String codiceUnitaMisura; //(4) NULL
	private float prezzo; // (19, 5) NULL
	private String codiceIVA; //(4) NULL
	private String codiceControparte; //(4) NULL
	private float percentualeProvvigione; //  NULL
	private float percentualeScontoCliente; //  NULL
	private float percentualeScontoArticolo; //  NULL
	private float percentualeScontoPagamento; //  NULL
	private String codiceMagazzino; //(4) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public PreventivoDettaglio(int numeroPreventivo, short numeroRigaPreventivo, LocalDateTime dataPreventivo){
		this.numeroPreventivo = numeroPreventivo;
		this.numeroRigaPreventivo = numeroRigaPreventivo;
		this.dataPreventivo = dataPreventivo;
	}

	public PreventivoDettaglio(int numeroPreventivo, short numeroRigaPreventivo, LocalDateTime dataPreventivo,
			String codiceTipoRigaDocumento, String codiceArticolo, float quantitaArticolo, float quantitaConsegnata,
			float quantitaDaConsegnare, String descrizione, String descrizioneAggiuntiva, LocalDateTime dataConsegna,
			String codiceUnitaMisura, float prezzo, String codiceIVA, String codiceControparte,
			float percentualeProvvigione, float percentualeScontoCliente, float percentualeScontoArticolo,
			float percentualeScontoPagamento, String codiceMagazzino, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica, String loginInserimento) {
		this.numeroPreventivo = numeroPreventivo;
		this.numeroRigaPreventivo = numeroRigaPreventivo;
		this.dataPreventivo = dataPreventivo;
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
		this.codiceArticolo = codiceArticolo;
		this.quantitaArticolo = quantitaArticolo;
		this.quantitaConsegnata = quantitaConsegnata;
		this.quantitaDaConsegnare = quantitaDaConsegnare;
		this.descrizione = descrizione;
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
		this.dataConsegna = dataConsegna;
		this.codiceUnitaMisura = codiceUnitaMisura;
		this.prezzo = prezzo;
		this.codiceIVA = codiceIVA;
		this.codiceControparte = codiceControparte;
		this.percentualeProvvigione = percentualeProvvigione;
		this.percentualeScontoCliente = percentualeScontoCliente;
		this.percentualeScontoArticolo = percentualeScontoArticolo;
		this.percentualeScontoPagamento = percentualeScontoPagamento;
		this.codiceMagazzino = codiceMagazzino;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.loginInserimento = loginInserimento;
	}

	public int getNumeroPreventivo() {
		return numeroPreventivo;
	}

	public void setNumeroPreventivo(int numeroPreventivo) {
		this.numeroPreventivo = numeroPreventivo;
	}

	public short getNumeroRigaPreventivo() {
		return numeroRigaPreventivo;
	}

	public void setNumeroRigaPreventivo(short numeroRigaPreventivo) {
		this.numeroRigaPreventivo = numeroRigaPreventivo;
	}

	public LocalDateTime getDataPreventivo() {
		return dataPreventivo;
	}

	public void setDataPreventivo(LocalDateTime dataPreventivo) {
		this.dataPreventivo = dataPreventivo;
	}

	public String getCodiceTipoRigaDocumento() {
		return codiceTipoRigaDocumento;
	}

	public void setCodiceTipoRigaDocumento(String codiceTipoRigaDocumento) {
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public float getQuantitaArticolo() {
		return quantitaArticolo;
	}

	public void setQuantitaArticolo(float quantitaArticolo) {
		this.quantitaArticolo = quantitaArticolo;
	}

	public float getQuantitaConsegnata() {
		return quantitaConsegnata;
	}

	public void setQuantitaConsegnata(float quantitaConsegnata) {
		this.quantitaConsegnata = quantitaConsegnata;
	}

	public float getQuantitaDaConsegnare() {
		return quantitaDaConsegnare;
	}

	public void setQuantitaDaConsegnare(float quantitaDaConsegnare) {
		this.quantitaDaConsegnare = quantitaDaConsegnare;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDescrizioneAggiuntiva() {
		return descrizioneAggiuntiva;
	}

	public void setDescrizioneAggiuntiva(String descrizioneAggiuntiva) {
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
	}

	public LocalDateTime getDataConsegna() {
		return dataConsegna;
	}

	public void setDataConsegna(LocalDateTime dataConsegna) {
		this.dataConsegna = dataConsegna;
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

	public String getCodiceIVA() {
		return codiceIVA;
	}

	public void setCodiceIVA(String codiceIVA) {
		this.codiceIVA = codiceIVA;
	}

	public String getCodiceControparte() {
		return codiceControparte;
	}

	public void setCodiceControparte(String codiceControparte) {
		this.codiceControparte = codiceControparte;
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

	public String getCodiceMagazzino() {
		return codiceMagazzino;
	}

	public void setCodiceMagazzino(String codiceMagazzino) {
		this.codiceMagazzino = codiceMagazzino;
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

	public String getLoginInserimento() {
		return loginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		this.loginInserimento = loginInserimento;
	}
}
