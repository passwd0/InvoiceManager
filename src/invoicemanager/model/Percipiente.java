package invoicemanager.model;
import java.sql.Timestamp;

public class Percipiente {
	private String codicePercipiente; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato codiceStato = Stato.DISPONIBILE; // NULL
	private float aliquotaRitenutaAcconto; //  NULL
	private float percentualeImponibileRitenutaAcconto; //  NULL
	private String codiceTributo; //(10) NULL
	private boolean assoggettamentoINPS; // NULL
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL

	public Percipiente(String codicePercipiente){
		this.codicePercipiente = codicePercipiente;
	}

	public Percipiente(String codicePercipiente, String descrizione, Stato codiceStato, float aliquotaRitenutaAcconto,
			float percentualeImponibileRitenutaAcconto, String codiceTributo, boolean assoggettamentoINPS,
			Timestamp dataInserimento, Timestamp dataUltimaModifica) {
		this.codicePercipiente = codicePercipiente;
		this.descrizione = descrizione;
		this.codiceStato = codiceStato;
		this.aliquotaRitenutaAcconto = aliquotaRitenutaAcconto;
		this.percentualeImponibileRitenutaAcconto = percentualeImponibileRitenutaAcconto;
		this.codiceTributo = codiceTributo;
		this.assoggettamentoINPS = assoggettamentoINPS;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodicePercipiente() {
		return codicePercipiente;
	}

	public void setCodicePercipiente(String codicePercipiente) {
		this.codicePercipiente = codicePercipiente;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Stato getStato() {
		return codiceStato;
	}

	public void setStato(Stato codiceStato) {
		this.codiceStato = codiceStato;
	}

	public float getAliquotaRitenutaAcconto() {
		return aliquotaRitenutaAcconto;
	}

	public void setAliquotaRitenutaAcconto(float aliquotaRitenutaAcconto) {
		this.aliquotaRitenutaAcconto = aliquotaRitenutaAcconto;
	}

	public float getPercentualeImponibileRitenutaAcconto() {
		return percentualeImponibileRitenutaAcconto;
	}

	public void setPercentualeImponibileRitenutaAcconto(float percentualeImponibileRitenutaAcconto) {
		this.percentualeImponibileRitenutaAcconto = percentualeImponibileRitenutaAcconto;
	}

	public String getCodiceTributo() {
		return codiceTributo;
	}

	public void setCodiceTributo(String codiceTributo) {
		this.codiceTributo = codiceTributo;
	}

	public boolean isAssoggettamentoINPS() {
		return assoggettamentoINPS;
	}

	public void setAssoggettamentoINPS(boolean assoggettamentoINPS) {
		this.assoggettamentoINPS = assoggettamentoINPS;
	}

	public Timestamp getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(Timestamp dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Timestamp getDataUltimaModifica() {
		return dataUltimaModifica;
	}

	public void setDataUltimaModifica(Timestamp dataUltimaModifica) {
		this.dataUltimaModifica = dataUltimaModifica;
	}
}
