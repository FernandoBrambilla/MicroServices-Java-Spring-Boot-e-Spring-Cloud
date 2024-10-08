package com.br_sistemas.hr_api_gateway_zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class HrApiGatewayZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewayZullApplication.class, args);
	}

}
