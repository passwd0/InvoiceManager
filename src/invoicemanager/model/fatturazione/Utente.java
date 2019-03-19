package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Utente{
	private String codiceUtente; //(15) NULL
	private String path; //(50) NULL
	private String pathSalvataggi; //(50) NULL
	private String subUtente; //(15) NULL
	private boolean tipoUtente; // NULL
	private String cognome; //(50) NULL
	private String nome; //(50) NULL
	private LocalDateTime dataNascita; //  NULL
	private boolean sesso; // NULL
	private String comuneNascita; //(50) NULL
	private String provinciaNascita; //(2) NULL
	private String domicilioFiscale; //(50) NULL
	private String comune; //(50) NULL
	private String provincia; //(2) NULL
	private String partitaIVA; //(15) NULL
	private String attivita; //(50) NULL
	private String codicePersonaFisica; //(5) NULL
	private String codiceFiscale; //(16) NULL
	private String ragioneSociale; //(60) NULL
	private String naturaGiuridica; //(5) NULL
	private String domicilioAzienda; //(50) NULL
	private String comuneAzienda; //(50) NULL
	private String provinciaAzienda; //(2) NULL
	private String partitaIVAAzienda; //(15) NULL
	private String attivitaAzienda; //(50) NULL
	private String codiceAzienda; //(5) NULL
	private String codiceFiscaleAzienda; //(16) NULL
	private boolean indicatoreConversione; // NULL
	private String password; //(20) NULL
	private String cap; //(50) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public Utente(String codiceUtente, String path, String pathSalvataggi, String subUtente, boolean tipoUtente,
			String cognome, String nome, LocalDateTime dataNascita, boolean sesso, String comuneNascita,
			String provinciaNascita, String domicilioFiscale, String comune, String provincia, String partitaIVA,
			String attivita, String codicePersonaFisica, String codiceFiscale, String ragioneSociale,
			String naturaGiuridica, String domicilioAzienda, String comuneAzienda, String provinciaAzienda,
			String partitaIVAAzienda, String attivitaAzienda, String codiceAzienda, String codiceFiscaleAzienda,
			boolean indicatoreConversione, String password, String cap, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.codiceUtente = codiceUtente;
		this.path = path;
		this.pathSalvataggi = pathSalvataggi;
		this.subUtente = subUtente;
		this.tipoUtente = tipoUtente;
		this.cognome = cognome;
		this.nome = nome;
		this.dataNascita = dataNascita;
		this.sesso = sesso;
		this.comuneNascita = comuneNascita;
		this.provinciaNascita = provinciaNascita;
		this.domicilioFiscale = domicilioFiscale;
		this.comune = comune;
		this.provincia = provincia;
		this.partitaIVA = partitaIVA;
		this.attivita = attivita;
		this.codicePersonaFisica = codicePersonaFisica;
		this.codiceFiscale = codiceFiscale;
		this.ragioneSociale = ragioneSociale;
		this.naturaGiuridica = naturaGiuridica;
		this.domicilioAzienda = domicilioAzienda;
		this.comuneAzienda = comuneAzienda;
		this.provinciaAzienda = provinciaAzienda;
		this.partitaIVAAzienda = partitaIVAAzienda;
		this.attivitaAzienda = attivitaAzienda;
		this.codiceAzienda = codiceAzienda;
		this.codiceFiscaleAzienda = codiceFiscaleAzienda;
		this.indicatoreConversione = indicatoreConversione;
		this.password = password;
		this.cap = cap;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceUtente() {
		return codiceUtente;
	}

	public void setCodiceUtente(String codiceUtente) {
		this.codiceUtente = codiceUtente;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPathSalvataggi() {
		return pathSalvataggi;
	}

	public void setPathSalvataggi(String pathSalvataggi) {
		this.pathSalvataggi = pathSalvataggi;
	}

	public String getSubUtente() {
		return subUtente;
	}

	public void setSubUtente(String subUtente) {
		this.subUtente = subUtente;
	}

	public boolean isTipoUtente() {
		return tipoUtente;
	}

	public void setTipoUtente(boolean tipoUtente) {
		this.tipoUtente = tipoUtente;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDateTime dataNascita) {
		this.dataNascita = dataNascita;
	}

	public boolean isSesso() {
		return sesso;
	}

	public void setSesso(boolean sesso) {
		this.sesso = sesso;
	}

	public String getComuneNascita() {
		return comuneNascita;
	}

	public void setComuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
	}

	public String getProvinciaNascita() {
		return provinciaNascita;
	}

	public void setProvinciaNascita(String provinciaNascita) {
		this.provinciaNascita = provinciaNascita;
	}

	public String getDomicilioFiscale() {
		return domicilioFiscale;
	}

	public void setDomicilioFiscale(String domicilioFiscale) {
		this.domicilioFiscale = domicilioFiscale;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public String getAttivita() {
		return attivita;
	}

	public void setAttivita(String attivita) {
		this.attivita = attivita;
	}

	public String getCodicePersonaFisica() {
		return codicePersonaFisica;
	}

	public void setCodicePersonaFisica(String codicePersonaFisica) {
		this.codicePersonaFisica = codicePersonaFisica;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getNaturaGiuridica() {
		return naturaGiuridica;
	}

	public void setNaturaGiuridica(String naturaGiuridica) {
		this.naturaGiuridica = naturaGiuridica;
	}

	public String getDomicilioAzienda() {
		return domicilioAzienda;
	}

	public void setDomicilioAzienda(String domicilioAzienda) {
		this.domicilioAzienda = domicilioAzienda;
	}

	public String getComuneAzienda() {
		return comuneAzienda;
	}

	public void setComuneAzienda(String comuneAzienda) {
		this.comuneAzienda = comuneAzienda;
	}

	public String getProvinciaAzienda() {
		return provinciaAzienda;
	}

	public void setProvinciaAzienda(String provinciaAzienda) {
		this.provinciaAzienda = provinciaAzienda;
	}

	public String getPartitaIVAAzienda() {
		return partitaIVAAzienda;
	}

	public void setPartitaIVAAzienda(String partitaIVAAzienda) {
		this.partitaIVAAzienda = partitaIVAAzienda;
	}

	public String getAttivitaAzienda() {
		return attivitaAzienda;
	}

	public void setAttivitaAzienda(String attivitaAzienda) {
		this.attivitaAzienda = attivitaAzienda;
	}

	public String getCodiceAzienda() {
		return codiceAzienda;
	}

	public void setCodiceAzienda(String codiceAzienda) {
		this.codiceAzienda = codiceAzienda;
	}

	public String getCodiceFiscaleAzienda() {
		return codiceFiscaleAzienda;
	}

	public void setCodiceFiscaleAzienda(String codiceFiscaleAzienda) {
		this.codiceFiscaleAzienda = codiceFiscaleAzienda;
	}

	public boolean isIndicatoreConversione() {
		return indicatoreConversione;
	}

	public void setIndicatoreConversione(boolean indicatoreConversione) {
		this.indicatoreConversione = indicatoreConversione;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
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
	
	
}
