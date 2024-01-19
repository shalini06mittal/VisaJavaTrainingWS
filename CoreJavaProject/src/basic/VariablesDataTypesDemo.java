// comments can come outside the class
// package names : logical or structured name to a group of similar functionalities
package basic;
public class VariablesDataTypesDemo {
    public static void main(String[] args) {
        /**
         * data types:
         * byte     1B     8 bits
         * char     2B     16 bits
         * short    2B
         * int      4B
         * long     8B
         * float    4B
         * double   8B
         * boolean  JVM specific
         * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
         * statically typed language
         * JS : dynamically typed language
         */
        /**
         * variable/ identifier naming rules
         * 1. CAN only start with alphabet, _ or $
         * 2. CAN contain alphabet, _ , $ or numbers
         * 3. CANNOT be a keyword
         */
        int sum$of2_numbers;
        // variable declaration
        int x ; // x is an int variable
        //variable initialization
        x = 10;
        // declaration and initialization
        int y = 100;
        // comma separated declaration and initialization
        int a = 10, b=2, c;
        c = a+b;
        System.out.println("Sum of 2 numbers"+a+b+c);
        System.out.println(a+b+c+"Sum of 2 numbers");
        System.out.println("Sum of 2 numbers"+(a+b+c));
        // 10 + 2 = 12
        System.out.println();
        System.out.println(a+" + "+b+" = "+c+" "+10.78);
        // by default a number is an int, decimal default is double
        byte b1 = 12;
        char vowel = '1';
        short s = 21431;
        float f = 23.67f;
        double d = 876.876;
        boolean choice = true;// false

    }
}

