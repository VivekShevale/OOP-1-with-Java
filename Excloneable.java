/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
class Student implements Cloneable{
    int age;
    String name;
    Student (int age, String name){
        this.age=age;
        this.name=name;
    }
    public void Display(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Excloneable {
    public static void main(String args[]){
        try{
            Student S=new Student(50,"Reena");
            Student s1=(Student)S.clone();
            S.Display();
            s1.Display();
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
