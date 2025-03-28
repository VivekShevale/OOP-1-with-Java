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
public class DemoTreeSet {
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Fransisco");
        set.add("Beijing"); 
        
        TreeSet<String> tset=new TreeSet<>(set);
        System.out.println(tset);
        System.out.println("first() = "+tset.first());
        System.out.println("last() = "+tset.last());
        System.out.println("pollfirst() = "+tset.pollFirst());
        System.out.println("polllast() = "+tset.pollLast());
        System.out.println("New tree set = "+tset);
    }
}
