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
public class BufferedIO {
    public static void main(String args[]) throws IOException{
        FileOutputStream fo=new FileOutputStream("bufIO.txt");
        BufferedOutputStream bo=new BufferedOutputStream(fo);
        
        String S="Hello";
        byte[] ob=S.getBytes();
        
        bo.write(ob);
        bo.flush();
        bo.close();
        
        FileInputStream fi=new FileInputStream("bufIO.txt");
        BufferedInputStream bi=new BufferedInputStream(fi);
        byte[] ib=new byte[bi.available()];
        bi.read(ib);
        
        for(byte bt:ib){
            System.out.print((char)bt);
        }
    }
}