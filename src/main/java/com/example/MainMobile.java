package com.example;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.mvc.View;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class MainMobile extends MobileApplication {

    @Override
    public void init() {
        // Se define la vista principal usando el identificador HOME_VIEW
        addViewFactory(HOME_VIEW, () -> {
            Label label = new Label("Hello Victor!");
            return new View(label);
        });
    }

    @Override
    public void postInit(Scene scene) {
        // Se carga la hoja de estilos para que se apliquen los estilos de Gluon Mobile (asegúrate de que el recurso exista)
        scene.getStylesheets().add(getClass().getResource("/css/glisten.css").toExternalForm());
        // Se muestra la vista principal
        switchView(HOME_VIEW);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
