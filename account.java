package javaproject;
public class account {

    private int id;
    private String userName;
    private String Password;

    public account(int id, String userName, String Password) {
        this.id = id;
        this.userName = userName;
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
}
