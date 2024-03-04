package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // exception handling : try, catch, throw, throws, finally
        /**
         * 3 types of errors
         * 1. syntax errors
         * 2. logical errors: 3+5 => 15
         * 3. runtime errors: at runtime :
         * ClassCastException
         * NullPointerException:
         * InputMismatch : int
         *
         * Exception: RuntimeException, IOException
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int n1 = scanner.nextInt(); // "12"
       // int n2 = scanner.nextInt();
        /**
         * Try block should be followed by atleast 1 catch or finally
         * there can be multiple catch claused to a single try
         * If catch clause handle specific exceptions then the specific catch
         * block is invoked
         */
        String arr[] = {"1","2","3","abc","0"};
        try {
            System.out.println("inside try");
            String ss = arr[3]; // abc
            try {
                int den = Integer.parseInt(ss);
                int x = n1 / den;
                System.out.println(x);
            }catch (ArithmeticException e1){ // specific
                System.out.println("Cannot divide by 0");
            }
            for (int i=1;i<=5;i++) {
                for (int j = 1; j <= 5; j++)
                    System.out.print(ss + " ");
                System.out.println();
            }
        }catch (IndexOutOfBoundsException e1){ // specific
            System.out.println("Cannot divide by 0");
        }catch (Exception ex){
            System.out.println("something went wrong "+ex.getMessage());
            // generate logs; date , time, who
        }
        System.out.println("Enter a word");
        String s = scanner.next();
        System.out.println("reverse of s "+s);
    }
}