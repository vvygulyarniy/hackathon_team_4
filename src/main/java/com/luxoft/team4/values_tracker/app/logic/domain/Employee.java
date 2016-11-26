package com.luxoft.team4.values_tracker.app.logic.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by vadim.vygulyarniy
 */
@Entity
@Table(name = "employee")
@Data
public class Employee implements Serializable {
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
