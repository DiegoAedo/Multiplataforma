package com.example;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.mvc.View;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class MainMobile extends MobileApplication {

    @Override
    public void init() {
        // Registra la vista con la clave HOME_VIEW
        addViewFactory(HOME_VIEW, () -> new View(new Label("Hello Victor!")));
    }

    @Override
    public void postInit(Scene scene) {
        // Cambia a la vista principal para que se muestre
        switchView(HOME_VIEW);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
