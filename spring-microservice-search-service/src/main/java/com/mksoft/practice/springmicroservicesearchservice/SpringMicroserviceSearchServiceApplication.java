package com.mksoft.practice.springmicroservicesearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringMicroserviceSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceSearchServiceApplication.class, args);
	}

}
