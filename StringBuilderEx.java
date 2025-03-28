/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class StringBuilderEx {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.append("Welcome to Java"));
        System.out.println(sb.insert(11, "HTML and "));
        System.out.println(sb.delete(8,11));
        System.out.println(sb.replace(11,15,"HTML"));
        System.out.println(sb.reverse());
    }
    
}
