package com.nam;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Slick2DGame extends BasicGame {
    Slick2DGame(String name){
        super(name);
    }

    @Override
    public void init(GameContainer gc) throws SlickException{
        //
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException{
        //
    }

    public void render(GameContainer gc, Graphics g) throws SlickException{
        //
        g.drawString("Fuck you", 100, 100);
    }

}
