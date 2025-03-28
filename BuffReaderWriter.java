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
public class BuffReaderWriter {
    public static void main(String args[]) throws IOException, FileNotFoundException{
        FileReader fr=new FileReader("BufReader.txt");
        BufferedReader bufr=new BufferedReader(fr);
        
        FileWriter fw=new FileWriter("BufWriter.txt");
        BufferedWriter bufw=new BufferedWriter(fw);
                                                                                                                                          
        int b;
        while((b=bufr.read())!=-1){
            bufw.write(b);
        }
        bufr.close();
        bufw.close();
    }
}

