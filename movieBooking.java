
package JavaProject;
import JavaProject.Hall;
import JavaProject.Booking;
import java.util.*;


public class movieBooking extends Booking{
   
   
    private String seatnum;
    private boolean isVIP;
   
    public movieBooking( int movieId ,int price, String seatnum,boolean isVIP ) {
        super(price, movieId);
        this.seatnum=seatnum;
        this.isVIP=isVIP;
       
    }
public movieBooking(  ) {
        
        this(0 ,0, "",false);
        
       
    }
    public String getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(String seatnum) {
        this.seatnum = seatnum;
    }

    public boolean isIsVIP() {
        return isVIP;
    }

    public void setIsVIP(boolean isVIP) {
        this.isVIP = isVIP;
    }
   
   
    //print seats for standered and VIP halls
    public static void SprintSeats(Hall Hall){
        int counter=1 ,i=2;
        Hall.getSeats()[0]=true; //set 1A booked to test
       
       //to print the header " A B C D E "
        System.out.println("\u001B[33m  A B C D E");
        System.out.print("\u001B[33m1 ");
        System.out.print("\u001B[33m\u001B[37m");
       
        //note:seats array is boolean array where true means booked
        //Print seats array (O is empty and X is booked)
        for(boolean elm : Hall.getSeats()){
            if(elm)
             System.out.print("X ");
             else
                System.out.print("O ");
            counter++;
            if(counter == 6){
            System.out.println();
            counter =1;
            if(i!=5){//to stop printing line number on line 5(1- , 2- , ..)
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
                    if(Booking.getVIPhall1().getISeats(0)==false){
                       Booking.getVIPhall1().bookSeats(0);
                       a=true;
                       break;}
                   else
                        break;
            case "1B":
                if(Booking.getVIPhall1().getISeats(1)==false){
                       Booking.getVIPhall1().bookSeats(1);
                       a=true;
                       break;}
                   else
                        break;
               
            case "1C":
                 if(Booking.getVIPhall1().getISeats(2)==false){
                       Booking.getVIPhall1().bookSeats(2);
                       a=true;
                       break;}
                   else
                        break;
            case "1D":
                 if(Booking.getVIPhall1().getISeats(3)==false){
                       Booking.getVIPhall1().bookSeats(3);
                       a=true;
                       break;}
                   else
                        break;
                 case "1E":
                 if(Booking.getVIPhall1().getISeats(4)==false){
                       Booking.getVIPhall1().bookSeats(4);
                       a=true;
                       break;}
                   else
                        break;
           
            case "2A":
                 if(Booking.getVIPhall1().getISeats(5)==false){
                       Booking.getVIPhall1().bookSeats(5);
                       a=true;
                       break;}
                   else
                        break;
            case "2B":
                 if(Booking.getVIPhall1().getISeats(6)==false){
                       Booking.getVIPhall1().bookSeats(6);
                       a=true;
                       break;}
                   else
                        break;
            case "2C":
                 if(Booking.getVIPhall1().getISeats(7)==false){
                       Booking.getVIPhall1().bookSeats(7);
                       a=true;
                       break;}
                   else
                        break;
            case "2D":
                 if(Booking.getVIPhall1().getISeats(8)==false){
                       Booking.getVIPhall1().bookSeats(8);
                       a=true;
                       break;}
                   else
                        break;
            case "2E":
                 if(Booking.getVIPhall1().getISeats(9)==false){
                       Booking.getVIPhall1().bookSeats(9);
                       a=true;
                       break;}
                   else
                        break;
            case "3A":
                 if(Booking.getVIPhall1().getISeats(10)==false){
                       Booking.getVIPhall1().bookSeats(10);
                       a=true;
                       break;}
                   else
                        break;
            case "3B":
                 if(Booking.getVIPhall1().getISeats(11)==false){
                       Booking.getVIPhall1().bookSeats(11);
                       a=true;
                       break;}
                   else
                        break;
            case "3C":
                 if(Booking.getVIPhall1().getISeats(12)==false){
                       Booking.getVIPhall1().bookSeats(12);
                       a=true;
                       break;}
                   else
                        break;
            case "3D":
                if(Booking.getVIPhall1().getISeats(13)==false){
                       Booking.getVIPhall1().bookSeats(13);
                       a=true;
                       break;}
                   else
                        break;  
            case "3E":
                 if(Booking.getVIPhall1().getISeats(14)==false){
                       Booking.getVIPhall1().bookSeats(14);
                       a=true;
                       break;}
                   else
                        break;
            default:
                  System.out.println("Invalid seat , we booked seat 3C for you");
                  Booking.getVIPhall1().bookSeats(12);
                  a=true;
            }
    if(a==true)
           System.out.println(" - Seat booked successfully -");
    else
        System.err.println(" - Seat is already booked, please choose another -");
    return a;
  }
   
    //book a seat in standered hall
    public static boolean  bookSseat(String index){
        // return true if seat booked succssesfully and false if it is already booked
        boolean a=false;
    switch(index){
                case "1A":
                    if(Booking.getHall1().getISeats(0)==false){
                       Booking.getHall1().bookSeats(0);
                       a=true;
                       break;}
                   else
                        break;
            case "1B":
                if(Booking.getHall1().getISeats(1)==false){
                       Booking.getHall1().bookSeats(1);
                       a=true;
                       break;}
                   else
                        break;
               
            case "1C":
                 if(Booking.getHall1().getISeats(2)==false){
                       Booking.getHall1().bookSeats(2);
                       a=true;
                       break;}
                   else
                        break;
            case "1D":
                 if(Booking.getHall1().getISeats(3)==false){
                       Booking.getHall1().bookSeats(3);
                       a=true;
                       break;}
                   else
                        break;
                 case "1E":
                 if(Booking.getHall1().getISeats(4)==false){
                       Booking.getHall1().bookSeats(4);
                       a=true;
                       break;}
                   else
                        break;
           
            case "2A":
                 if(Booking.getHall1().getISeats(5)==false){
                       Booking.getHall1().bookSeats(5);
                       a=true;
                       break;}
                   else
                        break;
            case "2B":
                 if(Booking.getHall1().getISeats(6)==false){
                       Booking.getHall1().bookSeats(6);
                       a=true;
                       break;}
                   else
                        break;
            case "2C":
                 if(Booking.getHall1().getISeats(7)==false){
                       Booking.getHall1().bookSeats(7);
                       a=true;
                       break;}
                   else
                        break;
            case "2D":
                 if(Booking.getHall1().getISeats(8)==false){
                       Booking.getVIPhall1().bookSeats(8);
                       a=true;
                       break;}
                   else
                        break;
            case "2E":
                 if(Booking.getHall1().getISeats(9)==false){
                       Booking.getHall1().bookSeats(9);
                       a=true;
                       break;}
                   else
                        break;
            case "3A":
                 if(Booking.getHall1().getISeats(10)==false){
                       Booking.getHall1().bookSeats(10);
                       a=true;
                       break;}
                   else
                        break;
            case "3B":
                 if(Booking.getHall1().getISeats(11)==false){
                       Booking.getHall1().bookSeats(11);
                       a=true;
                       break;}
                   else
                        break;
            case "3C":
                 if(Booking.getHall1().getISeats(12)==false){
                       Booking.getHall1().bookSeats(12);
                       a=true;
                       break;}
                   else
                        break;
            case "3D":
                if(Booking.getHall1().getISeats(13)==false){
                       Booking.getHall1().bookSeats(13);
                       a=true;
                       break;}
                   else
                        break;  
            case "3E":
                 if(Booking.getHall1().getISeats(14)==false){
                       Booking.getHall1().bookSeats(14);
                       a=true;
                       break;}
                   else
                        break;
            case "4A":
                 if(Booking.getHall1().getISeats(15)==false){
                       Booking.getHall1().bookSeats(15);
                       a=true;
                       break;}
                   else
                        break;
            case "4B":
                 if(Booking.getHall1().getISeats(16)==false){
                       Booking.getHall1().bookSeats(16);
                       a=true;
                       break;}
                   else
                        break;
            case "4C":
                 if(Booking.getHall1().getISeats(17)==false){
                       Booking.getHall1().bookSeats(17);
                       a=true;
                       break;}
                   else
                        break;
                        case "4D":
                 if(Booking.getHall1().getISeats(18)==false){
                       Booking.getHall1().bookSeats(18);
                       a=true;
                       break;}
               
                 case "4E":
                 if(Booking.getHall1().getISeats(19)==false){
                       Booking.getHall1().bookSeats(19);
                       a=true;
                       break;}
                 
                 
                   else
                        break;
                 
            default:
                  System.out.println("Invalid seat , we booked seat 2C for you");
                  Booking.getHall1().bookSeats(12);  
                  a=true;
           }
    if(a==true)
           System.out.println(" Seat booked successfully");
    else
        System.out.println(" is Booked seat, please choose another.");
    return a;
         
}

    @Override
    public String toString() {
return String.format("Movie Ticket \nMovie : %s \nSeat : %s \nIs VIP : %b \nTotal Price : %.2f", super.movies2[super.getMovieId()].getName() ,getSeatnum() , isIsVIP() , super.getPrice()); 
        }

    public void printTicketInfo(){
        String hallType="";
        if(isVIP)
            hallType="VIP";
       
    System.out.println("Ticket information:");
    System.out.println("Movie:" + super.movies2[super.getMovieId()].getName() +" Genra:"+super.movies2[super.getMovieId()].getGenra()+"\nYou have booked in "+hallType+" Hall, seat:"+seatnum+"\nTotal:"+super.getPrice());//continue all info
   
    }
   
public double TicketTotalPrice(){
return super.getPrice();
}
      
    }
