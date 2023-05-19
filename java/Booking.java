
<<<<<<<< HEAD:src/Booking.java
package javaproject;

========
package java;
import java.Customer;
import java.Hall;
import java.Movie;
import java.Payable;
import java.Payment;
>>>>>>>> 0e61437c7f161577bc751cae8ad2267a4d11fff5:java/Booking.java
import java.util.*;

public abstract class Booking implements Payable{
      //halls
    private static Hall hall1 ;
   private static Hall hall2 ;
   private static Hall hall3 ;
   private static Hall VIPhall1 ;
   private static Hall VIPhall2 ;
   
    private int bookingId;
    private double price;
    private int movieId;
    private int ticketQ;

    
    
    
    


    public Booking(double price) {
       
        this.price = price;
    }
   
   
   
   
    //array of movies
     static ArrayList<Movie>  movies = new ArrayList<>();
     
   //accounts
   private static ArrayList<Customer> accounts = new ArrayList<>();
   private static int accountCounter=-1;
   public static int getAccountCounter(){
       return accountCounter;
   }
     // method ageLimit
 public static boolean checkAgeLimit(int sm){
//     System.out.println("movie Age"+movies.get(sm).getAgeLimit());
//     System.out.println("customer Age"+accounts.get(getAccountCounter()).getAge());
     if(movies.get(sm).getAgeLimit() > accounts.get(getAccountCounter()).getAge()){
return false;
//System.err.println("Entry denied! Please choose a suitable movie");
         //keep entring age until it's >=ageLimit
     }
     else if(movies.get(sm).getAgeLimit() <= accounts.get(getAccountCounter()).getAge())
         return true;
     else
         return true;
 }
   public static void addProducerM(Movie movie){
   movies.add(movie);
   }
  public static void defultMovie(){
  movies.add(new Movie(  "Barbie" , "Animation" , 7 , 120));
  movies.add(new Movie("Avengers:End Game","Action",18,160));
  movies.add(new Movie("Harry potter:Cup Of Fire","Sci-fi",15,140));
 
  }
 
  public static void createHalls(){
       hall1 = new Hall(20,"Regular",1111);
       hall2 = new Hall(20,"Regular",1112);
       hall3 = new Hall(20,"Regular",1113);
       VIPhall1 = new Hall(15,"VIP",1114);
       VIPhall2 = new Hall(15,"VIP",1115);
  }
   
   public static void printMovies(){
       System.out.println("Showing Now:");
    int counter=0;
    for(Movie ele : movies){    
        System.out.printf("%d-%s \n",(counter+1),ele);
        counter ++;
    }}
 
   public static boolean checkAccount(String userName,String passward){
        boolean check=false;
    for(Customer c :accounts){
        if(c.getUserName().equals(userName) && c.getPassword().equals(passward))
            check = true;
        else
          check = false;
    }
       if(check)
           System.out.println("Welcome back !\n");
       else
          System.out.println("userName or passward wrong");
          return check;
 }
  public static void createAccount(String userName,String Passward){
  accountCounter++;
  int cusNumb = accountCounter;
  accounts.add(new Customer(userName,Passward));
  System.out.println("New Account Created Successefully");
 
  }
 
  public static void createAccount(String userName,String Passward,int age,boolean student){
  accountCounter++;
  int cusNumb = accountCounter;
  accounts.add(new Customer(userName,Passward,age,student));
  System.out.println("defult Account Created Successefully");
 
  }

    public Booking(double price, int movieId) {
     
        calcPrice(price);
        this.movieId = movieId;
    }
   
   
    public void calcPrice(double price) {
        this.price = price + (price * TAX) - ( price * Payment.checkDiscount() );
      ;}

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

    public int getBookingId() {
        return bookingId;
    }

    public double getPrice() {
        return price;
    }

    public int getMovieId() {
        return movieId;
    }

    public static ArrayList<Movie> getMovies() {
        return movies;
    }

    public static ArrayList<Customer> getAccounts() {
        return accounts;
    }

    //public static int getAccountCounter(String userName) {
      //  for(customer c:accounts)
    //}

    public static void setHall1(Hall hall1) {
        Booking.hall1 = hall1;
    }

    public static void setHall2(Hall hall2) {
        Booking.hall2 = hall2;
    }

    public static void setHall3(Hall hall3) {
        Booking.hall3 = hall3;
    }

    public static void setVIPhall1(Hall VIPhall1) {
        Booking.VIPhall1 = VIPhall1;
    }

    public static void setVIPhall2(Hall VIPhall2) {
        Booking.VIPhall2 = VIPhall2;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public static void setMovies(ArrayList<Movie> movies) {
        Booking.movies = movies;
    }

    public static void setAccounts(ArrayList<Customer> accounts) {
        Booking.accounts = accounts;
    }

    public static void setAccountCounter(int accountCounter) {
        Booking.accountCounter = accountCounter;
    }
}
