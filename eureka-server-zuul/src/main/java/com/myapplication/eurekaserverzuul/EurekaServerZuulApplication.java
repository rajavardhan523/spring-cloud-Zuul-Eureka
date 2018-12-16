package com.myapplication.eurekaserverzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaServer
@EnableZuulProxy
@SpringBootApplication
public class EurekaServerZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerZuulApplication.class, args);
	}

}

