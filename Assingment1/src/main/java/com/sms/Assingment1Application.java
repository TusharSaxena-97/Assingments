package com.sms;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Assingment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assingment1Application.class, args);
	}
	
	 @Bean
	    public CommandLineRunner run(ApplicationContext appContext) {
	        return args -> {

	            String[] beans =  appContext.getBeanDefinitionNames();
	            Arrays.stream(beans).sorted().forEach(System.out::println);

	        };
	    }

	}