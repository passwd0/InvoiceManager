package invoicemanager.model.fatturazione;

public class StabileOrganizzazione {
	private String soIndirizzo; // (60)
	private String soNumeroCivico;	// (8)
	private String soCap; // (5)
	private String soComune; // (60)
	private String soProvincia; // (2)
	private String soNazione; // (2)
	
	public StabileOrganizzazione(String soIndirizzo, String soNumeroCivico, String soCap, String soComune,
			String soProvincia, String soNazione) {
		this.soIndirizzo = soIndirizzo;
		this.soNumeroCivico = soNumeroCivico;
		this.soCap = soCap;
		this.soComune = soComune;
		this.soProvincia = soProvincia;
		this.soNazione = soNazione;
	}

	public String getSoIndirizzo() {
		return soIndirizzo;
	}

	public void setSoIndirizzo(String soIndirizzo) {
		this.soIndirizzo = soIndirizzo;
	}

	public String getSoNumeroCivico() {
		return soNumeroCivico;
	}

	public void setSoNumeroCivico(String soNumeroCivico) {
		this.soNumeroCivico = soNumeroCivico;
	}

	public String getSoCap() {
		return soCap;
	}

	public void setSoCap(String soCap) {
		this.soCap = soCap;
	}

	public String getSoComune() {
		return soComune;
	}

	public void setSoComune(String soComune) {
		this.soComune = soComune;
	}

	public String getSoProvincia() {
		return soProvincia;
	}

	public void setSoProvincia(String soProvincia) {
		this.soProvincia = soProvincia;
	}

	public String getSoNazione() {
		return soNazione;
	}

	public void setSoNazione(String soNazione) {
		this.soNazione = soNazione;
	}
}
