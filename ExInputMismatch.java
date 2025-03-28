/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *a
 * 
 * @author student
 */
import java.util.*;
public class ExInputMismatch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter Integer :");
            int a=sc.nextInt();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
