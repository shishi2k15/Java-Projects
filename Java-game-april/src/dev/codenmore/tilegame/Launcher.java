package dev.codenmore.tilegame;

public class Launcher{
    public static void main(String[] args) {
        Game game = new Game("Tiles", 640, 360);
        game.start();
    }
}
