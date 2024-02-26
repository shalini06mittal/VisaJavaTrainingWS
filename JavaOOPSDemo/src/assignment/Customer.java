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
    public Customer(){

    }
    public  Customer(String fname, String lname, String ph, String pwd){
        firstname = fname;
        lastname = lname;
        phone = ph;
        password =pwd;
        email = generateEmail();
    }
//    public void displayDetails(){
//        System.out.println("First Name "+firstname);
//        System.out.println("Last Name "+lastname);
//        System.out.println("Email "+email);
//        System.out.println("Phone "+phone);
//    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
