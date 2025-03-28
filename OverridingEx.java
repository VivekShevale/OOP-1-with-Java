/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
class parent{
    int a=10;
    void show(){
        System.out.println("Parent's show()");
    }
}

class child extends parent{
    int a=20;
    void show(){
        System.out.println("Child's show()");
    }
}

public class OverridingEx {
    public static void main(String args[]){
        parent ob1=new parent();
        ob1.show();
        parent ob2=new child();
        ob2.show();
        System.out.println(ob2.a);
        child ob3=new child();
        ob3.show();
        System.out.println(ob3.a);
    }
}
