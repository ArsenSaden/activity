package com.company;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
        public class Main extends Application {
            public void start(Stage primaryStage){
                HBox pane = new HBox();
                pane.setAlignment(Pos.CENTER);
                for (int i = 0; i < 5; i++) {
                    Text text = new Text("Java");
                    text.setRotate(90);
                    text.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
                    text.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
                    pane.getChildren().add(text);
                }
                Scene scene = new Scene(pane, 400, 400);
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        }