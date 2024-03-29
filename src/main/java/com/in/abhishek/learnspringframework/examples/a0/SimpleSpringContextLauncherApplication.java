package com.in.abhishek.learnspringframework.examples.a0;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in.abhishek.learnspringframework.game.GameRunner;
import com.in.abhishek.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}

}
