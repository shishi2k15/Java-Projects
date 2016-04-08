package dev.codenmore.tilegame.states;

import dev.codenmore.tilegame.entities.crreatures.Player;
import dev.codenmore.tilegame.gfx.Assets;

import java.awt.*;

public class GameState extends State{

    private Player player;

    public GameState(){
        player = new Player(100, 100);
    }

    public void tick() {
        player.tick();
    }

    public void render(Graphics g) {
        player.render(g);
    }
}
