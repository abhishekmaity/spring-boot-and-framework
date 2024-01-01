package com.in.abhishek.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in.abhishek.learnspringframework.game.GameRunner;
import com.in.abhishek.learnspringframework.game.GamingConsole;
import com.in.abhishek.learnspringframework.game.PacManGame;


@Configuration
public class GamingConfiguration {

    @Bean
    GamingConsole game() {
		var game = new PacManGame();
		return game;
		}
    
    @Bean
    GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
		}

}
