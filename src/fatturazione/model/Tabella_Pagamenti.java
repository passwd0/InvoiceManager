package fatturazione.model;

import java.time.LocalDateTime;

public class Tabella_Pagamenti{
	private String CodicePagamento; //(4) NOT
	private String Descrizione; //(100)
	private boolean CodiceStato;
	private String CodiceTipoPagamento; //(10)
	private boolean IndicatoreScadenzaAVista;
	private String GiornoMese; //(10)
	private int NumeroGiorni;
	private short NumeroScadenze;
	private float Sconto;
	private boolean ScadenzaIVAPrimaRata;
	private LocalDateTime DataInserimento;
	private LocalDateTime DataUltimaModifica;
	private String LoginInserimento; //(30)
}
