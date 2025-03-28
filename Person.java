/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
interface P1{
    void walk();
}
interface P2{
    public void run();
}

class Person implements P1, P2 {
    public void walk(){
        System.out.println("Person is walking");
    }
    
    public void run(){
        System.out.println("Person is running");
    }
    
    public static void main(String args[]){
        Person ob=new Person();
        ob.walk();
        ob.run();
    }
}
