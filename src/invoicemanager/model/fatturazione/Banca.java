package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Banca{
		private String codiceBanca; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private Stato stato; // (1) COLLATE Latin1_General_CI_AS NULL
		private String codiceABI; //(5) NULL
		private String codiceCAB; //(5) NULL
		private String localita; //(50) NULL
		private String provincia; //(20) NULL
		private String numeroContoCorrente; //(40) NULL
		private String codiceCIN; //(6) NULL
		private String codiceCINEur; //(6) NULL
		private String paese; //(6) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL
		private String loginModifica; //(30) NULL
		private String iban; //(50) NULL
		private String swift; //(50) NULL
		private String codiceConto; //(30) NULL
		private String indirizzo; //(2000) NULL
		
	public Banca(String codiceBanca, String descrizione, Stato stato, String codiceABI, String codiceCAB,
				String localita, String provincia, String numeroContoCorrente, String codiceCIN, String codiceCINEur,
				String paese, LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica, String loginInserimento,
				String loginModifica, String iban, String swift, String codiceConto, String indirizzo) {
			this.codiceBanca = codiceBanca;
			this.descrizione = descrizione;
			this.stato = stato;
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
			this.loginInserimento = loginInserimento;
			this.loginModifica = loginModifica;
			this.iban = iban;
			this.swift = swift;
			this.codiceConto = codiceConto;
			this.indirizzo = indirizzo;
		}

	public Banca(String CodiceBanca){
		this.codiceBanca = codiceBanca;
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

	public Stato getstato() {
		return stato;
	}

	public void setstato(Stato stato) {
		this.stato = stato;
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
		Banca other = (Banca) obj;
		if (codiceBanca == null) {
			if (other.codiceBanca != null)
				return false;
		} else if (!codiceBanca.equals(other.codiceBanca))
			return false;
		return true;
	}
}
