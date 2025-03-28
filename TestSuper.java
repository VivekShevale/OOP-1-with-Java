/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/** 00000000000000000000000000000000000000000000000000000000000000
 *
 * @author student
 */
class Person{
    String name="Person1";
    void message(){
        System.out.println("This is Person Class.");
    }
    
    Person(){
        System.out.println("This is person class.");
    }
}

class Student extends Person{
    Student(){
        super();
        System.out.println("Super Constructor.");
    }
    
    void message(){
        System.out.println("This is super class");
    }
    
    void display(){
        super.message();
        System.out.println(super.name);
        message();
    }
}

public class TestSuper {
    public static void main(String args[]){
        Student s=new Student();
        s.display();
    }
}
