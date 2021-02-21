package com.springboot.automation.springbootautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.springboot.automation.springbootautomation")
@EnableJpaRepositories("com.springboot.automation.springbootautomation.persistence.repo")
@EntityScan("com.springboot.automation.springbootautomation.persistence.model")
public class RestApiAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiAutomationApplication.class, args);
	}

}
