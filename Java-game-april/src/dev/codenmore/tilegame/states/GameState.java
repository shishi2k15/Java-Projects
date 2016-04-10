package dev.codenmore.tilegame.states;

import dev.codenmore.tilegame.Game;
import dev.codenmore.tilegame.Handler;
import dev.codenmore.tilegame.entities.crreatures.Player;
import dev.codenmore.tilegame.entities.statics.Tree;
import dev.codenmore.tilegame.tiles.Tile;
import dev.codenmore.tilegame.worlds.World;

import java.awt.*;

public class GameState extends State{

    private World world;

    public GameState(Handler handler){
        super(handler);
        world = new World(handler, "/home/roy/Projects/GitHub/Java-Projects/Java-game-april/res/world/world1.txt");
        handler.setWorld(world);
    }

    public void tick() {
        world.tick();
    }

    public void render(Graphics g) {
        world.render(g);
    }
}
