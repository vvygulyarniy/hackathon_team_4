package com.luxoft.team4.values_tracker.app.infrastructure.persistence.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

import static java.util.Optional.ofNullable;

@Converter(autoApply = true)
public final class LocalDateConverter implements AttributeConverter<LocalDate, Date> {
	@Override
	public Date convertToDatabaseColumn(LocalDate localDate) {
		return ofNullable(localDate).map(Date::valueOf).orElse(null);
	}

	@Override
	public LocalDate convertToEntityAttribute(Date date) {
		return ofNullable(date).map(Date::toLocalDate).orElse(null);
	}
}
