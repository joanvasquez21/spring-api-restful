package com.joan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:messages.properties")
public class SpringsecurityJoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityJoanApplication.class, args);
	}

}
