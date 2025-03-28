/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class InnerClassHandler1 extends Application {
    private final Circle circle=new Circle();
    @Override
    public void start(Stage primaryStage){
        HBox hbox=new HBox();
//        hbox.setSpacing(10);
//        hbox.setAlignment(Pos.CENTER);
        Button btn=new Button("Enlarge");
        hbox.getChildren().add(btn);

        btn.setOnAction(new EnlargeHandler());
        BorderPane borderpane=new BorderPane();
        borderpane.setCenter(circle);
        borderpane.setBottom(hbox);
        BorderPane.setAlignment(hbox,Pos.CENTER);
        Scene scene = new Scene(borderpane, 300, 250);
        primaryStage.setTitle("Control Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    class EnlargeHandler implements EventHandler<ActionEvent>{
    @Override
        public void handle(ActionEvent e){
            circle.setRadius(circle.getRadius()+2);
        } 
    }
    public static void main(String[] args) {
        launch(args);
    }
}

