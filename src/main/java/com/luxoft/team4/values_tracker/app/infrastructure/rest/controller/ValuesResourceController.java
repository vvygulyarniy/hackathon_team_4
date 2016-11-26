package com.luxoft.team4.values_tracker.app.infrastructure.rest.controller;

import com.luxoft.team4.values_tracker.app.infrastructure.persistence.CompanyValueRepo;
import com.luxoft.team4.values_tracker.app.infrastructure.persistence.EmployeeRepo;
import com.luxoft.team4.values_tracker.app.infrastructure.rest.domain.values.ValuesSummary;
import com.luxoft.team4.values_tracker.app.logic.domain.CompanyValue;
import com.luxoft.team4.values_tracker.app.logic.domain.EmployeePoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by vadim.vygulyarniy
 */
@RestController
@RequestMapping("/values")
public final class ValuesResourceController {
	private final CompanyValueRepo companyValueRepo;
	private final EmployeeRepo employeeRepo;

	@Autowired
	public ValuesResourceController(final CompanyValueRepo companyValueRepo, EmployeeRepo employeeRepo) {
		this.companyValueRepo = companyValueRepo;
		this.employeeRepo = employeeRepo;
	}

	@RequestMapping(method = GET)
	public ValuesSummary getSummary() {
		return ValuesSummary.builder()
							.values(companyValueRepo.findAll())
							.build();
	}

	@RequestMapping(value = "/{value}/top/participants", method = GET)
	public List<EmployeePoints> getTopParticipants(@PathVariable CompanyValue value) {
		return employeeRepo.getTopEmployeesByCompanyValue(value, new PageRequest(0, 10));
	}
}
