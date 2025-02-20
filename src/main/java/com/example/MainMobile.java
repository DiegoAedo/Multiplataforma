package com.example;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.mvc.View;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class MainMobile extends MobileApplication {

    @Override
    public void init() {
        System.out.println("Iniciando MainMobile");
        // Registrar la vista con la clave HOME_VIEW
        addViewFactory(HOME_VIEW, () -> new View(new Label("¡Hola Gluon Mobile!")));
    }

    @Override
    public void postInit(Scene scene) {
        // Después de crear el scene, cambiar a la vista registrada para que se renderice
        switchView(HOME_VIEW);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
