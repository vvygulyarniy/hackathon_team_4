package com.luxoft.team4.values_tracker.app.logic.domain;

import com.luxoft.team4.values_tracker.app.infrastructure.persistence.converters.BooleanToStringConverter;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "activity_employee")
@Data
public final class ActivityEmployee {
	@Id
	@Column(name = "id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "activity_id")
	private Activity activity;
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	@Column(name = "points")
	private Long points;
	@Convert(converter = BooleanToStringConverter.class)
	@Column(name = "is_organizer")
	private Boolean organizer;
	@Convert(converter = BooleanToStringConverter.class)
	@Column(name = "approved")
	private Boolean approved;
}
