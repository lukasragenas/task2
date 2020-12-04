package model;

import java.io.IOException;

public class ConsoleWindow {
    private boolean gameQuit = false;


    public static void clearConsole() {
        for (int i = 0; i < 100; i++)
            System.out.println("\b");
    }

    public static void printMenu() {
        System.out.println("MAIN MENU");
        System.out.println("=========");
        System.out.println("Press 'p' to play");
        System.out.println("Press 'q' to quit");
    }

    public static int readUserInput() throws IOException {
        return System.in.read();
    }

    public boolean isGameQuit() {
        return gameQuit;
    }

    public void setGameQuit(boolean gameQuit) {
        this.gameQuit = gameQuit;
    }
}
