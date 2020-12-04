package model;

public class GameRenderer {

    public void createNewMap(GameMap gameMap, GameMap gameMap2) {
        for (int i = 0; i < gameMap2.MAP.length; i++) {
            for (int j = 0; j < gameMap2.MAP[0].length; j++) {
                gameMap.MAP[i][j] = gameMap2.MAP[i][j];
            }
        }
    }

    public void moveMap(GameMap gameMap, int difficulty) {

        for (int row = 0; row < gameMap.MAP.length; row++) {
            int rowLength = gameMap.MAP[row].length;

            difficulty = difficulty % rowLength;

            int[] tmp = new int[difficulty];
            for (int i = 0; i < difficulty; i++) {
                tmp[i] = gameMap.MAP[row][i];
            }

            for (int col = 0; col < rowLength - difficulty; col++) {
                gameMap.MAP[row][col] = gameMap.MAP[row][col + difficulty];
            }

            for (int i = 0; i < difficulty; i++) {
                gameMap.MAP[row][i + (rowLength - difficulty)] = tmp[i];
            }
        }
    }

    public void printMap(GameLevel gameLevel) {
        for (int i = 0; i < gameLevel.getGameMap().MAP[0].length; i++) {
            System.out.print('=');
        }
        for (int y = 0; y < gameLevel.getGameMap().width(); y++) {
            for (int x = 0; x < gameLevel.getGameMap().height(); x++) {
                if (gameLevel.getBird().getPosition().at(x, y)) {
                    System.out.print('B');
                } else if (gameLevel.getGameMap().isBlank(y, x))
                    System.out.print(' ');
                else if (gameLevel.getGameMap().isWall(y, x))
                    System.out.print('#');
            }
            System.out.println();
        }
        for (int i = 0; i < gameLevel.getGameMap().MAP[0].length; i++) {
            System.out.print('=');
        }
        System.out.println();
    }
}
