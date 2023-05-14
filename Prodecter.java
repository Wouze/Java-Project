
package javaproject;

import java.util.Scanner;
public class Prodecter {
    private int prdId;
    private String CompanyName;
    private int securityCode;
    private boolean isPrem;
    int numberOfCamera;
    private String userName;
    private String Password;

    public Prodecter(String userName, String Password) {
        this.userName = userName;
        this.Password = Password;
       
    }
    Scanner input = new Scanner(System.in);
    

    public Prodecter(int prdId, String CompanyName, int securityCode, boolean isPrem) {
        this.prdId = prdId;
        this.CompanyName = CompanyName;
        this.securityCode = securityCode;
        this.isPrem = isPrem;
        
        typeOfShow(isPrem);
    }
    
    
    public void typeOfShow(boolean isPrem){
        if (isPrem)
            System.out.println("Enter Numbers Of Cameras");
        numberOfCamera = input.nextInt();
        System.out.println("Do you want a background");
        boolean BG = input.nextBoolean();
        System.out.println("What is your approximate number of guests");
        int guest = input.nextInt();
        
    }
    //public void addMovie(){
    
}

