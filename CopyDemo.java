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
public class CopyDemo {
    public static void main(String args[]) throws IOException{
        FileInputStream in=new FileInputStream("FIO.txt");
        FileOutputStream out=new FileOutputStream("copyFIO.txt");
                                                                                                                                          
        int c;
        while((c=in.read())!=-1){
            out.write(c);
        }
        in.close();
        out.close();
    }
}
