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
public class ExListFile {
    public static void main(String args[]){
        File f=new File("D:\\JavaProgram");
        String filenames[]=f.list();
        
        for (String filename:filenames){
            System.out.println(filename);
        }
    }
}
