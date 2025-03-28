/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class ExArithmetic {
    public static void main(String args[]){
        int a=5, b=0;
        try {
            int div = a/b;
            
        } catch(ArithmeticException e) { //catch(Exception e)
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
