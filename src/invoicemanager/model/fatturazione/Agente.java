package invoicemanager.model.fatturazione;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import invoicemanager.utils.Utils;

public class Agente {
	private String codiceAgente; //(10) NOT NULL
	private String nome; //(50)
	private float percentualeProvvigione;
	private boolean tipoProvvigione;
	private boolean tipoMandato;
	private String codiceContabile; //(30)
	private Controparte controparte; // (10)
	private LocalDateTime dataInserimento;
	private LocalDateTime dataUltimaModifica;
	private String loginInserimento; // (30)
	private String loginModifica; // (30)
	//private Stato stato = Stato.DISPONIBILE;						//AGGIUNTO!
		
	public Agente(String codiceAgente, String nome, float percentualeProvvigione, boolean tipoProvvigione,
				boolean tipoMandato, String codiceContabile, Controparte codiceControparte,
				LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica, String loginInserimento,
				String loginModifica) {
		this.codiceAgente = codiceAgente;
		this.nome = nome;
		this.percentualeProvvigione = percentualeProvvigione;
		this.tipoProvvigione = tipoProvvigione;
		this.tipoMandato = tipoMandato;
		this.codiceContabile = codiceContabile;
		this.controparte = codiceControparte;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.loginInserimento = loginInserimento;
		this.loginModifica = loginModifica;
	}

	public Agente(String codiceAgente){
		this.codiceAgente = codiceAgente;
	}
	
	public String getCodiceControparte() {
		if (controparte != null)
			return controparte.getCodiceControparte();
		return null;
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

	public Controparte getControparte() {
		return controparte;
	}

	public void setControparte(Controparte controparte) {
		this.controparte = controparte;
	}

	public LocalDateTime getDataInserimento() {
		return dataInserimento;
	}
	
	public String getDataInserimentoToString() {
		if (dataInserimento == null)
			return null;
		return Utils.formatterCompleteDB.format(dataInserimento);
	}
	
	public Timestamp getDataInserimentoToTimestamp() {
		if (dataInserimento == null)
			return null;
		return Timestamp.valueOf(dataInserimento);
	}

	public void setDataInserimento(LocalDateTime dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public LocalDateTime getDataUltimaModifica() {
		return dataUltimaModifica;
	}
	
	public String getDataUltimaModificaToString() {
		if (dataUltimaModifica == null)
			return null;
		return Utils.formatterCompleteDB.format(dataUltimaModifica);
	}
	
	public Timestamp getDataUltimaModificaToTimestamp() {
		if (dataUltimaModifica == null)
			return null;
		return Timestamp.valueOf(dataUltimaModifica);
	}

	public void setDataUltimaModifica(LocalDateTime dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getLoginInserimento() {
		return loginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		this.loginInserimento = loginInserimento;
	}

	public String getLoginModifica() {
		return loginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		this.loginModifica = loginModifica;
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
