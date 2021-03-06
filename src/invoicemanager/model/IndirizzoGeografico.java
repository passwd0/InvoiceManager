package invoicemanager.model;
import java.sql.Timestamp;

public class IndirizzoGeografico {
	private String codiceIndirizzo; //(50) NOT NULL		//serial
	private String codiceConto; //(30) NOT NULL			//codiceCliente, codiceFornitore
	private String via; //(100) NULL
	private String provincia; //(3) NULL
	private String cap; //(10) NULL
	private String citta; //(50) NULL
	private String codiceNazione; //(10) NULL
	private String codiceTipoIndirizzo; //(3) NULL
	private String descrizione; //(100) NULL
	private boolean indicatoreIndirizzoDefault = true; // NULL		//cliente
	private String codiceMinistero; //(50) NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL
	

	public IndirizzoGeografico(String codiceIndirizzo, String codiceConto){
		this.codiceIndirizzo = codiceIndirizzo;
		this.codiceConto = codiceConto;
	}

	public IndirizzoGeografico(String codiceIndirizzo, String codiceConto, String via, String provincia, String cap,
			String citta, String codiceNazione, String codiceTipoIndirizzo, String descrizione,
			boolean indicatoreIndirizzoDefault, String codiceMinistero, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
		this.codiceIndirizzo = codiceIndirizzo;
		this.codiceConto = codiceConto;
		this.via = via;
		this.provincia = provincia;
		this.cap = cap;
		this.citta = citta;
		this.codiceNazione = codiceNazione;
		this.codiceTipoIndirizzo = codiceTipoIndirizzo;
		this.descrizione = descrizione;
		this.indicatoreIndirizzoDefault = indicatoreIndirizzoDefault;
		this.codiceMinistero = codiceMinistero;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceIndirizzo() {
		return codiceIndirizzo;
	}

	public void setCodiceIndirizzo(String codiceIndirizzo) {
		this.codiceIndirizzo = codiceIndirizzo;
	}

	public String getCodiceConto() {
		return codiceConto;
	}

	public void setCodiceConto(String codiceConto) {
		this.codiceConto = codiceConto;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getCodiceNazione() {
		return codiceNazione;
	}

	public void setCodiceNazione(String codiceNazione) {
		this.codiceNazione = codiceNazione;
	}

	public String getCodiceTipoIndirizzo() {
		return codiceTipoIndirizzo;
	}

	public void setCodiceTipoIndirizzo(String codiceTipoIndirizzo) {
		this.codiceTipoIndirizzo = codiceTipoIndirizzo;
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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isIndicatoreIndirizzoDefault() {
		return indicatoreIndirizzoDefault;
	}

	public void setIndicatoreIndirizzoDefault(boolean indicatoreIndirizzoDefault) {
		this.indicatoreIndirizzoDefault = indicatoreIndirizzoDefault;
	}

	public String getCodiceMinistero() {
		return codiceMinistero;
	}

	public void setCodiceMinistero(String codiceMinistero) {
		this.codiceMinistero = codiceMinistero;
	}
}
