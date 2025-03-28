/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
import java.util.Arrays;

public class arrayMethod {
    public static void main(String args[]){
        String[] countries = { "Poland", "Nepal","India", "Australia"};
        
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));
        System.out.println(Arrays.binarySearch(countries, "India"));
    }
    
}
