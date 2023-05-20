package JavaProject;

import JavaProject.Food;
import JavaProject.Booking;
import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double FDTotalPrice = 0;
        int choice = 0;
        int price = 0;
        int sm = 0;
        boolean premier = false;
        int Again = 0;
        boolean valid = true;
        String haveAcc;
        String hallBook;
        String hallType;
        String ex;
        String seat = "";
        boolean isVIP = false;
        String snack;
        int Fchoice;
        int FQ;
        int Dchoice;
        int DQ;
        String ans;
        int mAdded;
        int ageR;
        String pre;
        int guest;
        int camera;
        //Arraylist of tickets

        ArrayList<Booking> ticketsArray = new ArrayList();

       
        Booking.createHalls();
        Booking.defultMovie();
        WriteFiletxt write = new WriteFiletxt();
        ReadtxtFile read = new ReadtxtFile();

        Booking.createAccount("Layan", "1122", 15, true);//creat defult account to test

        do {
            System.out.println("Welcome to AI Cinema");

            System.out.println("Enter your choice:");
            System.out.println("1-Customer \n2-Producer");

            //Big try for all input mismatchException
            try {

                do {//to check if choice is not 1 or 2 then ask again
                    choice = input.nextInt();
                    if (choice != 1 && choice != 2) {
                        System.err.println("Please choose number from the menu");
                        valid = false;
                    } else {
                        valid = true;
                    }

                } while (valid != true);

                if (choice == 1) { //CUSTOMER
                    
                    System.out.println("Do you have an account?(Yes or No)");

                    do {//to check if haveAcc is not "yes" or "no" then ask again
                        haveAcc = input.next();
                        if ("yes".equals(haveAcc) || "Yes".equals(haveAcc) || "No".equals(haveAcc) || "no".equals(haveAcc)) {
                            valid = true;
                        } else {
                            System.err.println("Please choose Yes or No");
                            valid = false;
                        }
                    } while (valid != true);

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
                        String a = input.next();
                        if ("No".equals(String.valueOf(a)) || "no".equals(String.valueOf(a))) {
                            Booking.getAccounts().get(Booking.getAccountCounter()).setStudnet(false);
                        } else if ("Yes".equals(String.valueOf(a)) || "yes".equals(String.valueOf(a))) {
                            Booking.getAccounts().get(Booking.getAccountCounter()).setStudnet(true);
                        }
                    }

                    //to Movie booking 
                    Booking.printMovies();
                    boolean answer = true;
                    do {//to check if the movie is not suitable ask to enter another
                        System.out.println("Select A Movie to watch");

                        do {
                            sm = input.nextInt();
                            if (sm > 5 || sm <= 0) {//if selected  movie is above than 5 or less or equal to 0
                                System.err.println("Please Select from the menu");
                                valid = false;
                            } else {
                                valid = true;
                            }
                        } while (valid != true);

                        sm -= 1;
                        //METHOD THAT CHECKS THE USER'S AGE***************
                        answer = Booking.checkAgeLimit(sm);

                        if (answer == false) {
                            System.err.println("Entery Denied! Select A Suitable Movie To Watch");

                        }
                    } while (answer != true);
                    
                    System.out.println("Would You Like To Book A Movie Hall For A Special Occasion?(Yes|No)");
                    do {//to check if hallBook is not "yes" or "no" then ask again
                        hallBook = input.next();
                        if ("yes".equals(hallBook) || "Yes".equals(hallBook) || "No".equals(hallBook) || "no".equals(hallBook)) {
                            valid = true;
                        } else {
                            System.err.println("Please choose Yes or No");
                            valid = false;
                        }
                    } while (valid != true);

                    if ("Yes".equals(String.valueOf(hallBook)) || "yes".equals(String.valueOf(hallBook))) {
                        System.out.println("Do You Want A VIP or Standard Hall?");

                        do {//to check if hallType is not "VIP" or "Standard" then ask again
                            hallType = input.next();
                            if ("VIP".equals(hallType) || "vip".equals(hallType) || "Standard".equals(hallType) || "standard".equals(hallType)) {
                                valid = true;
                            } else {
                                System.err.println("Please choose VIP or Standard");
                                valid = false;
                            }
                        } while (valid != true);

                        if ("VIP".equals(String.valueOf(hallType)) || "vip".equals(String.valueOf(hallType))) {
                            System.out.println("Your Hall Has Been Successfully booked");
                            hallBooking hallB = new hallBooking(5000, "VIP");
                            ticketsArray.add(hallB);
                            hallB.printHallBooking(sm);
                            Payment.cardInfo();
                            System.out.println("Online Purchase\nAmount: 5000SAR\nAt AI Cinema\n");
                            

                        } else if ("Standard".equals(String.valueOf(hallType)) || "standard".equals(String.valueOf(hallType))) {
                            System.out.println("Your Hall Has Been Successfully Booked");
                            hallBooking hallB = new hallBooking(2500, "Standard");
                            ticketsArray.add(hallB);
                            Payment.cardInfo();
                            System.out.println("Online Purchase\nAmount: 2500SAR\nAt AI Cinema\n");

                        }
                    }

                    if ("No".equals(String.valueOf(hallBook)) || "no".equals(String.valueOf(hallBook))) {
                        System.out.println("Do you Want A VIP Or A Standard Experience?(VIP|Standard)");
                        do {//to check if ex is not "VIP" or "Standard" then ask again
                            ex = input.next();
                            if ("VIP".equals(ex) || "vip".equals(ex) || "Standard".equals(ex) || "standard".equals(ex)) {
                                valid = true;
                            } else {
                                System.err.println("Please choose VIP or Standard");
                                valid = false;
                            }
                        } while (valid != true);

                        boolean Bookingsucs = false; //flag for tickets booking (true --> booked successfully)
                        if ("VIP".equals(String.valueOf(ex)) || "vip".equals(String.valueOf(ex))) {
                            isVIP = true;

                            do {
                                movieBooking.VprintSeats(Booking.getVIPhall1());
                                System.out.println("Select A Seat(Row-Column)");
                                seat = input.next();

                                Bookingsucs = movieBooking.bookVIPseat(seat);
                            } while (Bookingsucs != true);
                            System.out.println();
                            movieBooking.VprintSeats(Booking.getVIPhall1());//print seats after booking
                            price = 50; //set price for vip tickets
                        } else if ("Standard".equals(String.valueOf(ex)) || "standard".equals(String.valueOf(ex))) {

                            do {
                                movieBooking.SprintSeats(Booking.getHall1());
                                System.out.println("Select A Seat(Row-Column)");
                                seat = input.next();
                                Bookingsucs = movieBooking.bookSseat(seat);
                            } while (Bookingsucs != true);
                            System.out.println();
                            movieBooking.SprintSeats(Booking.getHall1());//print seats after booking
                            price = 30;
                        }
                        movieBooking Ticket1 = new movieBooking(sm, price, seat, isVIP);
                        Ticket1.printTicketInfo();
                        System.out.println();
                        ticketsArray.add(Ticket1);

                        
                        //Buying Snacks
                        System.out.println("Would You Like To Buy A Snack?(Yes|No)");
                        do {//to check if hallBook is not "yes" or "no" then ask again
                            snack = input.next();
                            if ("yes".equals(snack) || "Yes".equals(snack) || "No".equals(snack) || "no".equals(snack)) {
                                valid = true;
                            } else {
                                System.err.println("Please choose Yes or No");
                                valid = false;
                            }
                        } while (valid != true);

                        if ("Yes".equals(String.valueOf(snack)) || "yes".equals(String.valueOf(snack))) {
                            System.out.println("Choose A Snack from The Menu");
                            Food.PrintFood();
                            do {
                                Fchoice = input.nextInt();
                                if (Fchoice > 3 || Fchoice <= 0) {
                                    System.err.println("Please choose from menu");
                                    valid = false;
                                } else {
                                    valid = true;
                                }
                            } while (valid != true);

                            System.out.println("How Many Would You Like To Get?");
                            do {
                                FQ = input.nextInt();
                                if (FQ > 10 || FQ < 0) {
                                    System.err.println("Invalid quantity, you are allowed to choose up to 10");
                                    valid = false;
                                } else {
                                    valid = true;
                                }
                            } while (valid != true);

                            System.out.println("Choose A Drink From The menu");
                            Food.PrintDrink();
                            do {
                                Dchoice = input.nextInt();
                                if (Dchoice > 3 || Dchoice <= 0) {
                                    System.err.println("Please choose from menu");
                                    valid = false;
                                } else {
                                    valid = true;
                                }
                            } while (valid != true);

                            System.out.println("How Many Would You Like To Get?");
                            do {
                                DQ = input.nextInt();
                                if (DQ > 10 || DQ < 0) {
                                    System.err.println("Invalid quantity, you are allowed to choose up to 10");
                                    valid = false;
                                } else {
                                    valid = true;
                                }
                            } while (valid != true);

                            FDTotalPrice = Food.calcPrice(Fchoice, FQ, Dchoice, DQ);
                            //SNACK PRICE ADDED TO TOTAL PRICE**
                            System.out.println("Your Final Total Price Is: " + (Ticket1.TicketTotalPrice() + FDTotalPrice) + "SAR");

                        }
                        //Take Card Info
                        Payment.cardInfo();
                        //Print Payment message
                        System.out.println("\nOnline Purchase\nAmount: " + (Ticket1.TicketTotalPrice() + FDTotalPrice) + " SAR\nAt AI Cinema\n");

                    }
                    write.openFile("CustomerTicket.txt");
                    for (Booking b : ticketsArray) {
                        write.writeFile(b);//write the file by calling toString method based on whether it is instance of MovieBooking or HallBooking 
                    }
                    write.closeFile();
                   System.out.println("Ticket Saved in File Successfully! ");
                   System.out.println("Do You Want to Print Your Ticket?");
                   String option;
                   do {
                     option= input.next();
                      if ("yes".equals(option) || "Yes".equals(option) || "No".equals(option) || "no".equals(option)) {
                            valid = true;}
                      else{
                         valid = false;
                      System.err.println("Please enter yes or no");}
 
                    } while (valid != true);
                     if ("yes".equals(option) || "Yes".equals(option)){
                            read.openFile("CustomerTicket.txt");
                            read.readFile();
                            read.closefile();}
                   System.exit(0);
                } 
                else if (choice == 2) { //Producer
                    int i = 1;
                    System.out.println("Enter security code");
                    do {
                        String SC = input.next();
                        if (String.valueOf(SC).equals("12345")) {
                            valid = true;
                        } else {
                            System.err.println("Invaled Security code");
                            valid = false;
                        }

                    } while (valid != true);
                    System.out.println("Provide Us With Your Company's Name");
                    String companyName = input.next();
                    System.out.println("Would You Like To Add A Movie?");

                    do {//to check if ans is not "yes" or "no" then ask again
                        ans = input.next();
                        if ("yes".equals(ans) || "Yes".equals(ans) || "No".equals(ans) || "no".equals(ans)) {
                            valid = true;
                        } else {
                            System.err.println("Please choose Yes or No");
                            valid = false;
                        }
                    } while (valid != true);

                    if ("Yes".equals(String.valueOf(ans)) || "yes".equals(String.valueOf(ans))) {
                        System.out.println("How Many Movies Would You Like To Add");
                        //Producer allowed to add maximum 2 movies
                        do {
                            mAdded = input.nextInt();
                            if (mAdded >= 3 || mAdded <= 0) {
                                System.err.println("invalid quantity, you are allowed to add up to 2 movies");
                                valid = false;
                            } else {
                                valid = true;
                            }
                        } while (valid != true);
                        do {
                            System.out.println("Provide Us With The Movie's name");
                            String mName = input.next();
                            System.out.println("Provide Us With The Movie's Duration");
                            int duration = input.nextInt();
                            System.out.println("What Is The Movie's Genra?");
                            String genra = input.next();
                            System.out.println("What Is The Movie's Age Restriction");
                            //maximum age restriction is 21+
                            do {
                                ageR = input.nextInt();
                                if (ageR > 21 || ageR <= 0) {
                                    System.err.println("Invalid Age restriction, you are allowed to choose up to 21");
                                    valid = false;
                                } else {
                                    valid = true;
                                }
                            } while (valid != true);

                            //CREATING AND ADDING A MOVIE TO THE LIST
                            Movie p1 = new Movie(mName, genra, ageR, duration);
                            Booking.addProducerM(p1);
                            System.out.println("Movie Added Successfully!");
                            //PRINTING THE MOVIE AFTER BEING ADDED TO THE LIST
                            
                            Booking.printMovies();
                            System.out.println("Is It A Premier?(Yes|No)");
                            do {//to check if ans is not "yes" or "no" then ask again
                                pre = input.next();
                                if ("yes".equals(pre) || "Yes".equals(pre) || "No".equals(pre) || "no".equals(pre)) {
                                    valid = true;
                                } else {
                                    System.err.println("Please choose Yes or No");
                                    valid = false;
                                }
                            } while (valid != true);

                            i++;
                            if ("Yes".equals(String.valueOf(pre)) || "yes".equals(String.valueOf(pre))) {
                                System.out.println("What Is The Approximate Number Of Your Guests?");
                                //Number of guests allowed is up to 1000 

                                do {
                                    guest = input.nextInt();
                                    if (guest >= 1000 || guest <= 0) {
                                        System.err.println("Invalid Number of guests, you are allowed to choose up to 1000");
                                        valid = false;
                                    } else {
                                        valid = true;
                                    }
                                } while (valid != true);

                                System.out.println("How Many Cameras Would You Like?");
                                //number of cameras allowed is up to 20
                                do {
                                    camera = input.nextInt();
                                    if (camera > 20 || camera <= 0) {
                                        System.err.println("Invalid Number of cameras, you are allowed to choose up to 20");
                                        valid = false;
                                    } else {
                                        valid = true;
                                    }
                                } while (valid != true);

                                premier = true;
                            } else if ("No".equals(String.valueOf(pre)) || "no".equals(String.valueOf(pre))) {
                                premier = false;

                            }

                            Producer pp = new Producer(companyName, premier);

                        } while (i <= mAdded);

                        System.out.println("Thank You For Visiting Our Site");

                    }//DOES NOT WANT TO ADD A MOVIE
                    else if ("No".equals(String.valueOf(ans)) || "no".equals(String.valueOf(ans))) {
                        System.out.println("Thank you");

                    }

                    //ENHANCED FOR PRINTS ELEMENTS OF ARRAYLIST TICKETSARRAY
                    for (Booking e : ticketsArray) {
                        System.out.println("ToString Method:");
                        if (e instanceof hallBooking) {
                            hallBooking ele = (hallBooking) e;
                            ele.printHallBooking(sm);
                        }
                    }

                    System.out.println("\n\nEnter any num to Quit or 1 to play again");
                    Again = input.nextInt();
                    System.out.println();}
                }
             catch (InputMismatchException e) {
                System.err.println("INVALED INPUT -MismatchException");
                System.exit(1);
            }
        } while (Again == 1);
        

    }

}

