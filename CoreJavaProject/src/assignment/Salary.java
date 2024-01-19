package assignment;

public class Salary {

    public static void main(String[] args) {
        int basic = 10000;

//        double da = 0.4 * basic;
        double da = (double)40/100 * basic;
        double hra = 0.7 *  basic;
        double gs = basic + da + hra ;

        System.out.println("Basic Salary "+basic);
        System.out.println("DA "+da);
        System.out.println("HRA "+hra);
        System.out.println("Gross Salary "+gs);
    }
}
