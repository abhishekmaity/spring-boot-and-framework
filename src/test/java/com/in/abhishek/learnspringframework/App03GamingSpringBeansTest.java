package com.in.abhishek.learnspringframework;

import com.in.abhishek.learnspringframework.game.GameRunner;
import com.in.abhishek.learnspringframework.game.GamingConsole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


@SpringBootTest(classes = GamingConfiguration.class)
@Import(GamingConfiguration.class)
class App03GamingSpringBeansTest {

    @Autowired
    private GamingConsole gamingConsole;

    @Autowired
    private GameRunner gameRunner;

    @Test
    void testGamingConsoleUp() {
        gamingConsole.up();
        // Add assertions or verifications based on the expected behavior of the GamingConsole
    }

    @Test
    void testGameRunnerRun() {
        // Create a mock GamingConsole
        GamingConsole mockGamingConsole = mock(GamingConsole.class);
        // Set the mock GamingConsole to be used by the GameRunner
        gameRunner.setGamingConsole(mockGamingConsole);

        // Run the game
        gameRunner.run();
    }
}
