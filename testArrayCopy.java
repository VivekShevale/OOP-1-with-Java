/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class testArrayCopy {
    public static void main (String args[]){
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        
        char[] copyTo = new char[copyFrom.length];
        
        System.arraycopy(copyFrom, 5, copyTo, 0, 5);
        System.out.println(String.valueOf(copyTo));
    }
}
