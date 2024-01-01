package com.in.abhishek.learnspringframework;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in.abhishek.learnspringframework.game.GameRunner;
import com.in.abhishek.learnspringframework.game.GamingConsole;

class GamingConfigurationTest {

    @Test
    void testGameBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        GamingConsole game = context.getBean(GamingConsole.class);
        assertNotNull(game, "Game bean should not be null");
        // Add more assertions or test specific behaviors if needed
    }

    @Test
    void testGameRunnerBean() {
        GamingConsole mockGame = mock(GamingConsole.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        GameRunner gameRunner = context.getBean(GameRunner.class, mockGame);
        assertNotNull(gameRunner, "GameRunner bean should not be null");
        // Add more assertions or test specific behaviors if needed
    }
}
