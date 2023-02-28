package com.reset.dylala.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DylalaApplication {

	@GetMapping("/appwork")
	public String message() {
		return "application working";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DylalaApplication.class, args);
	}

}
