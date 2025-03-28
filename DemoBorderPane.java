/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;

public class DemoBorderPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button b1 = new Button("Click Me");
        Button b2 = new Button("Click Me");
        Button b3 = new Button("Click Me");
        Button b4 = new Button("Click Me");
        Button b5 = new Button("Click Me");

        BorderPane root=new BorderPane();
        root.setBottom(b1);
        root.setCenter(b2);
        root.setLeft(b3);
        root.setRight(b4);
        root.setTop(b5); 

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}