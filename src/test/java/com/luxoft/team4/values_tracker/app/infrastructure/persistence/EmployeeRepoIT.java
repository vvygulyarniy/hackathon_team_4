package com.luxoft.team4.values_tracker.app.infrastructure.persistence;

import com.luxoft.team4.values_tracker.app.infrastructure.config.PersistenceConfig;
import com.luxoft.team4.values_tracker.app.logic.domain.EmployeePoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by vadim.vygulyarniy
 */
@ContextConfiguration(classes = PersistenceConfig.class)
public class EmployeeRepoIT extends AbstractTestNGSpringContextTests {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Test
	public void shouldGivePointsForUserById() throws Exception {
		EmployeePoints employeePoints = employeeRepo.getEmployeePoints(1L);
		assertThat(employeePoints.getTotalPoints()).isEqualTo(10L);
	}
}