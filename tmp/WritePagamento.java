Create table public.Pagamento (
	"CodicePagamento" varchar(25) NOT NULL,
	"Descrizione" varchar(25) NULL,
	"CodiceStato" varchar(25) NULL,
	"CodiceTipoPagamento" varchar(25) NULL,
	"IndicatoreScadenzaAVista" Boolean NULL,
	"GiornoMese" varchar(25) NULL,
	"NumeroGiorni" INTEGER NULL,
	"NumeroScadenze" INTEGER NULL,
	"Sconto" Float NULL,
	"ScadenzaIVAPrimaRata" Boolean NULL,
	"DataInserimento" Timestamp NULL,
	"DataUltimaModifica" Timestamp NULL
);
