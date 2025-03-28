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
public class FISDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileOutputStream fos=new FileOutputStream("FIO.txt");
        fos.write(98);
        
        FileInputStream fis=new FileInputStream("FIO.txt");
        int data=fis.read();
        System.out.println("data: "+data);
        
        fis.close();
        fos.close();
    }
}
