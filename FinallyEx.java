/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class FinallyEx {
    public static void main(String args[]){
        try{
            int a=100, b=0;
            int c = a/b;
            System.out.println(c);
        }
        finally{
            System.out.println("I am in finally block.");
        }
        System.out.println("Hello");
    }
}
