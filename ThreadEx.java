/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */

class childThread extends Thread{
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
}
public class ThreadEx {
    public static void main(String args[]){
        childThread ch=new childThread();
        ch.start();
    }
    
}
