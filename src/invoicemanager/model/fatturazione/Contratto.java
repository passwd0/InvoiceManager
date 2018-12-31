package invoicemanager.model.fatturazione;
import java.time.LocalDate;

public class Contratto{ //List
	private int numeroContratto; //  NULL,
	private short numeroRigaContratto; //  NULL,
	private LocalDate dataContratto; //  NULL,
	private String cntCodiceCommessaConvenzione; // (100),
	private String cntCodiceCUP; // (15),
	private String cntCodiceCIG; // (15),
	
	public Contratto(int numeroContratto, short numeroRigaContratto, LocalDate dataContratto,
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
	public short getNumeroRigaContratto() {
		return numeroRigaContratto;
	}
	public void setNumeroRigaContratto(short numeroRigaContratto) {
		this.numeroRigaContratto = numeroRigaContratto;
	}
	public LocalDate getDataContratto() {
		return dataContratto;
	}
	public void setDataContratto(LocalDate dataContratto) {
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