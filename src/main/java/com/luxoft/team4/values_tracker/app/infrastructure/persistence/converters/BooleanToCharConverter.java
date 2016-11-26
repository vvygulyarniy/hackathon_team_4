package com.luxoft.team4.values_tracker.app.infrastructure.persistence.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public final class BooleanToCharConverter implements AttributeConverter<Boolean, Character> {

	@Override
	public Character convertToDatabaseColumn(Boolean aBoolean) {
		return aBoolean ? 'Y' : null;
	}

	@Override
	public Boolean convertToEntityAttribute(Character character) {
		return character != null;
	}
}
