package generic;

public class GenericDemo {
    //    public static void sumofValues(int arr[])
//    {
//        // calculate sum
//    }
    // T - type, E - element, K- key, V - value

    /**
     * T - object
     * int : primitive and not a type of Object
     * Wrapper classes:
     * byte : Byte
     * char : Character
     * short : Short
     * int : Integer
     * long: Long
     * float : Float
     * double :Double
     * boolean: Boolean
     * void : Void
     *
     */

    public static <T extends Number> void sumofValues(T arr[])
    {
        // calculate sum
        for(T num : arr)
        {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int x[] = {1,2,3,4,5};
        //sumofValues(x);
//        double d[] = {1.2,3.4};
//        sumofValues(d);
        Double ob[] = new Double[5];
        ob[0] = 10.7;
        ob[1] = 10.1;
        ob[2] = 10.8;
        ob[3] = 10.9;
        ob[4] = 10.0;
        System.out.println(ob);
        sumofValues(ob);
//        String s[] = new String[5];
//        sumofValues(s);
    }
}
