package com.ubl.student_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {
SecurityAutoConfiguration.class })
@EnableJpaRepositories("com.ubl.student_web.repository")
@ComponentScan({
	"com.ubl.student_web.repository",
	"com.ubl.student_web.service",
	"com.ubl.student_web.rest",
	"com.ubl.student_web.domain",
})
public class StudentWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentWebApplication.class, args);
	}


}
