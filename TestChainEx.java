/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
import java.io.IOException;
public class TestChainEx {
    public static void main(String args[]){
        try{
            ArithmeticException ex=new ArithmeticException("ExceptionMsg");
            ex.initCause(new IOException("we are unable to read/write infinite."));
            throw ex;
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
            System.out.println(ex.getCause());
        }
    }
}
