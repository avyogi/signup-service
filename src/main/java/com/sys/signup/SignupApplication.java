package com.sys.signup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SignupApplication {

	public static void main(String[] args) {
		System.out.println("start main");
		SpringApplication.run(SignupApplication.class, args);
		System.out.println("end main");
	}

}
