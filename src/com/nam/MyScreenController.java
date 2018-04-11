package com.nam;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.NiftyEventSubscriber;
import de.lessvoid.nifty.elements.events.NiftyMouseMovedEvent;
import de.lessvoid.nifty.elements.events.NiftyMousePrimaryClickedEvent;
import de.lessvoid.nifty.input.NiftyInputEvent;
import de.lessvoid.nifty.screen.KeyInputHandler;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyScreenController implements ScreenController , KeyInputHandler{

    private static Logger log = LoggerFactory.getLogger(MyScreenController.class);

    public void bind(Nifty nifty, Screen screen){
        //

        log.info("bind");

    }

    public void onStartScreen(){
        //

        log.info("onStartScreen");
    }

    public void onEndScreen(){
        //

        log.info("onEndScreen");
    }

    public String PidorClick(){
        //

        log.warn("PIDOR CLICK!!!1111");
        return new String("GOMIK");
    }

    public void click42(String a){
        log.info("FUCK!!!!!!!!!!!!!!!!" + a);
    }

    public void clk42(int x, int y){
        log.info("Clk42 x = " + x + " y = " + y);
    }

    public boolean keyEvent(NiftyInputEvent inputEvent){
        //wtf
        log.info("KeyEvent PIDOR" + inputEvent);

        return true;
    }

    //@NiftyEventSubscriber(id = "img42")
    @NiftyEventSubscriber(pattern = "im.*")
    public void onClic11k(String id, NiftyMousePrimaryClickedEvent event){
        log.info("id = " + id + " event x = [" + event.getMouseX() + "] event y = [" + event.getMouseY() + "]");
    }
/*
    @NiftyEventSubscriber(pattern = "im.*")
    public void onMmove(String id, NiftyMouseMovedEvent event){
        log.info("Moved id = " + id + " event x = [" + event.getMouseX() + "] event y = [" + event.getMouseY() + "]");
    }*/

}
