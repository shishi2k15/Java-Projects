package dev.codenmore.tilegame.gfx;

import javafx.scene.image.Image;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 24, height = 26;

    public static BufferedImage  grass, tree, stone, dirt;
    public static BufferedImage[]  player_up, player_down, player_left, player_right;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
        //player
        player_down = new BufferedImage[2];
        player_up = new BufferedImage[2];
        player_right = new BufferedImage[2];
        player_left = new BufferedImage[2];

        player_down[0] = sheet.crop(width * 4, 0, width, height);
        player_down[1] = sheet.crop(width * 5, 0, width, height);

        player_up[0] = sheet.crop(width * 6, 0, width, height);
        player_up[1] = sheet.crop(width * 7, 0, width, height);

        player_right[0] = sheet.crop(width * 4, height, width, height);
        player_right[1] = sheet.crop(width * 5, height, width, height);

        player_left[0] = sheet.crop(width * 6, height, width, height);
        player_left[1] = sheet.crop(width * 7, height, width, height);


        //world
        grass = sheet.crop(0, height, width, height);
        tree = sheet.crop(width, height, width, height);
        stone = sheet.crop(width * 2, height, width, height);
        dirt = sheet.crop(width * 3, height, width, height);
    }
}
