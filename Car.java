/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
import java.util.*;
public class Car implements Comparable<Car>{
    String name;
    int id;
    public Car(String Name, int id){
        this.name=name;
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public int compareTo(Car c){
        if (this.getId()==c.getId()){
            return 0;
        } else if (this.getId()>c.getId()){
            return -1;
        } else {
            return 1;
        }
    }
    public static void main(String args[]){
        Car c1=new Car("BMW", 10);
        Car c2=new Car("Volvo", 5);
        Car c3=new Car("Fiat", 8);
        Car c4=new Car("Tesla", 40);
        
        ArrayList<Car> arr=new ArrayList<Car>();
        arr.add(c1); arr.add(c2);
        arr.add(c3); arr.add(c4);
        Collections.sort(arr);
        System.out.println("Sorted array");
        for (Car c:arr){
            System.out.println(c.id);
        }
    }
}
