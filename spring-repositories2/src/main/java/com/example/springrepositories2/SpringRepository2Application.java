package com.example.springrepositories2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class SpringRepository2Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringRepository2Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "5050"));
		app.run(args);
	}

}
