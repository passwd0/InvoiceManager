package invoicemanager.model.fatturazione;

public class RappresentanteFiscale {
	private int codice;
	private String paese;	// (2)
	private String identificativoFiscale; //(28)
	private String denominazione; //(80)
	private String nome; //(60)
	private String cognome; //(60)
	
	public RappresentanteFiscale(int codice, String paese, String identificativoFiscale, String denominazione, String nome,
			String cognome) {
		this.codice = codice;
		this.paese = paese;
		this.identificativoFiscale = identificativoFiscale;
		this.denominazione = denominazione;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	public String getPaese() {
		return paese;
	}

	public void setPaese(String paese) {
		this.paese = paese;
	}

	public String getIdentificativoFiscale() {
		return identificativoFiscale;
	}

	public void setIdentificativoFiscale(String identificativoFiscale) {
		this.identificativoFiscale = identificativoFiscale;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
}
