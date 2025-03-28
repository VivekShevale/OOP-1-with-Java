/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class TestCircle {
    public static void main(String args[]){
        try{
            ExCircle c1=new ExCircle(5);
            ExCircle c2=new ExCircle(-5);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}

class ExCircle{
    double radius;
    
    ExCircle(double radius){
        setRadius(radius);
    }
    
    void setRadius(double radius) throws IllegalArgumentException{
        if (radius>=0){
            this.radius=radius;
        } else{
            throw new IllegalArgumentException("Radius can not be negative.");
        }
    }
}
