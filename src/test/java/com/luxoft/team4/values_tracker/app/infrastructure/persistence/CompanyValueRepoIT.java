package com.luxoft.team4.values_tracker.app.infrastructure.persistence;

import com.luxoft.team4.values_tracker.app.infrastructure.config.PersistenceConfig;
import com.luxoft.team4.values_tracker.app.logic.domain.CompanyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by vadim.vygulyarniy
 */
@ContextConfiguration(classes = PersistenceConfig.class)
public class CompanyValueRepoIT extends AbstractTestNGSpringContextTests {
	@Autowired
	private CompanyValueRepo repo;

	@Test
	public void repositoryShouldGiveStatsForAllTheCompanyValues() throws Exception {
		assertThat(repo.findAll()).hasSize(CompanyValue.values().length);
	}

}