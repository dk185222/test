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

/**
 * test 
 *IdentityServiceRest.java
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class IdentityServiceRest {

	@GetMapping(value = "/info")
	public ResponseEntity<String> getInfo() {
		return new ResponseEntity<>("test triger 0001..!", HttpStatus.OK);
	}

}
