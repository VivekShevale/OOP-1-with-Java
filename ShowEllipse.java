/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;

public class ShowEllipse extends Application {
    @Override
    public void start(Stage primaryStage) {
        Ellipse ellipse=new Ellipse(150.0f,70.0f,100.0f,30.0f);
        ellipse.setStrokeWidth(5);
        ellipse.setStroke(Color.RED);
        ellipse.setFill(Color.WHITE);
        StackPane root=new StackPane(ellipse);
        
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("ShowElllipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    } 
}
