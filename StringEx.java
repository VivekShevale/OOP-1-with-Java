/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class StringEx {
    public static void main(String args[]){
        String s1="Welcome to Java";
        String s2=s1;
        String s3=new String("Welcome to Java");
        
        System.out.println("s1==s2 "+(s1==s2));
        System.out.println("s1==s3 "+(s1==s3));
        System.out.println(s1.replace('J', 'L'));
        System.out.println(s1.replaceAll("e", "_"));
        System.out.println(s1.replaceFirst("W", "T"));
        System.out.println(s1.toCharArray());
      
    }
    
}
