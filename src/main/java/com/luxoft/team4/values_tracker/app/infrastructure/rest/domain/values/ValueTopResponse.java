package com.luxoft.team4.values_tracker.app.infrastructure.rest.domain.values;

import com.luxoft.team4.values_tracker.app.logic.domain.Employee;
import lombok.Data;

/**
 * Created by vadim.vygulyarniy
 */
@Data
public final class ValueTopResponse {
	private final Employee employee;
	private final Long points;
}
