package arrays;

public class ForEachLoopVarargsDemo {

    //
    public static void m1(int arr[]){ // if array is an input then need to create an array to be passed to this method
        System.out.println("FROM m1");
        System.out.println(arr.length);
    }
    // ... (ellipsis) and they are called as var args to which you can pass n no of values

    /**
     * 1. it has to be the last parameter after all positional parameters(a and b)
     * 2. cannot have more than 1 var args as parameters in a method
     * @param arr
     */
    public static void m2(int a, int b, int... arr){
        System.out.println("FROM m2");
        System.out.println(arr.length);
    }
    public static void main(String[] args) {
        // EXPLORE THE FORMAT FUNCTION of System.out

        //array
        int x[] = {1,2,3,4,5};
        m1(x);
        m2(1,3,4,5,7);
        for (int i = 0; i < x.length; i++) {
            int n = x[i];
            System.out.println(n);
        }

        int s = 10;
        // for-each loop => iterating over an array, 0 to length, +1
        //forward-only loop and should not modify the array values in the loop
        for(int n : x){
            System.out.println(n);
            // no access to index
        }

    }
}
