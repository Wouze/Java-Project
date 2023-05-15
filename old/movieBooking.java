
package javaproject;

import java.util.*;
public class movieBooking extends Booking{
 
   //halls     
   private static Hall hall1 ;
   private static Hall hall2 ;
   private static Hall hall3 ;
   private static Hall VIPhall1 ;
   private static Hall VIPhall2 ;
   //movies
   static ArrayList<Movie>  movies = new ArrayList<>();
   //accounts
   private static ArrayList<Customer> accounts;
   private static int accountCounter=0;
   
  public static void defultMovie(){
  movies.add(new Movie(111 , "Barbie" , "Animation" , 7 , 120));
  movies.add(new Movie(222,"Avengers:End Game","Action",18,160));
  movies.add(new Movie(333,"Harry potter:Cup Of Fire","Sci-fi",15,140));
  
  }
  
  public static void createHalls(){
       hall1 = new Hall(20,"Regular",1111); 
       hall2 = new Hall(20,"Regular",1112); 
       hall3 = new Hall(20,"Regular",1113); 
       VIPhall1 = new Hall(15,"VIP",1114);
       VIPhall2 = new Hall(15,"VIP",1115);
  }
  public static void createAccount(String accountName,String userName,String Passward){
  accountCounter++;
  accounts.add(new Customer(userName,Passward,accountCounter));
  }
    public movieBooking( int bookingId, int cusId, Price price, int movieId) {
        super(bookingId, cusId, price, movieId);
        
    
    }
    public static void printMovies(){
    int counter=1;
    for(Movie ele : movies){    
        System.out.printf("%d-%s \n",counter,ele);
        counter ++;
    }}
    
    public static void printSeats(Hall Hall){
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
        }
        
        }
  
}
    public static boolean checkAccount(String userName,String passward){
        boolean check=false;
    for(Customer c :accounts){
        if(c.getUserName().equals(userName) && c.getPassword().equals(passward))
            check = true;
        else
          check = false;
    }
       if(check)
           System.out.println("Welcome back !");
       else
          System.out.println("userName or passward wrong");
          return check;
 }

    public static Hall getHall1() {
        return hall1;
    }

    public static Hall getHall2() {
        return hall2;
    }

    public static Hall getHall3() {
        return hall3;
    }

    public static Hall getVIPhall1() {
        return VIPhall1;
    }

    public static Hall getVIPhall2() {
        return VIPhall2;
    }

}
   


