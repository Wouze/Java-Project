
package JavaProject;


public class Hall {
     private boolean[] seats;
    private String type;
    private int hallID;

    public Hall(int NPseats, String type,int ID) {
        hallID = ID;
        seats = new boolean[NPseats];
        this.type = type;
    }
    
    public Hall() {
        this(0,"",0);
        
    }

    public boolean[] getSeats() {
        return seats;
    }
     public boolean getISeats(int index) {
        return seats[index];
    }
    public String getType() {
        return type;
    }

    public void bookSeats(int index) {
        seats[index]=true;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return String.format("seats:%b/ntype:%s/nhallID:%d/n",seats,type,hallID);
    }
}

