/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
/**
 *
 * @author student
 */
public class DemoFlowPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button b1=new Button("Click Me");
        Button b2=new Button("Click Me");
        Button b3=new Button("Click Me");
        
        FlowPane root=new FlowPane();
        root.getChildren().addAll(b1, b2, b3);
        
        Scene scene = new Scene(root, 100, 200);
        
        primaryStage.setTitle("FlowPane");
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
