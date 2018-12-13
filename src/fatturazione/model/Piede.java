package fatturazione.model;

import java.time.LocalDateTime;
import java.util.List;

public class Piede {
	private int numeroFattura;
	private LocalDateTime dataFattura;
	private float costoMerce;
	private float nettoMerce;
	private float speseTrasporto;
	private float speseInballo;
	private float speseIncasso;
	private float speseBolli;
	private float omaggi;
	private float totaleFattura;
	private float totalePagato;
	private LocalDateTime dataInserimento; 
	private LocalDateTime dataUltimaModifica;
	private List<LocalDateTime> listaDataScadenza;
	private List<Float> listaImportoScadenza;
	
	public Piede(int numeroFattura, LocalDateTime dataFattura) {
		this.numeroFattura = numeroFattura;
		this.dataFattura = dataFattura;
	}
	public int getNumeroFattura() {
		return numeroFattura;
	}
	public void setNumeroFattura(int numeroFattura) {
		this.numeroFattura = numeroFattura;
	}
	public LocalDateTime getDataFattura() {
		return dataFattura;
	}
	public void setDataFattura(LocalDateTime dataFattura) {
		this.dataFattura = dataFattura;
	}
	public float getCostoMerce() {
		return costoMerce;
	}
	public void setCostoMerce(float costoMerce) {
		this.costoMerce = costoMerce;
	}
	public float getNettoMerce() {
		return nettoMerce;
	}
	public void setNettoMerce(float nettoMerce) {
		this.nettoMerce = nettoMerce;
	}
	public float getSpeseTrasporto() {
		return speseTrasporto;
	}
	public void setSpeseTrasporto(float speseTrasporto) {
		this.speseTrasporto = speseTrasporto;
	}
	public float getSpeseInballo() {
		return speseInballo;
	}
	public void setSpeseInballo(float speseInballo) {
		this.speseInballo = speseInballo;
	}
	public float getSpeseIncasso() {
		return speseIncasso;
	}
	public void setSpeseIncasso(float speseIncasso) {
		this.speseIncasso = speseIncasso;
	}
	public float getSpeseBolli() {
		return speseBolli;
	}
	public void setSpeseBolli(float speseBolli) {
		this.speseBolli = speseBolli;
	}
	public float getOmaggi() {
		return omaggi;
	}
	public void setOmaggi(float omaggi) {
		this.omaggi = omaggi;
	}
	public float getTotaleFattura() {
		return totaleFattura;
	}
	public void setTotaleFattura(float totaleFattura) {
		this.totaleFattura = totaleFattura;
	}
	public float getTotalePagato() {
		return totalePagato;
	}
	public void setTotalePagato(float totalePagato) {
		this.totalePagato = totalePagato;
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
	public List<LocalDateTime> getListaDataScadenza() {
		return listaDataScadenza;
	}
	public void setListaDataScadenza(List<LocalDateTime> listaDataScadenza) {
		this.listaDataScadenza = listaDataScadenza;
	}
	public List<Float> getListaImportoScadenza() {
		return listaImportoScadenza;
	}
	public void setListaImportoScadenza(List<Float> listaImportoScadenza) {
		this.listaImportoScadenza = listaImportoScadenza;
	}
	
	
}