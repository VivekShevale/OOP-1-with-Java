/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class Variables {
    static int a;
    int b;
    
    public static void main(String args[]){
        int x=1;
        System.out.println("local variables x = "+x);
        System.out.println("Static variable a = "+a);
        
        Variables ob=new Variables();
        
        System.out.println("Instance variable b = "+ob.b);
        ob.b=5;
        
        System.out.println("Updated b = "+ob.b);
        a=6;
        System.out.println("Updated a = "+a);
    }
}
