package com.java.bluma.kd2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.java.bluma.kd2")
@ComponentScan(basePackages = "com.java.*")
public class Kd2Application {

	public static void main(String[] args) {
		SpringApplication.run(Kd2Application.class, args);
	}

}
