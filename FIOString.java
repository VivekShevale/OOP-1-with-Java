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
public class FIOString {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileOutputStream fos=new FileOutputStream("FIO.txt");
        String S="Learning I/O Stream";
        byte b[]=S.getBytes();
        fos.write(b);
        fos.close();
        
        FileInputStream fis=new FileInputStream("FIO.txt");
        int i=0;
        while ((i=fis.read())!=-1){
            System.out.print((char)i);
        }
        fis.close();
    }
}
