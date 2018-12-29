package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class ListinoArticolo implements Listino{
	private String codiceArticolo; //(30) NOT NULL
	private int progressivo; //  NOT NULL
	private String codiceDivisa; //(4) NOT NULL
	private float prezzo; // (19, 5) NULL
	private int numeroDecimali; //  NULL
	private LocalDateTime dataDecorrenza; //  NULL
	private LocalDateTime dataValidita; //  NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL

	public ListinoArticolo(String codiceArticolo, int progressivo, String codiceDivisa){
		this.codiceArticolo = codiceArticolo;
		this.progressivo = progressivo;
		this.codiceDivisa = codiceDivisa;
	}
}
