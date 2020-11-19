package com.github.onelineoff.treedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Driver {
	private static final Logger log = LoggerFactory.getLogger(Driver.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Driver.class, args);
	}
	
	public void print()  {
		log.info("Driver created");
	}
}
