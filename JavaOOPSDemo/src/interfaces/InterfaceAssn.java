package interfaces;

/**
 * Create an interface Filter that has below method
 * public boolean isTrue(int no){}
 */
public class InterfaceAssn {
    /**
     * if the filter isTrue method returns true then print the valus of a
     * based on user choice of even or odd or positive numbers
     */
//    public static void printResult(Filter filter, int ...a){
//        for(int n : a){
//            if(filter.isTrue(n))
//                System.out.println(n);
//        }
//    }
    // implementation of isTrue() within the filter interface
    public static void printResult(Filter filter, int []a){
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
        int a[] = {1,2,-3,4,5,6,-3,-8};
        System.out.println("Even numbers");
        printResult(new EvenFilter(), a);
        System.out.println("Odd numbers");
        printResult(new OddFilter(), a);
        System.out.println("Positive numbers");
        printResult(new PositiveFilter(), a);
        // anonynous inner class
//       Filter f = new Filter(){
//            @Override
//            public boolean isTrue(int no) {
//                return no<0;
//             }
//       };
        // lambdas
        Filter f = (int no)  -> no<0;

        System.out.println("Negative numbers");
       printResult(f, a);
        System.out.println("prime numbers");
        printResult(new Filter() {
            @Override
            public boolean isTrue(int no) {
                for(int i=2;i<no/2;i++)
                    if(no%i==0)
                        return false;
                return  true;
            }
        }, a);

    InputSource inputSource = () -> {
        System.out.println("akjdah");
        return "Hello";
    };
    inputSource = () -> "Hello";
    Message message = (String a1, String b)-> System.out.println(a1+b);
    message.consume("One","Two");
    }
}
