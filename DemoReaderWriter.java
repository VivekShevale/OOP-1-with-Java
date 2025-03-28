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
public class DemoReaderWriter {
    public static void main(String args[]) throws IOException{
        FileWriter fw=new FileWriter("Fwrite.txt");
        fw.write(553);
        System.out.println("File Write Successfully.");
        fw.close();
        
        FileReader fr=new FileReader("Fwrite.txt");
        int data=fr.read();
        System.out.println((char)data);
        fr.close();
    }
}
