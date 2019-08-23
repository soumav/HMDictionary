package com.hmdict.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.hmdict.*")
public class HMDictionaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HMDictionaryApplication.class, args);
	}

}
