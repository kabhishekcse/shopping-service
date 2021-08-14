package com.example.retail.ShoppingCartSevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShoppingCartSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartSeviceApplication.class, args);
	}

}
