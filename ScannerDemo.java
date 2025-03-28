/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */

import java.io.*;
import java.util.*;
public class ScannerDemo {
    public static void main(String args[]) throws FileNotFoundException{
        File f=new File("Out1.txt");
        
        Scanner sc=new Scanner(f);
//        String word=sc.next();
//        System.out.println(word);
        String word;
        while(sc.hasNext()){
            word=sc.next();
            System.out.println(word);
        }
        
        
    }
}
