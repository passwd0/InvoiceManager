package invoicemanager.model.fatturazione;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

public class FatturaDettaglio {
	private int numeroFattura;
	private LocalDate dataFattura;
	private int numeroRigaFattura;
	private String codiceTipoRigaDocumento;
	private String codiceArticolo;
	private float costo;
	private int numeroOrdine;
	private int numeroRigaOrdine;
	private LocalDate dataOrdine;
	private float quantitaDaConsegnare;
	private boolean indicatoreEvasione;
	private String descrizione;
	private float quantita;
	private float prezzo;			//Math decimal(19,5)
	private String codiceIva;
	private String codiceContropartitaContabile;
	private float percentualeProvvigione;
	private float percentualeScontoCliente;
	private float percentualeScontoArticolo;
	private float percentualeScontoPagamento;
	private String codiceUnitaMisura;
	private String serialNumber;
	private boolean indicatoreNoConferma;
	private String codiceMagazzino;
	private int numeroDdt;
	private LocalDateTime dataDdt;
	private int numeroRigaDdt;
	private String codicePercipiente;
	private String codiceCassaPrevidenziale;
	private String codiceCdc;
	private String contoRicavoUsato;
	private String ricavoUsato;
	private List<Ordine> ordini;
	private List<Contratto> contratti;
	private List<Convenzione> convenzioni;
	private List<Ricezione> ricezioni;
	private List<FatturaCollegata> fattureCollegate;
	private List<AltroDatoGestionale> altriDatiGestionali;
	private LocalDateTime dataInserimento = LocalDateTime.now();
	private LocalDateTime dataUltimaModifica = LocalDateTime.now();

	public FatturaDettaglio(int numeroFattura, LocalDate dataFattura, int numeroRigaFattura) {
		super();
		this.numeroFattura = numeroFattura;
		this.dataFattura = dataFattura;
		this.numeroRigaFattura = numeroRigaFattura;
	}

	public FatturaDettaglio(int numeroFattura, LocalDate dataFattura, int numeroRigaFattura,
			String codiceTipoRigaDocumento, String codiceArticolo, float costo, int numeroOrdine, int numeroRigaOrdine,
			LocalDate dataOrdine, float quantitaDaConsegnare, boolean indicatoreEvasione, String descrizione,
			float quantita, float prezzo, String codiceIva, String codiceContropartitaContabile,
			float percentualeProvvigione, float percentualeScontoCliente, float percentualeScontoArticolo,
			float percentualeScontoPagamento, String codiceUnitaMisura, String serialNumber,
			boolean indicatoreNoConferma, String codiceMagazzino, int numeroDdt, LocalDateTime dataDdt,
			int numeroRigaDdt, String codicePercipiente, String codiceCassaPrevidenziale, String codiceCdc,
			String contoRicavoUsato, String ricavoUsato, List<Ordine> ordini, List<Contratto> contratti,
			List<Convenzione> convenzioni, List<Ricezione> ricezioni, List<FatturaCollegata> fattureCollegate,
			List<AltroDatoGestionale> altriDatiGestionali, LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.numeroFattura = numeroFattura;
		this.dataFattura = dataFattura;
		this.numeroRigaFattura = numeroRigaFattura;
		this.codiceTipoRigaDocumento = codiceTipoRigaDocumento;
		this.codiceArticolo = codiceArticolo;
		this.costo = costo;
		this.numeroOrdine = numeroOrdine;
		this.numeroRigaOrdine = numeroRigaOrdine;
		this.dataOrdine = dataOrdine;
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
		this.codiceUnitaMisura = codiceUnitaMisura;
		this.serialNumber = serialNumber;
		this.indicatoreNoConferma = indicatoreNoConferma;
		this.codiceMagazzino = codiceMagazzino;
		this.numeroDdt = numeroDdt;
		this.dataDdt = dataDdt;
		this.numeroRigaDdt = numeroRigaDdt;
		this.codicePercipiente = codicePercipiente;
		this.codiceCassaPrevidenziale = codiceCassaPrevidenziale;
		this.codiceCdc = codiceCdc;
		this.contoRicavoUsato = contoRicavoUsato;
		this.ricavoUsato = ricavoUsato;
		this.ordini = ordini;
		this.contratti = contratti;
		this.convenzioni = convenzioni;
		this.ricezioni = ricezioni;
		this.fattureCollegate = fattureCollegate;
		this.altriDatiGestionali = altriDatiGestionali;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public int getNumeroFattura() {
		return numeroFattura;
	}

	public void setNumeroFattura(int numeroFattura) {
		this.numeroFattura = numeroFattura;
	}

	public LocalDate getDataFattura() {
		return dataFattura;
	}

	public void setDataFattura(LocalDate dataFattura) {
		this.dataFattura = dataFattura;
	}

	public int getNumeroRigaFattura() {
		return numeroRigaFattura;
	}

	public void setNumeroRigaFattura(int numeroRigaFattura) {
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
		NumberFormat formatter = NumberFormat.getInstance(Locale.ITALY);
		formatter.setMaximumFractionDigits(5);
		formatter.setRoundingMode(RoundingMode.HALF_UP); 
		Float formatedPrezzo = Float.valueOf(formatter.format(prezzo));
		return formatedPrezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public List<AltroDatoGestionale> getAltriDatiGestioni() {
		return altriDatiGestionali;
	}

	public void setAltriDatiGestioni(List<AltroDatoGestionale> altriDatiGestioni) {
		this.altriDatiGestionali = altriDatiGestioni;
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

	public int getNumeroRigaDdt() {
		return numeroRigaDdt;
	}

	public void setNumeroRigaDdt(int numeroRigaDdt) {
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
	
	public int getCodiceOrdine() {
		if (ordini == null || ordini.isEmpty())
			return -1;
		return ordini.get(0).getNumeroOrdine();
	}
	
	public int getCodiceContratto() {
		if (contratti == null || contratti.isEmpty())
			return -1;
		return contratti.get(0).getNumeroContratto();
	}
	
	public int getCodiceConvezione() {
		if (convenzioni == null || convenzioni.isEmpty())
			return -1;
		return convenzioni.get(0).getNumeroConvenzione();
	}
	
	public int getCodiceRicezione() {
		if (ricezioni == null || ricezioni.isEmpty())
			return -1;
		return ricezioni.get(0).getNumeroRicezione();
	}
	
	public int getCodiceFatturaCollegata() {
		if (fattureCollegate == null || fattureCollegate.isEmpty())
			return -1;
		return fattureCollegate.get(0).getNumeroFtCollegate();
	}
	
	public int getCodiceAltriDatiGestionali() {
		if (altriDatiGestionali == null || altriDatiGestionali.isEmpty())
			return -1;
		return altriDatiGestionali.get(0).getCodiceAltroDatoGestionale();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFattura == null) ? 0 : dataFattura.hashCode());
		result = prime * result + numeroFattura;
		result = prime * result + numeroRigaFattura;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FatturaDettaglio other = (FatturaDettaglio) obj;
		if (dataFattura == null) {
			if (other.dataFattura != null)
				return false;
		} else if (!(dataFattura.getYear()==other.dataFattura.getYear()))
			return false;
		if (numeroFattura != other.numeroFattura)
			return false;
		if (numeroRigaFattura != other.numeroRigaFattura)
			return false;
		return true;
	}
}
