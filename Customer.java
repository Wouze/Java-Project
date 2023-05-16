package javaproject;

public class Customer {
    private String userName;
    private String Password;
    private int Age;
    private boolean Studnet;
 
    
    public Customer(String userName , String Password,  int Age, boolean Studnet) {
        this.userName = userName;
        this.Password = Password;
        this.Studnet = Studnet;
    }

   public Customer(String userName, String Password ) {
        this.userName = userName;
        this.Password = Password;
               
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return Password;
    }

    public boolean isStudnet() {
        return Studnet;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public boolean getStudnet() {
        return Studnet;
    }

    public void setStudnet(boolean Studnet) {
        this.Studnet = Studnet;
    }
    
    
}

