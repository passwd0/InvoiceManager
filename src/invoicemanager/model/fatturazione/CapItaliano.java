package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class CapItaliano{
	private int id; //  NOT NULL
	private String cap; //(5) NULL
	private String comune; //(50) NULL
	private String provincia; //(2) NULL
	private String nazione; //(30) NULL
	private String codiceISTAT; //(20) NULL
	private String codiceCAB; //(20) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL

	public CapItaliano(int id){
		this.id = id;
	}
}
