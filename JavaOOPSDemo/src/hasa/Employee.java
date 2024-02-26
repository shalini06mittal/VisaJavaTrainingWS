package hasa;

public class Employee {
    private int eid;
    private String ename;

    // has-a relationship
    private MyDate dateOfJoining;
    private MyDate dateOfBirth;
    public Employee(){}

    public Employee(int eid, String ename, MyDate dateOfJoining, MyDate dateOfBirth) {
        this.eid = eid;
        this.ename = ename;
        this.dateOfJoining = dateOfJoining;
        this.dateOfBirth = dateOfBirth;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public MyDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(MyDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public MyDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(MyDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
