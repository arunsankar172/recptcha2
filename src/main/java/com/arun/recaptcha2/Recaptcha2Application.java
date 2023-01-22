package com.arun.recaptcha2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.arun"})
public class Recaptcha2Application {

	public static void main(String[] args) {
		SpringApplication.run(Recaptcha2Application.class, args);
	}

}
