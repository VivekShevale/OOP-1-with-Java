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
public class DemoIterator {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(30);
        a.add(20);
        System.out.println("ArrayList = "+a);
        
        Iterator<Integer> i=a.iterator();
        System.out.println("Iterating Over ArrayList");
        while (i.hasNext()){
            System.out.print(i.next()+"\t");
        }
    }
}
