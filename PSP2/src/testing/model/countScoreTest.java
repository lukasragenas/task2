package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class countScoreTest {

    GameMap gameMap = new GameMap();
    Bird bird = new Bird(new Position(10, 8));
    GameLevel gameLevel = new GameLevel(gameMap, bird);

    @Test
    public void countScore() {
        GameRules gameRules = new GameRules(gameLevel);
        assertEquals(1, gameRules.countScoreNumber(10));
    }
}