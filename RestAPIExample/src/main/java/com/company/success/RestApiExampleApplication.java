package com.company.success;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot")
public class RestApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiExampleApplication.class, args);
	}

}
