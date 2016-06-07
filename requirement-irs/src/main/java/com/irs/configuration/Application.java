package com.irs.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.irs.configuration", 
		"com.irs.controller", 
		"com.irs.service",
		"com.irs.entity"})
@EnableJpaRepositories(value = {"com.irs.entity", "com.irs.repository"})
@Configuration
public class Application {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		
	}
	
	
/*
 * http://kielczewski.eu/2014/04/spring-boot-mvc-application/
 */
	

}