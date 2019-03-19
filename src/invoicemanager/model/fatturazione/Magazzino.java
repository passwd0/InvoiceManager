package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Magazzino{
	private String codiceMagazzino; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private boolean codiceStato; // NULL
	private String codiceTipoMagazzino; //(15) NULL
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public Magazzino(String codiceMagazzino){
		this.codiceMagazzino = codiceMagazzino;
	}

	public Magazzino(String codiceMagazzino, String descrizione, boolean codiceStato, String codiceTipoMagazzino,
			LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.codiceMagazzino = codiceMagazzino;
		this.descrizione = descrizione;
		this.codiceStato = codiceStato;
		this.codiceTipoMagazzino = codiceTipoMagazzino;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceMagazzino() {
		return codiceMagazzino;
	}

	public void setCodiceMagazzino(String codiceMagazzino) {
		this.codiceMagazzino = codiceMagazzino;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isCodiceStato() {
		return codiceStato;
	}

	public void setCodiceStato(boolean codiceStato) {
		this.codiceStato = codiceStato;
	}

	public String getCodiceTipoMagazzino() {
		return codiceTipoMagazzino;
	}

	public void setCodiceTipoMagazzino(String codiceTipoMagazzino) {
		this.codiceTipoMagazzino = codiceTipoMagazzino;
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
