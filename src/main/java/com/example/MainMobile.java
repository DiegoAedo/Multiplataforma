package com.example;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.mvc.View;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class MainMobile extends MobileApplication {

    @Override
    public void init() {
        // Este método se ejecuta al inicio de la aplicación
        System.out.println("Init method called");
        addViewFactory(HOME_VIEW, () -> {
            Label label = new Label("Hello Android!");
            // Establece estilos inline para el Label
            label.setStyle("-fx-text-fill: #333333; -fx-font-size: 18px; -fx-padding: 10;");
            return new View(label);
        });
    }

    @Override
    public void postInit(Scene scene) {
        // Este método se ejecuta después de la inicialización de la escena
        System.out.println("postInit method called");

        // Establece un color de fondo para la escena y el nodo raíz
        scene.setFill(Color.LIGHTGRAY);
        scene.getRoot().setStyle("-fx-background-color: #df7f01;");

        // Intenta cargar un archivo CSS externo para complementar los estilos inline
        try {
            String css = getClass().getResource("/css/glisten.css").toExternalForm();
            System.out.println("CSS loaded from: " + css);
            scene.getStylesheets().add(css);
        } catch (Exception e) {
            System.out.println("External CSS not found, using inline styles. Error: " + e.getMessage());
        }

        // Cambia a la vista principal definida en init()
        switchView(HOME_VIEW);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
