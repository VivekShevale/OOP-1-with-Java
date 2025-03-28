/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */

class Base{
    int basev=10;
    public void base(){
        System.out.println("I am Base Class");
    }
}

class Derived extends Base{
    int derivedv=20;
    public void derived(){
        System.out.println("I am Derived class.");
    }
}

public class inheritanceEx1 {
    public static void main(String args[]){
        Derived d=new Derived();
        System.out.println("base var is = "+d.basev);
        d.base();
        System.out.println("derived var is: "+d.derivedv);
        d.derived();
    }
}
