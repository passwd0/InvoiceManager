package invoicemanager.model.fatturazione;

public class Allegato { //List
	private String nomeAllegato; // (60),
	private String pathAllegato; // (60),

	public Allegato(String nomeAllegato, String pathAllegato) {
		this.nomeAllegato = nomeAllegato;
		this.pathAllegato = pathAllegato;
	}

	public String getNomeAllegato() {
		return nomeAllegato;
	}

	public void setNomeAllegato(String nomeAllegato) {
		this.nomeAllegato = nomeAllegato;
	}

	public String getPathAllegato() {
		return pathAllegato;
	}

	public void setPathAllegato(String pathAllegato) {
		this.pathAllegato = pathAllegato;
	}
	
	
}
