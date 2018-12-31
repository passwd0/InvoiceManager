package invoicemanager.model.fatturazione;

import java.time.LocalDate;

public class AltriDatiGestionali {
	private String tipoDato; //(10)
	private String riferimentoTesto; //(60)
	private float riferimentoNumero;
	private LocalDate riferimentoData;
	
	public AltriDatiGestionali(String tipoDato, String riferimentoTesto, float riferimentoNumero,
			LocalDate riferimentoData) {
		this.tipoDato = tipoDato;
		this.riferimentoTesto = riferimentoTesto;
		this.riferimentoNumero = riferimentoNumero;
		this.riferimentoData = riferimentoData;
	}

	public String getTipoDato() {
		return tipoDato;
	}

	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}

	public String getRiferimentoTesto() {
		return riferimentoTesto;
	}

	public void setRiferimentoTesto(String riferimentoTesto) {
		this.riferimentoTesto = riferimentoTesto;
	}

	public float getRiferimentoNumero() {
		return riferimentoNumero;
	}

	public void setRiferimentoNumero(float riferimentoNumero) {
		this.riferimentoNumero = riferimentoNumero;
	}

	public LocalDate getRiferimentoData() {
		return riferimentoData;
	}

	public void setRiferimentoData(LocalDate riferimentoData) {
		this.riferimentoData = riferimentoData;
	}
	
	
}
