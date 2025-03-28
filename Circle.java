/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class Circle {
    double radius;
    
    Circle(double radius){
        this.radius=radius;
    }
    
    Circle(){
        this(1.0);
    }
    
    void display(){
        System.out.println(radius);
    }
        
    public static void main(String args[]){
            Circle c1=new Circle();
            c1.display();
            Circle c2=new Circle(3.5);
            c2.display();
    }
}
