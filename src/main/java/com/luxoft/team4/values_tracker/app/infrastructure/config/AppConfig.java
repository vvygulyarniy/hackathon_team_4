package com.luxoft.team4.values_tracker.app.infrastructure.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;

/**
 * Created by vadim.vygulyarniy
 */
@Configuration
@EnableAutoConfiguration(exclude = {
		SecurityAutoConfiguration.class,
		JpaRepositoriesAutoConfiguration.class
})
@ComponentScan(basePackages = {"com.luxoft.team4.values_tracker.app.infrastructure.rest.controller",
		"com.luxoft.team4.values_tracker.app.infrastructure.controller."
})
@Import(PersistenceConfig.class)
public class AppConfig {
	@Bean
	@Primary
	public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
		ObjectMapper objectMapper = builder.createXmlMapper(false).build();
		objectMapper.registerModule(new JavaTimeModule());
		objectMapper.configure(WRITE_DATES_AS_TIMESTAMPS, false);
		return objectMapper;
	}
}
