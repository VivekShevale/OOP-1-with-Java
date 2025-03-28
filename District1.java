/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
import java.util.*;
public class District1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] name=new String[5];
        
        System.out.println("Enter 5 districts: ");
        
        for(int i=0; i<5; i++){
            name[i]=sc.nextLine();
        }
        System.out.println("Enter District: ");
        int dis=sc.nextLine();
        getDistrict(name, dis);
    }
    
    public static void getDistrict(String[] name, int index){
        if(index>=name.length){
            System.out.println("Out of Bound.");
        } else {
            System.out.println(name[index]);
        }
}
    
}
