/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class LayoutExampleHbox extends Application {
 
 @Override
 public void start(Stage primaryStage) {
 Button btn1 = new Button("Click Me");
 Button btn2 = new Button("Click Me");
 Button btn3 = new Button("Click Me");
 Button btn4 = new Button("Click Me");
 Button btn5 = new Button("Click Me");
 
 BorderPane root=new BorderPane();
 
 root.setBottom(btn1);
 root.setCenter(btn2);
 root.setLeft(btn3);
 root.setRight(btn4);
 root.setTop(btn5); 
 
 Scene scene = new Scene(root, 300, 250);
 
 primaryStage.setTitle("Hello World!");
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 }
 
}

