/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ch.pkg03_vivek;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ColorLabelText extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle c1=new Circle();
        c1.setRadius(50);
        //Constant Color
        c1.setFill(Color.YELLOW);

        Circle c2=new Circle();
        c2.setRadius(50);
        //rgb COLOR Method
        c2.setFill(Color.rgb(200, 150, 130, 0.6));

        
        StackPane root1=new StackPane();
        root1.getChildren().add(c1);
        
        Label l=new Label("JavaFX"); 
        //hsb COLOR Method
        l.setTextFill(Color.hsb(270, 0.6, 0.9));

        StackPane root2=new StackPane();
        root2.getChildren().addAll(c2,l);


        Text t=new Text(20,20,"JAVA is Fun");
        //color Method
        t.setFill(Color.color(0.2, 0.6, 0.7));
        //Font class
        t.setFont(Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC,20));
        t.setUnderline(true);


        HBox root3=new HBox();
        root3.getChildren().addAll(root1,root2,t);

        Scene scene = new Scene(root3, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

