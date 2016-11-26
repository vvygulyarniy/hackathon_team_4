package com.luxoft.team4.values_tracker.app.infrastructure.persistence;

import com.luxoft.team4.values_tracker.app.infrastructure.config.PersistenceConfig;
import com.luxoft.team4.values_tracker.app.logic.domain.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by vadim.vygulyarniy. 25.11.2016.
 */

@ContextConfiguration(classes = PersistenceConfig.class)
public class ActivityRepoIT extends AbstractTestNGSpringContextTests {

	@Autowired
	private ActivityRepo repo;

	@Test
	public void shouldGiveActivityById() throws Exception {
		Activity activity = repo.findOne(1L);
		assertThat(activity.getId()).isEqualTo(1L);
	}
}
