package com.luxoft.team4.values_tracker.app.logic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * Created by vadim.vygulyarniy
 */
@Entity
@Table(name = "employee")
public final class Employee {
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "employed_since")
	private LocalDate employedSince;
}
