package com.nam;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.newdawn.slick.*;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
	// write your code here

        log.info("Hello world Motherfucka!!!");
/*
        try {
            AppGameContainer apgc = new AppGameContainer(new Slick2DGame("Hack42"));
            apgc.setDisplayMode(1024, 768, false);
            apgc.start();
        } catch (SlickException ex){
            log.error("Wtf", ex);
        }
*/

        NiftyGUI.createGame(new NiftyGUI());

    }
}
