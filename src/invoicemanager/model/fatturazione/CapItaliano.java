package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class CapItaliano{
	private int id; //  NOT NULL
	private String cap; //(5) NULL
	private String comune; //(50) NULL
	private String provincia; //(2) NULL
	private String nazione; //(30) NULL
	private String codiceISTAT; //(20) NULL
	private String codiceCAB; //(20) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public CapItaliano(int id){
		this.id = id;
	}

	public CapItaliano(int id, String cap, String comune, String provincia, String nazione, String codiceISTAT,
			String codiceCAB, LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.id = id;
		this.cap = cap;
		this.comune = comune;
		this.provincia = provincia;
		this.nazione = nazione;
		this.codiceISTAT = codiceISTAT;
		this.codiceCAB = codiceCAB;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public String getCodiceISTAT() {
		return codiceISTAT;
	}

	public void setCodiceISTAT(String codiceISTAT) {
		this.codiceISTAT = codiceISTAT;
	}

	public String getCodiceCAB() {
		return codiceCAB;
	}

	public void setCodiceCAB(String codiceCAB) {
		this.codiceCAB = codiceCAB;
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
