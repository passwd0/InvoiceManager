package invoicemanager.model.fatturazione;

import java.time.LocalDate;

public class ScadenzaPagamenti {
	private int numeroFattura;
	private LocalDate dataFattura;
	private LocalDate dataScadenza;
	private float importoScadenza;
	
	public ScadenzaPagamenti(int numeroFattura, LocalDate dataFattura, LocalDate dataScadenza, float importoScadenza) {
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

	public LocalDate getDataFattura() {
		return dataFattura;
	}

	public void setDataFattura(LocalDate dataFattura) {
		this.dataFattura = dataFattura;
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public float getImportoScadenza() {
		return importoScadenza;
	}

	public void setImportoScadenza(float importoScadenza) {
		this.importoScadenza = importoScadenza;
	}
}
