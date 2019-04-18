package invoicemanager.model;

import java.sql.Date;

public class ScadenzaPagamenti {
	private int numeroFattura;
	private Date dataFattura;
	private Date dataScadenza;
	private float importoScadenza;
	
	public ScadenzaPagamenti(int numeroFattura, Date dataFattura, Date dataScadenza, float importoScadenza) {
		this.numeroFattura = numeroFattura;
		this.dataFattura = dataFattura;
		this.dataScadenza = dataScadenza;
		this.importoScadenza = importoScadenza;
	}

	public int getNumeroFattura() {
		return numeroFattura;
	}

	public void setNumeroFattura(int numeroFattura) {
		this.numeroFattura = numeroFattura;
	}

	public Date getDataFattura() {
		return dataFattura;
	}

	public void setDataFattura(Date dataFattura) {
		this.dataFattura = dataFattura;
	}

	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public float getImportoScadenza() {
		return importoScadenza;
	}

	public void setImportoScadenza(float importoScadenza) {
		this.importoScadenza = importoScadenza;
	}
}
