/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muzon
 */
import java.util.Scanner;

public class Producer {

    private String CompanyName;
    private int securityCode;
    private boolean isPrem;
    private int NOguests;
    private int numberOfCamera;
    private account Account;

    /* public Producer(String userName, String Password) {

        this.userName = userName;
        this.Password = Password;
       
    }
     */
    Scanner input = new Scanner(System.in);

    public Producer(account Account, String CompanyName, int securityCode, boolean isPrem) {
        this.Account = Account;
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

    public account getAccount() {
        return Account;
    }

    public void setAccount(account Account) {
        this.Account = Account;
    }

}
