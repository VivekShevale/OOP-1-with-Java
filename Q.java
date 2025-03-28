/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */

interface P{
    public static final int P=100;
    void methodP();
}

interface P1 extends P{
    public static final int P1=10;
    void methodP1();
}

interface P2 extends P{
    public static final int P2=20;
    void methodP2();
}

interface P12 extends P1,P2{
    public static final int P12=30;
    void methodP12();
}
public class Q implements P12{
    public void methodP12(){
        System.out.println("P12 class Method Constant: "+P12);
    }
    
    public void methodP1(){
        System.out.println("P1 class Method: "+P1);
    }
    
    public void methodP2(){
        System.out.println("P2 class Method: "+P2);
    }
    
    public void methodP(){
        System.out.println("P class Method: "+P);
    }
    
    public static void main(String args[]){
        Q ob=new Q();
        ob.methodP();
        ob.methodP1();
        ob.methodP2();
        ob.methodP12();
    }
}
