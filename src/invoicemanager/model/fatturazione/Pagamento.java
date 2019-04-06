package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Pagamento {
		private String codicePagamento; //(4) NOT NULL
		private String descrizione; //(100) NULL
		private Stato stato = Stato.DISPONIBILE; // (1) COLLATE Latin1_General_CI_AS NULL
		private TipoPagamento tipoPagamento; // (10) COLLATE Latin1_General_CI_AS NULL
		private boolean indicatoreScadenzaAVista; // NULL
		private String giornoMese; //(10) NULL
		private int numeroGiorni; //  NULL
		private int numeroScadenze; //  NULL
		private float sconto; //  NULL
		private boolean scadenzaIVAPrimaRata; // NULL
		private LocalDateTime dataInserimento = LocalDateTime.now(); //  NULL
		private LocalDateTime dataUltimaModifica = LocalDateTime.now(); //  NULL

	public Pagamento(String codicePagamento){
		this.codicePagamento = codicePagamento;
	}

	public Pagamento(String codicePagamento, String descrizione, Stato stato, TipoPagamento tipoPagamento,
			boolean indicatoreScadenzaAVista, String giornoMese, int numeroGiorni, int numeroScadenze, float sconto,
			boolean scadenzaIVAPrimaRata, LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica) {
		this.codicePagamento = codicePagamento;
		this.descrizione = descrizione;
		this.stato = stato;
		this.tipoPagamento = tipoPagamento;
		this.indicatoreScadenzaAVista = indicatoreScadenzaAVista;
		this.giornoMese = giornoMese;
		this.numeroGiorni = numeroGiorni;
		this.numeroScadenze = numeroScadenze;
		this.sconto = sconto;
		this.scadenzaIVAPrimaRata = scadenzaIVAPrimaRata;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
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

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}
	
	public String getCodiceTipoPagamento() {
		if (tipoPagamento == null)
			return null;
		return tipoPagamento.getCodiceTipoPagamento();
	}

	public void setCodiceTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
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
