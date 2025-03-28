/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

import java.util.*;

public class Factorial {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    
    public static int fact(int f){
        int ans=1;
        for (int i=1; i<=f; i++){
            ans=ans*i;
        }
        return ans;
    }
}
