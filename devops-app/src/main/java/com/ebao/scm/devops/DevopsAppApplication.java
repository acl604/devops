package com.ebao.scm.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsAppApplication.class, args);
	}

	@RequestMapping("/")
	private String index(String name) {
		return  "Time,Hello Spring Boot!";
	}

}
