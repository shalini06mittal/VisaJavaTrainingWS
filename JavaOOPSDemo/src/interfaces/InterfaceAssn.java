package interfaces;

/**
 * Create an interface Filter that has below method
 * public boolean isTrue(int no){}
 */
public class InterfaceAssn {

    public static void printResult(Filter filter, int ...a){

        /**
         * if the filter isTrue method returns true then print the valus of a
         * based on user choice of even or odd or positive numbers
         */
        for(int n : a){
            if(filter.isTrue(n))
                System.out.println(n);
        }
    }
    public static void main(String[] args) {
        /**
         * create a array of numbers and perform below calculations based on user choice
         * 1. Print all even numbers
         * 2. Print all odd numbers
         * 3. print all positive numbers
         */
        System.out.println("Even numbers");
        printResult(new EvenFilter(), 1,2,-3,4,5,6,-3,-8);
        System.out.println("Odd numbers");
        printResult(new OddFilter(), 1,2,-3,4,5,6,-3,-8);
        System.out.println("Positive numbers");
        printResult(new PositiveFilter(), 1,2,-3,4,5,6,-3-6);
    }
}
