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
public class TestCreateFile {
    public static void main(String args[]) throws IOException{
        File f=new File("D://xyz.txt");
        
        if (f.createNewFile()){
            System.out.println("file is created");
        } else {
            System.out.println("File is already exists.");
        }
        
        System.out.println("==============================");
        System.out.println("file exist? "+f.exists());
        System.out.println("length of file = "+f.length());
        System.out.println("readable? "+f.canRead());
        System.out.println("writable? "+f.canWrite());
        System.out.println("directory? "+f.isDirectory());
        System.out.println("hiden? "+f.isHidden());
        System.out.println("Absolute Path = "+f.getAbsolutePath());
    }
}
