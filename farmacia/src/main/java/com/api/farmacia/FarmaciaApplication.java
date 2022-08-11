package com.api.farmacia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FarmaciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmaciaApplication.class, args);
	}

}
