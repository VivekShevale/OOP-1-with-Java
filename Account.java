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
public class Account {
    int Ac_No;
    String Name;
    double Balance;
    
    void display(){
        System.out.println("Account no is: "+Ac_No);
        System.out.println("Name is : "+Name);
        System.out.println("Balance is: "+Balance);
    }
    
    void setdata(int acno, String Name, double Balance){
        Ac_No=acno;
        this.Name=Name;
        this.Balance=Balance;
    }
    
    void deposit(int dep){
        Balance+=dep;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        Account ob1=new Account();
        ob1.setdata(1165895804, "TataSky", 5);
        System.out.println("Enter amount to deposit: ");
        int d=sc.nextInt();
        ob1.deposit(d);
        
        ob1.display();
    }
}
