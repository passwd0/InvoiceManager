package invoicemanager.model;
import java.sql.Date;

public class Contratto{ //List
	private int numeroContratto; //  NULL,
	private int numeroRigaContratto; //  NULL,
	private Date dataContratto; //  NULL,
	private String cntCodiceCommessaConvenzione; // (100),
	private String cntCodiceCUP; // (15),
	private String cntCodiceCIG; // (15),
	
	public Contratto(int numeroContratto, int numeroRigaContratto, Date dataContratto,
			String cntCodiceCommessaConvenzione, String cntCodiceCUP, String cntCodiceCIG) {
		this.numeroContratto = numeroContratto;
		this.numeroRigaContratto = numeroRigaContratto;
		this.dataContratto = dataContratto;
		this.cntCodiceCommessaConvenzione = cntCodiceCommessaConvenzione;
		this.cntCodiceCUP = cntCodiceCUP;
		this.cntCodiceCIG = cntCodiceCIG;
	}
	
	public int getNumeroContratto() {
		return numeroContratto;
	}
	public void setNumeroContratto(int numeroContratto) {
		this.numeroContratto = numeroContratto;
	}
	public int getNumeroRigaContratto() {
		return numeroRigaContratto;
	}
	public void setNumeroRigaContratto(int numeroRigaContratto) {
		this.numeroRigaContratto = numeroRigaContratto;
	}
	public Date getDataContratto() {
		return dataContratto;
	}
	public void setDataContratto(Date dataContratto) {
		this.dataContratto = dataContratto;
	}
	public String getCntCodiceCommessaConvenzione() {
		return cntCodiceCommessaConvenzione;
	}
	public void setCntCodiceCommessaConvenzione(String cntCodiceCommessaConvenzione) {
		this.cntCodiceCommessaConvenzione = cntCodiceCommessaConvenzione;
	}
	public String getCntCodiceCUP() {
		return cntCodiceCUP;
	}
	public void setCntCodiceCUP(String cntCodiceCUP) {
		this.cntCodiceCUP = cntCodiceCUP;
	}
	public String getCntCodiceCIG() {
		return cntCodiceCIG;
	}
	public void setCntCodiceCIG(String cntCodiceCIG) {
		this.cntCodiceCIG = cntCodiceCIG;
	}
}