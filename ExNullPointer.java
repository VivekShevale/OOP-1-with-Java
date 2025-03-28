/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class ExNullPointer {
    public static void main(String args[]){
        
        try{
            String str=null;
            System.out.println(str.charAt(0));
        }
        
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
}
