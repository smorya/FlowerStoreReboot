package com.user.lab9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController()
@RequestMapping(path = "/api/v1/")
public class Lab9Application {

	public String hello(){
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(Lab9Application.class, args);
	}

}
