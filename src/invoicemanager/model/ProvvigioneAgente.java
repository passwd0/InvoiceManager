package invoicemanager.model;
import java.sql.Timestamp;

public class ProvvigioneAgente{
	private String codiceProvvigione; //(50) NULL
	private String codiceAgente; //(10) NULL
	private float scontoLegatoProvvigione; //  NULL
	private float provvigioneLegataSconto; //  NULL
	private int progressivo; //  NULL
	private String codiceGruppoMerceologico; //(4) NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); // 
	
	public ProvvigioneAgente(String codiceProvvigione, String codiceAgente, float scontoLegatoProvvigione,
			float provvigioneLegataSconto, int progressivo, String codiceGruppoMerceologico,
			Timestamp dataInserimento, Timestamp dataUltimaModifica) {
		this.codiceProvvigione = codiceProvvigione;
		this.codiceAgente = codiceAgente;
		this.scontoLegatoProvvigione = scontoLegatoProvvigione;
		this.provvigioneLegataSconto = provvigioneLegataSconto;
		this.progressivo = progressivo;
		this.codiceGruppoMerceologico = codiceGruppoMerceologico;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}
	public String getCodiceProvvigione() {
		return codiceProvvigione;
	}
	public void setCodiceProvvigione(String codiceProvvigione) {
		this.codiceProvvigione = codiceProvvigione;
	}
	public String getCodiceAgente() {
		return codiceAgente;
	}
	public void setCodiceAgente(String codiceAgente) {
		this.codiceAgente = codiceAgente;
	}
	public float getScontoLegatoProvvigione() {
		return scontoLegatoProvvigione;
	}
	public void setScontoLegatoProvvigione(float scontoLegatoProvvigione) {
		this.scontoLegatoProvvigione = scontoLegatoProvvigione;
	}
	public float getProvvigioneLegataSconto() {
		return provvigioneLegataSconto;
	}
	public void setProvvigioneLegataSconto(float provvigioneLegataSconto) {
		this.provvigioneLegataSconto = provvigioneLegataSconto;
	}
	public int getProgressivo() {
		return progressivo;
	}
	public void setProgressivo(int progressivo) {
		this.progressivo = progressivo;
	}
	public String getCodiceGruppoMerceologico() {
		return codiceGruppoMerceologico;
	}
	public void setCodiceGruppoMerceologico(String codiceGruppoMerceologico) {
		this.codiceGruppoMerceologico = codiceGruppoMerceologico;
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
