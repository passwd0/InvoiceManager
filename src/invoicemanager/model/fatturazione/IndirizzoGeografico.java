package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class IndirizzoGeografico{
	private String codiceIndirizzo; //(50) NOT NULL
	private String codiceConto; //(30) NOT NULL
	private String via; //(100) NULL
	private String provincia; //(3) NULL
	private String cap; //(10) NULL
	private String citta; //(50) NULL
	private String codiceNazione; //(10) NULL
	private String codiceTipoIndirizzo; //(3) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL
	private String loginInserimento; //(30) NULL
	private String loginModifica; //(30) NULL
	private String descrizione; //(100) NULL
	private boolean indicatoreIndirizzoDefault; // NULL
	private String codiceMinistero; //(50) NULL

	public IndirizzoGeografico(String codiceIndirizzo, String codiceConto){
		this.codiceIndirizzo = codiceIndirizzo;
		this.codiceConto = codiceConto;
	}

	public IndirizzoGeografico(String codiceIndirizzo, String codiceConto, String via, String provincia, String cap,
			String citta, String codiceNazione, String codiceTipoIndirizzo, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica, String loginInserimento, String loginModifica, String descrizione,
			boolean indicatoreIndirizzoDefault, String codiceMinistero) {
		this.codiceIndirizzo = codiceIndirizzo;
		this.codiceConto = codiceConto;
		this.via = via;
		this.provincia = provincia;
		this.cap = cap;
		this.citta = citta;
		this.codiceNazione = codiceNazione;
		this.codiceTipoIndirizzo = codiceTipoIndirizzo;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.loginInserimento = loginInserimento;
		this.loginModifica = loginModifica;
		this.descrizione = descrizione;
		this.indicatoreIndirizzoDefault = indicatoreIndirizzoDefault;
		this.codiceMinistero = codiceMinistero;
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

	public String getLoginModifica() {
		return loginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		this.loginModifica = loginModifica;
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
