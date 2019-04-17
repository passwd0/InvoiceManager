package invoicemanager.model;
import java.time.LocalDateTime;

public class Contatto {
	private int id;
	private String codiceConto; //(30) COLLATE Latin1_General_CI_AS NOT NULL,	x
	private TipoDettaglio tipoDettaglio; //(2) COLLATE Latin1_General_CI_AS NOT NULL,	x
	private String dettaglio; //(50) COLLATE Latin1_General_CI_AS NULL,			x
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL,
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL,

	public Contatto(String codiceConto, TipoDettaglio tipoDettaglio, String dettaglio){
		this.codiceConto = codiceConto;
		this.tipoDettaglio = tipoDettaglio;
		this.dettaglio = dettaglio;
	}

	public Contatto(int id, String codiceConto, TipoDettaglio tipoDettaglio, String dettaglio,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.id = id;
		this.codiceConto = codiceConto;
		this.tipoDettaglio = tipoDettaglio;
		this.dettaglio = dettaglio;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDettaglio() {
		return dettaglio;
	}

	public void setDettaglio(String dettaglio) {
		this.dettaglio = dettaglio;
	}

	public String getCodiceConto() {
		return codiceConto;
	}

	public void setCodiceConto(String codiceConto) {
		this.codiceConto = codiceConto;
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
