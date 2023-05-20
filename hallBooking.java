package JavaProject;
	
import JavaProject.Booking;

public class hallBooking extends Booking{
    String hallType;
       public hallBooking(int price, String hallType) {
        super(price);
        this.hallType = hallType;
    }
       public void setHallType(String hallType){
           this.hallType = hallType;
       }
       
       public hallBooking() {
        
        this(0, "");
    }
       
       public String getHallType(){
           return hallType;
       }
       public void printHallBooking(int index){
           System.out.println("**Hall Booking Information**");
           System.out.println("Hall Type: "+getHallType());
           System.out.println("Movie:"+movies.get(index).getName());
           System.out.println("Genra:"+movies.get(index).Genra);
           System.out.println("Total: "+super.getPrice()+"SAR");
       }

    @Override
    public String toString() {
       
        return String.format("Hall Ticket \n Movie : %s\n Hall Type : %s\n Total Price : %.2f", super.movies.get(super.getMovieId()).getName() , getHallType() ,super.getPrice() );
    }

}

