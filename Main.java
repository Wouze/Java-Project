
package javaproject;
import java.util.*;
public class Main {
static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     int choice=0;
     int price=0;
      int sm = 0;
     boolean premier = false;
    //JANAN ADDED PREMIER
     try{   
        Booking.createHalls();
        Booking.defultMovie();
        
        Booking.createAccount("Layan","1122",15,true);//creat defult account to test
        System.out.println("Welcome to Vox Cinema");
        System.out.println("Enter your choice:");
        System.out.println("1-Customer \n2-Producer");

         choice = input.nextInt();
     }
      catch(InputMismatchException e){
         System.err.println("INVALID INPUT!");
         input.next();
         do{
          System.out.println("Choose A Valid Input");
          choice = input.nextInt();
         }while(choice != 1 && choice != 2);
     }
     try{
        if(choice == 1){ //Customer
       //LOGICAL ERROR  (ACCEPTS ALL VALUES)
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
            Booking.getAccounts().get(Booking.getAccountCounter()).setAge(age);
            System.out.println("Are You A Student ?(Yes|No)");
            String a =input.next();
            if("No".equals(String.valueOf(a)) || "no".equals(String.valueOf(a)))
            Booking.getAccounts().get(Booking.getAccountCounter()).setStudnet(false);
            else if("Yes".equals(String.valueOf(a)) || "yes".equals(String.valueOf(a)))
               Booking.getAccounts().get(Booking.getAccountCounter()).setStudnet(true); 
        }
        
        //to Movie booking page
        Booking.printMovies();
        boolean answer =true;
        do{
        System.out.println("Select A Movie to watch");
         sm = input.nextInt();
         sm-=1;
        //METHOD THAT CHECKS THE USER'S AGE***************
        answer =  Booking.checkAgeLimit(sm);
            
       if(answer == false){
           System.err.println("Entery Denied! Select A Suitable Movie To Watch");
           
       }}
        while(answer != true);
        //JANAN*****************
            System.out.println("Would You Like To Book A Movie Hall For A Special Occasion?(Yes|No)");
            String hallBook = input.next();
        if("Yes".equals(String.valueOf(hallBook))||"yes".equals(String.valueOf(hallBook))){
            
        }
        
    
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
             
    
        //else
              //  System.out.println("Enter A Movie To Watch");
        }
        
        //JANAN***
        else if(choice == 2){ //Producer
            int i = 1;
            System.out.println("Provide Us With Your Company's Name");
            String companyName = input.next();
            System.out.println("Would You Like To Add A Movie?");
            String ans = input.next();
            if("Yes".equals(String.valueOf(ans))||"yes".equals(String.valueOf(ans))){
                System.out.println("How Many Movies Would You Like To Add");
                int mAdded = input.nextInt();
                do{
                System.out.println("Provide Us With The Movie's name");
                String mName = input.next();
                System.out.println("Provide Us With The Movie's Duration");
                int duration = input.nextInt();
                System.out.println("What Is The Movie's Genra?");
                String genra = input.next();
                System.out.println("What Is The Movie's Age Restriction");
                int ageR = input.nextInt();
                  //CREATING AND ADDING A MOVIE TO THE LIST 
                Movie p1 = new Movie(mName,genra,ageR,duration);
                Booking.addProducerM(p1);
                System.out.println("Movie Added Successfully!");
                //PRINTING THE MOVIE AFTER BEING ADDED TO THE LIST
                //edit : print added movie info 
                Booking.printMovies();
                System.out.println("Is It A Premier?(Yes|No)");
                String pre = input.next();
                i++;
                if("Yes".equals(String.valueOf(pre))||"yes".equals(String.valueOf(pre))){
                    System.out.println("What Is The Approximate Number Of Your Guests?");
                    int guest = input.nextInt();
                    System.out.println("How Many Cameras Would You Like?");
                    int camera = input.nextInt();
                 premier = true;   
                }
                else if("No".equals(String.valueOf(pre))||"no".equals(String.valueOf(pre))){
                premier = false;
                
                }
             Producer pp = new Producer(companyName,premier);
                }while(i<=mAdded);
                
                System.out.println("Thank You For Visiting Our Site");
            
            }//DOES NOT WANT TO ADD A MOVIE
            else if("No".equals(String.valueOf(ans))||"no".equals(String.valueOf(ans))){
                    System.out.println("Thank you");
        }
        else
            System.out.println("Invalid choice");
    
    }
}
     catch(InputMismatchException e){
         System.err.println("INVALID INPUT!");
         input.next();
     }
     catch(ArrayIndexOutOfBoundsException e){
         System.err.println("ENTER A NUMBER WITHIN THE RANGE 0 TO ARRAYLENGTH-1");
         input.next();
     }
}
}

