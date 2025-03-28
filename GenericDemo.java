/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
class GenericEx <T>{
    T value;
    void show(){
        System.out.println(value);
    }
}
public class GenericDemo {
    static <T> void genericprint(T element){
        System.out.println(element.getClass().getName()+" = "+element);
    }
    
    public static void main(String args[]){
        GenericEx<Integer> ob=new GenericEx<>();
        ob.value=10;
        ob.show();
        genericprint(11);
        genericprint(1.0f);
        genericprint(1.01d);
    }
}
