package com.example.week5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class HelloApplication extends Application {   //абстрактный класс, который нужно реализовать
    @Override// старт переописываем
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();               //макет, который позволяет расположить компоненты в виде таблицы
        //TilePane pane = new TilePane();             //координаты не нужны
        pane.setAlignment(Pos.CENTER);                //как размещается текст
        Label[] text = new Label[5];                  //oтображает текст, иконки
        for (int i = 0; i < text.length; i++) {
            text[i] = new Label("Java");
            text[i].setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
            text[i].setTextFill(getRandomColor());
            text[i].setRotate(90);
            pane.add(text[i], i, 0);
        }
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Color getRandomColor() {
        return new Color(Math.random(), Math.random(), Math.random(), Math.random());
    }
    public static void main(String[] args) {
        Application.launch(args);             //запускает метод старт
    }
}