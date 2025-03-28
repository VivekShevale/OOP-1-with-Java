/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class Test3Darray {
    public static void main (String args[]){
        
        int [][][] arr = { {{10,20}, {30,40}},
                {{40,50}, {60,70}}
                };
                
        for (int tables=0; tables<arr.length; tables++){
            for (int rows=0; rows<arr[tables].length; rows++){
                for(int columns=0; columns<arr[tables][rows].length; columns++){
                    System.out.print(arr[tables][rows][columns]+"\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
