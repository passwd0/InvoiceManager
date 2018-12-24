package invoicemanager.model.fatturazione;

import java.time.LocalDateTime;
import java.util.List;

public class FatturaPiede {
	private int numeroFattura;
	private LocalDateTime dataFattura;
	private float costoMerce;
	private float nettoMerce;
	private float speseTrasporto;
	private float speseImballo;
	private float speseIncasso;
	private float speseBolli;
	private float omaggi;
	private LocalDateTime dataInserimento;
	private LocalDateTime dataUltimaModifica;
	private LocalDateTime listaDataScadenza;
	private Float listaImportoScadenza;
	private List<Iva> listaIva;
	private List<Float> listaImportoImponibileIva;
	private List<Float> listaImportoIva;
	private float totaleFattura;
	private float totalePagato;
	private float totaleRitenuta;
	private float totaleSconti;

	public FatturaPiede(int numeroFattura, LocalDateTime dataFattura) {
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
		return speseImballo;
	}
	public void setSpeseInballo(float speseInballo) {
		this.speseImballo = speseInballo;
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
	public LocalDateTime getListaDataScadenza() {
		return listaDataScadenza;
	}
	public void setListaDataScadenza(LocalDateTime listaDataScadenza) {
		this.listaDataScadenza = listaDataScadenza;
	}
	public Float getListaImportoScadenza() {
		return listaImportoScadenza;
	}
	public void setListaImportoScadenza(Float listaImportoScadenza) {
		this.listaImportoScadenza = listaImportoScadenza;
	}

	public float getSpeseImballo() {
		return speseImballo;
	}

	public void setSpeseImballo(float speseImballo) {
		this.speseImballo = speseImballo;
	}

	public List<Iva> getListaIva() {
		return listaIva;
	}

	public void setListaIva(List<Iva> listaIva) {
		this.listaIva = listaIva;
	}

	public List<Float> getListaImportoImponibileIva() {
		return listaImportoImponibileIva;
	}

	public void setListaImportoImponibileIva(List<Float> listaImportoImponibileIva) {
		this.listaImportoImponibileIva = listaImportoImponibileIva;
	}

	public List<Float> getListaImportoIva() {
		return listaImportoIva;
	}

	public void setListaImportoIva(List<Float> listaImportoIva) {
		this.listaImportoIva = listaImportoIva;
	}

	public float getTotaleRitenuta() {
		return totaleRitenuta;
	}

	public void setTotaleRitenuta(float totaleRitenuta) {
		this.totaleRitenuta = totaleRitenuta;
	}

	public float getTotaleSconti() {
		return totaleSconti;
	}

	public void setTotaleSconti(float totaleSconti) {
		this.totaleSconti = totaleSconti;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFattura == null) ? 0 : dataFattura.hashCode());
		result = prime * result + numeroFattura;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FatturaPiede other = (FatturaPiede) obj;
		if (dataFattura == null) {
			if (other.dataFattura != null)
				return false;
		} else {
		    int y1 = dataFattura.getYear();
		    int y2 = other.dataFattura.getYear();
			if (y1 != y2)
				return false;
		}
		if (numeroFattura != other.numeroFattura)
			return false;
		return true;
	}

	
}
