package invoicemanager.model.fatturazione;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BancaGlobale {
	private String codiceBanca; //(4) COLLATE Latin1_General_CI_AS NOT NULL,
	private String descrizione; //(100) COLLATE Latin1_General_CI_AS NULL,
	private String codiceABI; //(5) COLLATE Latin1_General_CI_AS NULL,
	private String codiceCAB; //(5) COLLATE Latin1_General_CI_AS NULL,
	private String localita; //(50) COLLATE Latin1_General_CI_AS NULL,
	private String provincia; //(20) COLLATE Latin1_General_CI_AS NULL,
	private String numeroContoCorrente; //(40) COLLATE Latin1_General_CI_AS NULL,
	private String codiceCIN; //(6) COLLATE Latin1_General_CI_AS NULL,
	private String codiceCINEur; //(6) COLLATE Latin1_General_CI_AS NULL,
	private String paese; //(6) COLLATE Latin1_General_CI_AS NULL,
	private String iban; //(50) COLLATE Latin1_General_CI_AS NULL,
	private String swift; //(50) COLLATE Latin1_General_CI_AS NULL,
	private String codiceConto; //(30) COLLATE Latin1_General_CI_AS NULL,
	private String indirizzo; //(2000) COLLATE Latin1_General_CI_AS NULL,
	private String cap; //(2000) COLLATE Latin1_General_CI_AS
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL,
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL,



	public BancaGlobale (String codiceBanca, String descrizione, String codiceABI, String codiceCAB){
		this.codiceBanca = codiceBanca;
		this.descrizione = descrizione;
		this.codiceABI = codiceABI;
		this.codiceCAB = codiceCAB;
	}


	public BancaGlobale(String codiceBanca, String descrizione, String codiceABI,
			String codiceCAB, String localita, String provincia, String numeroContoCorrente, String codiceCIN,
			String codiceCINEur, String paese, String iban,
			String swift, String codiceConto, String indirizzo, String cap, LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.codiceBanca = codiceBanca;
		this.descrizione = descrizione;
		this.codiceABI = codiceABI;
		this.codiceCAB = codiceCAB;
		this.localita = localita;
		this.provincia = provincia;
		this.numeroContoCorrente = numeroContoCorrente;
		this.codiceCIN = codiceCIN;
		this.codiceCINEur = codiceCINEur;
		this.paese = paese;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.iban = iban;
		this.swift = swift;
		this.codiceConto = codiceConto;
		this.indirizzo = indirizzo;
		this.cap = cap;
	}


	public String getCodiceBanca() {
		return codiceBanca;
	}


	public void setCodiceBanca(String codiceBanca) {
		this.codiceBanca = codiceBanca;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCodiceABI() {
		return codiceABI;
	}


	public void setCodiceABI(String codiceABI) {
		this.codiceABI = codiceABI;
	}


	public String getCodiceCAB() {
		return codiceCAB;
	}


	public void setCodiceCAB(String codiceCAB) {
		this.codiceCAB = codiceCAB;
	}


	public String getLocalita() {
		return localita;
	}


	public void setLocalita(String localita) {
		this.localita = localita;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getNumeroContoCorrente() {
		return numeroContoCorrente;
	}


	public void setNumeroContoCorrente(String numeroContoCorrente) {
		this.numeroContoCorrente = numeroContoCorrente;
	}


	public String getCodiceCIN() {
		return codiceCIN;
	}


	public void setCodiceCIN(String codiceCIN) {
		this.codiceCIN = codiceCIN;
	}


	public String getCodiceCINEur() {
		return codiceCINEur;
	}


	public void setCodiceCINEur(String codiceCINEur) {
		this.codiceCINEur = codiceCINEur;
	}


	public String getPaese() {
		return paese;
	}


	public void setPaese(String paese) {
		this.paese = paese;
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


	public String getIban() {
		return iban;
	}


	public void setIban(String iban) {
		this.iban = iban;
	}


	public String getSwift() {
		return swift;
	}


	public void setSwift(String swift) {
		this.swift = swift;
	}


	public String getCodiceConto() {
		return codiceConto;
	}


	public void setCodiceConto(String codiceConto) {
		this.codiceConto = codiceConto;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public String getCap() {
		return cap;
	}


	public void setCap(String cap) {
		this.cap = cap;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceBanca == null) ? 0 : codiceBanca.hashCode());
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
		BancaGlobale other = (BancaGlobale) obj;
		if (codiceBanca == null) {
			if (other.codiceBanca != null)
				return false;
		} else if (!codiceBanca.equals(other.codiceBanca))
			return false;
		return true;
	}
	
}
