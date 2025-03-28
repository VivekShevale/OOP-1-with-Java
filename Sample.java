/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */

interface f1{
    void StudentName();
}
interface f2 extends f1{
    void StudentInstitute();
}

public class Sample implements f2 {
    public void StudentName(){
        System.out.println("MyName");
    }
    
    public void StudentInstitute(){
        System.out.println("NLJIET");
    }
    
    
    public static void main(String args[]){
        Sample ob=new Sample();
        ob.StudentName();
        ob.StudentInstitute();
    }
}
