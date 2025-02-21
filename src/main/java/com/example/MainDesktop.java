package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.net.URL;

public class MainDesktop extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Button btnNew = new Button("Reproducir new.mp3");
        Button btnRejected = new Button("Reproducir rejected.mp3");
        Button btnTrade = new Button("Reproducir trade.mp3");

        String newSoundFile = "new.mp3";
        String rejectedSoundFile = "rejected.mp3";
        String tradeSoundFile = "trade.mp3";

        btnNew.setOnAction(e -> playSound(newSoundFile));
        btnRejected.setOnAction(e -> playSound(rejectedSoundFile));
        btnTrade.setOnAction(e -> playSound(tradeSoundFile));

        VBox root = new VBox(15, btnNew, btnRejected, btnTrade);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Reproductor de Sonidos");
        stage.setScene(scene);
        stage.show();
    }

    private void playSound(String soundFile) {
        String resourcePath = "/sounds/" + soundFile;
        URL resource = getClass().getResource(resourcePath);
        if (resource == null) {
            System.out.println("No se encontró el recurso: " + resourcePath);
            return;
        }
        Media sound = new Media(resource.toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

}
