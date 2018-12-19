package invoicemanager.model.fatturazione;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

public class Dettaglio {
	private int numeroFattura;
	private LocalDateTime dataFattura;
	private short numeroRigaFattura;
	private String codiceTipoRigaDocumento;
	private String codiceArticolo;
	private float costo;
	private int numeroOrdine;
	private short numeroRigaOrdine;
	private LocalDateTime dataOrdine;
	private float quantitaDaConsegnare;
	private boolean indicatoreEvasione;
	private List<String> descrizione;
	private float quantita;
	private float prezzo;			//Math decimal(19,5)
	private String codiceIva;
	private String codiceContropartitaContabile;
	private float percentualeProvvigione;
	private float percentualeScontoCliente;
	private float percentualeScontoArticolo;
	private float percentualeScontoPagamento;
	//private String descrizioneAggiuntiva;
	private String codiceUnitaMisura;
	private String serialNumber;
	private boolean indicatoreNoConferma;
	private String codiceMagazzino;
	private int numeroDdt;
	private LocalDateTime dataDdt;
	private short numeroRigaDdt;
	private String codicePercipiente;
	private String codiceCassaPrevidenziale;
	private String codiceCdc;
	private String contoRicavoUsato;
	private String ricavoUsato;
	private LocalDateTime dataInserimento;
	private LocalDateTime dataUltimaModifica;
	
	public Dettaglio(int numeroFattura, LocalDateTime dataFattura, short numeroRigaFattura) {
		this.numeroFattura = numeroFattura;
		this.dataFattura = dataFattura;
		this.numeroRigaFattura = numeroRigaFattura;
	}

	public int getNumeroFattura() {
		return numeroFattura;
	}

	public void setNumeroFattura(int numeroFattura) {
		this.numeroFattura = numeroFattura;
	}

	public LocalDateTime getDataFattura() {
		return dataFattura;
	}

	public void setDataFattura(LocalDateTime dataFattura) {
		this.dataFattura = dataFattura;
	}

	public short getNumeroRigaFattura() {
		return numeroRigaFattura;
	}

	public void setNumeroRigaFattura(short numeroRigaFattura) {
		this.numeroRigaFattura = numeroRigaFattura;
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

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public short getNumeroRigaOrdine() {
		return numeroRigaOrdine;
	}

	public void setNumeroRigaOrdine(short numeroRigaOrdine) {
		this.numeroRigaOrdine = numeroRigaOrdine;
	}

	public LocalDateTime getDataOrdine() {
		return dataOrdine;
	}

	public void setDataOrdine(LocalDateTime dataOrdine) {
		this.dataOrdine = dataOrdine;
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

	public List<String> getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(List<String> descrizione) {
		this.descrizione = descrizione;
	}

	public float getQuantita() {
		return quantita;
	}

	public void setQuantita(float quantita) {
		this.quantita = quantita;
	}

	public float getPrezzo() {
		NumberFormat formatter = NumberFormat.getInstance(Locale.ITALY);
		formatter.setMaximumFractionDigits(5);
		formatter.setRoundingMode(RoundingMode.HALF_UP); 
		Float formatedPrezzo = Float.valueOf(formatter.format(prezzo));
		return formatedPrezzo;
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

	public int getNumeroDdt() {
		return numeroDdt;
	}

	public void setNumeroDdt(int numeroDdt) {
		this.numeroDdt = numeroDdt;
	}

	public LocalDateTime getDataDdt() {
		return dataDdt;
	}

	public void setDataDdt(LocalDateTime dataDdt) {
		this.dataDdt = dataDdt;
	}

	public short getNumeroRigaDdt() {
		return numeroRigaDdt;
	}

	public void setNumeroRigaDdt(short numeroRigaDdt) {
		this.numeroRigaDdt = numeroRigaDdt;
	}

	public String getCodicePercipiente() {
		return codicePercipiente;
	}

	public void setCodicePercipiente(String codicePercipiente) {
		this.codicePercipiente = codicePercipiente;
	}

	public String getCodiceCassaPrevidenziale() {
		return codiceCassaPrevidenziale;
	}

	public void setCodiceCassaPrevidenziale(String codiceCassaPrevidenziale) {
		this.codiceCassaPrevidenziale = codiceCassaPrevidenziale;
	}

	public String getCodiceCdc() {
		return codiceCdc;
	}

	public void setCodiceCdc(String codiceCdc) {
		this.codiceCdc = codiceCdc;
	}

	public String getContoRicavoUsato() {
		return contoRicavoUsato;
	}

	public void setContoRicavoUsato(String contoRicavoUsato) {
		this.contoRicavoUsato = contoRicavoUsato;
	}

	public String getRicavoUsato() {
		return ricavoUsato;
	}

	public void setRicavoUsato(String ricavoUsato) {
		this.ricavoUsato = ricavoUsato;
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
