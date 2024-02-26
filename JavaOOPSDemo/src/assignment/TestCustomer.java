package assignment;

public class TestCustomer {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.initialize("Shalini","Mittal","686868876","sha1234");
//        c1.displayDetails();
        System.out.println(c1);
    }
}

/**
 *
 * Create a class Supplier with following details:
 * suppid, suppname, address, email, phone
 * constructor/getter/setter/tostring
 * Create a class Product with foll details
 * pid, prodname, description, price, category(enum), Supplier
 * Category -> Electronics, toys, books
 * constructor/getter/setter/tostring
 *
 * Create a test class:
 * Create 2 supplier object
 * Create an array of 5 products :
 *
 * Ask the user for category name and display all products in that category
 */
