package com.in.abhishek.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in.abhishek.learnspringframework.game.GameRunner;
import com.in.abhishek.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.in.abhishek.learnspringframework.game")
public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}

}
