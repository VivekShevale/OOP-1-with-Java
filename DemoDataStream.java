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
public class DemoDataStream {
    public static void main(String args[]) throws IOException {
        FileOutputStream fout=new FileOutputStream("Datatxt.txt");
        DataOutputStream dout=new DataOutputStream(fout);
        
        dout.writeBoolean(true);
        dout.writeInt(2);
        dout.close();
        
        FileInputStream fin=new FileInputStream("Datatxt.txt");
        DataInputStream din=new DataInputStream(fin);
        boolean f=din.readBoolean();
        int k=din.readInt();
        System.out.println(f+" "+k);
    }
}
