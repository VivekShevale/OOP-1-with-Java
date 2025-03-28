/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class ExRethrow {
    static void divide(){
        int x,y,z;
        
        try{
            x=6;
            y=0;
            z=x/y;
            System.out.println("div= "+z);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught in Divide()");
            System.out.println(e);
            throw e;
        }
    }
    
    public static void main(String args[]){
        System.out.println("Start main");
        
        try{
            divide();
        }
        catch(ArithmeticException e){
            System.out.println("RethrowEx");
            System.out.println(e);
        }
    }
}
