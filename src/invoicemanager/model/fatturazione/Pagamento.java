package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Pagamento{
		private String codicePagamento; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private Stato codiceStato; // (1) COLLATE Latin1_General_CI_AS NULL
		private TipoPagamento codiceTipoPagamento; // (10) COLLATE Latin1_General_CI_AS NULL
		private boolean indicatoreScadenzaAVista; // NULL
		private String giornoMese; //(10) NULL
		private int numeroGiorni; //  NULL
		private int numeroScadenze; //  NULL
		private float sconto; //  NULL
		private boolean scadenzaIVAPrimaRata; // NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL
		private String loginInserimento; //(30) NULL

	public Pagamento(String codicePagamento){
		this.codicePagamento = codicePagamento;
	}

	public String getCodicePagamento() {
		return codicePagamento;
	}

	public void setCodicePagamento(String codicePagamento) {
		this.codicePagamento = codicePagamento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Stato getCodiceStato() {
		return codiceStato;
	}

	public void setCodiceStato(Stato codiceStato) {
		this.codiceStato = codiceStato;
	}

	public TipoPagamento getCodiceTipoPagamento() {
		return codiceTipoPagamento;
	}

	public void setCodiceTipoPagamento(TipoPagamento codiceTipoPagamento) {
		this.codiceTipoPagamento = codiceTipoPagamento;
	}

	public boolean isIndicatoreScadenzaAVista() {
		return indicatoreScadenzaAVista;
	}

	public void setIndicatoreScadenzaAVista(boolean indicatoreScadenzaAVista) {
		this.indicatoreScadenzaAVista = indicatoreScadenzaAVista;
	}

	public String getGiornoMese() {
		return giornoMese;
	}

	public void setGiornoMese(String giornoMese) {
		this.giornoMese = giornoMese;
	}

	public int getNumeroGiorni() {
		return numeroGiorni;
	}

	public void setNumeroGiorni(int numeroGiorni) {
		this.numeroGiorni = numeroGiorni;
	}

	public int getNumeroScadenze() {
		return numeroScadenze;
	}

	public void setNumeroScadenze(int numeroScadenze) {
		this.numeroScadenze = numeroScadenze;
	}

	public float getSconto() {
		return sconto;
	}

	public void setSconto(float sconto) {
		this.sconto = sconto;
	}

	public boolean isScadenzaIVAPrimaRata() {
		return scadenzaIVAPrimaRata;
	}

	public void setScadenzaIVAPrimaRata(boolean scadenzaIVAPrimaRata) {
		this.scadenzaIVAPrimaRata = scadenzaIVAPrimaRata;
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

	public String getLoginInserimento() {
		return loginInserimento;
	}

	public void setLoginInserimento(String loginInserimento) {
		this.loginInserimento = loginInserimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codicePagamento == null) ? 0 : codicePagamento.hashCode());
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
		Pagamento other = (Pagamento) obj;
		if (codicePagamento == null) {
			if (other.codicePagamento != null)
				return false;
		} else if (!codicePagamento.equals(other.codicePagamento))
			return false;
		return true;
	}
	
	
}
