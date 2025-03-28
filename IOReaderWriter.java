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
public class IOReaderWriter {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileInputStream fin=new FileInputStream("IOReader.txt");
        InputStreamReader ir=new InputStreamReader(fin);
        
        FileOutputStream fout=new FileOutputStream("IOWriter.txt");
        OutputStreamWriter ow=new OutputStreamWriter(fout);
        
        int b;
        while((b=ir.read())!=-1){
            ow.write(b);
        }
        ir.close();
        ow.close();
    }
}
