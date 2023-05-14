
package javaproject;
import java.util.*;

public class JavaProject {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {

      
        System.out.println("Welcome to Vox Cinema");
        System.out.println("Enter your choice:");
        System.out.println("1-cus \n2-prod");

        int choice = input.nextInt();

        System.out.println("Enter Username:");
        String userName = input.next();
        System.out.println("Enter Password:");
        String Passward = input.next();

       

        switch (choice) {
            case 1:
                Customer accountc = new Customer(userName, Passward);
                System.out.println("Are You a Student ? (Yes or No)");
                String option = input.next();
                if (String.valueOf(option) == "Yes" || String.valueOf(option) == "yes") {
                    accountc.setStudnet(true); }
                System.out.println("Showing now:");
                movieBooking.defultMovie();
                movieBooking.printMovies();
                System.out.println("Select Movie to watch");
                int Smovie = input.nextInt();
                //print the seets of the hall
                //ask for number of tickets
                break;
                
            case 2:
                Prodecter accountp = new Prodecter(userName, Passward);
                //method calling
                System.out.println("Do you want to add a movie?");
                boolean movie = input.nextBoolean();
                System.out.println("Do you want a premier?");
                boolean p1 = input.nextBoolean();
                accountp.typeOfShow(p1);
                break;

        }
        System.out.println();

        // Prodecter p1 = new Prodecter (111 , "" , 333 ,true);
    
}}

