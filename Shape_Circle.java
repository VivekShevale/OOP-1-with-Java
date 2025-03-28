/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

/**
 *
 * @author student
 */
public class Shape_Circle extends Application {
 
    @Override
    public void start(Stage primaryStage) {
        Circle circle=new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLUE);
        circle.setFill(Color.YELLOW);

        Pane pane=new Pane();
        pane.getChildren().add(circle); 

        Scene scene = new Scene(pane, 300, 250);

        primaryStage.setTitle("Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
 
}

