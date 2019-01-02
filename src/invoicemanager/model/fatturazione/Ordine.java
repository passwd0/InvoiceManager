package invoicemanager.model.fatturazione;
import java.time.LocalDate;

public class Ordine{ //List
	private int numeroOrdine; //  NULL,
	private int numeroRigaOrdine; //  NULL,
	private LocalDate dataOrdine; //  NULL,
	private String ordCodiceCommessaConvenzione; // (100),
	private String ordCodiceCUP; // (15),
	private String ordCodiceCIG; // (15),
	
	public Ordine(int numeroOrdine, int numeroRigaOrdine, LocalDate dataOrdine, String ordCodiceCommessaConvenzione,
			String ordCodiceCUP, String ordCodiceCIG) {
		this.numeroOrdine = numeroOrdine;
		this.numeroRigaOrdine = numeroRigaOrdine;
		this.dataOrdine = dataOrdine;
		this.ordCodiceCommessaConvenzione = ordCodiceCommessaConvenzione;
		this.ordCodiceCUP = ordCodiceCUP;
		this.ordCodiceCIG = ordCodiceCIG;
	}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public int getNumeroRigaOrdine() {
		return numeroRigaOrdine;
	}

	public void setNumeroRigaOrdine(int numeroRigaOrdine) {
		this.numeroRigaOrdine = numeroRigaOrdine;
	}

	public LocalDate getDataOrdine() {
		return dataOrdine;
	}

	public void setDataOrdine(LocalDate dataOrdine) {
		this.dataOrdine = dataOrdine;
	}

	public String getOrdCodiceCommessaConvenzione() {
		return ordCodiceCommessaConvenzione;
	}

	public void setOrdCodiceCommessaConvenzione(String ordCodiceCommessaConvenzione) {
		this.ordCodiceCommessaConvenzione = ordCodiceCommessaConvenzione;
	}

	public String getOrdCodiceCUP() {
		return ordCodiceCUP;
	}

	public void setOrdCodiceCUP(String ordCodiceCUP) {
		this.ordCodiceCUP = ordCodiceCUP;
	}

	public String getOrdCodiceCIG() {
		return ordCodiceCIG;
	}

	public void setOrdCodiceCIG(String ordCodiceCIG) {
		this.ordCodiceCIG = ordCodiceCIG;
	}
}
