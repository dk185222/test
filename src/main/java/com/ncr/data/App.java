package com.ncr.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import io.micrometer.core.instrument.MeterRegistry;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "application-base-package", "com.ncr.data" })
@EnableAsync
public class App {
	public static void main(final String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	MeterRegistryCustomizer meterRegistryCustomizer(MeterRegistry meterRegistry) {
		return meterRegistry1 -> {
			meterRegistry.config().commonTags("application", "micrometer-monitoring-example");
		};
	}
}
