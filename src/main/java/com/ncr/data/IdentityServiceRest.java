/*
 * File Name            :    IdentityServiceRest.java com.ncr.data.rest
 * Project Title        :    nis-identity-service-impl
 * Copyright            :    Copyright (c) 2018-2019 NCR Corporation
 * Author               :    rg185129
 * Date					:	 Sep 1, 2021
 *
 */
package com.ncr.data;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;

/**
 * test IdentityServiceRest.java
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class IdentityServiceRest {

	@GetMapping(value = "/info")
	@Timed(value = "monitoring.info.request", histogram = true, percentiles = { 0.95, 0.99 }, extraTags = { "version",
			"1.0" })
	public ResponseEntity<String> getInfo() {
		return new ResponseEntity<>("Welcome to test CI/CD sample..!", HttpStatus.OK);
	}

	@GetMapping(value = "/test")
	@Timed(value = "monitoring.test.request", histogram = true, percentiles = { 0.95, 0.99 }, extraTags = { "version",
			"1.0" })
	public ResponseEntity<String> getTest() {
		return new ResponseEntity<>("Welcome to test CI/CD sample..!", HttpStatus.OK);
	}

}
