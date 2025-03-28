/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class ExNestedTryCatch {
    public static void main(String args[]){
        try{
            int a[]={1,2,3};
            System.out.println(a[1]);
        
            try{
                int x=a[1]/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
