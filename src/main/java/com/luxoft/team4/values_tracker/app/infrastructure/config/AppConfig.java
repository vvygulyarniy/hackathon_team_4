package com.luxoft.team4.values_tracker.app.infrastructure.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by vadim.vygulyarniy
 */
@Configuration
@EnableAutoConfiguration(exclude = {
		SecurityAutoConfiguration.class,
		JpaRepositoriesAutoConfiguration.class
})
@ComponentScan(basePackages = "com.luxoft.team4.values_tracker.app.infrastructure.rest.controller")
@Import(PersistenceConfig.class)
public class AppConfig {

}
