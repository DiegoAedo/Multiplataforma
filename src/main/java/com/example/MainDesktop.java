package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.io.File;

public class MainDesktop extends Application {

    public static void main(String[] args) {
        // Este método main() arranca la app JavaFX y es reconocido por GluonFX
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Crear botones para reproducir cada sonido
        Button btnNew = new Button("Reproducir new.mp3");
        Button btnRejected = new Button("Reproducir rejected.mp3");
        Button btnTrade = new Button("Reproducir trade.mp3");

        // Asumimos que los archivos de audio están en el directorio raíz del proyecto o en una ruta accesible.
        String newSoundPath = "new.mp3";
        String rejectedSoundPath = "rejected.mp3";
        String tradeSoundPath = "trade.mp3";

        // Asignar acciones a cada botón
        btnNew.setOnAction(e -> playSound(newSoundPath));
        btnRejected.setOnAction(e -> playSound(rejectedSoundPath));
        btnTrade.setOnAction(e -> playSound(tradeSoundPath));

        // Organizar los botones en un VBox
        VBox root = new VBox(15, btnNew, btnRejected, btnTrade);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Reproductor de Sonidos");
        stage.setScene(scene);
        stage.show();
    }

    // Método para reproducir el sonido
    private void playSound(String soundFile) {
        Media sound = new Media(new File(soundFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
}
