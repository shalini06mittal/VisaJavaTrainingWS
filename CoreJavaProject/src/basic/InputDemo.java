package basic;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
//        System.out.println("Enter number 1");
        Scanner scanner = new Scanner(System.in);
//        // what type of data : integer
//        int n1 = scanner.nextInt(); it stops reading at space
//        System.out.println("Enter number 2");
//        int n2 = scanner.nextInt(); it stops reading at space
//        System.out.println("Addition "+(n1+n2));
//        System.out.println("Enter temperature in fahrenheit");
//        double fah = scanner.nextDouble(); it stops reading at space
//        double cel = (fah - 32)*5.0/9;
//        System.out.println("Celcius "+cel);
        System.out.println("Enter name");
        // reads only a single word, it stops reading at space;
        String name = scanner.next();
//        int n = scanner.nextInt();
//        String city = scanner.next();
//        double d = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter an address");
        String sent = scanner.nextLine(); // reads spaces and stops at enter key
        System.out.println(name);// +" "+n+" "+city+" "+d);
        System.out.println(sent);
    }

}
