package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@SpringBootApplication
public class RestapiApplication {

	@Bean
	public RestTemplate createRestTemplate(){
		return new RestTemplateBuilder().build();
	}

	@Bean
	public Random createRandom(){
		return new Random();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx
				= SpringApplication.run(RestapiApplication.class, args);

//		GenerateService service = ctx.getBean(GenerateService.class);
//		System.out.println("====>" + service.getId());
	}

}