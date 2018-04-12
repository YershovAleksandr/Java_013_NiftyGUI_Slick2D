package com.nam;

import com.sun.istack.internal.NotNull;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.builder.LayerBuilder;
import de.lessvoid.nifty.builder.PanelBuilder;
import de.lessvoid.nifty.builder.PopupBuilder;
import de.lessvoid.nifty.builder.ScreenBuilder;
import de.lessvoid.nifty.controls.dynamic.PanelCreator;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.screen.Screen;
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
       // super( "Fuck GUI", "start42");
        //super( "Fuck GUI", "country_select_screen");
        super( "Fuck GUI");
        log.info("Constructor");
        setRenderOrder(NiftyRenderOrder.NiftyBackground);
    }

    @Override
    protected void prepareNifty(Nifty nifty) {
        //nifty.fromXml("res/myfuckscreen.xml", "start");
        //nifty.fromXml("res/helloworld42.xml", "start");
        //nifty.fromXmlWithoutStartScreen("res/myfuckscreen.xml");
        //nifty.fromXml("res/screens/country_select_screen.xml", "country_select_screen");

        nifty.addXml("res/myfuckscreen.xml");

        //nifty.gotoScreen("stop");

        //nifty.gotoScreen("fuckscreen");

        log.info("Render order" + getRenderOrder());

        log.info("ver = " + nifty.getVersion());


       /* Screen screen = nifty.getCurrentScreen();

        Element layer = screen.findElementByName("baseLayer");

        PanelCreator createPanel = new PanelCreator();
        createPanel.setHeight("80px");
        createPanel.setBackgroundColor("#0f0f");

        Element newPanel = createPanel.create(nifty, screen, layer);

        Screen screen2 = new ScreenBuilder("start"){{
            layer(new LayerBuilder("baseLayer"){{
                childLayoutCenter();
                panel(new PanelBuilder(){{
                    height("150px");
                    backgroundColor("#00ff");
                }});
            }});
        }}.build(nifty);
*/

      /* Screen screen = new ScreenBuilder("start"){{
           //
           controller(new MyScreenController());
           layer(new LayerBuilder("baseLayer"){{
               childLayoutCenter();
               panel(new PanelBuilder(){{
                   height("150px");
                   backgroundColor("#00ff");
               }});
           }});

       }}.build(nifty);*/


      /*new PopupBuilder("popupExit"){{
          //childLayoutCenter();
          //back
      }}.registerPopup(nifty);*/

/*
        Element popupElement = nifty.createPopup("popupExit");

        //nifty.showPopup(nifty.getCurrentScreen(), popupElement.getId(), null);

        Thread th = new Thread(new Runnable() {
            @Override
            public void run(){

                //while (true){
                    try {
                        Thread.sleep(2000);
                    } catch (Exception ex) {
                        log.error("PIDOR", ex);
                    }

                nifty.showPopup(nifty.getCurrentScreen(), popupElement.getId(), null);

                try {
                    Thread.sleep(2000);
                } catch (Exception ex) {
                    log.error("PIDOR", ex);
                }

                nifty.closePopup(popupElement.getId());

                //}
            }
        });

        th.start();*/

        //nifty.setDebugOptionPanelColors(true);

        //log.info("PIDOR" + nifty.getCurrentScreen().debugOutput());

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
