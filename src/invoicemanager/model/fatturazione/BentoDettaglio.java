package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class BentoDettaglio {
	private String codiceBento; //(50) NOT NULL
	private short numeroRigaBento; //  NOT NULL
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
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public BentoDettaglio(String codiceBento, TipoBento tipoBento, short numeroRigaBento){
		this.codiceBento = codiceBento;
		this.tipoBento = tipoBento;
		this.numeroRigaBento = numeroRigaBento;
	}

	public BentoDettaglio(String codiceBento, short numeroRigaBento, TipoBento tipoBento, String codiceRigaBento,
			String codiceArticolo, String descrizione, float quantita, UnitaMisura unitaMisura, float prezzo,
			Iva iva, Controparte controparte, float percentualeProvvigione, float percentualeScontoCliente,
			float percentualeScontoArticolo, float percentualeScontoPagamento, Magazzino magazzino,
			CausaleMagazzino causale, String descrizioneAggiuntiva, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica, String loginInserimento) {
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

	public TipoBento getCodiceTipoBento() {
		return tipoBento;
	}

	public void setCodiceTipoBento(TipoBento tipoBento) {
		this.tipoBento = tipoBento;
	}
	
	public String getCodiceTipoBento(TipoBento tipoBento) {
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

	public UnitaMisura getCodiceUnitaMisura() {
		return unitaMisura;
	}

	public void setCodiceUnitaMisura(UnitaMisura unitaMisura) {
		this.unitaMisura = unitaMisura;
	}

	public String getCodiceUnitaMisura(UnitaMisura unitaMisura) {
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

	public Iva getCodiceIva() {
		return iva;
	}

	public void setCodiceIva(Iva iva) {
		this.iva = iva;
	}
	
	public String getCodiceIva(Iva iva) {
		if (iva == null)
			return null;
		return iva.getCodiceIva();
	}
	

	public Controparte getCodiceControparte() {
		return controparte;
	}

	public void setCodiceControparte(Controparte controparte) {
		this.controparte = controparte;
	}
	
	public String getCodiceControparte(Controparte controparte) {
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

	public Magazzino getCodiceMagazzino() {
		return magazzino;
	}

	public void setCodiceMagazzino(Magazzino magazzino) {
		this.magazzino = magazzino;
	}

	public String getCodiceMagazzino(Magazzino magazzino) {
		if (magazzino == null)
			return null;
		return magazzino.getCodiceMagazzino();
	}
	
	public CausaleMagazzino getCodiceCausale() {
		return causale;
	}

	public void setCodiceCausale(CausaleMagazzino causale) {
		this.causale = causale;
	}

	public String getCausaleMagazzino(CausaleMagazzino causale) {
		if (causale == null)
			return null;
		return causale.getCausaleMagazzino();
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
