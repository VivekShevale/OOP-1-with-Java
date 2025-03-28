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
public class DemoRandomAccess {
    public static void main(String artgs[])throws IOException{
        try(RandomAccessFile R=new RandomAccessFile("Random.txt","rw")){
            R.setLength(0);
            for(int i=0; i<200; i++){
                R.writeInt(i);
            }
            
            System.out.println("Current File length = "+R.length());
            
            R.seek(0);
            System.out.println("First = "+R.readInt());
            
            R.seek(1*4);
            System.out.println("Second = "+R.readInt());
            
            R.seek(9*4);
            System.out.println("Ten = "+R.readInt());
            
            R.writeInt(555);
            R.seek(10*4);
            System.out.println("Eleven = "+R.readInt());
            
            R.seek(R.length());
            System.out.println("New Length = "+R.length());
        }
    }
}
