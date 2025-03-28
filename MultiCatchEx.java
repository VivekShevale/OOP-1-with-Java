/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class MultiCatchEx {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        try{
            int n=Integer.parseInt(sc.nextLine());
            System.out.println(1/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
