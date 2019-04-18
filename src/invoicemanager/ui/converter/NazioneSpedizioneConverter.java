package invoicemanager.ui.converter;

import invoicemanager.model.IndirizzoGeografico;
import javafx.util.StringConverter;

public class NazioneSpedizioneConverter  extends StringConverter<IndirizzoGeografico> {

	@Override
	public String toString(IndirizzoGeografico object) {
		return object == null ? null : object.getCodiceNazione();
	}

	@Override
	public IndirizzoGeografico fromString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
