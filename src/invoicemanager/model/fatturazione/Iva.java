package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;

public class Iva{
	private String codiceIva; //(4) NOT NULL
	private String descrizione; //(100) NULL
	private Stato stato = Stato.DISPONIBILE; // (1) COLLATE Latin1_General_CI_AS NULL
	private int rigaIVAAcquisti; //  NULL
	private float addizionaleIVA; //  NULL
	private float aliquotaIVA; //  NULL
	private float imponibileAcquisti; //  NULL
	private float imponibileAcquistiNonDetraibile; //  NULL
	private float impostaAcquisti; //  NULL
	private float imponibileVendite; //  NULL
	private float imponibileVenditeNonDetraibile; //  NULL
	private float impostaVendite; //  NULL
	private int rigaIVAVendite; //  NULL
	private float coefficienteIVA; //  NULL
	private String percentualeIndetraibilita; //(5) NULL
	private float valoreArrotondamento; //  NULL
	private boolean indicatoreTroncaAcquisti; // NULL
	private boolean indicatoreSommaAcquisti; // NULL
	private boolean indicatoreArrotondaAcquisti; // NULL
	private boolean indicatoreSottraeAcquisti; // NULL
	private boolean indicatoreTroncaVendite; // NULL
	private boolean indicatoreSommaVendite; // NULL
	private boolean indicatoreArrotondaVendite; // NULL
	private boolean indicatoreSottraeVendite; // NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL
	private String loginModifica; //(30) NULL
	private boolean elencoClientiFornitori; // NULL
	private String colonnaClientiFornitori; //(50) NULL
	private String colonnaNoteClientiFornitori; //(50) NULL
	private String splitPayment;
		
	public Iva(String codiceIva, String descrizione, Stato stato, int rigaIVAAcquisti, float addizionaleIVA,
				float aliquotaIVA, float imponibileAcquisti, float imponibileAcquistiNonDetraibile,
				float impostaAcquisti, float imponibileVendite, float imponibileVenditeNonDetraibile,
				float impostaVendite, int rigaIVAVendite, float coefficienteIVA, String percentualeIndetraibilita,
				float valoreArrotondamento, boolean indicatoreTroncaAcquisti, boolean indicatoreSommaAcquisti,
				boolean indicatoreArrotondaAcquisti, boolean indicatoreSottraeAcquisti, boolean indicatoreTroncaVendite,
				boolean indicatoreSommaVendite, boolean indicatoreArrotondaVendite, boolean indicatoreSottraeVendite,
				LocalDateTime dataInserimento, LocalDateTime dataUltimaModifica, String loginInserimento,
				String loginModifica, boolean elencoClientiFornitori, String colonnaClientiFornitori,
				String colonnaNoteClientiFornitori, String splitPayment) {
		this.codiceIva = codiceIva;
		this.descrizione = descrizione;
		this.stato = stato;
		this.rigaIVAAcquisti = rigaIVAAcquisti;
		this.addizionaleIVA = addizionaleIVA;
		this.aliquotaIVA = aliquotaIVA;
		this.imponibileAcquisti = imponibileAcquisti;
		this.imponibileAcquistiNonDetraibile = imponibileAcquistiNonDetraibile;
		this.impostaAcquisti = impostaAcquisti;
		this.imponibileVendite = imponibileVendite;
		this.imponibileVenditeNonDetraibile = imponibileVenditeNonDetraibile;
		this.impostaVendite = impostaVendite;
		this.rigaIVAVendite = rigaIVAVendite;
		this.coefficienteIVA = coefficienteIVA;
		this.percentualeIndetraibilita = percentualeIndetraibilita;
		this.valoreArrotondamento = valoreArrotondamento;
		this.indicatoreTroncaAcquisti = indicatoreTroncaAcquisti;
		this.indicatoreSommaAcquisti = indicatoreSommaAcquisti;
		this.indicatoreArrotondaAcquisti = indicatoreArrotondaAcquisti;
		this.indicatoreSottraeAcquisti = indicatoreSottraeAcquisti;
		this.indicatoreTroncaVendite = indicatoreTroncaVendite;
		this.indicatoreSommaVendite = indicatoreSommaVendite;
		this.indicatoreArrotondaVendite = indicatoreArrotondaVendite;
		this.indicatoreSottraeVendite = indicatoreSottraeVendite;
		this.dataInserimento = dataInserimento;
		this.dataUltimaModifica = dataUltimaModifica;
		this.loginInserimento = loginInserimento;
		this.loginModifica = loginModifica;
		this.elencoClientiFornitori = elencoClientiFornitori;
		this.colonnaClientiFornitori = colonnaClientiFornitori;
		this.colonnaNoteClientiFornitori = colonnaNoteClientiFornitori;
		this.splitPayment = splitPayment;
	}

	public Iva(String codiceIva){
		this.codiceIva = codiceIva;
	}

	public String getCodiceIva() {
		return codiceIva;
	}

	public void setCodiceIva(String codiceIva) {
		this.codiceIva = codiceIva;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String getCodiceStato() {
		if (stato == null) return null;
		return stato.name();
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public int getRigaIVAAcquisti() {
		return rigaIVAAcquisti;
	}

	public void setRigaIVAAcquisti(int rigaIVAAcquisti) {
		this.rigaIVAAcquisti = rigaIVAAcquisti;
	}

	public float getAddizionaleIVA() {
		return addizionaleIVA;
	}

	public void setAddizionaleIVA(float addizionaleIVA) {
		this.addizionaleIVA = addizionaleIVA;
	}

	public float getAliquotaIVA() {
		return aliquotaIVA;
	}

	public void setAliquotaIVA(float aliquotaIVA) {
		this.aliquotaIVA = aliquotaIVA;
	}

	public float getImponibileAcquisti() {
		return imponibileAcquisti;
	}

	public void setImponibileAcquisti(float imponibileAcquisti) {
		this.imponibileAcquisti = imponibileAcquisti;
	}

	public float getImponibileAcquistiNonDetraibile() {
		return imponibileAcquistiNonDetraibile;
	}

	public void setImponibileAcquistiNonDetraibile(float imponibileAcquistiNonDetraibile) {
		this.imponibileAcquistiNonDetraibile = imponibileAcquistiNonDetraibile;
	}

	public float getImpostaAcquisti() {
		return impostaAcquisti;
	}

	public void setImpostaAcquisti(float impostaAcquisti) {
		this.impostaAcquisti = impostaAcquisti;
	}

	public float getImponibileVendite() {
		return imponibileVendite;
	}

	public void setImponibileVendite(float imponibileVendite) {
		this.imponibileVendite = imponibileVendite;
	}

	public float getImponibileVenditeNonDetraibile() {
		return imponibileVenditeNonDetraibile;
	}

	public void setImponibileVenditeNonDetraibile(float imponibileVenditeNonDetraibile) {
		this.imponibileVenditeNonDetraibile = imponibileVenditeNonDetraibile;
	}

	public float getImpostaVendite() {
		return impostaVendite;
	}

	public void setImpostaVendite(float impostaVendite) {
		this.impostaVendite = impostaVendite;
	}

	public int getRigaIVAVendite() {
		return rigaIVAVendite;
	}

	public void setRigaIVAVendite(int rigaIVAVendite) {
		this.rigaIVAVendite = rigaIVAVendite;
	}

	public float getCoefficienteIVA() {
		return coefficienteIVA;
	}

	public void setCoefficienteIVA(float coefficienteIVA) {
		this.coefficienteIVA = coefficienteIVA;
	}

	public String getPercentualeIndetraibilita() {
		return percentualeIndetraibilita;
	}

	public void setPercentualeIndetraibilita(String percentualeIndetraibilita) {
		this.percentualeIndetraibilita = percentualeIndetraibilita;
	}

	public float getValoreArrotondamento() {
		return valoreArrotondamento;
	}

	public void setValoreArrotondamento(float valoreArrotondamento) {
		this.valoreArrotondamento = valoreArrotondamento;
	}

	public boolean isIndicatoreTroncaAcquisti() {
		return indicatoreTroncaAcquisti;
	}

	public void setIndicatoreTroncaAcquisti(boolean indicatoreTroncaAcquisti) {
		this.indicatoreTroncaAcquisti = indicatoreTroncaAcquisti;
	}

	public boolean isIndicatoreSommaAcquisti() {
		return indicatoreSommaAcquisti;
	}

	public void setIndicatoreSommaAcquisti(boolean indicatoreSommaAcquisti) {
		this.indicatoreSommaAcquisti = indicatoreSommaAcquisti;
	}

	public boolean isIndicatoreArrotondaAcquisti() {
		return indicatoreArrotondaAcquisti;
	}

	public void setIndicatoreArrotondaAcquisti(boolean indicatoreArrotondaAcquisti) {
		this.indicatoreArrotondaAcquisti = indicatoreArrotondaAcquisti;
	}

	public boolean isIndicatoreSottraeAcquisti() {
		return indicatoreSottraeAcquisti;
	}

	public void setIndicatoreSottraeAcquisti(boolean indicatoreSottraeAcquisti) {
		this.indicatoreSottraeAcquisti = indicatoreSottraeAcquisti;
	}

	public boolean isIndicatoreTroncaVendite() {
		return indicatoreTroncaVendite;
	}

	public void setIndicatoreTroncaVendite(boolean indicatoreTroncaVendite) {
		this.indicatoreTroncaVendite = indicatoreTroncaVendite;
	}

	public boolean isIndicatoreSommaVendite() {
		return indicatoreSommaVendite;
	}

	public void setIndicatoreSommaVendite(boolean indicatoreSommaVendite) {
		this.indicatoreSommaVendite = indicatoreSommaVendite;
	}

	public boolean isIndicatoreArrotondaVendite() {
		return indicatoreArrotondaVendite;
	}

	public void setIndicatoreArrotondaVendite(boolean indicatoreArrotondaVendite) {
		this.indicatoreArrotondaVendite = indicatoreArrotondaVendite;
	}

	public boolean isIndicatoreSottraeVendite() {
		return indicatoreSottraeVendite;
	}

	public void setIndicatoreSottraeVendite(boolean indicatoreSottraeVendite) {
		this.indicatoreSottraeVendite = indicatoreSottraeVendite;
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

	public String getLoginModifica() {
		return loginModifica;
	}

	public void setLoginModifica(String loginModifica) {
		this.loginModifica = loginModifica;
	}

	public boolean isElencoClientiFornitori() {
		return elencoClientiFornitori;
	}

	public void setElencoClientiFornitori(boolean elencoClientiFornitori) {
		this.elencoClientiFornitori = elencoClientiFornitori;
	}

	public String getColonnaClientiFornitori() {
		return colonnaClientiFornitori;
	}

	public void setColonnaClientiFornitori(String colonnaClientiFornitori) {
		this.colonnaClientiFornitori = colonnaClientiFornitori;
	}

	public String getColonnaNoteClientiFornitori() {
		return colonnaNoteClientiFornitori;
	}

	public void setColonnaNoteClientiFornitori(String colonnaNoteClientiFornitori) {
		this.colonnaNoteClientiFornitori = colonnaNoteClientiFornitori;
	}
	
	public String getSplitPayment() {
		return splitPayment;
	}

	public void setSplitPayment(String splitPayment) {
		this.splitPayment = splitPayment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceIva == null) ? 0 : codiceIva.hashCode());
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
		Iva other = (Iva) obj;
		if (codiceIva == null) {
			if (other.codiceIva != null)
				return false;
		} else if (!codiceIva.equals(other.codiceIva))
			return false;
		return true;
	}
	
	
}
