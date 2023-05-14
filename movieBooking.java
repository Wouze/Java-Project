
package javaproject;

import java.util.*;
public class movieBooking extends Booking{
 
    
   private boolean[] seats ;
   static ArrayList<Movie>  movies = new ArrayList<>();
   
  public static void defultMovie(){
  movies.add(new Movie(111 , "Barbie" , "Animation" , 7 , 120));
  movies.add(new Movie(222,"Avengers:End Game","Action",18,160));
  movies.add(new Movie(333,"Harry potter:Cup Of Fire","Sci-fi",15,140));
  
  }
    public movieBooking( int bookingId, int cusId, Price price, int movieId) {
        super(bookingId, cusId, price, movieId);
    
    }
    public static void printMovies(){
    int counter=1;
    for(Movie ele : movies){    
        System.out.printf("%d-%s \n",counter,ele);
        counter ++;
    }

    

    
    

}}
   


