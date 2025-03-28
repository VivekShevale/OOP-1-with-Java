/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button; 
 
public class DemoStackPane extends Application { 
    @Override 
    public void start(Stage primaryStage) throws Exception { 
        Button btn1 = new Button("Button 1 on bottom "); 
        Button btn2 = new Button("Button 2 on top");
        
        StackPane root = new StackPane(); 
        root.getChildren().addAll(btn1,btn2); 
        
        Scene scene = new Scene(root,300,250); 
        
        primaryStage.setTitle("Demo  StackPane");
        primaryStage.setScene(scene); 
        primaryStage.show();
    } 
    public static void main(String[] args) { 
        launch(args); 
    }
}


