/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
/**
 *
 * @author student
 */
public class Shape_Line extends Application {
    @Override
    public void start(Stage primaryStage) {
        Line l1=new Line();
        l1.setStartX(10);
        l1.setStartY(10);
        l1.setEndX(160);
        l1.setEndY(160);
        l1.setStrokeWidth(5);
        l1.setStroke(Color.BLUE);
        l1.setOpacity(0.7);
        l1.setRotate(90);
        
        Line l2=new Line(10,10,160,160);
        
        StackPane root=new StackPane();
        root.getChildren().addAll(l1,l2);
        
        Scene scene=new Scene(root); 

        primaryStage.setTitle("Show Line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
       launch(args);
    }
}

