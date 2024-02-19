package com.microservicios.credito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicioCreditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioCreditoApplication.class, args);
	}

}
