
package com.course.practicaljava.api.server;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestAPI {

	private Logger LOG = (Logger) LoggerFactory.getLogger(DefaultRestAPI.class);

	@GetMapping(value = "/welcome")
	public String welcome() {
		// System.out.println(StringUtils.join("Hi", " this is", " spring boot ", "REST
		// API"));
		LOG.info(StringUtils.join("Hi", " this is", " spring boot ", "REST API"));

		return " Welcome Spring Boot";
	}

	@GetMapping(value = "/time")
	public String time() {
		return LocalTime.now().toString();
	}

}
