/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */

class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg); 
    }
    YoungerAgeException(){
        super("You are under age.");
    }
}

public class TestCustomException {
    static void  validate(int age) throws YoungerAgeException{
        if (age<18){
            throw new YoungerAgeException();
        } else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String args[]){
        try{
            validate(13);
        }
        catch (YoungerAgeException e){
            System.out.println(e);
        }
    }
}
