package invoicemanager.ui.converter;

import invoicemanager.model.IndirizzoGeografico;
import javafx.util.StringConverter;

public class LocalitaSpedizioneConverter extends StringConverter<IndirizzoGeografico> {

	@Override
	public String toString(IndirizzoGeografico object) {
		return object == null ? null : object.getCitta();
	}

	@Override
	public IndirizzoGeografico fromString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
