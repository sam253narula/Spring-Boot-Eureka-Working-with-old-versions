package com.ofss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceDiscoveryServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceDiscoveryServiceServerApplication.class, args);
	}

}
