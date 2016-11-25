package com.luxoft.team4.values_tracker.app.logic.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.EnumType.STRING;

/**
 * Created by vadim.vygulyarniy
 */
@Entity
@Table(name = "value_points")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValuePoints {
	@Id
	@Column(name = "value")
	@Enumerated(STRING)
	private CompanyValue value;
	@Column(name = "points")
	private Long points;
}
