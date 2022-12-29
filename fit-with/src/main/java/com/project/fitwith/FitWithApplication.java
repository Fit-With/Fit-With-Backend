package com.project.fitwith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FitWithApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitWithApplication.class, args);
	}

}
