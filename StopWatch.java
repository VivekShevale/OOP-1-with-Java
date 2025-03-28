/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class StopWatch {
    private long startTime;
    private long endTime;
    
    
    
    StopWatch(){
        startTime=System.currentTimeMillis();
    }
    
    void start(){
        startTime=System.currentTimeMillis();
    }
    
    void stop(){
        endTime=System.currentTimeMillis();
    }
    
    long getElapsedTime(){
        return endTime-startTime;
    }
    
    public static void main(String args[]){
        StopWatch ob1=new StopWatch();
        ob1.start();
        System.out.println(ob1.startTime);
        ob1.stop();
        System.out.println(ob1.endTime);
        System.out.println("Elapsed Time is: "+ob1.getElapsedTime());
    }
}