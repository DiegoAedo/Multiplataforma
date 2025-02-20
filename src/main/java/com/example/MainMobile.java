package com.example;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.mvc.View;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class MainMobile extends MobileApplication {

    @Override
    public void init() {
        System.out.println("Init method called");
        addViewFactory(HOME_VIEW, () -> {
            Label label = new Label("Hello Android!");
            // Estilos inline para el Label
            label.setStyle("-fx-text-fill: #333333; -fx-font-size: 18px; -fx-padding: 10;");
            return new View(label);
        });
    }

    @Override
    public void postInit(Scene scene) {
        System.out.println("postInit method called");
        // Aplicar un color de fondo inline a la escena
        scene.setFill(Color.LIGHTGRAY);

        // También se puede aplicar al nodo raíz
        scene.getRoot().setStyle("-fx-background-color: #df7f01;");

        // Intentar cargar un archivo CSS externo para complementar o reemplazar los estilos inline
        try {
            String css = getClass().getResource("/css/glisten.css").toExternalForm();
            System.out.println("CSS loaded from: " + css);
            scene.getStylesheets().add(css);
        } catch (Exception e) {
            System.out.println("External CSS not found, using inline styles. Error: " + e.getMessage());
        }

        // Cambiar a la vista principal
        switchView(HOME_VIEW);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
