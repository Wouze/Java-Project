package javaproject;
public abstract class Price implements Payable{

    int CVV;
    int expDate;
    int cardNum;
    public double price;
    

    public String checkNum(int cardNum) {
        String cardnum = String.valueOf(cardNum);
        if (cardnum.length() < 10 && cardnum.length() > 10) {
            return "Invalid Card Number";
        } else {
            return cardnum;
        }
// less than 10 numbers 
    }

    public double checkDiscount(boolean Student) {
        if (Student) {
            
            return 0.05;
        } else {
            return 0;
        }

    }
   // public double getMoviePrice(){
      //  return 25 + 25*TAX - 25*checkDiscount(getStudent());
    //}
    // public double getPrice() {
    // return price = price * checkDiscount();

    //@Override
    //public double calcPrice() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

//public Static double getFoodPrice(int F,int D){


//}
}

