package com.tavant.accountmicroserviceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountMicroserviceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroserviceServerApplication.class, args);
	}

}
