package javaproject;
//public class Hall {  }

public class Hall {
    private boolean[] seats;
    private String type;
    private int hallID;

    public Hall(int NPseats, String type,int ID) {
        hallID = ID;
        seats = new boolean[NPseats];
        this.type = type;
    }

    public boolean[] getSeats() {
        return seats;
    }

    public String getType() {
        return type;
    }

    public void setSeats(boolean[] seats) {
        this.seats = seats;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
