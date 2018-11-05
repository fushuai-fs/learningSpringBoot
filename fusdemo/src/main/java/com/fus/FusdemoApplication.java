package com.fus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class FusdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FusdemoApplication.class, args);
	}
}
