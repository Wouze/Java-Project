<<<<<<<< HEAD:src/Hall.java

package javaproject;
========
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java;
>>>>>>>> 0e61437c7f161577bc751cae8ad2267a4d11fff5:java/Hall.java


public class Hall {
     private boolean[] seats;
    private String type;
    private int hallID;

    public Hall(int NPseats, String type,int ID) {
        hallID = ID;
        seats = new boolean[NPseats];
        this.type = type;
    }

    public boolean[] getSeats() {
        return seats;
    }
     public boolean getISeats(int index) {
        return seats[index];
    }
    public String getType() {
        return type;
    }

    public void bookSeats(int index) {
        seats[index]=true;
    }

    public void setType(String type) {
        this.type = type;
    }
}

