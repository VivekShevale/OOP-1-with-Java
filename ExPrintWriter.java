/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
import java.io.*;
public class ExPrintWriter {
    public static void main(String args[]) throws FileNotFoundException{
        String data="This is text inside file";
        
        try{
            PrintWriter pout=new PrintWriter("Out1.txt");
            int age=35;
            
            pout.printf("I am %d years old\n",age);
            pout.printf(data);
            pout.close();
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
