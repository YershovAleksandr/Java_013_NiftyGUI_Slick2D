package com.nam;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyScreenController implements ScreenController{

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

}
