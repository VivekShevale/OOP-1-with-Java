/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
import java.util.*;
public class DemoStack {
    public static void main(String args[]){
        Stack<String> s=new Stack<>();
        s.push("Apple");
        s.push("Banana");
        s.push("Cherry");
        
        System.out.println("Top element = "+s.peek());
        System.out.println("Popped Element = "+s.pop());
        System.out.println("Position of Apple = "+s.search("Apple"));
        System.out.println("is stack empty ? "+s.isEmpty());
        System.out.println("Stack size = "+s.size());
    }
}
