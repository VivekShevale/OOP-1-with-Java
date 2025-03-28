package ch.pkg03_vivek;

import java.util.*;
public class Pattern {
   
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
        int n=sc.nextInt();
        pattern(n);
   }
   public static void pattern(int x){     
        for (int i=1; i<=x; i++){
            for (int j=1; j<=x-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();  
        } 
    }
   
}
