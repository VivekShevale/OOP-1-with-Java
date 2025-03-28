/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class JaggedArray {
    public static void main(String args[]){
        int arr[][] = new int[3][];
        
        arr[0] = new int[]{10, 20, 30};
        arr[1] = new int[]{40, 50};
        arr[2] = new int[]{60, 70, 80, 90};
        System.out.println("Ragged array: ");
        
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}

