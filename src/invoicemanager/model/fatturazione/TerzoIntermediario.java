package invoicemanager.model.fatturazione;

public class TerzoIntermediario{
	private int codice;
	private String identificaticoFiscale; // (20)
	private String denominazione; // (80)
	private String nome; // (60)
	private String cognome; // (60)
	private String codEORI; // (17)
	
	public TerzoIntermediario(int codice, String identificaticoFiscale, String denominazione, String nome, String cognome,
			String codEORI) {
		this.codice = codice;
		this.identificaticoFiscale = identificaticoFiscale;
		this.denominazione = denominazione;
		this.nome = nome;
		this.cognome = cognome;
		this.codEORI = codEORI;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getIdentificaticoFiscale() {
		return identificaticoFiscale;
	}

	public void setIdentificaticoFiscale(String identificaticoFiscale) {
		this.identificaticoFiscale = identificaticoFiscale;
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

	public String getCodEORI() {
		return codEORI;
	}

	public void setCodEORI(String codEORI) {
		this.codEORI = codEORI;
	}
}
