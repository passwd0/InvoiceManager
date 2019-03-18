Create table public.Percipiente (
	"CodicePercipiente" varchar(25) NULL,
	"Descrizione" varchar(25) NULL,
	"CodiceStato" Boolean NULL,
	"AliquotaRitenutaAcconto" Float NULL,
	"PercentualeImponibileRitenutaAcconto" Float NULL,
	"CodiceTributo" varchar(25) NULL,
	"AssoggettamentoINPS" Boolean NULL,
	"DataInserimento" Timestamp NULL,
	"DataUltimaModifica" Timestamp NULL,
);
