
import java.util.ArrayList;
public abstract class  Booking {
    
    //halls
    private static Hall hall1 ;
   private static Hall hall2 ;
   private static Hall hall3 ;
   private static Hall VIPhall1 ;
   private static Hall VIPhall2 ;
   
    private int bookingId;
    private Price price;
    private int movieId;
    private int ticketQ;
    
    //array of movies
     static ArrayList<Movie>  movies = new ArrayList<>();
     
   //accounts
   private static ArrayList<Customer> accounts = new ArrayList<>();
   private static int accountCounter=-1;
   
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
           System.out.println("Welcome back !");
       else
          System.out.println("userName or passward wrong");
          return check;
 }
  public static void createAccount(String userName,String Passward){
  accountCounter++;
  accounts.add(new Customer(userName,Passward));
  System.out.println("New Account Created Successefully");
  
  }

    public Booking(int bookingId, Price price, int movieId) {
        this.bookingId = bookingId;
        
        this.price = price;
        this.movieId = movieId;
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

    public int getBookingId() {
        return bookingId;
    }

    public Price getPrice() {
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

    public static int getAccountCounter() {
        return accountCounter;
    }

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

    
    public void setPrice(Price price) {
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
//    
//    public double calcTotalPrice(){
//      if()
//    }
    
}
