package javaproject;

import java.util.*;

import java.util.Scanner;

public class Producer {
    
    private String CompanyName;
    //private int securityCode;
    private boolean isPrem;
    private int NOguests;
    private int numberOfCamera;
    //private int id;
    private String userName;
    private String Password;
   


    /* public Producer(String userName, String Password) {

        this.userName = userName;
        this.Password = Password;
       
    }
     */
    Scanner input = new Scanner(System.in);

    public Producer(int NOguests, int numberOfCamera) {
        this.NOguests = NOguests;
        this.numberOfCamera = numberOfCamera;
    }
    

    public Producer(String CompanyName, boolean isPrem) {
        this.CompanyName = CompanyName;
        this.isPrem = isPrem;

        typeOfShow(isPrem);
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public int getNOguests() {
        return NOguests;
    }

    public void setNOguests(int NOguests) {
        this.NOguests = NOguests;
    }

    public int getNumberOfCamera() {
        return numberOfCamera;
    }

    public void setNumberOfCamera(int numberOfCamera) {
        this.numberOfCamera = numberOfCamera;
    }

    public void typeOfShow(boolean isPrem) {
        if (isPrem) {
            System.out.println(getCompanyName()+"'s Movie Will Be Premiering");
        }

    }
    //public void addMovie(){

}

