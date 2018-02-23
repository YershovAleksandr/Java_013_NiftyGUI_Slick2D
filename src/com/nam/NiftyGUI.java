package com.nam;

import com.sun.istack.internal.NotNull;
import com.sun.org.apache.xpath.internal.operations.String;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.button.builder.ButtonBuilder;
import de.lessvoid.nifty.slick2d.NiftyBasicGame;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.SlickException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NiftyGUI extends NiftyBasicGame{

    private static Logger log = LoggerFactory.getLogger(NiftyGUI.class);

    public static void createGame(NiftyGUI game){
        try{
            AppGameContainer container = new AppGameContainer(game, 1024, 768, false);
            container.start();
        }catch (SlickException ex){
            log.error("WTF", ex);
        }
    }

    public NiftyGUI(){
        super( "Fuck GUI", "start");
        log.info("Constructor");

        //"res/helloworld.xml"
    }

    @Override
    protected void prepareNifty(Nifty nifty) {
        //if (nifty.getM)
        //nifty.fromXml();

        nifty.fromXml("res/helloworld.xml", "start");
        //ButtonBuilder b = new ButtonBuilder("Btn", "Fuck");

        //log.info("ver = " + nifty.getVersion());

    }

    //
    //screen.debugOutput();

    /*@Override
    protected void renderGame(){

    }*/
}
