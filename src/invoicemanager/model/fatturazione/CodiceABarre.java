package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class CodiceABarre{
	private String codiceArticolo; //(30) NOT NULL
	private String codiceABarre; //(50) NOT NULL
	private String tipo; //(50) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public CodiceABarre(String codiceArticolo, String codiceABarre){
		this.codiceArticolo = codiceArticolo;
		this.codiceABarre = codiceABarre;
	}
}
