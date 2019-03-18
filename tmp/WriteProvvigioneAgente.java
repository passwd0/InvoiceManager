Create table public.ProvvigioneAgente (
	"CodiceProvvigione" varchar(25) NULL,
	"CodiceAgente" varchar(25) NULL,
	"ScontoLegatoProvvigione" Float NULL,
	"ProvvigioneLegataSconto" Float NULL,
	"Progressivo" INTEGER NULL,
	"CodiceGruppoMerceologico" varchar(25) NULL,
	"DataInserimento" Timestamp NULL,
	"DataUltimaModifica" Timestamp NULL,
);
