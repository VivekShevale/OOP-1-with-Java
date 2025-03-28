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

class child extends Base{
    int childv=60;
    public void child(){
        System.out.println("I am Child.");
    }
}

public class inheritanceEx3 {
    public static void main(String args[]){
        child c=new child();
        Derived d=new Derived();
        System.out.println("base var is = "+c.basev);
        c.base();
        System.out.println("derived var is: "+d.derivedv);
        d.derived();
        System.out.println("Child variable is "+c.childv);
        c.child();
    }
}
