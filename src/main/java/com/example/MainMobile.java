package com.example;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.mvc.View;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class MainMobile extends MobileApplication {

    @Override
    public void init() {
        System.out.println("Iniciando MainMobile");
        addViewFactory(HOME_VIEW, () -> new View(new Label("¡Hola Gluon Mobile!")));
    }

    @Override
    public void postInit(Scene scene) {
    }

    public static void main(String[] args) {
        launch(args);
    }
}