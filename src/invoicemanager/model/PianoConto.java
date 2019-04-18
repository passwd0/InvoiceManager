package invoicemanager.model;
import java.sql.Timestamp;

public class PianoConto {
	private String codiceConto; //(30) NOT NULL
	private String descrizione; //(100) NULL
	private boolean tipo; // NULL
	private String codiceClassificazione; //(50) NULL
	private float darePeriodo; //  NULL
	private float averePeriodo; //  NULL
	private float dareProgressivo; //  NULL
	private float avereProgressivo; //  NULL
	private String codiceDivisa; //(4) NULL
	private String codiceBancaBonifico; //(4) NULL
	private boolean contoBanca; 
	private Timestamp dataInserimento = new Timestamp(System.currentTimeMillis()); //  NULL
	private Timestamp dataUltimaModifica = new Timestamp(System.currentTimeMillis()); //  NULL
	
	public PianoConto(String codiceConto){
		this.codiceConto = codiceConto;
	}

	public PianoConto(String codiceConto, String descrizione, boolean tipo, String codiceClassificazione,
			float darePeriodo, float averePeriodo, float dareProgressivo, float avereProgressivo, String codiceDivisa,
			String codiceBancaBonifico, boolean contoBanca, Timestamp dataInserimento,
			Timestamp dataUltimaModifica) {
		this.codiceConto = codiceConto;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.codiceClassificazione = codiceClassificazione;
		this.darePeriodo = darePeriodo;
		this.averePeriodo = averePeriodo;
		this.dareProgressivo = dareProgressivo;
		this.avereProgressivo = avereProgressivo;
		this.codiceDivisa = codiceDivisa;
		this.codiceBancaBonifico = codiceBancaBonifico;
		this.contoBanca = contoBanca;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
	}

	public String getCodiceConto() {
		return codiceConto;
	}

	public void setCodiceConto(String codiceConto) {
		this.codiceConto = codiceConto;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	public String getCodiceClassificazione() {
		return codiceClassificazione;
	}

	public void setCodiceClassificazione(String codiceClassificazione) {
		this.codiceClassificazione = codiceClassificazione;
	}

	public float getDarePeriodo() {
		return darePeriodo;
	}

	public void setDarePeriodo(float darePeriodo) {
		this.darePeriodo = darePeriodo;
	}

	public float getAverePeriodo() {
		return averePeriodo;
	}

	public void setAverePeriodo(float averePeriodo) {
		this.averePeriodo = averePeriodo;
	}

	public float getDareProgressivo() {
		return dareProgressivo;
	}

	public void setDareProgressivo(float dareProgressivo) {
		this.dareProgressivo = dareProgressivo;
	}

	public float getAvereProgressivo() {
		return avereProgressivo;
	}

	public void setAvereProgressivo(float avereProgressivo) {
		this.avereProgressivo = avereProgressivo;
	}

	public String getCodiceDivisa() {
		return codiceDivisa;
	}

	public void setCodiceDivisa(String codiceDivisa) {
		this.codiceDivisa = codiceDivisa;
	}

	public String getCodiceBancaBonifico() {
		return codiceBancaBonifico;
	}

	public void setCodiceBancaBonifico(String codiceBancaBonifico) {
		this.codiceBancaBonifico = codiceBancaBonifico;
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

	public boolean isContoBanca() {
		return contoBanca;
	}

	public void setContoBanca(boolean contoBanca) {
		this.contoBanca = contoBanca;
	}
}
