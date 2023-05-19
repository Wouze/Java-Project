
package javaproject.old;

public class Date {
    private int day;
    private int month;
    private int Year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    @Override
    public String toString() {
        return "Date{" + "day=" + day + "/ month=" + month + ", Year=" + Year + '}'; //String Format 
    }
    // Predefind method
    
}
