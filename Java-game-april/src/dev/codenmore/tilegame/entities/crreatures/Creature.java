package dev.codenmore.tilegame.entities.crreatures;

import dev.codenmore.tilegame.entities.Entity;

public abstract class Creature extends Entity{

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 3.0f;
    public static final  int DEFAULT_CREATURE_WIDTH = 30,
                            DEFAULT_CREATURE_HEIGHT = 30;

    protected int health;
    protected float speed;
    protected float xMove, yMove;

    public Creature(float x, float y, int width, int height) {
        super(x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;
    }

    public void move(){
        x += xMove;
        y += yMove;
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
