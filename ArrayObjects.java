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
public class ArrayObjects {
    public static void main(String args[]){
        Student[] stdArray=new Student[3];
        Scanner sc=new Scanner(System.in);
        
        for (int i=0; i<stdArray.length; i++){
            stdArray[i]=new Student();
        }
        for (Student s: stdArray){
            s.java=sc.nextInt();
            s.co=sc.nextInt();
            s.os=sc.nextInt();
        }
        
        System.out.println("Java\tCO\tOS");
        for (Student x: stdArray){
            System.out.println(x.java+"\t"+x.co+"\t"+x.os);
        }
    }
    
}

class Student{
    int java;
    int co;
    int os;
}
