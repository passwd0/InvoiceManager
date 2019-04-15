package invoicemanager.ui.fatturazione.converter;

import invoicemanager.model.fatturazione.ArticoloMagazzino;
import javafx.util.StringConverter;

public class ArticoloMagazzinoConverter extends StringConverter<ArticoloMagazzino> {

	@Override
	public String toString(ArticoloMagazzino object) {
		return object == null ? null : object.getCodiceArticolo();
	}

	@Override
	public ArticoloMagazzino fromString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
