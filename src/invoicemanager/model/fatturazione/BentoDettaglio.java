package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class BentoDettaglio {
	private String codiceBento; //(50) NOT NULL
	private short numeroRigaBento; //  NOT NULL
	private String codiceTipoBento; //(2) NULL
	private String codiceRigaBento; //(2) NULL
	private String codiceArticolo; //(30) NULL
	private String descrizione; //(2000) NULL
	private float quantita; // (19, 4) NULL
	private String codiceUnitaMisura; //(4) NULL
	private float prezzo; // (19, 5) NULL
	private String codiceIVA; //(4) NULL
	private String codiceControparte; //(4) NULL
	private float percentualeProvvigione; //  NULL
	private float percentualeScontoCliente; //  NULL
	private float percentualeScontoArticolo; //  NULL
	private float percentualeScontoPagamento; //  NULL
	private String codiceMagazzino; //(4) NULL
	private String codiceCausale; //(4) NULL
	private String descrizioneAggiuntiva; //(200) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public BentoDettaglio(String codiceBento, short numeroRigaBento){
		this.codiceBento = codiceBento;
		this.numeroRigaBento = numeroRigaBento;
	}

	public BentoDettaglio(String codiceBento, short numeroRigaBento, String codiceTipoBento, String codiceRigaBento,
			String codiceArticolo, String descrizione, float quantita, String codiceUnitaMisura, float prezzo,
			String codiceIVA, String codiceControparte, float percentualeProvvigione, float percentualeScontoCliente,
			float percentualeScontoArticolo, float percentualeScontoPagamento, String codiceMagazzino,
			String codiceCausale, String descrizioneAggiuntiva, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica, String loginInserimento) {
		this.codiceBento = codiceBento;
		this.numeroRigaBento = numeroRigaBento;
		this.codiceTipoBento = codiceTipoBento;
		this.codiceRigaBento = codiceRigaBento;
		this.codiceArticolo = codiceArticolo;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.codiceUnitaMisura = codiceUnitaMisura;
		this.prezzo = prezzo;
		this.codiceIVA = codiceIVA;
		this.codiceControparte = codiceControparte;
		this.percentualeProvvigione = percentualeProvvigione;
		this.percentualeScontoCliente = percentualeScontoCliente;
		this.percentualeScontoArticolo = percentualeScontoArticolo;
		this.percentualeScontoPagamento = percentualeScontoPagamento;
		this.codiceMagazzino = codiceMagazzino;
		this.codiceCausale = codiceCausale;
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.loginInserimento = loginInserimento;
	}

	public String getCodiceBento() {
		return codiceBento;
	}

	public void setCodiceBento(String codiceBento) {
		this.codiceBento = codiceBento;
	}

	public short getNumeroRigaBento() {
		return numeroRigaBento;
	}

	public void setNumeroRigaBento(short numeroRigaBento) {
		this.numeroRigaBento = numeroRigaBento;
	}

	public String getCodiceTipoBento() {
		return codiceTipoBento;
	}

	public void setCodiceTipoBento(String codiceTipoBento) {
		this.codiceTipoBento = codiceTipoBento;
	}

	public String getCodiceRigaBento() {
		return codiceRigaBento;
	}

	public void setCodiceRigaBento(String codiceRigaBento) {
		this.codiceRigaBento = codiceRigaBento;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
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

	public String getCodiceCausale() {
		return codiceCausale;
	}

	public void setCodiceCausale(String codiceCausale) {
		this.codiceCausale = codiceCausale;
	}

	public String getDescrizioneAggiuntiva() {
		return descrizioneAggiuntiva;
	}

	public void setDescrizioneAggiuntiva(String descrizioneAggiuntiva) {
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
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
