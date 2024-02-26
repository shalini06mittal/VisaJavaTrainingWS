package hasa;


public class MyDate {
    private int day;
    private Month month;
    private int year;

    public MyDate(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // @ -> annotation : small piece of extra information to the compiler or JVM
    @Override
    // overloading
    public String toString() {
        return day+ "/"+month+"/"+year;
    }
   // public String toString(int x){}
}
