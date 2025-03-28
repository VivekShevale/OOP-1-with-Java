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
public class DemoVector {
    public static void main(String args[]){
        Vector<String> v=new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        v.addElement("Date");
        
        System.out.println("Element at index 1 = "+v.get(1));
        v.remove("Banana");
        v.removeElement("Date");
        System.out.println("Size of vector is: "+v.size());
        System.out.println("Contains Apple? "+v.contains("Apple"));
        
        System.out.println("The index of Cherry is = "+v.indexOf("Cherry"));
        System.out.println("Is vector empty ? "+v.isEmpty());
        System.out.println("First element = "+v.firstElement());
        System.out.println("Capacity of vector is "+v.capacity());
    }
}
