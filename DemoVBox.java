/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

/**
 *
 * @author student
 */
public class DemoVBox extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Click Me");
        Button btn1 = new Button("Click Me");
        
        VBox root=new VBox();
        root.getChildren().add(btn); 
        root.getChildren().add(btn1);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("VBox");
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
