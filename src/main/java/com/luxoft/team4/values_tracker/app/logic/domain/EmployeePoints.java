package com.luxoft.team4.values_tracker.app.logic.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by vadim.vygulyarniy
 */
@Entity
@Table(name = "employee_points")
@Data
public class EmployeePoints {
	@Id
	@Column(name = "employee_id")
	private Long employeeId;
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	@Column(name = "total_points")
	private Long totalPoints;
}
