package com.example;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.mvc.View;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class MainMobile extends MobileApplication {

    public static final String HOME_VIEW = "HOME_VIEW";

    @Override
    public void init() {
        // Se agrega una vista simple que muestra un Label.
        addViewFactory(HOME_VIEW, () -> new View(new Label("¡Hola Gluon Mobile!")));
    }

    @Override
    public void postInit(Scene scene) {
        // Aquí puedes aplicar un tema o realizar otras configuraciones globales.
    }

    public static void main(String[] args) {
        launch(args);
    }
}
