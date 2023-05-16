package javaproject;

import java.util.*;
public class movieBooking extends Booking{
 
    public movieBooking( int bookingId,Price price, int movieId) {
        super(bookingId, price, movieId);   
    }
   
    //print seats for standered and VIP halls
    public static void SprintSeats(Hall Hall){
        int counter=1 ,i=2;
        Hall.getSeats()[0]=true;
        System.out.println("\u001B[33m  A B C D E");
        System.out.print("\u001B[33m1 ");
        System.out.print("\u001B[33m\u001B[37m");
        for(boolean elm : Hall.getSeats()){
            if(elm)
             System.out.print("X ");
             else
                System.out.print("O ");
            counter++;
            if(counter == 6){
            System.out.println();
            counter =1;
            if(i!=5){
            System.out.print("\u001B[33m"+i+" \u001B[37m");
            i++;}  
        }}}
    public static void VprintSeats(Hall Hall){
        int counter=1 ,i=2;
        Hall.getSeats()[0]=true;
        System.out.println("\u001B[33m  A B C D E");
        System.out.print("\u001B[33m1 ");
        System.out.print("\u001B[33m\u001B[37m");
        for(boolean elm : Hall.getSeats()){
            if(elm)
             System.out.print("X ");
             else
                System.out.print("O ");
            counter++;
            if(counter == 6){
            System.out.println();
            counter =1;
            if(i!=4){
            System.out.print("\u001B[33m"+i+" \u001B[37m");
            i++;}  
        }}}
    
    //book a seat in VIP hall
    public static boolean  bookVIPseat(String index){
      //a return true if seat booked succssesfully and false if it is already booked 
        boolean a=false;
    switch(index){
                case "1A":
                    if(Booking.getVIPhall1().getISeats(0)){
                       Booking.getVIPhall1().bookSeats(0);
                       a=true;
                       break;}
                   else 
                        break;
            case "1B":
                if(Booking.getVIPhall1().getISeats(1)){
                       Booking.getVIPhall1().bookSeats(1);
                       a=true;
                       break;}
                   else 
                        break;
                
            case "1C":
                 if(Booking.getVIPhall1().getISeats(2)){
                       Booking.getVIPhall1().bookSeats(2);
                       a=true;
                       break;}
                   else 
                        break; 
            case "1D":
                 if(Booking.getVIPhall1().getISeats(3)){
                       Booking.getVIPhall1().bookSeats(3);
                       a=true;
                       break;}
                   else 
                        break;
                 case "1E":
                 if(Booking.getVIPhall1().getISeats(4)){
                       Booking.getVIPhall1().bookSeats(4);
                       a=true;
                       break;}
                   else 
                        break;
            
            case "2A":
                 if(Booking.getVIPhall1().getISeats(5)){
                       Booking.getVIPhall1().bookSeats(5);
                       a=true;
                       break;}
                   else 
                        break; 
            case "2B":
                 if(Booking.getVIPhall1().getISeats(6)){
                       Booking.getVIPhall1().bookSeats(6);
                       a=true;
                       break;}
                   else 
                        break; 
            case "2C":
                 if(Booking.getVIPhall1().getISeats(7)){
                       Booking.getVIPhall1().bookSeats(7);
                       a=true;
                       break;}
                   else 
                        break;
            case "2D":
                 if(Booking.getVIPhall1().getISeats(8)){
                       Booking.getVIPhall1().bookSeats(8);
                       a=true;
                       break;}
                   else 
                        break;
            case "2E":
                 if(Booking.getVIPhall1().getISeats(9)){
                       Booking.getVIPhall1().bookSeats(9);
                       a=true;
                       break;}
                   else 
                        break;
            case "3A":
                 if(Booking.getVIPhall1().getISeats(10)){
                       Booking.getVIPhall1().bookSeats(10);
                       a=true;
                       break;}
                   else 
                        break;
            case "3B":
                 if(Booking.getVIPhall1().getISeats(11)){
                       Booking.getVIPhall1().bookSeats(11);
                       a=true;
                       break;}
                   else 
                        break; 
            case "3C":
                 if(Booking.getVIPhall1().getISeats(12)){
                       Booking.getVIPhall1().bookSeats(12);
                       a=true;
                       break;}
                   else 
                        break;
            case "3D":
                if(Booking.getVIPhall1().getISeats(13)){
                       Booking.getVIPhall1().bookSeats(13);
                       a=true;
                       break;}
                   else 
                        break;  
            case "3E":
                 if(Booking.getVIPhall1().getISeats(14)){
                       Booking.getVIPhall1().bookSeats(14);
                       a=true;
                       break;}
                   else 
                        break; 
            default:
                  System.out.println("Invalid seat , we booked seat 2C for you");
                  Booking.getVIPhall1().bookSeats(12);
            }
    if(a==true)
           System.out.println(" Seat booked successfully");
    else
        System.out.println(" is Booked seat, please choose another.");
    return a;
  }
    
    public static boolean  bookSseat(String index){
        //a return true if seat booked succssesfully and false if it is already booked 
        boolean a=false;
    switch(index){
                case "1A":
                    if(Booking.getHall1().getISeats(0)){
                       Booking.getHall1().bookSeats(0);
                       a=true;
                       break;}
                   else 
                        break;
            case "1B":
                if(Booking.getHall1().getISeats(1)){
                       Booking.getHall1().bookSeats(1);
                       a=true;
                       break;}
                   else 
                        break;
                
            case "1C":
                 if(Booking.getHall1().getISeats(2)){
                       Booking.getHall1().bookSeats(2);
                       a=true;
                       break;}
                   else 
                        break; 
            case "1D":
                 if(Booking.getHall1().getISeats(3)){
                       Booking.getHall1().bookSeats(3);
                       a=true;
                       break;}
                   else 
                        break;
                 case "1E":
                 if(Booking.getHall1().getISeats(4)){
                       Booking.getHall1().bookSeats(4);
                       a=true;
                       break;}
                   else 
                        break;
            
            case "2A":
                 if(Booking.getHall1().getISeats(5)){
                       Booking.getHall1().bookSeats(5);
                       a=true;
                       break;}
                   else 
                        break; 
            case "2B":
                 if(Booking.getHall1().getISeats(6)){
                       Booking.getHall1().bookSeats(6);
                       a=true;
                       break;}
                   else 
                        break; 
            case "2C":
                 if(Booking.getHall1().getISeats(7)){
                       Booking.getHall1().bookSeats(7);
                       a=true;
                       break;}
                   else 
                        break;
            case "2D":
                 if(Booking.getHall1().getISeats(8)){
                       Booking.getVIPhall1().bookSeats(8);
                       a=true;
                       break;}
                   else 
                        break;
            case "2E":
                 if(Booking.getHall1().getISeats(9)){
                       Booking.getHall1().bookSeats(9);
                       a=true;
                       break;}
                   else 
                        break;
            case "3A":
                 if(Booking.getHall1().getISeats(10)){
                       Booking.getHall1().bookSeats(10);
                       a=true;
                       break;}
                   else 
                        break;
            case "3B":
                 if(Booking.getHall1().getISeats(11)){
                       Booking.getHall1().bookSeats(11);
                       a=true;
                       break;}
                   else 
                        break; 
            case "3C":
                 if(Booking.getHall1().getISeats(12)){
                       Booking.getHall1().bookSeats(12);
                       a=true;
                       break;}
                   else 
                        break;
            case "3D":
                if(Booking.getHall1().getISeats(13)){
                       Booking.getHall1().bookSeats(13);
                       a=true;
                       break;}
                   else 
                        break;  
            case "3E":
                 if(Booking.getHall1().getISeats(14)){
                       Booking.getHall1().bookSeats(14);
                       a=true;
                       break;}
                   else 
                        break; 
            case "4A":
                 if(Booking.getHall1().getISeats(15)){
                       Booking.getHall1().bookSeats(15);
                       a=true;
                       break;}
                   else 
                        break; 
            case "4B":
                 if(Booking.getHall1().getISeats(16)){
                       Booking.getHall1().bookSeats(16);
                       a=true;
                       break;}
                   else 
                        break;
            case "4C":
                 if(Booking.getHall1().getISeats(17)){
                       Booking.getHall1().bookSeats(17);
                       a=true;
                       break;}
                   else 
                        break; 
                        case "4E":
                 if(Booking.getHall1().getISeats(18)){
                       Booking.getHall1().bookSeats(18);
                       a=true;
                       break;}
                   else 
                        break; 
                 
            default:
                  System.out.println("Invalid seat , we booked seat 2C for you");
                  Booking.getVIPhall1().bookSeats(12);  
           }
    if(a==true)
           System.out.println(" Seat booked successfully");
    else
        System.out.println(" is Booked seat, please choose another.");
    return a;
         
}}
 
 
