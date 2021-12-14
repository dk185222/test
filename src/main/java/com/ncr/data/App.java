package com.ncr.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

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
}
