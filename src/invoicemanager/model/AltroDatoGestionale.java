package invoicemanager.model;

import java.sql.Date;

public class AltroDatoGestionale {
	private int codiceAltroDatoGestionale;
	private String tipoDato; //(10)
	private String riferimentoTesto; //(60)
	private float riferimentoNumero;
	private Date riferimentoData;
	
	public AltroDatoGestionale(int codiceAltroDatoGestionale, String tipoDato, String riferimentoTesto, 
			float riferimentoNumero, Date riferimentoData) {
		this.tipoDato = tipoDato;
		this.riferimentoTesto = riferimentoTesto;
		this.riferimentoNumero = riferimentoNumero;
		this.riferimentoData = riferimentoData;
	}

	public int getCodiceAltroDatoGestionale() {
		return codiceAltroDatoGestionale;
	}

	public void setCodiceAltroDatoGestionale(int codiceAltroDatoGestionale) {
		this.codiceAltroDatoGestionale = codiceAltroDatoGestionale;
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

	public Date getRiferimentoData() {
		return riferimentoData;
	}

	public void setRiferimentoData(Date riferimentoData) {
		this.riferimentoData = riferimentoData;
	}
}
