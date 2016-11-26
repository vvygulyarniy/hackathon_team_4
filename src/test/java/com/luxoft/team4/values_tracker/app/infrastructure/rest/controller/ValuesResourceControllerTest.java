package com.luxoft.team4.values_tracker.app.infrastructure.rest.controller;

import com.luxoft.team4.values_tracker.app.infrastructure.persistence.CompanyValueRepo;
import com.luxoft.team4.values_tracker.app.infrastructure.persistence.EmployeeRepo;
import com.luxoft.team4.values_tracker.app.infrastructure.rest.domain.values.ValuesSummary;
import com.luxoft.team4.values_tracker.app.logic.domain.ValuePoints;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.luxoft.team4.values_tracker.app.logic.domain.CompanyValue.AGILITY;
import static com.luxoft.team4.values_tracker.app.logic.domain.CompanyValue.FUN;
import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.when;

/**
 * Created by vadim.vygulyarniy
 */
public class ValuesResourceControllerTest {
	@Mock
	private CompanyValueRepo repo;
	@Mock
	private EmployeeRepo employeeRepo;

	private ValuesResourceController ctrl;

	@BeforeTest
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		ctrl = new ValuesResourceController(repo, employeeRepo);
	}

	@Test
	public void shouldGetPointsForParticularValueFromRepository() throws Exception {
		when(repo.findAll()).thenReturn(asList(new ValuePoints(FUN, 100500L), new ValuePoints(AGILITY, 1L)));

		ValuesSummary summary = ctrl.getSummary();

		assertThat(summary.statisticFor(FUN).getPoints()).isEqualTo(100500L);
		assertThat(summary.statisticFor(AGILITY).getPoints()).isEqualTo(1L);

	}
}
