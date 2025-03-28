/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class StringBufferEx {
    public static void main(String args[]){
        StringBuffer s1=new StringBuffer("Welcome to Java");
        System.out.println("Capacity: length*2+1: "+s1.capacity());
        System.out.println("length = "+s1.length());
        System.out.println("subString = "+s1.substring(11));
        System.out.println("SubString from 0 to 6 = "+s1.substring(0,7));
    }
}
