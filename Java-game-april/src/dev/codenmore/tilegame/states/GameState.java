package dev.codenmore.tilegame.states;

import dev.codenmore.tilegame.Game;
import dev.codenmore.tilegame.Handler;
import dev.codenmore.tilegame.entities.crreatures.Player;
import dev.codenmore.tilegame.tiles.Tile;
import dev.codenmore.tilegame.worlds.World;

import java.awt.*;

public class GameState extends State{

    private Player player;
    private World world;

    public GameState(Handler handler){
        super(handler);
        world = new World(handler, "/home/roy/Projects/GitHub/Java-Projects/Java-game-april/res/world/world1.txt");
        handler.setWorld(world);
        player = new Player(handler, 100, 100);

    }

    public void tick() {
        world.tick();
        player.tick();

    }

    public void render(Graphics g) {
        world.render(g);
        player.render(g);
    }
}
