/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

// devlop a proram which stores name of districts in gujarat in array of string.
//The array specified capacity to store 5 districts. 
//The user will able to print name of district based on array index. e.g.(0 will print Ahemedabad). 
//If the specified index is out of bounds, program will display the message of Bounds.
import java.util.*;
public class District {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] name=new String[5];
        
        System.out.println("Enter 5 districts: ");
        
        for(int i=0; i<5; i++){
            name[i]=sc.nextLine();
        }
        System.out.println("Enter index: ");
        int index=sc.nextInt();
        getDistrict(name, index);
    }
    
    public static void getDistrict(String[] name, int index){
        if(index>=name.length){
            System.out.println("Out of Bound.");
        } else {
            System.out.println(name[index]);
        }
}
    
}
