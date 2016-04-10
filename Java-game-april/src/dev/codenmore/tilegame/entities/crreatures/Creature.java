package dev.codenmore.tilegame.entities.crreatures;

import dev.codenmore.tilegame.Game;
import dev.codenmore.tilegame.Handler;
import dev.codenmore.tilegame.entities.Entity;
import dev.codenmore.tilegame.tiles.Tile;

public abstract class Creature extends Entity{

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 3.0f;
    public static final  int DEFAULT_CREATURE_WIDTH = 30,
                            DEFAULT_CREATURE_HEIGHT = 30;

    protected int health;
    protected float speed;
    protected float xMove, yMove;

    public Creature(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;
    }

    public void move(){
        if (!checkEntityCollisions(xMove, 0f))
            moveY();
        if (!checkEntityCollisions(0f, yMove))
            moveX();
    }

    public void moveX(){

        if (xMove > 0){//moving right
            int tx = (int)(x +xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;

            if(!collisionWithTile(tx,(int)(y + bounds.y) / Tile.TILEHEIGHT) &&
                    !collisionWithTile(tx, (int)(y + bounds.y + bounds.height) / Tile.TILEHEIGHT)){
                x += xMove;
            }

        }else if (xMove < 0){//moving left
            int tx = (int)(x +xMove + bounds.x) / Tile.TILEWIDTH;

            if(!collisionWithTile(tx,(int)(y + bounds.y) / Tile.TILEHEIGHT) &&
                    !collisionWithTile(tx, (int)(y + bounds.y + bounds.height) / Tile.TILEHEIGHT)){
                x += xMove;
            }
        }
    }
    public void moveY(){
        if (yMove < 0){//Up
            int ty =(int)(y + yMove + bounds.y) / Tile.TILEHEIGHT;

            if (!collisionWithTile((int)(x + bounds.x) / Tile.TILEWIDTH, ty)){
                y += yMove;
            }
        }else if (yMove > 0){//down
            int ty =(int)(y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

            if (!collisionWithTile((int)(x + bounds.x) / Tile.TILEWIDTH, ty)){
                y += yMove;
            }
        }
    }

    protected boolean collisionWithTile(int x, int y){
        return handler.getWorld().getTile(x, y).isSolid();
    }

    //GETTERS SETTERS

    public float getyMove() {
        return yMove;
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }

    public float getxMove() {
        return xMove;
    }

    public void setxMove(float xMove) {
        this.xMove = xMove;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
