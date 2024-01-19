package basic;

import java.util.Scanner;

public class TernaryOperatorDemo {

    public static void main(String[] args) {
        /**
         * Ternary -> 3 operands
         * ?:
         * conditional programming
         */
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter age");
//        int age = sc.nextInt();
//        String msg = age >= 18 ? "Can Vote" :"Cannot Vote";
//        System.out.println(msg);
//
//        System.out.println("Enter year");
//        int year = sc.nextInt();
//        String leapyear = ((year %4==0 && year%100 !=0)
//                || (year%4 == 0 && year%100==0 && year%400==0) ) ? "Leap year":"Not a Leap year";
//        System.out.println(leapyear);
//
//        System.out.println("Enter cost price");
//        int cp = sc.nextInt();
//
//        System.out.println("Enter selling price");
//        int sp = sc.nextInt();
//
//        String profiltorloss = cp > sp ? "Loss by "+(cp-sp) : "Profit By "+(sp-cp);
//        System.out.println(profiltorloss);
        /**
         * 5 mins
         * 1. leap year
         * 2. cost price and selling price , if profit, print "Profit by <amt>"
         * if loss, print "Loss by <amt>"
         */

        int a = 2000;
        String msg = ((a % 4 == 0) && (a % 100 == 0) && (a % 400 == 0))
                || ((a % 4 == 0) && (a % 100 != 0)) ? "leap year" : "not a leap year";
        System.out.println(msg); // Output user input

    }
}
