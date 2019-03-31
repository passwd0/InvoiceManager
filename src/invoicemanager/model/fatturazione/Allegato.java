package invoicemanager.model.fatturazione;

public class Allegato { //List
	private String nomeAllegato; // (60),
	private String pathAllegato; // (60),
	private int idFatturaTestata;

	public Allegato(String nomeAllegato, String pathAllegato, int idFatturaTestata) {
		this.nomeAllegato = nomeAllegato;
		this.pathAllegato = pathAllegato;
		this.idFatturaTestata = idFatturaTestata;
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

	public int getIdFatturaTestata() {
		return idFatturaTestata;
	}

	public void setIdFatturaTestata(int idFatturaTestata) {
		this.idFatturaTestata = idFatturaTestata;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeAllegato == null) ? 0 : nomeAllegato.hashCode());
		result = prime * result + ((pathAllegato == null) ? 0 : pathAllegato.hashCode());
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
		Allegato other = (Allegato) obj;
		if (nomeAllegato == null) {
			if (other.nomeAllegato != null)
				return false;
		} else if (!nomeAllegato.equals(other.nomeAllegato))
			return false;
		if (pathAllegato == null) {
			if (other.pathAllegato != null)
				return false;
		} else if (!pathAllegato.equals(other.pathAllegato))
			return false;
		return true;
	}
	
	
}
