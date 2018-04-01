package com.nam;

import com.sun.istack.internal.NotNull;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.slick2d.NiftyBasicGame;
import de.lessvoid.nifty.slick2d.NiftyRenderOrder;
import org.newdawn.slick.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NiftyGUI extends NiftyBasicGame{

    private static Logger log = LoggerFactory.getLogger(NiftyGUI.class);

    public static void createGame(NiftyGUI game){
        try{
            AppGameContainer container = new AppGameContainer(game, 1024, 768, false);
            container.setShowFPS(true);
            container.start();
        }catch (SlickException ex){
            log.error("WTF", ex);
        }
    }

    public NiftyGUI(){
        super( "Fuck GUI", "start42");
        //super( "Fuck GUI", "country_select_screen");
        //super( "Fuck GUI");
        log.info("Constructor");
        setRenderOrder(NiftyRenderOrder.NiftyBackground);
    }

    @Override
    protected void prepareNifty(Nifty nifty) {
        nifty.fromXml("res/helloworld.xml", "fuckscreen");
        //nifty.fromXmlWithoutStartScreen("res/helloworld.xml");
        //nifty.fromXml("res/screens/country_select_screen.xml", "country_select_screen");

        //nifty.addXml("res/helloworld.xml");

       // nifty.gotoScreen("sart42");

        nifty.gotoScreen("fuckscreen");

        log.info("Render order" + getRenderOrder());

        log.info("ver = " + nifty.getVersion());
    }

    public String Fuck42(){
        return "PIDOR";
    }

    @Override
    public void renderGame(GameContainer gc, Graphics g){
        g.setColor(Color.green);
        g.drawString("Fuck you", 100, 100);

        g.setColor(Color.red);
        g.drawRect(300, 300, 200, 200);
    }
}
