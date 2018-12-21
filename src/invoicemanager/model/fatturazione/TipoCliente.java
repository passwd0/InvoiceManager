package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TipoCliente{
		private String codiceTipoCliente; //(4) NOT NULL
		private String descrizione; //(50) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL

	public TipoCliente(String codiceTipoCliente){
		this.codiceTipoCliente = codiceTipoCliente;
	}
}
