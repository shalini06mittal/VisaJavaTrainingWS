package inheritance;
// child or derived or sub

/**
 * Object
 * child class inherits all the members which are public, default or protected
 * private members and constructor are not inherited
 * 1. single inheritance : B extends A
 * 2. multilevel : C extends  B extends A
 * 3. hierarchical :  B extends A,  C extends A,  d extends A
 * Not supported
 * multiple  B extends A, P
 * hybrid : diamond shape  B extends A,  C extends A,  D extends B, C
 */
public class Book extends Item {

    private int year;
    private String author;

    @Override
    public double calculateMrp() {
        System.out.println("Book calculate mrp");
        return 0;
    }

    Book(){
        // should call the respective parameterized constructor passing the values for the same
        /** use super to call parent class constructor or parent class methods
         * it has to be the 1st statement in a child constructor
         */
        super(1," "," ", 0);
        System.out.println("Book default constructor");

    }

    public Book(int id, String itemname, String description, double price, int year, String author) {
        super(id, itemname, description, price);
        this.year = year;
        this.author = author;
    }

    public Book(int year, String author) {
        //super(); // it is an implicit call if none provided
        this.year = year;
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    @Override
//    public void setPrice(double price) {
//        super.setPrice(price + 10);
//
//    }
    public double calculatePrice(double price, double tax) {

        super.setPrice(price);
        return getPrice() + 10;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", author='" + author + '\'' +
                "} " ;
    }
}
