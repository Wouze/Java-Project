
package javaproject.old;


public class Customer {
    private int cusId;
    private String userName;
    private String Password;
    private int Age;
    private boolean Studnet;

    public Customer(int cusId, String userName, String Password, int Age, boolean Studnet) {
        this.cusId = cusId;
        this.userName = userName;
        this.Password = Password;
        this.Age = Age;
        this.Studnet = Studnet;
    }

    public Customer(String userName, String Password,int cusId) {
        this.userName = userName;
        this.Password = Password;
        this.cusId = cusId;
    }
   

    
    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
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

