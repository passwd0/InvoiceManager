package invoicemanager.model;
import java.time.LocalDate;

public class FatturaCollegata{ //List
	private int numeroFtCollegate; //  NULL,
	private int numeroRigaFtCollegate; //  NULL,
	private int sezionale = 1;
	private LocalDate dataFtCollegate; //  NULL,
	private String ftcCodiceCommessaFtCollegate; // (100),
	private String ftcCodiceCUP; // (15),
	private String ftcCodiceCIG; // (15),
	
	public FatturaCollegata(int numeroFtCollegate, int numeroRigaFtCollegate, int sezionale, LocalDate dataFtCollegate,
			String ftcCodiceCommessaFtCollegate, String ftcCodiceCUP, String ftcCodiceCIG) {
		this.numeroFtCollegate = numeroFtCollegate;
		this.numeroRigaFtCollegate = numeroRigaFtCollegate;
		this.sezionale = sezionale;
		this.dataFtCollegate = dataFtCollegate;
		this.ftcCodiceCommessaFtCollegate = ftcCodiceCommessaFtCollegate;
		this.ftcCodiceCUP = ftcCodiceCUP;
		this.ftcCodiceCIG = ftcCodiceCIG;
	}
	
	public int getSezionale() {
		return sezionale;
	}

	public void setSezionale(int sezionale) {
		this.sezionale = sezionale;
	}
	
	public int getNumeroFtCollegate() {
		return numeroFtCollegate;
	}
	public void setNumeroFtCollegate(int numeroFtCollegate) {
		this.numeroFtCollegate = numeroFtCollegate;
	}
	public int getNumeroRigaFtCollegate() {
		return numeroRigaFtCollegate;
	}
	public void setNumeroRigaFtCollegate(int numeroRigaFtCollegate) {
		this.numeroRigaFtCollegate = numeroRigaFtCollegate;
	}
	public LocalDate getDataFtCollegate() {
		return dataFtCollegate;
	}
	public void setDataFtCollegate(LocalDate dataFtCollegate) {
		this.dataFtCollegate = dataFtCollegate;
	}
	public String getFtcCodiceCommessaFtCollegate() {
		return ftcCodiceCommessaFtCollegate;
	}
	public void setFtcCodiceCommessaFtCollegate(String ftcCodiceCommessaFtCollegate) {
		this.ftcCodiceCommessaFtCollegate = ftcCodiceCommessaFtCollegate;
	}
	public String getFtcCodiceCUP() {
		return ftcCodiceCUP;
	}
	public void setFtcCodiceCUP(String ftcCodiceCUP) {
		this.ftcCodiceCUP = ftcCodiceCUP;
	}
	public String getFtcCodiceCIG() {
		return ftcCodiceCIG;
	}
	public void setFtcCodiceCIG(String ftcCodiceCIG) {
		this.ftcCodiceCIG = ftcCodiceCIG;
	}
}
