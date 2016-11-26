package com.luxoft.team4.values_tracker.app.logic.domain;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.EnumType.STRING;

/**
 * Created by vadim.vygulyarniy
 */
@Entity
@Table(name = "organizer_points")
@Data
public class OrganizerPoints {
	@Id
	@Column(name = "employee_id")
	private Long employeeId;
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	@Column(name = "company_value")
	@Enumerated(STRING)
	private CompanyValue companyValue;
	@Column(name = "total_points")
	private Long totalPoints;
}
