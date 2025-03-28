/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class even10 {
    public static void main(String args[]){
        int sum=evensum(1,10);
        System.out.println("Sum is: "+sum);
    }
    
    public static int evensum(int a,int b){
        int bix=0;
        for (int i=a; i<=b; i++){
            if (i%2==0){
                bix+=i;
            }
        }
        return bix;
    }
}