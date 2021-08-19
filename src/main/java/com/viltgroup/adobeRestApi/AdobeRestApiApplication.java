package com.viltgroup.adobeRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.viltgroup.adobeRestApi.controller")
public class AdobeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdobeRestApiApplication.class, args);
	}

}
