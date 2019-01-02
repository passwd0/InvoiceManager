package invoicemanager.model.fatturazione;
import java.time.LocalDate;

public class Convenzione{ //List
	private int numeroConvenzione; //  NULL,
	private int numeroRigaConvenzione; //  NULL,
	private LocalDate dataConvenzione; //  NULL,
	private String cnvCodiceCommessaConvenzione; // (100),
	private String cnvCodiceCUP; // (15),
	private String cnvCodiceCIG; // (15),
	
	public Convenzione(int numeroConvenzione, int numeroRigaConvenzione, LocalDate dataConvenzione,
			String cnvCodiceCommessaConvenzione, String cnvCodiceCUP, String cnvCodiceCIG) {
		this.numeroConvenzione = numeroConvenzione;
		this.numeroRigaConvenzione = numeroRigaConvenzione;
		this.dataConvenzione = dataConvenzione;
		this.cnvCodiceCommessaConvenzione = cnvCodiceCommessaConvenzione;
		this.cnvCodiceCUP = cnvCodiceCUP;
		this.cnvCodiceCIG = cnvCodiceCIG;
	}

	public int getNumeroConvenzione() {
		return numeroConvenzione;
	}

	public void setNumeroConvenzione(int numeroConvenzione) {
		this.numeroConvenzione = numeroConvenzione;
	}

	public int getNumeroRigaConvenzione() {
		return numeroRigaConvenzione;
	}

	public void setNumeroRigaConvenzione(int numeroRigaConvenzione) {
		this.numeroRigaConvenzione = numeroRigaConvenzione;
	}

	public LocalDate getDataConvenzione() {
		return dataConvenzione;
	}

	public void setDataConvenzione(LocalDate dataConvenzione) {
		this.dataConvenzione = dataConvenzione;
	}

	public String getCnvCodiceCommessaConvenzione() {
		return cnvCodiceCommessaConvenzione;
	}

	public void setCnvCodiceCommessaConvenzione(String cnvCodiceCommessaConvenzione) {
		this.cnvCodiceCommessaConvenzione = cnvCodiceCommessaConvenzione;
	}

	public String getCnvCodiceCUP() {
		return cnvCodiceCUP;
	}

	public void setCnvCodiceCUP(String cnvCodiceCUP) {
		this.cnvCodiceCUP = cnvCodiceCUP;
	}

	public String getCnvCodiceCIG() {
		return cnvCodiceCIG;
	}

	public void setCnvCodiceCIG(String cnvCodiceCIG) {
		this.cnvCodiceCIG = cnvCodiceCIG;
	}
}
