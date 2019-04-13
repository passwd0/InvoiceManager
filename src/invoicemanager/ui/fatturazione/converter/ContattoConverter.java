package invoicemanager.ui.fatturazione.converter;

import invoicemanager.model.fatturazione.Contatto;
import javafx.util.StringConverter;

public class ContattoConverter extends StringConverter<Contatto> {

	@Override
	public Contatto fromString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString(Contatto contatto) {
		return contatto == null ? null : contatto.getDettaglio();
	}

}
