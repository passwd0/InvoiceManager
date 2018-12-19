package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TipoPagamento{
		private String CodiceTipoPagamento; //(10) NOT NULL
		private String Descrizione; //(100) NULL
		private LocalDateTime DataInserimento; //  NULL
		private LocalDateTime DataUltimaModifica; //  NULL
}
