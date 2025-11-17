package com.cihankrhsn.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"com.cihankrhsn"})
@ComponentScan(basePackages = {"com.cihankrhsn"})
@EnableJpaRepositories(basePackages = {"com.cihankrhsn"})
public class StudentapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentapiApplication.class, args);
	}

}
