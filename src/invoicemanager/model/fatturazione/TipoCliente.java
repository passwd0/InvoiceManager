package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TipoCliente{
		private String CodiceTipoCliente; //(4) NOT NULL
		private String Descrizione; //(50) NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
}

public TipoCliente(String CodiceTipoCliente){
	this.CodiceTipoCliente = CodiceTipoCliente;
}
