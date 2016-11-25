package com.luxoft.team4.values_tracker.app.infrastructure.persistence.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import static java.util.Optional.ofNullable;

@Converter(autoApply = true)
public final class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

	@Override
	public Timestamp convertToDatabaseColumn(LocalDateTime localDateTime) {
		return ofNullable(localDateTime).map(Timestamp::valueOf).orElse(null);
	}

	@Override
	public LocalDateTime convertToEntityAttribute(Timestamp timestamp) {
		return ofNullable(timestamp).map(Timestamp::toLocalDateTime).orElse(null);
	}
}
