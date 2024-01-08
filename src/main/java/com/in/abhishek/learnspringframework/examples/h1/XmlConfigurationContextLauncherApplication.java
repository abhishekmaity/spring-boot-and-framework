package com.in.abhishek.learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {
		
		try (var context = 
				new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			System.out.println(context.getBean("name"));
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}

}
