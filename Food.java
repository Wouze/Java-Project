package javaproject;



public class Food implements Payable {
     private String food;
   private String drink;
   
    static String[] Food = {"Popcorn","Nachos","Chocolate Bar"};
    static String[] Drinks ={"Slushie","Pepsi","Water"};
   
    public static void PrintFood(){
    int i = 1;
        for(String f :Food){
            System.out.println(i+"-"+f);
            i++;
    }}
       
    public static void PrintDrink(){
    int i = 1;
        for(String d :Drinks){
            System.out.println(i+"-"+d);
            i++;
    }}
   
    public  static double calcPrice(int foodChoice, int foodQ, int drinkChoice, int drinkQ ){
       double Fprice=0;
       double Dprice=0;
       double Tprice=0;
        switch(foodChoice){
            case 1 :
               Fprice= Payable.popcornP*foodQ;
                break;
            case 2:
                Fprice= Payable.nachosP*foodQ;
                break;
                case 3 :
                    Fprice= Payable.chocolateP*foodQ;
                    break;
        }
       switch(drinkChoice) {
           case 1:
               Dprice = Payable.slushiesP*drinkQ;
               break;
           case 2 :
               Dprice = Payable.pepsieP*drinkQ;
               break;
           case 3 :
               Dprice = Payable.waterP*drinkQ;
               break;
       }
       Tprice = Fprice+Dprice;
        //System.out.println("Your Total Price: "+Tprice+"SAR");
      return Tprice;
       
    }
   
}

