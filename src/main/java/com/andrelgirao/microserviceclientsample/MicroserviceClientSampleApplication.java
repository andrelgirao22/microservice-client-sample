package com.andrelgirao.microserviceclientsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceClientSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientSampleApplication.class, args);
	}

}
