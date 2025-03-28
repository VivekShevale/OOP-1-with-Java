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
public class RecursionDemo {
    static int fact(int n){
        if(n==1){
            return 1;
        } else {
            return n*fact(n-1);
        }
    }
    public static void main(String args[]){
        int n;
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int result=fact(n);
        System.out.println("Factorial = "+result);
    }
}
