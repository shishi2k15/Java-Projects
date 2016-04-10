package dev.codenmore.tilegame.entities.crreatures;

import dev.codenmore.tilegame.Game;
import dev.codenmore.tilegame.Handler;
import dev.codenmore.tilegame.gfx.Animation;
import dev.codenmore.tilegame.gfx.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public  class Player extends Creature {

    //Animation
    private Animation animDown, animUp, animRight, animLeft;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

        bounds.x = 5;
        bounds.y = 12;
        bounds.width = 20;
        bounds.height = 18;

        //Animation
        animDown = new Animation(100, Assets.player_down);
        animUp = new Animation(100, Assets.player_up);
        animRight = new Animation(100, Assets.player_right);
        animLeft = new Animation(100, Assets.player_left);
    }

    @Override
    public void tick() {
        //Animaitons
        animDown.tick();
        animRight.tick();
        animLeft.tick();
        animUp.tick();

        //Move
        getInput();
        move();
        handler.getGameCamera().centerOnEntity(this);
    }

    private void getInput(){
        xMove = 0;
        yMove = 0;

        if(handler.getKeyManager().up){
            yMove = -speed;
        }
        if(handler.getKeyManager().down){
            yMove = speed;
        }
        if(handler.getKeyManager().left){
            xMove = -speed;
        }
        if(handler.getKeyManager().right){
            xMove = speed;
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int)(x - handler.getGameCamera().getxOffset()),
                                        (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
//        g.setColor(Color.red); //// debug
//        g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//                (int)(y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
    }

    private BufferedImage getCurrentAnimationFrame(){
        if (xMove < 0){
            return animLeft.getCurrentFrame();
        } else if (xMove > 0){
            return animRight.getCurrentFrame();
        } else if (yMove < 0){
            return animUp.getCurrentFrame();
        } else {
            return animDown.getCurrentFrame();
        }
    }
}
