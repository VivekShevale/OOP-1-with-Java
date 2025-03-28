/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */

abstract class Bike{
    double speed=80.5;
    
    Bike(){
        System.out.println("bike is called");
    }
    
    abstract void run();
    
    final void changeGear(){
        System.out.println("Gear Changed");
    }
    
    void display(){
        System.out.println("This is Bike Class");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Running Honda");
    }
}

class Hero extends Bike{
    void run(){
        System.out.println("Running Hero");
    }
}
public class MainBikeEx {
    public static void main(String args[]){
        Bike b1=new Honda(); //Honda b1=new Honda;
        b1.run();
        b1.changeGear();
        System.out.println("The speed is: "+b1.speed);
        
        Bike b2=new Hero();
        b2.run();
        b2.changeGear();
    }
}
