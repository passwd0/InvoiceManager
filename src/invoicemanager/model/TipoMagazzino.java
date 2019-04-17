package invoicemanager.model;
import java.time.LocalDateTime;

public class TipoMagazzino{
	private boolean codiceTipoMagazzino; // COLLATE Latin1_General_CI_AS NOT NULL,
	private String descrizione; //(50) COLLATE Latin1_General_CI_AS NULL,
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL,
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL,

	public TipoMagazzino(boolean codiceTipoMagazzino){
		this.codiceTipoMagazzino = codiceTipoMagazzino;
	}

	public TipoMagazzino(boolean codiceTipoMagazzino, String descrizione, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.codiceTipoMagazzino = codiceTipoMagazzino;
		this.descrizione = descrizione;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public boolean isCodiceTipoMagazzino() {
		return codiceTipoMagazzino;
	}

	public void setCodiceTipoMagazzino(boolean codiceTipoMagazzino) {
		this.codiceTipoMagazzino = codiceTipoMagazzino;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
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
