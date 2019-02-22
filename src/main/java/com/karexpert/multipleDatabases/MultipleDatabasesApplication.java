package com.karexpert.multipleDatabases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.karexpert.multipleDatabases"})
public class MultipleDatabasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleDatabasesApplication.class, args);
	}

}
