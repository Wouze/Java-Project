
import java.util.*;

/*public class Main {

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
                    accountc.setStudnet(true);
                }
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
    }
}*/
import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {

        Booking.createHalls();
        Booking.defultMovie();

        System.out.println("Welcome to Vox Cinema");
        System.out.println("Enter your choice:");
        System.out.println("1-cus \n2-prod");

        int choice = input.nextInt();

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
            System.out.println("Are You A Student ?(Yes|No)");
            String a =input.next();
            if("No".equals(String.valueOf(a)) || "no".equals(String.valueOf(a)))
            Booking.getAccounts().get(Booking.getAccountCounter()).setStudnet(false);
            else if("Yes".equals(String.valueOf(a)) || "yes".equals(String.valueOf(a)))
               Booking.getAccounts().get(Booking.getAccountCounter()).setStudnet(true); 
        }
        Booking.printMovies();
        System.out.println("Select A Movie to watch");
        int sm = input.nextInt();
        //Ticket booking 
        System.out.println("Do you Want A VIP Or A Standard Experience?(VIP|Standard)");
        String ex = input.next();
        
        
    }

}




        
        

        /*switch (choice) {
            case 1:
               
              //  Customer accountc = new Customer(userName, Passward);
                System.out.println("Please provide us with your infotmation: ");
                System.out.println("Are You a Student ? (Yes or No)");
                String student = input.next();
                System.out.println("How old are you?");
                
                
                if (String.valueOf(student) == "Yes" || String.valueOf(student) == "yes") {
                  //  accountc.setStudnet(true); }
                System.out.println("Showing now:");
                movieBooking.printMovies();
                System.out.println("Select Movie to watch");
                int Smovie = input.nextInt();
                
                //print the seets of the hall
                //ask for number of tickets
                break;
                
            /*case 2:
                Prodecter accountp = new Prodecter(userName, Passward);
                //method calling
                System.out.println("Do you want to add a movie?");
                boolean movie = input.nextBoolean();
                System.out.println("Do you want a premier?");
                boolean p1 = input.nextBoolean();
                accountp.typeOfShow(p1);
                break

        }
        System.out.println();
           */
        // Prodecter p1 = new Prodecter (111 , "" , 333 ,true);
    
            
