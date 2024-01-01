package com.in.abhishek.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    String name() {
		return "Abhishek";
	}
    
    @Bean
    int age() {
		return 30;
	}
    
    @Bean
    Person person() {
    	return new Person("Aman", 35, new Address("Fort", "Mumbai"));
    }
    
    @Bean
    Address address() {
    	return new Address("Juhu", "Mumbai");
    }
    
    @Bean(name="address2")
    @Primary
    Address address2() {
    	return new Address("Colaba", "Mumbai");
    }
    
    @Bean(name="address3")
    Address address3() {
    	return new Address("Worli", "Mumbai");
    }
}
