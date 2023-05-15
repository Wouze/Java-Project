/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muzon
 */
/*import java.util.*;
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
   
*/



import java.util.*;
public class movieBooking extends Booking{
 
    public movieBooking( int bookingId,Price price, int movieId) {
        super(bookingId, price, movieId);
        
    }
   
    
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
   


}
