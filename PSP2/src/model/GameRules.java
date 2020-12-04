package model;

public class GameRules {
    private GameLevel level;
    private boolean gameOver = false;

    public GameRules(GameLevel level) {
        this.level = level;
    }

    private static void gameOverInfo() {
        System.out.println("Game Over");
    }

    public void moveBird(int key, Bird bird, GameMap gameMap) {
        switch (key) {
            case 'w':
                if (gameMap.isBlank(bird.getPosition().up())) {
                    bird.setPosition(bird.getPosition().up());
                } else {
                    setGameOver(true);
                    gameOverInfo();
                }
                break;
            case 's':
                if (gameMap.isBlank(bird.getPosition().down())) {
                    bird.setPosition(bird.getPosition().down());
                } else {
                    setGameOver(true);
                    gameOverInfo();
                }
                break;
            case 'e':
                setGameOver(true);
                break;
        }
    }

    public int countScore(int score, Bird bird, GameMap gameMap) {
        if (gameMap.MAP[1][bird.getPosition().getX() - 1] == 1)
            score++;
        System.out.println("Score: " + countScoreNumber(score));
        return score;
    }

    public int countScoreNumber(int score) {
        return (score / 2) / 4;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
