package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class Telefono{
	private String codiceConto; //(30) NOT NULL
	private short progressivo; //  NOT NULL
	private String tipoTelefono; //(2) NOT NULL
	private String numero; //(50) NULL
	private LocalDateTime dataInserimento; //  NULL
	private LocalDateTime dataUltimaModifica; //  NULL
	private String loginInserimento; //(30) NULL

	public Telefono(String codiceConto, short progressivo, String tipoTelefono){
		this.codiceConto = codiceConto;
		this.progressivo = progressivo;
		this.tipoTelefono = tipoTelefono;
	}
}
