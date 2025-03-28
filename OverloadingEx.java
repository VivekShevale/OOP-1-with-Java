/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
class A{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

class B extends A{
    void sum(int a, int b){
        System.out.println(a+b);
    }
}

public class OverloadingEx {
    public static void main(String args[]){
        B ob=new B();
        ob.sum(3,4);
        
        A ob1=new A();
        ob1.sum(6,4);
        ob1.sum(7,8,9);
        
        A ob2=new B();
        ob2.sum(2,3);
    }
}
