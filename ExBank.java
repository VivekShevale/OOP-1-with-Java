/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
interface Bank{
    public abstract float rateOfInterest();
}

class SBI implements Bank{
    public float rateOfInterest(){
        return 9.2f;
    }
}

class Axis implements Bank{
    public float rateOfInterest(){
        return 8.2f;
    }
}

public class ExBank {
    public static void main(String args[]){
        Bank b1=new SBI();
        System.out.println("SBI-ROI = "+b1.rateOfInterest());
        
        Bank b2=new Axis();
        System.out.println("Axis-ROI = "+b2.rateOfInterest());
    }
}
