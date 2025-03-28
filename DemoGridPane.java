/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
/**
 *
 * @author student
 */
public class DemoGridPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button b1=new Button("Click Me");
        Button b2=new Button("Click Me");
        Button b3=new Button("Click Me");
        
        GridPane root=new GridPane();
        root.add(b1, 0, 0);
        root.add(b2, 1, 1);
        root.add(b3, 2, 2);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Demo GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
