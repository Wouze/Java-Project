package javaproject;

public class Customer {
 
    private String userName;
    private String Password;
    private int Age;
    private boolean Studnet;
    private account Account;

    public Customer(account Account, int Age, boolean Studnet) {
        this.Age = Age;
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
    
    

    public account getAccount() {
        return Account;
    }

    public void setAccount(account Account) {
        this.Account = Account;
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

