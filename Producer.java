package javaproject;
import java.util.Scanner;

public class Producer {

    private String CompanyName;
    private int securityCode;
    private boolean isPrem;
    private int NOguests;
    private int numberOfCamera;
     private int id;
    private String userName;
    private String Password;


    /* public Producer(String userName, String Password) {

        this.userName = userName;
        this.Password = Password;
       
    }
     */
    Scanner input = new Scanner(System.in);

    public Producer(String CompanyName, int securityCode, boolean isPrem) {
        this.CompanyName = CompanyName;
        this.securityCode = securityCode;
        this.isPrem = isPrem;

        typeOfShow(isPrem);
    }

    public void typeOfShow(boolean isPrem) {
        if (isPrem) {
            System.out.println("Enter Numbers Of Cameras");
        }
        numberOfCamera = input.nextInt();
        System.out.println("Do you want a background");
        boolean BG = input.nextBoolean();
        System.out.println("What is your approximate number of guests");
        int guest = input.nextInt();

    }
    //public void addMovie(){

}
