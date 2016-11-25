package com.luxoft.team4.values_tracker.app;

import com.luxoft.team4.values_tracker.app.infrastructure.config.AppConfig;
import org.springframework.boot.SpringApplication;

public class Launcher {

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}
}
