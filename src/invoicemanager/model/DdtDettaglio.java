package invoicemanager.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DdtDettaglio {
	private int numeroDDT; //												x
	private LocalDateTime dataDDT; //										x
	private int numeroRigaDDT; //NOT NULL									x
	private String codiceTipoRigaDocumento;	//								----
	private String codiceArticolo;	//										x
	private String codiceMagazzino; //										x
	private float costo; //NULL												x
	private int numeroOrdine; //NULL										----
	private int numeroRigaOrdine; //NULL									----
	private LocalDate dataOrdine; //NULL									----
	private float quantitaDaConsegnare; //NULL								x
	private boolean indicatoreEvasione;
	private String descrizione; //											x
	private float quantita; //NULL											x
	private float prezzo; //[Prezzo] [decimal](19, 5) NULL,					x
	private String codiceIVA; //[CodiceIva] [varchar](4) COLLATE Latin1_General_CI_AS NULL,				x
	private String codiceContropartitaContabile; // [varchar](4) COLLATE Latin1_General_CI_AS NULL,
	private float percentualeProvvigione; //NULL							----
	private float percentualeScontoCliente; //NULL							----
	private float percentualeScontoArticolo; //NULL							----
	private float percentualeScontoPagamento; //NULL						----
	private String descrizioneAggiuntiva; // [varchar](2000) COLLATE Latin1_General_CI_AS NULL,
	private String codiceUnitaMisura; //] [varchar](4) COLLATE Latin1_General_CI_AS NULL,			x
	private String serialNumber; //[SerialNumber] [varchar](50) COLLATE Latin1_General_CI_AS NULL,	----
	private boolean indicatorePrelevatoVendita; //] [varchar](1) COLLATE Latin1_General_CI_AS NULL,
	private String pesoLordo; //[PesoLordo] [varchar](50) COLLATE Latin1_General_CI_AS NULL
	private int idDdtTestata; //																	x
	private LocalDateTime DataInserimento; //NULL
	private LocalDateTime DataUltimaModifica; //NULL
	
	public DdtDettaglio(int numeroDDT, LocalDateTime dataDDT, int numeroRigaDDT, String codiceTipoRigaDocumento,
			String codiceArticolo, String codiceMagazzino, float costo, int numeroOrdine, int numeroRigaOrdine,
			LocalDate dataOrdine, float quantitaDaConsegnare, boolean indicatoreEvasione, String descrizione,
			float quantita, float prezzo, String codiceIva, String codiceContropartitaContabile,
			float percentualeProvvigione, float percentualeScontoCliente, float percentualeScontoArticolo,
			float percentualeScontoPagamento, String descrizioneAggiuntiva, String codiceUnitaMisura,
			String serialNumber, boolean indicatorePrelevatoVendita, String pesoLordo, 
			int idDdtTestata, LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.numeroDDT = numeroDDT;
		this.dataDDT = dataDDT;
		this.numeroRigaDDT = numeroRigaDDT;
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
		this.codiceArticolo = codiceArticolo;
		this.codiceMagazzino = codiceMagazzino;
		this.costo = costo;
		this.numeroOrdine = numeroOrdine;
		this.numeroRigaOrdine = numeroRigaOrdine;
		this.dataOrdine = dataOrdine;
		this.quantitaDaConsegnare = quantitaDaConsegnare;
		this.indicatoreEvasione = indicatoreEvasione;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.prezzo = prezzo;
		this.codiceIVA = codiceIva;
		this.codiceContropartitaContabile = codiceContropartitaContabile;
		this.percentualeProvvigione = percentualeProvvigione;
		this.percentualeScontoCliente = percentualeScontoCliente;
		this.percentualeScontoArticolo = percentualeScontoArticolo;
		this.percentualeScontoPagamento = percentualeScontoPagamento;
		this.descrizioneAggiuntiva = descrizioneAggiuntiva;
		this.codiceUnitaMisura = codiceUnitaMisura;
		this.serialNumber = serialNumber;
		DataInserimento = dataInserimento;
		DataUltimaModifica = dataUltimaModifica;
		this.indicatorePrelevatoVendita = indicatorePrelevatoVendita;
		this.pesoLordo = pesoLordo;
		this.idDdtTestata = idDdtTestata;
	}

	public LocalDateTime getDataDDT() {
		return dataDDT;
	}

	public void setDataDDT(LocalDateTime dataDDT) {
		this.dataDDT = dataDDT;
	}

	public int getNumeroDDT() {
		return numeroDDT;
	}

	public void setNumeroDDT(int numeroDDT) {
		this.numeroDDT = numeroDDT;
	}

	public DdtDettaglio(int numeroDDT, int numeroRigaDDT, LocalDateTime dataDDT) {
		this.numeroRigaDDT = numeroRigaDDT;
	}
	
	public int getNumeroRigaDDT() {
		return numeroRigaDDT;
	}
	public void setNumeroRigaDDT(int numeroRigaDDT) {
		this.numeroRigaDDT = numeroRigaDDT;
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
	public String getCodiceMagazzino() {
		return codiceMagazzino;
	}
	public void setCodiceMagazzino(String codiceMagazzino) {
		this.codiceMagazzino = codiceMagazzino;
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
	public int getNumeroRigaOrdine() {
		return numeroRigaOrdine;
	}
	public void setNumeroRigaOrdine(int numeroRigaOrdine) {
		this.numeroRigaOrdine = numeroRigaOrdine;
	}
	public LocalDate getDataOrdine() {
		return dataOrdine;
	}
	public void setDataOrdine(LocalDate dataOrdine) {
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
		return codiceIVA;
	}
	public void setCodiceIva(String codiceIva) {
		this.codiceIVA = codiceIva;
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
	public LocalDateTime getDataInserimento() {
		return DataInserimento;
	}
	public void setDataInserimento(LocalDateTime dataInserimento) {
		DataInserimento = dataInserimento;
	}
	public LocalDateTime getDataUltimaModifica() {
		return DataUltimaModifica;
	}
	public void setDataUltimaModifica(LocalDateTime dataUltimaModifica) {
		DataUltimaModifica = dataUltimaModifica;
	}
	
	public boolean isIndicatorePrelevatoVendita() {
		return indicatorePrelevatoVendita;
	}
	public void setIndicatorePrelevatoVendita(boolean indicatorePrelevatoVendita) {
		this.indicatorePrelevatoVendita = indicatorePrelevatoVendita;
	}
	public String getPesoLordo() {
		return pesoLordo;
	}
	public void setPesoLordo(String pesoLordo) {
		this.pesoLordo = pesoLordo;
	}

	public int getIdDdtTestata() {
		return idDdtTestata;
	}

	public void setIdDdtTestata(int idDdtTestata) {
		this.idDdtTestata = idDdtTestata;
	}
}
