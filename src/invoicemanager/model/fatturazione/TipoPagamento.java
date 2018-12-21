package invoicemanager.model.fatturazione;
import java.time.LocalDateTime;
import java.util.List;

public class TipoPagamento{
		private String codiceTipoPagamento; //(10) NOT NULL
		private String descrizione; //(100) NULL
		private LocalDateTime dataInserimento; //  NULL
		private LocalDateTime dataUltimaModifica; //  NULL

	public TipoPagamento(String codiceTipoPagamento){
		this.codiceTipoPagamento = codiceTipoPagamento;
	}
}
