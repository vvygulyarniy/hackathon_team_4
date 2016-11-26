package com.luxoft.team4.values_tracker.app.infrastructure.persistence;

import com.luxoft.team4.values_tracker.app.infrastructure.config.PersistenceConfig;
import com.luxoft.team4.values_tracker.app.logic.domain.EmployeePoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;

import static com.luxoft.team4.values_tracker.app.logic.domain.CompanyValue.FUN;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by vadim.vygulyarniy
 */
@ContextConfiguration(classes = PersistenceConfig.class)
public class EmployeeRepoIT extends AbstractTestNGSpringContextTests {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Test
	public void shouldGetTop10EmployeesByValue() throws Exception {
		List<EmployeePoints> topEmployees = employeeRepo.getTopEmployeesByCompanyValue(FUN,
																					   new PageRequest(0, 10));

		System.err.println(topEmployees);
		assertThat(topEmployees).isNotEmpty();
	}

	@Test
	public void shouldGetTop10OrganizersByValue() throws Exception {
		List<EmployeePoints> top = employeeRepo.getTopOrganizersByCompanyValue(FUN,
																			   new PageRequest(0, 10));

		System.err.println(top);
		assertThat(top).isNotEmpty();
	}

}
