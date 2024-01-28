package arrays;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        /**
         *  arrays are used to store more than 1 values ONLY OF same data type
         *   it uses a special syntax []
         *   it supports indexing and index starts from 0
         *   arrays are fixed size => to specify the length of the array i.e how many elements you want to store
         *
         *   if array length = 5
         *   index of array =  0 to array.length - 1
         *
          */
        int x; // variable declaration
        x = 10; // variable initialization
        int y=10;
        /*
        1. array declaration
        2. array creation => java is blocking or allocating memory for those number of elements
        3. array initialization
         */
        int n = 5;
        int nos[]; // array declaration
        nos = new int[n]; // array creation 4 * 5 = 20 bytes of continuous memory block
        //nos[] = new int[n]
        // array initialization
//        nos[0] = 10;
//        nos[1] = 5;
//        nos[2] = 23;
//        nos[3] = 45;
//        nos[4] = 6;
        //nos[5] = 10;
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < nos.length; i++) {
//            System.out.println("Enter value "+(i+1));
//            nos[i] = sc.nextInt();
//        }
//        for (int i = 0; i < nos.length; i++)
//            System.out.println(nos[i] * nos[i]);

        // declare and create
        int temp[] = new int[5];

        // declare, create and initialize all in 1
        int scores[] = {1,2,4,5,6,67567,8};
        System.out.println(scores[0]);
        scores[0] = 100;
        System.out.println(scores[0]);
        System.out.println(scores.length); // length is a property
        /**
         * Create 2 arrays to store  data as follows:
         * 1. Product array - to store name of products p1 p2 p3 p4 p5
         * 2. Price array - to store price of each item for the product
         * 12 34 67 45 69
         *
         * 1, 4, 3 => 12+69+45
         * 1. P1 12 => at index 0
         * 2. P2 34
         *
         * Display a menu to the user with product name and price,
         * Keep asking the user products they want to purchase and -1 to stop purchasing
         * then display the total amount that user has to pay for the items purchased
         *
         */
    }
}
