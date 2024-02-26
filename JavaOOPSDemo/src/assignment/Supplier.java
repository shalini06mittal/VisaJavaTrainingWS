package assignment;

public class Supplier {
    private int suppid;
    private String suppname;
    private String address;
    private String email;
    private String phone;

    public Supplier() {

    }

    public Supplier(int suppid, String suppname, String address, String email, String phone) {
        this.suppid = suppid;
        this.suppname = suppname;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public int getSuppid() {
        return suppid;
    }

    public void setSuppid(int suppid) {
        this.suppid = suppid;
    }

    public String getSuppname() {
        return suppname;
    }

    public void setSuppname(String suppname) {
        this.suppname = suppname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "Supplier{" +
                "suppid=" + suppid +
                ", suppname='" + suppname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
