/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
class Student {
    int id;
    String name;
    int age;
    
    Student(int i, String n){
        id=i;
        name=n;
    }
    Student(int i, String n, int a){
        id=i;
        name=n;
        age=a;
    }
    
    public void display(){
        System.out.println(id+" "+name+" "+age);
    }
}

public class TestStudent{
    public static void main(String[] args){
        Student S1=new Student(1, "Jay");
        Student S2=new Student(2, "Ram", 20);
            
        S1.display();
        S2.display();
    }        
}
