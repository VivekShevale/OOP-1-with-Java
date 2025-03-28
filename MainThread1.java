/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class MainThread1 {
    public static void main(String args[]){
        for (int i=1; i<3; i++){
            MultiThreading1 r=new  MultiThreading1();
            Thread t=new Thread(r);
            t.start();
        }
    }
}

class MultiThreading1 implements Runnable{
    public void run(){
        for (int i=1; i<3; i++){
            String test=Thread.currentThread().getName();
            System.out.println("Hello from: "+test);
        }
    }
}