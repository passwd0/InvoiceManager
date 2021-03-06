package invoicemanager.model;
import java.sql.Date;

public class Ricezione{ //List
	private int numeroRicezione; //  NULL,
	private int numeroRigaRicezione; //  NULL,
	private Date dataRicezione; //  NULL,
	private String rczCodiceCommessaRicezione; // (100),
	private String rczCodiceCUP; // (15),
	private String rczCodiceCIG; // (15),
	
	public Ricezione(int numeroRicezione, int numeroRigaRicezione, Date dataRicezione,
			String rczCodiceCommessaRicezione, String rczCodiceCUP, String rczCodiceCIG) {
		this.numeroRicezione = numeroRicezione;
		this.numeroRigaRicezione = numeroRigaRicezione;
		this.dataRicezione = dataRicezione;
		this.rczCodiceCommessaRicezione = rczCodiceCommessaRicezione;
		this.rczCodiceCUP = rczCodiceCUP;
		this.rczCodiceCIG = rczCodiceCIG;
	}
	public int getNumeroRicezione() {
		return numeroRicezione;
	}
	public void setNumeroRicezione(int numeroRicezione) {
		this.numeroRicezione = numeroRicezione;
	}
	public int getNumeroRigaRicezione() {
		return numeroRigaRicezione;
	}
	public void setNumeroRigaRicezione(int numeroRigaRicezione) {
		this.numeroRigaRicezione = numeroRigaRicezione;
	}
	public Date getDataRicezione() {
		return dataRicezione;
	}
	public void setDataRicezione(Date dataRicezione) {
		this.dataRicezione = dataRicezione;
	}
	public String getRczCodiceCommessaRicezione() {
		return rczCodiceCommessaRicezione;
	}
	public void setRczCodiceCommessaRicezione(String rczCodiceCommessaRicezione) {
		this.rczCodiceCommessaRicezione = rczCodiceCommessaRicezione;
	}
	public String getRczCodiceCUP() {
		return rczCodiceCUP;
	}
	public void setRczCodiceCUP(String rczCodiceCUP) {
		this.rczCodiceCUP = rczCodiceCUP;
	}
	public String getRczCodiceCIG() {
		return rczCodiceCIG;
	}
	public void setRczCodiceCIG(String rczCodiceCIG) {
		this.rczCodiceCIG = rczCodiceCIG;
	}
}
