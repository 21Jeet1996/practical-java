
package com.course.practicaljava.api.server;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestAPI {

	@GetMapping(value = "/welcome")
	public String welcome() {
		System.out.println(StringUtils.join("Hi", " this is", " spring boot ", "REST API"));
		return " Welcome Spring Boot";
	}

	@GetMapping(value = "/time")
	public String time() {
		return LocalTime.now().toString();
	}

}
