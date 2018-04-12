package com.nam;

import de.lessvoid.nifty.EndNotify;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.effects.EffectEventId;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFuckScreenController implements ScreenController {

    private static Logger log = LoggerFactory.getLogger(MyFuckScreenController.class);

    private Nifty nifty;
    private Element image;

    @Override
    public void bind(final Nifty newNifty, final Screen newScreen){
        this.nifty = newNifty;
        this.image = newScreen.findElementByName("imageId");

        log.info("bind nifty = " + newNifty + " screen = " + newScreen);
    }

    @Override
    public void onStartScreen(){
        log.info("onStart Screen");
        image.startEffect(EffectEventId.onCustom, new FadeInEnd(), "fadeIn");
    }

    @Override
    public void onEndScreen(){
        log.info("onEnd Screen");
    }

    class FadeInEnd implements EndNotify{
        @Override
        public void perform(){
            log.info("FadeInd has ended");
            image.startEffect(EffectEventId.onCustom, new FadeOutEnd(), "fadeOut");
        }
    }

    class FadeOutEnd implements EndNotify{
        @Override
        public void perform(){
            log.info("FadeOut has ended");
        }
    }


}
