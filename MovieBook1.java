/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
class BookTheaterSeat1{
    int total_seats=10;
    
    synchronized void bookseat(int seats){
        if(total_seats>=seats){
            System.out.println(seats+" book successfully");
            total_seats-=seats;
            System.out.println("Seats left: "+total_seats);
        } else {
            System.out.println("Seat not available.");
            System.out.println("Seat left: "+total_seats);
        }
    }
}
public class MovieBook1 extends Thread{
    static BookTheaterSeat1 b;
    int seats;
    
    public void run(){
        b.bookseat(seats);
    }
    
    public static void main(String args[]){
        b=new BookTheaterSeat1();
        
        MovieBook1 Reena=new MovieBook1();
        Reena.seats=7;
        Reena.start();
        
        MovieBook1 Amit=new MovieBook1();
        Amit.seats=6;
        Amit.start();
    }
}

