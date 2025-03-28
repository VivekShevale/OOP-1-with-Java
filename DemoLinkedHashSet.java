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
public class DemoLinkedHashSet {
    public static void main(String args[]){
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Fransisco");
        set.add("Beijing");
        set.add("New York");
        
        System.out.println(set);
    }
}
