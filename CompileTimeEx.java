/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */

import java.io.FileInputStream;
public class CompileTimeEx {
    public static void main(String args[]) throws Exception{
        
        try{
            FileInputStream fis=new FileInputStream("d:/abc.txt");
    
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
}
