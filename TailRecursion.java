/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class TailRecursion {
   static int printnumber(int n){
       if (n<1){
           return 0;
       } else {
           System.out.println(" "+n);
           printnumber(n/2);
           System.out.println(" "+n);
           return n;
       }
   }
   public static void main(String args[]){
       int n;
       System.out.println("Enter number: ");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int result=printnumber(n);
       System.out.println("Last return number: "+result);
   }
}