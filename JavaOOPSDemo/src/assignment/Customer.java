package assignment;

/**
 * Create a class Customer with following data members
 * firstname, lastname, emailid, phone, password
 *
 * Create a method to initialize the firstname, lastname, phone and password.
 * Create a method to generate email id using the below pattern
 * firstname.lastname@gmail.com. Call this method from initialize() to initialize the email id
 *
 * Create a method displayDetails(), that display the details of the customer excluding password
 * Create a Test class, create a customer object and call respective methods
 */
public class Customer {
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String password;

    private String generateEmail(){
        return firstname.toLowerCase()+"."+lastname.toLowerCase()+"@gmail.com";
    }
    public void initialize(String fname, String lname, String ph, String pwd){
        firstname = fname;
        lastname = lname;
        phone = ph;
        password =pwd;
        email = generateEmail();
    }
    public void displayDetails(){
        System.out.println("First Name "+firstname);
        System.out.println("Last Name "+lastname);
        System.out.println("Email "+email);
        System.out.println("Phone "+phone);
    }
}
