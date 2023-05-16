package javaproject;
import java.util.*;

import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        int price=0;
        Booking.createHalls();
        Booking.defultMovie();
        
        Booking.createAccount("Layan","1122");//creat defult account to test
        System.out.println("Welcome to Vox Cinema");
        System.out.println("Enter your choice:");
        System.out.println("1-Customer \n2-Producer");

        int choice = input.nextInt();
        if(choice == 1){ //Customer
        System.out.println("Do you have an account?(Yes or No)");
        String haveAcc = input.next();
        if ("Yes".equals(String.valueOf(haveAcc)) || "yes".equals(String.valueOf(haveAcc))) {
            boolean flag = true;
            System.out.println("\nLogin");
            while (flag) {
                System.out.println("Enter Username:");
                String userName = input.next();
                System.out.println("Enter Password:");
                String Passward = input.next();
                if (Booking.checkAccount(userName, Passward)) {
                    break;
                }
            }
            
        } else if ("No".equals(String.valueOf(haveAcc)) || "no".equals(String.valueOf(haveAcc))) {
            System.out.println("Register");
            System.out.println("Enter Username:");
            String userName = input.next();
            System.out.println("Enter Password:");
            String Passward = input.next();
            Booking.createAccount(userName, Passward);
            System.out.println("Enter Your Age");
            int age = input.nextInt();
            System.out.println("Are You A Student ?(Yes|No)");
            String a =input.next();
            if("No".equals(String.valueOf(a)) || "no".equals(String.valueOf(a)))
            Booking.getAccounts().get(Booking.getAccountCounter()).setStudnet(false);
            else if("Yes".equals(String.valueOf(a)) || "yes".equals(String.valueOf(a)))
               Booking.getAccounts().get(Booking.getAccountCounter()).setStudnet(true); 
        }
        
        //to Movie booking page
        Booking.printMovies();
        System.out.println("Select A Movie to watch");
        int sm = input.nextInt();
        
        System.out.println("Do you Want A VIP Or A Standard Experience?(VIP|Standard)");
        String ex = input.next();
        
        String seat="";
        boolean isVIP=false;
        boolean Bookingsucs = false; //flag for tickets booking (true --> booked successfully)
        if("VIP".equals(String.valueOf(ex))||"vip".equals(String.valueOf(ex))){
            isVIP=true;
           
            do{
            movieBooking.VprintSeats(Booking.getVIPhall1());
            System.out.println("Select A Seat(Row-Column)");
            seat = input.next();
            
            Bookingsucs =  movieBooking.bookVIPseat(seat);}
            while (Bookingsucs != true);
            
            movieBooking.VprintSeats(Booking.getVIPhall1());//print seats after booking
            price = 50; //set price for vip tickets
                    }
        
        else if("Standard".equals(String.valueOf(ex))||"standard".equals(String.valueOf(ex))){
            
            do{
            movieBooking.VprintSeats(Booking.getHall1());
            System.out.println("Select A Seat(Row-Column)");
            seat = input.next();
            Bookingsucs =  movieBooking.bookSseat(seat);}
            while (Bookingsucs != true);
            
            movieBooking.VprintSeats(Booking.getHall1());//print seats after booking
            price = 30;
       }
        movieBooking Ticket1 = new movieBooking(sm,price,seat,isVIP);
        Ticket1.printTicketInfo();
        
    }
        else if(choice == 2){ //Producer
        
        }
        else
            System.out.println("Invalid choice");
    }

}




        
               
              
    
            
