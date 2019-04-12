package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Contatto {
	private String codiceConto; //(30) COLLATE Latin1_General_CI_AS NOT NULL,	x
	private int progressivo; //  NOT NULL,										x
	private TipoDettaglio tipoDettaglio; //(2) COLLATE Latin1_General_CI_AS NOT NULL,	x
	private String dettaglio; //(50) COLLATE Latin1_General_CI_AS NULL,			x
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL,
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL,

	public Contatto(String codiceConto, int progressivo, TipoDettaglio tipoDettaglio){
		this.codiceConto = codiceConto;
		this.progressivo = progressivo;
		this.tipoDettaglio = tipoDettaglio;
	}

	public Contatto(String codiceConto, int progressivo, TipoDettaglio tipoDettaglio, String numero,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.codiceConto = codiceConto;
		this.progressivo = progressivo;
		this.tipoDettaglio = tipoDettaglio;
		this.dettaglio = numero;
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

	public TipoDettaglio getTipoDettaglio() {
		return tipoDettaglio;
	}

	public void setTipoDettaglio(TipoDettaglio tipoDettaglio) {
		this.tipoDettaglio = tipoDettaglio;
	}

	public String getNumero() {
		return dettaglio;
	}

	public void setNumero(String numero) {
		this.dettaglio = numero;
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
