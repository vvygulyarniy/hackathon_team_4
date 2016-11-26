package com.luxoft.team4.values_tracker.app.infrastructure.persistence.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public final class BooleanToStringConverter implements AttributeConverter<Boolean, String> {
	@Override
	public String convertToDatabaseColumn(Boolean aBoolean) {
		return aBoolean ? "Y" : null;
	}

	@Override
	public Boolean convertToEntityAttribute(String s) {
		return s != null;
	}
}
