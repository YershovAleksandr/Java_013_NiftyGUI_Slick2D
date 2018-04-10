package com.nam;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.Controller;
import de.lessvoid.nifty.controls.Parameters;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.input.NiftyInputEvent;
import de.lessvoid.nifty.screen.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyElementController implements Controller{

    private Logger log = LoggerFactory.getLogger(MyElementController.class);

    private Element element;

    @Override
    public void bind(
            Nifty nifty,
            Screen screen,
            Element element,
            Parameters parameter){

        this.element = element;
        log.info("bind " + element);
    }

    @Override
    public void init(Parameters parameter){
        log.info("init " + element);
    }

    @Override
    public void onStartScreen(){
        log.info("onStart " + element);
    }

    @Override
    public void onEndScreen(){
        log.info("OnEnd " + element);
    }

    @Override
    public void onFocus(boolean getFocus){
        log.info("onFocus " + element + " " + getFocus);
    }

    @Override
    public boolean inputEvent(NiftyInputEvent inputEvent){
        return false;
    }

    public boolean clk42(int x, int y){
        log.info("Clk42 x = " + x + " y = " + y + " element " + element);

        return true;
    }
}
