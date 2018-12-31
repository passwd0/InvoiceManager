package invoicemanager.model.fatturazione;
import java.time.LocalDate;
import java.util.List;

public class FatturaProformaDettaglio{
	private int numeroFattura; //  NOT NULL,
	private short numeroRigaFattura; //  NOT NULL,
	private LocalDate dataFattura; //  NOT NULL,
	private String codiceTipoRigaDocumento; //(4) COLLATE Latin1_General_CI_AS NULL,
	private String codiceArticolo; //(30) COLLATE Latin1_General_CI_AS NULL,
	private float costo; //  NULL,
	private float quantitaDaConsegnare; //  NULL,
	private boolean indicatoreEvasione; // COLLATE Latin1_General_CI_AS NULL,
	private String descrizione; //(2000) COLLATE Latin1_General_CI_AS NULL,
	private float quantita; //  NULL,
	private float prezzo; // (19, 5) NULL,
	private String codiceIva; //(4) COLLATE Latin1_General_CI_AS NULL,
	private String codiceContropartitaContabile; //(4) COLLATE Latin1_General_CI_AS NULL,
	private float percentualeProvvigione; //  NULL,
	private float percentualeScontoCliente; //  NULL,
	private float percentualeScontoArticolo; //  NULL,
	private float percentualeScontoPagamento; //  NULL,
	private String descrizioneAggiuntiva; //(2000) COLLATE Latin1_General_CI_AS NULL,
	private String codiceUnitaMisura; //(4) COLLATE Latin1_General_CI_AS NULL,
	private String serialNumber; //(20) COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatoreNoConferma; // COLLATE Latin1_General_CI_AS NULL,
	private String codiceMagazzino; //(4) COLLATE Latin1_General_CI_AS NULL,
	private List<Ordine> ordini;
	private List<Contratto> contratti;
	private List<Convenzione> convenzioni;
	private List<Ricezione> ricezioni;
	private List<FatturaCollegata> fattureCollegate;
	private List<AltroDatoGestionale> altriDatiGestionali;

	public FatturaProformaDettaglio(int numeroFattura, short numeroRigaFattura, LocalDate dataFattura){
		this.numeroFattura = numeroFattura;
		this.numeroRigaFattura = numeroRigaFattura;
		this.dataFattura = dataFattura;
	}

	public FatturaProformaDettaglio(int numeroFattura, short numeroRigaFattura, LocalDate dataFattura,
			String codiceTipoRigaDocumento, String codiceArticolo, float costo, float quantitaDaConsegnare,
			boolean indicatoreEvasione, String descrizione, float quantita, float prezzo, String codiceIva,
			String codiceContropartitaContabile, float percentualeProvvigione, float percentualeScontoCliente,
			float percentualeScontoArticolo, float percentualeScontoPagamento, String descrizioneAggiuntiva,
			String codiceUnitaMisura, String serialNumber, boolean indicatoreNoConferma, String codiceMagazzino,
			List<Ordine> ordini, List<Contratto> contratti, List<Convenzione> convenzioni, List<Ricezione> ricezioni,
			List<FatturaCollegata> fattureCollegate, List<AltroDatoGestionale> altriDatiGestionali) {
		this.numeroFattura = numeroFattura;
		this.numeroRigaFattura = numeroRigaFattura;
		this.dataFattura = dataFattura;
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
		this.codiceArticolo = codiceArticolo;
		this.costo = costo;
		this.quantitaDaConsegnare = quantitaDaConsegnare;
		this.indicatoreEvasione = indicatoreEvasione;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.prezzo = prezzo;
		this.codiceIva = codiceIva;
		this.codiceContropartitaContabile = codiceContropartitaContabile;
		this.percentualeProvvigione = percentualeProvvigione;
		this.percentualeScontoCliente = percentualeScontoCliente;
		this.percentualeScontoArticolo = percentualeScontoArticolo;
		this.percentualeScontoPagamento = percentualeScontoPagamento;
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
		this.codiceUnitaMisura = codiceUnitaMisura;
		this.serialNumber = serialNumber;
		this.indicatoreNoConferma = indicatoreNoConferma;
		this.codiceMagazzino = codiceMagazzino;
		this.ordini = ordini;
		this.contratti = contratti;
		this.convenzioni = convenzioni;
		this.ricezioni = ricezioni;
		this.fattureCollegate = fattureCollegate;
		this.altriDatiGestionali = altriDatiGestionali;
	}

	public int getNumeroFattura() {
		return numeroFattura;
	}

	public void setNumeroFattura(int numeroFattura) {
		this.numeroFattura = numeroFattura;
	}

	public short getNumeroRigaFattura() {
		return numeroRigaFattura;
	}

	public void setNumeroRigaFattura(short numeroRigaFattura) {
		this.numeroRigaFattura = numeroRigaFattura;
	}

	public LocalDate getDataFattura() {
		return dataFattura;
	}

	public void setDataFattura(LocalDate dataFattura) {
		this.dataFattura = dataFattura;
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

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public float getQuantitaDaConsegnare() {
		return quantitaDaConsegnare;
	}

	public void setQuantitaDaConsegnare(float quantitaDaConsegnare) {
		this.quantitaDaConsegnare = quantitaDaConsegnare;
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

	public String getCodiceUnitaMisura() {
		return codiceUnitaMisura;
	}

	public void setCodiceUnitaMisura(String codiceUnitaMisura) {
		this.codiceUnitaMisura = codiceUnitaMisura;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public boolean isIndicatoreNoConferma() {
		return indicatoreNoConferma;
	}

	public void setIndicatoreNoConferma(boolean indicatoreNoConferma) {
		this.indicatoreNoConferma = indicatoreNoConferma;
	}

	public String getCodiceMagazzino() {
		return codiceMagazzino;
	}

	public void setCodiceMagazzino(String codiceMagazzino) {
		this.codiceMagazzino = codiceMagazzino;
	}

	public List<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}

	public List<Contratto> getContratti() {
		return contratti;
	}

	public void setContratti(List<Contratto> contratti) {
		this.contratti = contratti;
	}

	public List<Convenzione> getConvenzioni() {
		return convenzioni;
	}

	public void setConvenzioni(List<Convenzione> convenzioni) {
		this.convenzioni = convenzioni;
	}

	public List<Ricezione> getRicezioni() {
		return ricezioni;
	}

	public void setRicezioni(List<Ricezione> ricezioni) {
		this.ricezioni = ricezioni;
	}

	public List<FatturaCollegata> getFattureCollegate() {
		return fattureCollegate;
	}

	public void setFattureCollegate(List<FatturaCollegata> fattureCollegate) {
		this.fattureCollegate = fattureCollegate;
	}

	public List<AltroDatoGestionale> getAltriDatiGestionali() {
		return altriDatiGestionali;
	}

	public void setAltriDatiGestionali(List<AltroDatoGestionale> altriDatiGestionali) {
		this.altriDatiGestionali = altriDatiGestionali;
	}
}
