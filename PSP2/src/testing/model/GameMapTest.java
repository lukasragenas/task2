package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameMapTest {

    @Test
    public void isWallTest() {
        GameMap gameMap = new GameMap();
        assertEquals(true, gameMap.isWall(3, 18));
    }
}