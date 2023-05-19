
package javaproject;

import java.util.*;
public class Payment implements Payable{
    static Scanner input = new Scanner(System.in);
    private static int CVV;
    private static int expDate;
    private static int cardNum;
    public static double price;

    public Payment(int CVV, int expDate, int cardNum, double price) {
        this.CVV = CVV;
        this.expDate = expDate;
       // this.cardNum = checkNum(cardNum);
        this.price = price;
    }

    public Payment(int cardNum) {
        //constructor chaining
        this(0,0,cardNum,0);
    }  
   
//CHANGED METHOD
//    public static void checkNum(int cardNum ) {
//        String cn;
//        int cardNumber ;
//        String cardnum = String.valueOf(cardNum);
//        if(cardnum.length()==10){
//            setCardNum(cardNum);
//        }
//      //  else if (cardnum.length() < 10 || cardnum.length > 10) {
//        else{
//            do{ System.err.println("Invalid Card Number");
//                System.out.println("Enter A Valid CardNum(10 Digits)");
//                 cardNumber = input.nextInt();
//                cn =  String.valueOf(cardNumber);  
//           }while(cn.length()!= 10);
//           setCardNum(cardNumber);}
//        
//          
//           }                        
// less than 10 numbers
   
   
    public static void cardInfo(){
        String validateM = "Valid", validateY = "Valid",validateCVV = "Valid";
        boolean flag =true;
        do{
        try{
           
        System.out.println("Enter Your Card number");
        double num = input.nextInt();
       
       
        String numS = String.valueOf(num);
       System.out.println(numS.length());
        if (numS.length()-2 != 10){
            flag = false;
            System.err.println("Invaled Num");}
        else
            flag=true;
       
           
           
//        checkNum(num);
        }
        catch(InputMismatchException e){
        System.err.println("Invaled Num");
        flag = false;
        input.next();}}
        while(flag==false);
       
       
        System.out.println("Enter Expiration Date");
    //loop
        do{ System.out.println("Month : ");
          int month = input.nextInt();
          //CHANGED AND TO OR
        if (month > 12 || month < 1){
            System.err.println("Invalid Month ! Try Again");
        validateM = "Invalid";}
        else
            validateM = "Valid";
          }while("Invalid".equals(String.valueOf(validateM)));          
       do{ System.out.println("Year: ");
        int year = input.nextInt();
            if(year < 2023 || year > 2026){
                 System.err.println("Invalid Year ! Try Again");
       validateY = "Invalid";}
       else
                validateY = "Valid";}
       while("Invalid".equals(String.valueOf(validateY)));
          do{  System.out.print("CVV = ");
             CVV =  input.nextInt();
            String cvv = String.valueOf(CVV);
            //CHANGED AND TO OR
               if (cvv.length() < 3 || cvv.length() > 3) {
           System.err.println("CVV Is Invalid! ");
               validateCVV = "Invalid"; }
          else
                   validateCVV = "Valid";
          }
               while("Invalid".equals(String.valueOf(validateCVV)));
          setCVV(CVV);
          System.out.println("Credit Card Added Successfully");
         
    }
   
    public static double checkDiscount(){
    if(Booking.getAccounts().get(Booking.getAccountCounter()).getStudnet())
         return 0.10;
    else
        return 0;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public int getCVV() {
        return CVV;
    }

    public static void setCVV(int CVV) {
        Payment.CVV = CVV;
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    public int getCardNum() {
        return cardNum;
    }

    public static void setCardNum(int cardNum) {
        Payment.cardNum = cardNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
}