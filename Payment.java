package javaproject;
import java.util.Scanner;
public abstract class Payment implements Payable{
Scanner input = new Scanner(System.in);
    int CVV;
    int expDate;
    int cardNum;
    public double price;
   
    

    public String checkNum(int cardNum ) {
        String cardnum = String.valueOf(cardNum);
        if (cardnum.length() < 10 && cardnum.length() > 10) {
            return "Invalid Card Number";
        } else {
            return cardnum;
        }
   
                           
// less than 10 numbers 
    }
    public void cardInfo(){
        System.out.println("Enter Your Card number");
        int num = input.nextInt();
        checkNum(num);
        System.out.println("Enter Expiration Date");
    //loop
         System.out.println("Month : ");
          int month = input.nextInt();
        if (month > 12 && month < 1)
            System.err.println("Invalid Month ! Try Again");
        System.out.println("Year");
        int year = input.nextInt();
            if(year < 2023 && year > 2026)
                 System.err.println("Invalid Year ! Try Again");
            System.out.print("CVV = ");
             CVV =  input.nextInt();
            String cvv = String.valueOf(CVV);
               if (cvv.length() < 3 && cvv.length() > 3) {
           System.err.println(CVV + "Is Invalid ! ");
    }
    }
    public static double checkDiscount(){
    if(Booking.getAccounts().get(Booking.getAccountCounter()).getStudnet())
         return 0.10;
    else
        return 0;
    }
}

