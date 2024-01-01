package com.in.abhishek.learnspringframework;

import com.in.abhishek.learnspringframework.game.GameRunner;
import com.in.abhishek.learnspringframework.game.PacManGame;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class App01GamingBasicJavaTest {

    @Test
    void testGameRunner() {
        // Create a mock instance of the PacManGame
        PacManGame mockGame = mock(PacManGame.class);

        // Create the GameRunner with the mock game
        GameRunner gameRunner = new GameRunner(mockGame);

        // Run the game
        gameRunner.run();

    }
}
