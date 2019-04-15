package invoicemanager.ui.fatturazione.converter;

import invoicemanager.model.fatturazione.Magazzino;
import javafx.util.StringConverter;

public class MagazzinoConverter extends StringConverter<Magazzino> {

	@Override
	public String toString(Magazzino object) {
		return object == null ? null : object.getCodiceMagazzino();
	}

	@Override
	public Magazzino fromString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
