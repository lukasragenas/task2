package model;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Position up() {
        return new Position(x, y - 1);
    }

    public Position down() {
        return new Position(x, y + 1);
    }

    public int positionKey() {
        String up = "w";
        String down = "s";
        int temp = 0;
        if (up.equals("w") || down.equals("s")) {
            temp = temp + 1;
        }
        return temp;
    }

    public boolean at(int x2, int y2) {
        return this.x == x2 && this.y == y2;
    }

}
