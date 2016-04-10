package dev.codenmore.tilegame.entities.statics;

import dev.codenmore.tilegame.Handler;
import dev.codenmore.tilegame.gfx.Assets;
import dev.codenmore.tilegame.tiles.Tile;

import java.awt.*;

public class Tree extends StaticEntity{

    public Tree(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.tree, (int) (x - handler.getGameCamera().getxOffset()),
                                 (int) (y - handler.getGameCamera().getyOffset()), null);
    }
}
