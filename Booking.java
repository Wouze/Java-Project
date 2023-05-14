/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject;

public abstract class  Booking {
    
    private int bookingId;
    private int cusId;
    private Price price;
    private int movieId;

    public Booking(int bookingId, int cusId, Price price, int movieId) {
        this.bookingId = bookingId;
        this.cusId = cusId;
        this.price = price;
        this.movieId = movieId;
    }
    
}
