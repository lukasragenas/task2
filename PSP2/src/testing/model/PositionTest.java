package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    @Test
    public void positionTest() {
        Position position = new Position(0, 0);
        assertEquals(1, position.positionKey());
    }
}