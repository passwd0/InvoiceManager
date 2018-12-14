package fatturazione.model;

import java.time.LocalDateTime;

public class TipoPagamento{
	private String CodiceTipoPagamento; //(10) NOT
	private String Descrizione; //(100)
	private LocalDateTime DataInserimento;
	private LocalDateTime DataUltimaModifica;
}
