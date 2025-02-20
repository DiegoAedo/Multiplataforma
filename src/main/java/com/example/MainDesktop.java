package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainDesktop extends Application {

    public static void main(String[] args) {
        // Este método main() arranca la app JavaFX y es reconocido por GluonFX
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Label label = new Label("¡Hola Mundo desde JavaFX + GraalVM!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Mi Hola Mundo");
        stage.setScene(scene);
        stage.show();
    }
}
