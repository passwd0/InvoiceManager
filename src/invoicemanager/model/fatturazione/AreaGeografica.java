package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class AreaGeografica{
	private int codiceArea; //  NOT NULL
	private String nazione; //(50) NULL
	private String area; //(50) NULL
	private String regione; //(50) NULL
	private String provincia; //(2) NOT NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now();

	public AreaGeografica(int codiceArea, String provincia){
		this.codiceArea = codiceArea;
		this.provincia = provincia;
	}

	public AreaGeografica(int codiceArea, String nazione, String area, String regione, String provincia,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.codiceArea = codiceArea;
		this.nazione = nazione;
		this.area = area;
		this.regione = regione;
		this.provincia = provincia;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public int getCodiceArea() {
		return codiceArea;
	}

	public void setCodiceArea(int codiceArea) {
		this.codiceArea = codiceArea;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + codiceArea;
		result = prime * result + ((nazione == null) ? 0 : nazione.hashCode());
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
		result = prime * result + ((regione == null) ? 0 : regione.hashCode());
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
		AreaGeografica other = (AreaGeografica) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (codiceArea != other.codiceArea)
			return false;
		if (nazione == null) {
			if (other.nazione != null)
				return false;
		} else if (!nazione.equals(other.nazione))
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		if (regione == null) {
			if (other.regione != null)
				return false;
		} else if (!regione.equals(other.regione))
			return false;
		return true;
	}
	
	
}
