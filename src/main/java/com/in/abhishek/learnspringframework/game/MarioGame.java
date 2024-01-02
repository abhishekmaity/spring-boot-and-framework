package com.in.abhishek.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{
		
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Go into a hole");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("Accelerate");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
