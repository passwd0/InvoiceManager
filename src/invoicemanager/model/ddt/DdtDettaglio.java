package invoicemanager.model.ddt;

import java.time.LocalDateTime;

public class DdtDettaglio {
	private int numeroDDT; //NOT NULL
	private short numeroRigaDDT; //NOT NULL
	private LocalDateTime dataDDT; //NOT NULL
	private String codiceTipoRigaDocumento;
	private String codiceArticolo;
	private String codiceMagazzino;
	private float costo; //NULL
	private int numeroOrdine; //NULL
	private short numeroRigaOrdine; //NULL
	private LocalDateTime dataOrdine; //NULL
	private float quantitaDaConsegnare; //NULL
	private boolean indicatoreEvasione;
	private String descrizione;
	private float quantita; //NULL
	private float prezzo; //[Prezzo] [decimal](19, 5) NULL,
	private String codiceIva; //[CodiceIva] [varchar](4) COLLATE Latin1_General_CI_AS NULL,
	private String codiceContropartitaContabile; // [varchar](4) COLLATE Latin1_General_CI_AS NULL,
	private float percentualeProvvigione; //NULL
	private float percentualeScontoCliente; //NULL
	private float percentualeScontoArticolo; //NULL
	private float percentualeScontoPagamento; //NULL
	private String descrizioneAggiuntiva; // [varchar](2000) COLLATE Latin1_General_CI_AS NULL,
	private String codiceUnitaMisura; //] [varchar](4) COLLATE Latin1_General_CI_AS NULL,
	private String serialNumber; //[SerialNumber] [varchar](50) COLLATE Latin1_General_CI_AS NULL,
	private LocalDateTime DataInserimento; //NULL
	private LocalDateTime DataUltimaModifica; //NULL
	private String loginInserimento; //[LoginInserimento] [varchar](30) COLLATE Latin1_General_CI_AS NULL,
	private String loginModifica; //[LoginModifica] [varchar](30) COLLATE Latin1_General_CI_AS NULL,
	private boolean indicatorePrelevatoVendita; //] [varchar](1) COLLATE Latin1_General_CI_AS NULL,
	private String pesoLordo; //[PesoLordo] [varchar](50) COLLATE Latin1_General_CI_AS NULL

}
