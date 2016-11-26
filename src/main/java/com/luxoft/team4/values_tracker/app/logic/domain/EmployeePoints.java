package com.luxoft.team4.values_tracker.app.logic.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.FetchType.LAZY;

/**
 * Created by vadim.vygulyarniy
 */
@Entity
@Table(name = "employee_points")
@Data
public class EmployeePoints implements Serializable {
	@Id
	@OneToOne(fetch = LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	@Column(name = "total_points")
	private Long totalPoints;

	public EmployeePoints(Employee employee, Long totalPoints) {
		this.employee = employee;
		this.totalPoints = totalPoints;
	}
}
