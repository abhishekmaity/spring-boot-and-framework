package com.in.abhishek.learnspringframework.game;

public class SuperContraGame implements GamingConsole{
		
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Doge");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("Fire");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

