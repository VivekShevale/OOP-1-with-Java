/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class MainThread {
    public static void main(String args[]){
        for (int i=1; i<3; i++){
            MultiThreading t=new  MultiThreading();
            t.start();
        }
    }
}

class MultiThreading extends Thread{
    public void run(){
        for (int i=1; i<3; i++){
            String test=Thread.currentThread().getName();
            System.out.println("Hello from: "+test);
        }
    }
}