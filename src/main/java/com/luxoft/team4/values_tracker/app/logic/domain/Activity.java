package com.luxoft.team4.values_tracker.app.logic.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.EnumType.STRING;

/**
 * Created by vadim.vygulyarniy
 */
@Entity
@Table(name = "company_activity")
@Data
public class Activity {
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "company_value")
	@Enumerated(STRING)
	private CompanyValue companyValue;
	@Column(name = "activity_type")
	private String activityType;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "start_date")
	private LocalDateTime startDate;
	@Column(name = "finish_date")
	private LocalDateTime finishDate;
	@Column(name = "available_for_group")
	private Long availableForGroup;
	@ManyToOne
	@JoinColumn(name = "organizer_id")
	private Employee organizer;
}
