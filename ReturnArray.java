/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *zz
 * @author student
 */
public class ReturnArray {
    public static void main(String args[]){
        int arr[] = get();
        
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    static int[] get(){
        int arr[] = {10, 20, 30, 40, 50};
        return arr;
    }
}
