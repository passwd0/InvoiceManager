package invoicemanager.ui.converter;

import invoicemanager.model.IndirizzoGeografico;
import javafx.util.StringConverter;

public class CodiceSpedizioneConverter extends StringConverter<IndirizzoGeografico> {

	@Override
	public IndirizzoGeografico fromString(String indirizzoGeografico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString(IndirizzoGeografico indirizzoGeografico) {
		return indirizzoGeografico == null ? null : indirizzoGeografico.getCodiceIndirizzo();
	}
}
