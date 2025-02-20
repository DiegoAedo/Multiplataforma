package com.example;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.mvc.View;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class MainMobile extends MobileApplication {

    @Override
    public void init() {
        addViewFactory(HOME_VIEW, () -> new View(new Label("Hello Victor!")));
    }

}