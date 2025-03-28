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
public class GTU2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[10];
        
        System.out.println("Enter 10 element: ");
        for (int i=0; i<10; i++){
            arr[i]=sc.nextInt();
        }
        
        while(true){
            System.out.println("Menu\n1. Addition\n2. Maximum\n3. Search\n4. Exit\nChoose an option");
            
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Addition = "+add(arr));
                    break;
                case 2:
                    System.out.println("Maximum = "+max(arr));
                    break;
                case 3:
                    System.out.println("Enter element you want to find: ");
                    int key=sc.nextInt();
                    
                    int index=search(arr, key);
                    if(index==-1){
                        System.out.println("Not found");
                    } else{
                        System.out.println("Element found at index: "+index);
                    }
                    
                    break;
                case 4:
                    System.out.println("Exit...");
                    sc.close();
                    return;
                default:
                    System.out.println("Enter valid number!");
            }
        }
    }
    
    public static int add(int a[]){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        return sum;
    }
    public static int max(int a[]){
        int max=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    
    public static int search(int a[], int key){
        int id=-1;
        for(int i=0; i<a.length; i++){
            if(key==a[i]){
                id=i;
            }
        }
        return id;
    }
    
}
