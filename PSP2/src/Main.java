import model.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        GameMap gameMap = new GameMap();
        GameMap gameMapReset = new GameMap();

        ConsoleWindow consoleWindow = new ConsoleWindow();
        Scanner scanner = new Scanner(System.in);
        InfoMessages infoMessages = new InfoMessages();

        infoMessages.enterName();
        String name = scanner.nextLine();
        infoMessages.welcomeInfo();
        infoMessages.playerName(name);
        consoleWindow.printMenu();

        while (!consoleWindow.isGameQuit()) {


            int score = 0;
            int action = consoleWindow.readUserInput();
            switch (action) {
                case 'p':

                    Bird bird = new Bird(new Position(10, 8));
                    GameLevel gameLevel = new GameLevel(gameMap, bird);
                    GameRenderer renderer = new GameRenderer();
                    GameRules gameRules = new GameRules(gameLevel);

                    renderer.printMap(gameLevel);
                    renderer.createNewMap(gameMap, gameMapReset);

                    while (!gameRules.isGameOver()) {

                        renderer.printMap(gameLevel);

                        int key = consoleWindow.readUserInput();

                        gameRules.moveBird(key, bird, gameMap);
                        renderer.moveMap(gameMap, 1);
                        consoleWindow.clearConsole();
                        infoMessages.exitInfo();

                        score = gameRules.countScore(score, bird, gameMap);
                    }

                    consoleWindow.clearConsole();
                    consoleWindow.printMenu();
                    break;

                case 'q':

                    infoMessages.quitInfo();
                    consoleWindow.setGameQuit(true);
                    break;
            }
        }
    }
}
