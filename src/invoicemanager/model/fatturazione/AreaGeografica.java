package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class AreaGeografica{
	private int codiceArea; //  NOT NULL
	private String nazione; //(50) NULL
	private String area; //(50) NULL
	private String regione; //(50) NULL
	private String provincia; //(2) NOT NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica;

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
	
	
}
