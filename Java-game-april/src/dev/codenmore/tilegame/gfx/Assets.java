package dev.codenmore.tilegame.gfx;

import javafx.scene.image.Image;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 24, height = 26;

    public static BufferedImage playerRight, playerFace, playerLeft, playerBack, secondPlayer;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
        playerRight = sheet.crop(0, 0, width, height);
        playerFace = sheet.crop(width, 0, width, height);
        playerLeft = sheet.crop(width * 2, 0, width, height);
        playerBack = sheet.crop(width * 3, 0, width, height);
        secondPlayer = sheet.crop(0, height, width, height);
    }
}
