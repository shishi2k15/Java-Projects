package dev.codenmore.tilegame.states;

import dev.codenmore.tilegame.Game;
import dev.codenmore.tilegame.entities.crreatures.Player;
import dev.codenmore.tilegame.tiles.Tile;
import dev.codenmore.tilegame.worlds.World;

import java.awt.*;

public class GameState extends State{

    private Player player;
    private World world;

    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100);
        world = new World(game, "/home/roy/Projects/GitHub/Java-Projects/Java-game-april/res/world/world1.txt");

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
