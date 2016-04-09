package dev.codenmore.tilegame.entities.crreatures;

import dev.codenmore.tilegame.Game;
import dev.codenmore.tilegame.gfx.Assets;

import java.awt.*;

public  class Player extends Creature {

    public Player(Game game, float x, float y) {
        super(game, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
    }

    @Override
    public void tick() {
        getInput();
        move();
        game.getGameCamera().centerOnEntity(this);
    }

    private void getInput(){
        xMove = 0;
        yMove = 0;

        if(game.getKeyManager().up){
            yMove = -speed;
        }
        if(game.getKeyManager().down){
            yMove = speed;
        }
        if(game.getKeyManager().left){
            xMove = -speed;
        }
        if(game.getKeyManager().right){
            xMove = speed;
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.playerRight, (int)(x - game.getGameCamera().getxOffset()),
                                        (int)(y - game.getGameCamera().getyOffset()), width, height, null);
    }
}
