package invoicemanager.model;
import java.time.LocalDateTime;

public class BentoDettaglio {
	private String codiceBento; //(50) NOT NULL
	private int numeroRigaBento; //  NOT NULL
	private TipoBento tipoBento; //(2) NULL
	private String codiceRigaBento; //(2) NULL
	private String codiceArticolo; //(30) NULL
	private String descrizione; //(2000) NULL
	private float quantita; // (19, 4) NULL
	private UnitaMisura unitaMisura; //(4) NULL
	private float prezzo; // (19, 5) NULL
	private Iva iva; //(4) NULL
	private Controparte controparte; //(4) NULL
	private float percentualeProvvigione; //  NULL
	private float percentualeScontoCliente; //  NULL
	private float percentualeScontoArticolo; //  NULL
	private float percentualeScontoPagamento; //  NULL
	private Magazzino magazzino; //(4) NULL
	private CausaleMagazzino causale; //(4) NULL
	private String descrizioneAggiuntiva; //(200) NULL
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public BentoDettaglio(String codiceBento, TipoBento tipoBento, int numeroRigaBento){
		this.codiceBento = codiceBento;
		this.tipoBento = tipoBento;
		this.numeroRigaBento = numeroRigaBento;
	}

	public BentoDettaglio(String codiceBento, int numeroRigaBento, TipoBento tipoBento, String codiceRigaBento,
			String codiceArticolo, String descrizione, float quantita, UnitaMisura unitaMisura, float prezzo,
			Iva iva, Controparte controparte, float percentualeProvvigione, float percentualeScontoCliente,
			float percentualeScontoArticolo, float percentualeScontoPagamento, Magazzino magazzino,
			CausaleMagazzino causale, String descrizioneAggiuntiva, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.codiceBento = codiceBento;
		this.numeroRigaBento = numeroRigaBento;
		this.tipoBento = tipoBento;
		this.codiceRigaBento = codiceRigaBento;
		this.codiceArticolo = codiceArticolo;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.unitaMisura = unitaMisura;
		this.prezzo = prezzo;
		this.iva = iva;
		this.controparte = controparte;
		this.percentualeProvvigione = percentualeProvvigione;
		this.percentualeScontoCliente = percentualeScontoCliente;
		this.percentualeScontoArticolo = percentualeScontoArticolo;
		this.percentualeScontoPagamento = percentualeScontoPagamento;
		this.magazzino = magazzino;
		this.causale = causale;
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceBento() {
		return codiceBento;
	}

	public void setCodiceBento(String codiceBento) {
		this.codiceBento = codiceBento;
	}

	public int getNumeroRigaBento() {
		return numeroRigaBento;
	}

	public void setNumeroRigaBento(int numeroRigaBento) {
		this.numeroRigaBento = numeroRigaBento;
	}

	public TipoBento getTipoBento() {
		return tipoBento;
	}

	public void setTipoBento(TipoBento tipoBento) {
		this.tipoBento = tipoBento;
	}
	
	public String getCodiceTipoBento() {
		if (tipoBento == null)
			return null;
		return tipoBento.getCodiceTipoBento();
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

	public UnitaMisura getUnitaMisura() {
		return unitaMisura;
	}

	public void setCodiceUnitaMisura(UnitaMisura unitaMisura) {
		this.unitaMisura = unitaMisura;
	}

	public String getCodiceUnitaMisura() {
		if (unitaMisura == null)
			return null;
		return unitaMisura.getCodiceUnitaMisura();
	}
	
	
	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public String getCodiceIva() {
		if (iva == null) return null;
		return iva.getCodiceIva();
	}

	public Iva getIva() {
		return iva;
	}

	public void setIva(Iva iva) {
		this.iva = iva;
	}

	public Controparte getControparte() {
		return controparte;
	}

	public void setControparte(Controparte controparte) {
		this.controparte = controparte;
	}
	
	public String getCodiceControparte() {
		if (controparte == null)
			return null;
		return controparte.getCodiceControparte();
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

	public Magazzino getMagazzino() {
		return magazzino;
	}

	public void setCodiceMagazzino(Magazzino magazzino) {
		this.magazzino = magazzino;
	}

	public String getCodiceMagazzino() {
		if (magazzino == null)
			return null;
		return magazzino.getCodiceMagazzino();
	}
	
	public CausaleMagazzino getCausaleMagazzino() {
		return causale;
	}

	public void setCausale(CausaleMagazzino causale) {
		this.causale = causale;
	}

	public String getCodiceCausaleMagazzino() {
		if (causale == null)
			return null;
		return causale.getCodiceCausaleMagazzino();
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
}
