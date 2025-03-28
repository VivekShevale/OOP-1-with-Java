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
public class DemoEnumeration {
    public static void main(String args[]){
        Vector<String> v=new Vector<>();
        v.add("January");
        v.add("February");
        v.add("March");
        v.add("April");
        
        Enumeration<String> e=v.elements();
        
        System.out.println("Traverse Vector: ");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
