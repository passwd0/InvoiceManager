package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Vettore {
	private String codiceVettore; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // (1) COLLATE Latin1_General_CI_AS NULL
	private String via; //(50) NULL
	private String citta; //(100) NULL
	private String partitaIva; //(11) NULL
	private String iscrizione; //(50) NULL
	private String telefono; //(50) NULL
	private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
	private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL
	
	public Vettore(String codiceVettore){
		this.codiceVettore = codiceVettore;
	}

	public Vettore(String codiceVettore, String descrizione, Stato stato, String via, String citta,
			String partitaIva, String iscrizione, String telefono, LocalDateTime dataInserimento,
			LocalDateTime dataUltimaModifica) {
		this.codiceVettore = codiceVettore;
		this.descrizione = descrizione;
		this.stato = stato;
		this.via = via;
		this.citta = citta;
		this.partitaIva = partitaIva;
		this.iscrizione = iscrizione;
		this.telefono = telefono;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceVettore() {
		return codiceVettore;
	}

	public void setCodiceVettore(String codiceVettore) {
		this.codiceVettore = codiceVettore;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
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

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getIscrizione() {
		return iscrizione;
	}

	public void setIscrizione(String iscrizione) {
		this.iscrizione = iscrizione;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceVettore == null) ? 0 : codiceVettore.hashCode());
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
		Vettore other = (Vettore) obj;
		if (codiceVettore == null) {
			if (other.codiceVettore != null)
				return false;
		} else if (!codiceVettore.equals(other.codiceVettore))
			return false;
		return true;
	}
}
