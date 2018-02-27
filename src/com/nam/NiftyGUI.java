package com.nam;

import com.sun.istack.internal.NotNull;
import com.sun.org.apache.xpath.internal.operations.String;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.button.builder.ButtonBuilder;
import de.lessvoid.nifty.slick2d.NiftyBasicGame;
import de.lessvoid.nifty.slick2d.NiftyRenderOrder;
import de.lessvoid.nifty.slick2d.NiftyUpdateOrder;
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
        super( "Fuck GUI", "start");
        log.info("Constructor");
        setRenderOrder(NiftyRenderOrder.NiftyBackground);

        //"res/helloworld.xml"
    }

    @Override
    protected void prepareNifty(Nifty nifty) {
        //nifty.fromXml();



        nifty.fromXml("res/helloworld.xml", "start");



        log.info("Render order" + getRenderOrder());


        log.info("ver = " + nifty.getVersion());

    }

    @Override
    public void renderGame(GameContainer gc, Graphics g){
        //
        g.setColor(Color.green);
        //g.setFont(new );
        g.drawString("Fuck you", 100, 100);

        g.setColor(Color.red);
        g.drawRect(300, 300, 200, 200);

    }


    //
    //screen.debugOutput();

    /*@Override
    protected void renderGame(){

    }*/
}
