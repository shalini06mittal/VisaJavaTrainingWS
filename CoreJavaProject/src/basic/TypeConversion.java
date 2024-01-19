package basic;

public class TypeConversion {

    public static void main(String[] args) {

        double d = 234.78; // digital to analog signals
        // convert the decimal value to int
        // type conversion / casting : explicit
        int x = (int)d;
        System.out.println(x);
        // implicit
        int z = 979;
        double f = z;
        System.out.println(f);

        char ch = 'a';
        int s = ch++;
        System.out.println(ch+" "+s);
        char cc = (char)s;
    }
}
