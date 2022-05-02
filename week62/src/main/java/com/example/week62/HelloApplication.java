package com.example.week62;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        CarPane pane = new CarPane();
        pane.setOnMousePressed(e -> pane.pause());
        pane.setOnMouseReleased(e -> pane.play());

        pane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                pane.increaseSpeed();
            }
            else if (e.getCode() == KeyCode.DOWN) {
                pane.decreaseSpeed();
            }
        });

        Scene scene = new Scene(pane, 600, 100);

        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }
}