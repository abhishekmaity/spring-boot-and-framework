package com.in.abhishek.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1: Launch a Spring Context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//3: Retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address"));
			System.out.println(context.getBean(Address.class));
			
			//4: List all @Beans managed by Spring Framework
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
		//2: Configure the things that we want the Spring to manage 
		//HelloWorldConfiguration - @Configuration
		//name - @Bean


	}

}
