/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class ObPass {
    public static void main(String args[]){
        ObjectPass ob1=new ObjectPass(100,200);
        ObjectPass ob2=new ObjectPass(100,200);
        ObjectPass ob3=new ObjectPass(1,1);
        System.out.println("ob1=ob2 is "+ob1.equalsTo(ob2));
        System.out.println("ob1=ob3 is "+ob1.equalsTo(ob3));
    }
}

class ObjectPass{
    int a,b;
    
    ObjectPass(int a, int b){
        this.a=a;
        this.b=b;
    }
    
    boolean equalsTo(ObjectPass ob){
        return (ob.a==a && ob.b==b);
    }
}