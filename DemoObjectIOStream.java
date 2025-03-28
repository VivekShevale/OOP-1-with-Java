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
class Student implements Serializable{
    String name;
    String regno;
    public Student (String name, String regno){
        this.name=name;
        this.regno=regno;
    }
}
public class DemoObjectIOStream {
    public static void main(String args[])throws IOException, ClassNotFoundException{
        Student S=new Student("std 1","657");
        
        FileOutputStream fout=new FileOutputStream("ObjTxt.txt");
        ObjectOutputStream obout=new ObjectOutputStream(fout);
        
        obout.writeObject(S);
        obout.close();
        
        FileInputStream fin=new FileInputStream("ObjTxt.txt");
        ObjectInputStream obin=new ObjectInputStream(fin);
        
        Student std=null;
        std = (Student)obin.readObject();
        
        System.out.println(std.name);
        System.out.println(std.regno);
    }
}
