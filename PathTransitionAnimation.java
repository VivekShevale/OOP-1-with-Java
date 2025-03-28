/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author student
 */
public class PathTransitionAnimation extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws FileNotFoundException {
        // Create a pane
        
        // Add an image view and add it to pane
        FileInputStream fin=new FileInputStream("D:\\iris.png");
        Image image=new Image(fin);
        ImageView imageView = new ImageView(image);
        Pane pane = new Pane(imageView);
//      pane.getChildren().add(imageView);
        // Create a path transition
        PathTransition pt = new PathTransition(Duration.millis(10000),
        new Line(300, 500, 300, 100), imageView);
        pt.setCycleCount(5);
        pt.play(); // Start animation
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 200);
        
        primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    public static void main(String[] args) {
        launch(args);
    }
}

