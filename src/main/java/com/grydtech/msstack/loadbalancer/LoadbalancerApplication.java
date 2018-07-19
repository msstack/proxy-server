package com.grydtech.msstack.loadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class LoadbalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadbalancerApplication.class, args);
	}
}
