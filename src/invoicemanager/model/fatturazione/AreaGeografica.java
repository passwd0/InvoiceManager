package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class AreaGeografica{
	private int codiceArea; //  NOT NULL
	private String nazione; //(50) NULL
	private String area; //(50) NULL
	private String regione; //(50) NULL
	private String provincia; //(2) NOT NULL
	private LocalDateTime dataInserimento; //  NULL

	public AreaGeografica(int codiceArea, String provincia){
		this.codiceArea = codiceArea;
		this.provincia = provincia;
	}
}
