/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ShowRectangle extends Application {
    @Override 
    public void start(Stage primaryStage) { 
        // Create rectangles 
        Rectangle r1 = new Rectangle(25, 10, 60, 30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE); 
        Rectangle r2 = new Rectangle(25, 50, 60, 30); 
        Rectangle r3 = new Rectangle(25, 90, 60, 30);
        r3.setArcWidth(15);
        r3.setArcHeight(25); 

        // Create a group and add nodes to the group
        Group group = new Group();
        group.getChildren().addAll(
                new Text(10, 27, "r1"),r1, 
                new Text(10, 67, "r2"), r2, 
                new Text(10, 107, "r3"), r3);
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(new BorderPane(group), 300, 250);
        
        primaryStage.setTitle("ShowRectangle"); 
        primaryStage.setScene(scene); 
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    } 
}
