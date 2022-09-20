package com.ajpl.cop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CopOrNotApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CopOrNotApiApplication.class, args);
	}

}
