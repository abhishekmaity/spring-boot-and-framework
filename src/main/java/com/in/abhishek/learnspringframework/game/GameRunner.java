package com.in.abhishek.learnspringframework.game;

public class GameRunner {
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " +game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

	public void setGamingConsole(GamingConsole mockGamingConsole) {
		// TODO Auto-generated method stub
		
	}

}
