/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
/**
 *
 * @author student
 */
public class KeyEventDemo extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        Text text = new Text(20, 20, "A");
        Pane pane = new Pane();
        pane.getChildren().add(text);
        text.setOnKeyPressed(e -> {text.setText(e.getText());});
        
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("KeyEventDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        text.requestFocus(); // text is focused to receive key input
    }
    public static void main(String[] args) {
    launch(args);
    }
}