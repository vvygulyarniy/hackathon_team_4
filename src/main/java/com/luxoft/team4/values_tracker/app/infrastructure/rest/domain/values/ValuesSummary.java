package com.luxoft.team4.values_tracker.app.infrastructure.rest.domain.values;

import com.luxoft.team4.values_tracker.app.logic.domain.CompanyValue;
import com.luxoft.team4.values_tracker.app.logic.domain.ValuePoints;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

/**
 * Created by vadim.vygulyarniy on 25.11.2016.
 */
@Data
@Builder
public final class ValuesSummary {
	@Singular
	private final List<ValuePoints> values;

	public ValuePoints statisticFor(CompanyValue companyValue) {
		return values.stream()
				.filter(value -> value.getValue() == companyValue)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Company value " + companyValue + " not found"));
	}
}
