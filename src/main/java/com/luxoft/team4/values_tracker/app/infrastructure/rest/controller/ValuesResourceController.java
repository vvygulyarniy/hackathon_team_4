package com.luxoft.team4.values_tracker.app.infrastructure.rest.controller;

import com.luxoft.team4.values_tracker.app.infrastructure.persistence.CompanyValueRepo;
import com.luxoft.team4.values_tracker.app.infrastructure.rest.domain.values.ValueTopResponse;
import com.luxoft.team4.values_tracker.app.infrastructure.rest.domain.values.ValuesSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by vadim.vygulyarniy
 */
@RestController
@RequestMapping("/values")
public final class ValuesResourceController {
	private final CompanyValueRepo repo;

	@Autowired
	public ValuesResourceController(final CompanyValueRepo repo) {
		this.repo = repo;
	}

	@RequestMapping(method = GET)
	public ValuesSummary getSummary() {
		return ValuesSummary.builder()
				.values(repo.findAll())
				.build();
	}

	@RequestMapping(value = "/{value}/top/participants", method = GET)
	public ValueTopResponse getTopParticipants() {
		return null;
	}
}
