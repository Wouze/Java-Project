
package javaproject.old;


public class Food implements Payable{
    String food;
    String drink;
   
    static String[] Food = {"Popcorn","nachos","chocolate"};
    static String[] Drinks ={"slushie","pepsie","water"};
    
    public static void PrintFood(){
    
        for(String f :Food){
            System.out.println(f);
    }}
       
    public static void PrintDrink(){
    
        for(String f :Drinks){
            System.out.println(f);
    }}
    
    
    public void calcPrice(int foodChoice, int foodQ, int drinkChoice, int drinkQ ){
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
           case 2 :
               Dprice = Payable.pepsieP*drinkQ;
           case 3 : 
               Dprice = Payable.waterP*drinkQ;
       }
       
    }

    @Override
    public double calcPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

