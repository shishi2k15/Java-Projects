package dev.codenmore.tilegame.states;


import dev.codenmore.tilegame.Game;
import dev.codenmore.tilegame.Handler;

import java.awt.*;

public class MenuState extends  State{

    public MenuState(Handler handler){
        super(handler);
    }

    @Override
    public void tick() {
        if (handler.getMouseManager().isLeftPressed() && handler.getMouseManager().isRightPressed()){
            State.setState(handler.getGame().gameState);
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 8, 8);
    }
}
