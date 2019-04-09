package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Contatto {
	private String codiceConto; //(30) COLLATE Latin1_General_CI_AS NOT NULL,
	private int progressivo; //  NOT NULL,
	private String tipoContatto; //(2) COLLATE Latin1_General_CI_AS NOT NULL,
	private String numero; //(50) COLLATE Latin1_General_CI_AS NULL,
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL,
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL,

	public Contatto(String codiceConto, int progressivo, String tipoContatto){
		this.codiceConto = codiceConto;
		this.progressivo = progressivo;
		this.tipoContatto = tipoContatto;
	}

	public Contatto(String codiceConto, int progressivo, String tipoContatto, String numero,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.codiceConto = codiceConto;
		this.progressivo = progressivo;
		this.tipoContatto = tipoContatto;
		this.numero = numero;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceConto() {
		return codiceConto;
	}

	public void setCodiceConto(String codiceConto) {
		this.codiceConto = codiceConto;
	}

	public int getProgressivo() {
		return progressivo;
	}

	public void setProgressivo(int progressivo) {
		this.progressivo = progressivo;
	}

	public String getTipoContatto() {
		return tipoContatto;
	}

	public void setTipoContatto(String tipoContatto) {
		this.tipoContatto = tipoContatto;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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
