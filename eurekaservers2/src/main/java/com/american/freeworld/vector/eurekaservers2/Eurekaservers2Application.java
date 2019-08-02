package com.american.freeworld.vector.eurekaservers2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekaservers2Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaservers2Application.class, args);
	}

}
