/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class TestPassArray {
    public static void main(String args[]){
        int a[] = {30, 2, 10, 5};
        min(a);
    }
    
    static void min(int a[]){
        int min = a[0];
        for (int i=0; i<a.length; i++){
            if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
    
}
