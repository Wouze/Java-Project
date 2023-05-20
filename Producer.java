package JavaProject;

import java.util.*;

import java.util.Scanner;

public class Producer {
    
    private String CompanyName;
    private boolean isPrem;
    private int NOguests;
    private int numberOfCamera;
    private String userName;
    private String Password;
   


    Scanner input = new Scanner(System.in);

    public Producer(int NOguests, int numberOfCamera) {
        this.NOguests = NOguests;
        this.numberOfCamera = numberOfCamera;
    }
    
    public Producer() {
        this(0, 0);
       
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

    @Override
    public String toString() {
        return String.format("CompanyName:%s/nisPrem:%b/nNOguests:%d/nnumberOfCamera:%d/nuserName:%s/nPassword:%s/n",CompanyName,isPrem,NOguests,numberOfCamera,userName,Password);
    }
    

}

