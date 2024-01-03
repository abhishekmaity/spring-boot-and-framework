package com.in.abhishek.learnspringframework.examples.a4;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in.abhishek.learnspringframework.game.GameRunner;
import com.in.abhishek.learnspringframework.game.GamingConsole;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Clean up");
	}
}

@Component
class SomeDependency{

	public void getReady() {
		System.out.println("logic using someDependency");
		
	}
	
}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}

}
