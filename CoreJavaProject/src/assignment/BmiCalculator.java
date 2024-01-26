package assignment;

import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in kgs");
        double weight = scanner.nextDouble();
        System.out.println("Enter height in cms");
        double height = scanner.nextDouble();

        height = height/100;

        double bmi = weight /(height*height);
        System.out.println("BMI is "+bmi);

        if(bmi < 16)
            System.out.println("Severe Thinness");
        else if(bmi < 17)
            System.out.println("Moderate Thinness");
        else if (bmi <18.5) {
            System.out.println("Mild Thinness");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi < 35) {
            System.out.println("Obese Class 1");
        } else if (bmi < 40) {
            System.out.println("Obese Class 2");
        }
        else
            System.out.println("Obese Class 3");

        /**
         * take customer total amount of the items
         * and calculate discount
         * 1. member => > 10000
         * 2. coupon code
         * if customer is member{
         *      if amount <= 5000
         *          disc = 10
         *      else if amount <= 10000
         *          disc = 15
         * }
         */
    }
}
