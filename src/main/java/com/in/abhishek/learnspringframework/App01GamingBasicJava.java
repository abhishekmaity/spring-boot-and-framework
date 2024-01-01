package com.in.abhishek.learnspringframework;

import com.in.abhishek.learnspringframework.game.GameRunner;
import com.in.abhishek.learnspringframework.game.MarioGame;
import com.in.abhishek.learnspringframework.game.PacManGame;
import com.in.abhishek.learnspringframework.game.SuperContraGame;

@SuppressWarnings("unused")
public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		
		var game = new PacManGame();             //1: Object Creation     
		var gameRunner = new GameRunner(game);   //2: Object Creation + Wiring of Dependencies
												 //   Here Game is a dependency of GameeRunner
		gameRunner.run();

	}

}
