
package JavaProject;

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
   
        this.price = price;
    }

    public Payment(int cardNum) {
        //constructor chaining
        this(0,0,cardNum,0);
    }  

    public static void cardInfo(){
        String validateM = "Valid", validateY = "Valid",validateCVV = "Valid";
        boolean flag =true;
        do{
        try{
           
        System.out.println("\nEnter Your Card number");
        double num = input.nextInt();
       
       
        String numS = String.valueOf(num);
       
        if (numS.length()-2 != 10){
            flag = false;
            System.err.println("Invaled Num");}
        else
            flag=true;
       
        }
        catch(InputMismatchException e){
        System.err.println("Invaled Num");
        flag = false;
        input.next();}}
        while(flag==false);
       
       
        System.out.println("Enter Expiration Date");
    
        do{ System.out.println("Month : ");
          int month = input.nextInt();
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