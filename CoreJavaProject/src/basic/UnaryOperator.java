package basic;

public class UnaryOperator {
    public static void main(String[] args) {
        // pre and post incr/ decr
        // unary operators modify the value of the operand
        int x = 2;
        int y = x++;
        System.out.println(x+" "+y);//3 2
        int a=1;
        int z = ++a;
        System.out.println(a+" "+z);//2 2
    }
}
