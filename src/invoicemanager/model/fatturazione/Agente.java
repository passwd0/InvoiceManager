package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Agente {
	private String codiceAgente; //(10) NOT NULL
	private String nome; //(50) NULL
	private float percentualeProvvigione; //  NULL
	private boolean tipoProvvigione; // NULL
	private boolean tipoMandato; // NULL
	private String codiceContabile; //(30) NULL
	private Controparte controparte; // (10) COLLATE Latin1_General_CI_AS NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
		
	public Agente(String codiceAgente, String nome, float percentualeProvvigione, boolean tipoProvvigione,
				boolean tipoMandato, String codiceContabile, Controparte controparte,
				LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.codiceAgente = codiceAgente;
		this.nome = nome;
		this.percentualeProvvigione = percentualeProvvigione;
		this.tipoProvvigione = tipoProvvigione;
		this.tipoMandato = tipoMandato;
		this.codiceContabile = codiceContabile;
		this.controparte = controparte;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public Agente(String codiceAgente){
		this.codiceAgente = codiceAgente;
	}

	public String getCodiceAgente() {
		return codiceAgente;
	}

	public void setCodiceAgente(String codiceAgente) {
		this.codiceAgente = codiceAgente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPercentualeProvvigione() {
		return percentualeProvvigione;
	}

	public void setPercentualeProvvigione(float percentualeProvvigione) {
		this.percentualeProvvigione = percentualeProvvigione;
	}

	public boolean isTipoProvvigione() {
		return tipoProvvigione;
	}

	public void setTipoProvvigione(boolean tipoProvvigione) {
		this.tipoProvvigione = tipoProvvigione;
	}

	public boolean isTipoMandato() {
		return tipoMandato;
	}

	public void setTipoMandato(boolean tipoMandato) {
		this.tipoMandato = tipoMandato;
	}

	public String getCodiceContabile() {
		return codiceContabile;
	}

	public void setCodiceContabile(String codiceContabile) {
		this.codiceContabile = codiceContabile;
	}
	
	public String getCodiceControparte() {
		if (controparte == null)
			return null;
		return controparte.getCodiceControparte();
	}

	public Controparte getControparte() {
		return controparte;
	}

	public void setControparte(Controparte controparte) {
		this.controparte = controparte;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceAgente == null) ? 0 : codiceAgente.hashCode());
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
		Agente other = (Agente) obj;
		if (codiceAgente == null) {
			if (other.codiceAgente != null)
				return false;
		} else if (!codiceAgente.equals(other.codiceAgente))
			return false;
		return true;
	}
	
	
}
