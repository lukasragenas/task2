package model;

public class GameLevel {

    GameMap gameMap;
    Bird bird;

    public GameLevel(GameMap gameMap, Bird bird) {
        setGameMap(gameMap);
        setBird(bird);
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }
}
