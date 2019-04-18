package invoicemanager.model;
import java.sql.Timestamp;

public class CodiceABarre{
	private String codiceArticolo; //(30) NOT NULL
	private String codiceABarre; //(50) NOT NULL
	private String tipo; //(50) NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public CodiceABarre(String codiceArticolo, String codiceABarre){
		this.codiceArticolo = codiceArticolo;
		this.codiceABarre = codiceABarre;
	}

	public CodiceABarre(String codiceArticolo, String codiceABarre, String tipo, Timestamp dataInserimento, Timestamp dataUltimaModifica) {
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

	public Timestamp getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(Timestamp dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Timestamp getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(Timestamp dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}
}
