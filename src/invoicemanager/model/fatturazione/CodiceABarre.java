package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class CodiceABarre{
	private String codiceArticolo; //(30) NOT NULL
	private String codiceABarre; //(50) NOT NULL
	private String tipo; //(50) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL

	public CodiceABarre(String codiceArticolo, String codiceABarre){
		this.codiceArticolo = codiceArticolo;
		this.codiceABarre = codiceABarre;
	}

	public CodiceABarre(String codiceArticolo, String codiceABarre, String tipo, LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.codiceArticolo = codiceArticolo;
		this.codiceABarre = codiceABarre;
		this.tipo = tipo;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public String getCodiceABarre() {
		return codiceABarre;
	}

	public void setCodiceABarre(String codiceABarre) {
		this.codiceABarre = codiceABarre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
